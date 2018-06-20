package com.glmapper.framerwork.dmo;

import java.util.Date;
/**
 * 订单信息类
 * @author glmapper
 *
 */
public class OrderInfo {
	private String orderId;//订单ID
	private long goodsId;//商品ID
	private long userId;//用户ID
	private Date orderTime;//下单时间
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public long getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(long goodsId) {
		this.goodsId = goodsId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	
	
}
