package com.geek09.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;

/**
 * Servlet implementation class ResponseHeaderServlet
 */
@WebServlet("/ResponseHeaderServlet")
public class ResponseHeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResponseHeaderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//         response.setContentType("application/vnd.ms-excel");
//	       PrintWriter out=response.getWriter();
//	       out.println("\tQ1\tQ2\tQ3\tQ4\tTotal");
//	       out.println("Apples\t78\t87\t92\t=SUM(B2:E2)");
//	       out.println("Oranges\t77\t86\t93\t30\t=SUM(B3:E3)");
//	
	       
//	       response.setContentType("images/jpeg");
//	       InputStream in =this.getClass().getClassLoader().getResourceAsStream("girl.jpg");
//	       int len =in.available();
//	       byte[] buffer=new byte[len];
//	       //输出值
//	       OutputStream out=response.getOutputStream();
//	       out.write(buffer);
//	       out.flush();
//	       out.close();
		
		
		response.setHeader("refresh", "1");
		response.setContentType("text/html;charset=gbk");
		PrintWriter out =response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<HTML>");
		out.println("<head><title>Servlet</title></head>");
		out.println("<body>");
		out.println("当前时间为：");
		out.println(new Date().toLocaleString());
		out.println("</body>");
		out.println("<html>");
		out.flush();
	    out.close();
	       
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
