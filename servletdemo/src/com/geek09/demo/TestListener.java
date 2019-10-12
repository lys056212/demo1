package com.geek09.demo;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestListener
 */
@WebServlet("/TestListener")
public class TestListener extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestListener() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		ServletContext ctx=this.getServletContext();
//		ctx.setAttribute("ctx_name", "ctx_value");
//		
//		//replace
//		ctx.setAttribute("ctx_name", "ctx_value2");
//	    ctx.removeAttribute("ctx_name");
//		
		HttpSession session=request.getSession();
		//session.invalidate();
		session.setAttribute("s_name","s_value");
		session.setAttribute("s_name","s_value2");
		session.removeAttribute("s_name");
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
