package com.glmapper.framerwork.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.glmapper.framerwork.service.holder.SpringContextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.glmapper.framerwork.dmo.Goods;
import com.glmapper.framerwork.service.GoodsService;
import com.glmapper.framerwork.service.OrderService;

@Controller
@RequestMapping("/buy")
public class BuyController {

	@Autowired
	private OrderService orderService;

//	@Autowired
//	private GoodsService proxy;

	@Autowired
	private GoodsService goodsService;


	@RequestMapping("/initPage")
	public ModelAndView initPage(HttpServletRequest request,
			HttpServletResponse response, ModelAndView view) {

//		GoodsService proxy= (GoodsService) SpringContextUtil.getBean("proxy");

//		GoodsService goodsService=(GoodsService) SpringContextUtil.getBean("goodsServiceImpl");

		List<Goods> goods = goodsService.queryAll(10,10);
		view.addObject("goodsList", goods);
		view.setViewName("goodslist");
		return view;
	}
}
