package com.geek09.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

	@Override
	public User login(String username, String password) {
	
		try{
			Connection conn=BaseDB.getConn();
			String sql="select id,username,password from UserTbl where username=? and password=?";
			//String sql="select id,username,password from UserTbl where username=? and password=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,username);
			pstmt.setString(2,password);
			
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				int id =rs.getInt(1);
				User u=new User();
				u.setId(id); 
				u.setUsername(username);
				u.setPassword(password);
				return u;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
