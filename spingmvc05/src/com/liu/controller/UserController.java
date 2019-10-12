package com.liu.controller;

import java.text.SimpleDateFormat;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.liu.po.UserInfo;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/add1.do")
	public String add(HttpServletRequest request) {

    	 String userNumber=request.getParameter("userNumber");
    	 String passWord=request.getParameter("password");
    	 
    	 System.out.println("userNumber:"+userNumber+"passWord:"+passWord);
    	return "user_add1";
	}
  
    
    @RequestMapping("/add2.do")
 	public String add(String userNumber,String passWord) {

     
     	 System.out.println("userNumber:"+userNumber+"passWord:"+passWord);
     	return "user_add2";
 	}
    
    
    @RequestMapping("/add3.do")
 	public String add3(UserInfo user) {
     	 System.out.println(user);
     	return "user_add3";
 	}
    
    
    @RequestMapping("/add4.do")
 	public String add4(Integer userId,Data userTime) {

     
     	 System.out.println(userId);
    	 System.out.println(userTime );
     	return "user_add4";
 	}
    /**
     * 时间属性编辑器
     */
    
    
    @InitBinder
    public void iniBinder(ServletRequestDataBinder bin) {
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
    	CustomDateEditor cust=new CustomDateEditor(sdf, true);
    	bin.registerCustomEditor(Data.class, cust);
    }
    
    
    
    
}
