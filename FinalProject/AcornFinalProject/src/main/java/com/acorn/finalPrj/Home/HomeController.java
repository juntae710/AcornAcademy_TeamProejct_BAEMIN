package com.acorn.finalPrj.Home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "home/home";
	}
	
	@GetMapping("/cartList")
	public String cartList() {
		return "home/cart_list";
	}
	
}
