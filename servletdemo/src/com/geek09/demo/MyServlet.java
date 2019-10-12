package com.geek09.demo;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{

	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//String value = this.getServletContext().getInitParameter("geek09");
		
		//1.sendRedirect
//		      resp.sendRedirect("http://geek09.com");
		
		//2.include
		//3.forword
		
//		PrintWriter out=resp.getWriter();
//		out.print("Hello Servlet!");
//		out.close();
		//1.sendRedirect
		//resp.sendRedirect("http://www.geek99.com");
		//2.forward
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
