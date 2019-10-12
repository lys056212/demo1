<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Insert title here</title>
</head>
<body>
<h1>用户信息添加3</h1>
<form action="user/add3.do" method="post">
            编号：<input type="text" name="userId"/></br>
           姓名：<input type="text" name="userName"/></br>
           性别：<input type="text" name="userSex"/></br>
          兴趣爱好：
<input type="checkbox" name="userxq" value="LOL"/>LOL
<input type="checkbox" name="userxq" value="英雄联盟"/>英雄联盟
<input type="checkbox" name="userxq" value="DOTA"/>DOTA</br>
            时间：<input type="text" name="userTime"/></br>

<input type="submit" value="提交"/>
</form>
</html>