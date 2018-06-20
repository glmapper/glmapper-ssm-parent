package com.glmapper.framerwork.dmo;

/**
 * 商品信息类
 * @author glmapper
 *
 */
public class Goods {
	private long goodsId;// 商品ID

	private String goodsName;// 商品名称

	private int number;// 商品库存

	public long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(long goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
