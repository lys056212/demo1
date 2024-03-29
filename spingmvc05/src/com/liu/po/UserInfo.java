package com.liu.po;

import java.util.Arrays;

import javax.xml.crypto.Data;

import org.springframework.format.annotation.DateTimeFormat;

public class UserInfo {

	
	private Integer userId;
	
	private String userName;
	
	private String userSex;
	
	private String[] userxq;

	private Data userTime;
	
	public Data getUserTime() {
		return userTime;
	}
	public void setUserTime(Data userTime) {
		this.userTime = userTime;
	}
	public String[] getUserxq() {
		return userxq;
	}
	public void setUserxq(String[] userxq) {
		this.userxq = userxq;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", userSex=" + userSex + ", userxq="
				+ Arrays.toString(userxq) + ", userTime=" + userTime + "]";
	}


}
