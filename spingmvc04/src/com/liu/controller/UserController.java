package com.liu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
@RequestMapping(value="/list.do")
	public String list() {
		System.out.println("查询用户信息-----");
		return "userinfo/user_list";
	}
    @RequestMapping("/add.do")
	public String add() {
		System.out.println("用户信息添加-----");
		return "userinfo/user_add";
	}
    @RequestMapping("/update.do")
 	public String update() {
 		System.out.println("用户信息修改-----");
 		return "userinfo/user_update";
 	}
}
