package com.liu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	
	@RequestMapping("/hello.do")
	public String hello(String userName,Model model) {
		
		System.out.println(userName);
		
		model.addAttribute("helloword","Hello:"+userName);
		
		
		return "index";
	}
}
