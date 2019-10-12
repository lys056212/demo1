package com.geek09.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDB {
	
	//公用数据连接方法
	public static Connection getConn() {
		//1.加载驱动
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");//建立连接
			conn=DriverManager.getConnection("jdbd:mysql://localhost:3306/TestServlet","root","root");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	public int exexuteUpdate(String sql,Object[] obj) {
		
		PreparedStatement pstmt=null;
		Connection conn=null;
		
		
		try {
			
			pstmt=conn.prepareStatement(sql);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return 0;
	}
	
	public void setParam(PreparedStatement pstmt,Object[] obj) {
		
		if(obj!=null) {
			for (int i = 0; i < obj.length; i++) {
				try {
					pstmt.setObject(i+1, obj[i]);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
	
	public static void closeAll(Connection conn,Statement pstmt,ResultSet rs) {
		try {
			if(rs!=null) {
				rs.close();
			}
			if(pstmt!=null) {
				pstmt.close();
			}
			if(conn!=null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	

}
