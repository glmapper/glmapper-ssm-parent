package com.glmapper.framerwork.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.glmapper.framerwork.dmo.Goods;

@Repository
public interface GoodsDao {

	/**
	 * 通过ID查询单件商品信息
	 * 
	 * @param id
	 * @return
	 */
	Goods queryById(long id);

	/**
	 * 查询所有商品信息
	 * 
	 * @param offset 查询起始位置
	 * @param limit 查询条数
	 * @return
	 */
	List<Goods> queryAll(@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * 减少商品库存
	 * 
	 * @param bookId
	 * @return 如果影响行数等于>1，表示更新的记录行数
	 */
	int reduceNumber(long goodsId);

}
