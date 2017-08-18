package com.itzixi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alipay")
public class AlipayController {
	
//	@Autowired
//	private IUserService userService;

	/**
	 * 
	 * @Description: TODO
	 * @param model
	 * @return
	 * @throws Exception
	 * 
	 * @author leechenxiang
	 * @date 2016年3月25日 下午10:36:49
	 */
	@RequestMapping(value = "/products")
	public String products(Model model) throws Exception {
		
//		User user = userService.findUserById(1);
//		model.addAttribute("username", user.getName());
		
		return "products";
	}
	
}
