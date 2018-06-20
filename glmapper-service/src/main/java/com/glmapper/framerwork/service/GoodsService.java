package com.glmapper.framerwork.service;

import java.util.List;

import com.glmapper.framerwork.dmo.Goods;

public interface GoodsService {
	
	/**
	 * 查询所有商品信息
	 * 
	 * @param offset 查询起始位置
	 * @param limit 查询条数
	 * @return
	 */
	List<Goods> queryAll(int offset,int limit);

}
