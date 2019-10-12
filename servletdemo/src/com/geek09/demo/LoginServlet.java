package com.geek09.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServtley
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    	System.out.println("LoginServlet---");
    }
    @Override
    public void init() throws ServletException {
    	super.init();
    	System.out.println("init---");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet---");
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost---");
		PrintWriter out=response.getWriter();
		out.print("<h1>Login Servlet</h1>");
		
		request.getRequestDispatcher("PrintHTMLServlet").include(request,response);
//		request.getRequestDispatcher("PrintHTMLServlet").forward(request,response);
//		
	
//		
//		request.getRequestDispatcher("PrintHTMLServlet").forward(request, response);
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy---");
	}

}
