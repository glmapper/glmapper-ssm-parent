package com.glmapper.framerwork.dao;

import org.springframework.stereotype.Repository;

import com.glmapper.framerwork.dmo.OrderInfo;

@Repository
public interface OrderInfoDao {

	/**
	 * 插入订单记录
	 * 
	 * @param OrderInfo orderInfo
	 * @return 插入的行数
	 */
	int insertOrderInfo(OrderInfo orderInfo);

	/**
	 * 通过主键查询订单记录，返回订单实体 
	 * @param orderId
	 * @return
	 */
	OrderInfo queryByOrderId(String orderId);

}
