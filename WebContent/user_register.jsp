<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
    <%@ page import="java.util.List"  %>
    <%@ page import="com.ZGY.Servlet.pojo.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>用户列表</title>
</head>
<body>
<h1 align="center">用户注册</h1>
<hr>
<form action="user_register.do"  method="post" >
 <table border="1",align="center" width="80%"  cellspacing="0" cellpadding="0">
	<tr>
	<td>用户名</td><td><input type="text" name="username"></td>
	</tr>
	<tr>
	<td>密码</td><td><input type="password" name="password"></td>
	</tr>
	<tr>
	<td>电话</td><td><input type="text" name="phone"></td>
	</tr>
	<tr>
	<td>用户地址</td><td><textarea name="addr"></textarea></td>
	</tr>
	<tr>
	<td colspan="2"><input type="rest" value="重置"><input type="submit" value="提交"></td>
	</tr>

 </table>
</form>
</body>
</html>