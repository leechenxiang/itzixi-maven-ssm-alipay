package com.itzixi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @Title: AlipayController.java
 * @Package com.itzixi.controller
 * @Description: controller
 * Copyright: Copyright (c) 2016
 * Company:FURUIBOKE.SCIENCE.AND.TECHNOLOGY
 * 
 * @author leechenxiang
 * @date 2017年8月18日 上午10:39:15
 * @version V1.0
 */
@Controller
@RequestMapping("/alipay")
public class AlipayController {
	
	/**
	 * 
	 * @Description: 显示产品列表
	 * @param model
	 * @return
	 * @throws Exception
	 * 
	 * @author leechenxiang
	 * @date 2016年3月25日 下午10:36:49
	 */
	@RequestMapping(value = "/products")
	public String products(Model model) throws Exception {
		
		return "products";
	}
	
}
