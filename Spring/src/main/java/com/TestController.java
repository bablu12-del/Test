package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {
	
	
	@RequestMapping("/home")
	@ResponseBody
	public String home() {
		System.out.println("inside");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("inside about");
		return "about";
	}
}
