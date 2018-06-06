<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page import="java.util.List"  %>
    <%@ page import="com.ZGY.Servlet.pojo.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>用户列表</title>
</head>
<body>
<table border="1",align="center" width="50%"  cellspacing="0" cellpadding="0">
<tr>
		<td>ID</td>
		<td>用户名</td>
		<td>密码</td>
		<td>电话</td>
		<td>送货地址</td>
		<td>注册日期</td>
		<td>操作</td>
		</tr>
	   <!-- 获取服务器端绑定的数据 -->
		<c:forEach var="user" items="${users}">
		<tr>
		<td>${user.id}</td>
		<td>${user.username}</td>
		<td>${user.password}</td>
		<td>${user.phone}</td>
		<td>${user.addr}</td>
		<td>${user.rdate}</td>
		<td><a href="user_delete.do?id=${user.id}">删除</a>|<a href="user_rivese.do?id=${user.id}">修改</a></td>
		</tr>
	</c:forEach>

</table>
</body>
</html>