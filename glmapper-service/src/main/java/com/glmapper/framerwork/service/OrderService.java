package com.glmapper.framerwork.service;

import java.util.List;

import com.glmapper.framerwork.dmo.Goods;
import com.glmapper.framerwork.dmo.OrderInfo;



/**
 * 订单业务接口【由于时间问题，这里没有在单独写一个商品处理相关的业务接口】
 */
public interface OrderService {

	/**
	 * 查询商品
	 * 
	 * @param bookId
	 */
	Goods getById(long goodsId);

	/**
	 * 查询所有商品
	 */
	List<Goods> getList(int offset,int limit);

	/**
	 * 下单
	 * @param goodsId 商品ID
	 * @param userId 用户ID
	 * @return
	 */
	OrderInfo buyGoods(long goodsId, long userId);

}
