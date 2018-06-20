package com.glmapper.framerwork.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glmapper.framerwork.dao.GoodsDao;
import com.glmapper.framerwork.dao.OrderInfoDao;
import com.glmapper.framerwork.dmo.Goods;
import com.glmapper.framerwork.dmo.OrderInfo;
import com.glmapper.framerwork.service.OrderService;

@Service
@Qualifier("orderService")
public class OrderServiceImpl implements OrderService {
	//log生成器
	private Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);
	
	// 注入dao依赖【商品dao，订单dao】
	@Autowired
	private GoodsDao goodsDao;
	@Autowired
	private OrderInfoDao orderInfoDao;
	
	@Override
	public Goods getById(long goodsId) {
		// TODO Auto-generated method stub
		return goodsDao.queryById(goodsId);
	}

	@Override
	public List<Goods> getList(int offset,int limit) {
		// TODO Auto-generated method stub
		return goodsDao.queryAll(offset, limit);
	}

	@Override
	@Transactional
	public OrderInfo buyGoods(long goodsId, long userId) {
		//扣减库存，插入订单 =一个事务  如果失败则执行回滚
		try {
			// 减库存
			int update = goodsDao.reduceNumber(goodsId);
			if (update <= 0) {// 库存不足
				throw new Exception("no number");
			} else {
				// 执行预约操作
				OrderInfo orderInfo=new OrderInfo();
				orderInfo.setGoodsId(goodsId);
				orderInfo.setUserId(userId);
				orderInfo.setOrderTime(new Date());
				String orderId=getRandomOrderId(goodsId);
				orderInfo.setOrderId(orderId);
				int insert = orderInfoDao.insertOrderInfo(orderInfo);
				if (insert <= 0) {// 重复预约
					throw new Exception("repeat appoint");
				} else {// 预约成功
					return orderInfo;
				}
			}
		} catch (Exception e) {
			//这里可以丰富下具体的返回信息
			logger.error("下单失败");
		} 
		return null;
	}

	private String getRandomOrderId(long goodsId) {
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyyyMMddhhmmss");
		String prefix=dateFormater.format(new Date());
		String goodsIdStr=goodsId+"";
		String temp="";
		for (int i = 0; i < 6; i++) {
			Random random=new Random(goodsIdStr.length()-1);
			temp+=goodsIdStr.charAt(random.nextInt());
		}
		return prefix+temp;
	}

}
