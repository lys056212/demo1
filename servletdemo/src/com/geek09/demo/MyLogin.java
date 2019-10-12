package com.geek09.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyLogin
 */
@WebServlet("/MyLogin")
public class MyLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
         String username =request.getParameter("username");
         String password =request.getParameter("password");
         UserDao dao= new UserDaoImpl();
         User u=dao.login(username, password);
         if(u!=null) {
        	 HttpSession session=request.getSession();
        	 session.setAttribute("UserSession", u);
        	 request.getRequestDispatcher("welcome.jsp").forward(request, response);
         }else {
        	 System.out.println("username or password error,please relogin!");
         }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
