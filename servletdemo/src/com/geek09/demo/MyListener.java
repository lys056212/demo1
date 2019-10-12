package com.geek09.demo;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

//import javax.servlet.ServletContextAttributeEvent;
//import javax.servlet.ServletContextAttributeListener;
//import javax.servlet.ServletContextEvent;
//import javax.servlet.ServletContextListener;
//import javax.servlet.http.HttpSessionEvent;
//
//public class MyListener  implements ServletContextListener{
//
//	@Override
//	public void contextDestroyed(ServletContextEvent arg0) {
//		System.out.println("contextInitialized-----");
//	}
//
//	@Override
//	public void contextInitialized(ServletContextEvent arg0) {
//		System.out.println("contextInitialized----");
//	}
//
//}



//public class MyListener implements ServletContextAttributeListener{
//
//	@Override
//	public void attributeAdded(ServletContextAttributeEvent event) {
//		System.out.println("attributeAdded..........");
//	}
//
//	@Override
//	public void attributeRemoved(ServletContextAttributeEvent event) {
//		System.out.println("attributeRemoved..........");
//	}
//
//	@Override
//	public void attributeReplaced(ServletContextAttributeEvent event) {
//		System.out.println("attributeReplaced..........");
//	}
//	
//}




//import javax.servlet.http.HttpSessionListener;
//public class MyListener implements HttpSessionListener{
//
//	@Override
//	public void sessionCreated(HttpSessionEvent se) {
//		// TODO Auto-generated method stub
//		System.out.println("sessionCreated-------");
//	}
//
//	@Override
//	public void sessionDestroyed(HttpSessionEvent se) {
//		// TODO Auto-generated method stub
//		System.out.println("sessionDestroyed-------");
//	}
//	
//	
//}




//public class MyListener implements HttpSessionAttributeListener{
//
//	@Override
//	public void attributeAdded(HttpSessionBindingEvent event) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void attributeRemoved(HttpSessionBindingEvent event) {
//		// TODO Auto-generated method stub
//		System.out.println("attributeRemoved------");
//	}
//
//	@Override
//	public void attributeReplaced(HttpSessionBindingEvent event) {
//		// TODO Auto-generated method stub
//		System.out.println("attributeReplaced------");
//	}
	
public class MyListener implements ServletRequestListener{

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		System.out.println("requestDestroyed------");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		System.out.println("requestInitialized------");
	}
	
}






