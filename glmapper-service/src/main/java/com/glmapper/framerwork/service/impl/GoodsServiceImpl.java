package com.glmapper.framerwork.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.glmapper.framerwork.dao.GoodsDao;
import com.glmapper.framerwork.dmo.Goods;
import com.glmapper.framerwork.service.GoodsService;

@Service
@Qualifier("goodsService")
public class GoodsServiceImpl implements GoodsService {

	@Autowired 
	private GoodsDao goodsDao;

	public List<Goods> queryAll(int offset, int limit) {
		System.out.println("excute queryAll method...");
		List<Goods> list = new ArrayList<Goods>();
		return list;
	}
}
