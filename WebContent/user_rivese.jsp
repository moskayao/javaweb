<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page import="java.util.List"  %>
    <%@ page import="com.ZGY.Servlet.pojo.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>�û��б�</title>
</head>
<body>
<h1 align="center">�û�ע��</h1>
<hr>
<form action="user_rivese.do"  method="post" >
 <table border="1",align="center" width="80%"  cellspacing="0" cellpadding="0">
 <tr>
	<td>ID</td><td><input type="text" name="id"  value=${user.id}></td>
	</tr>
	<tr>
	<td>�û���</td><td><input type="text" name="username"  value=${user.username }></td>
	</tr>
	<tr>
	<td>����</td><td><input type="password" name="password" value=${user.password}></td>
	</tr>
	<tr>
	<td>�绰</td><td><input type="text" name="phone" value=${user.phone}></td>
	</tr>
	<tr>
	<td>�û���ַ</td><td><textarea name="addr" value=${user.addr }></textarea></td>
	</tr>
	<tr>
	<td colspan="2"><input type="rest" value="����"><input type="submit" value="�ύ"></td>
	</tr>

 </table>
</body>
</html>