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
<table border="1",align="center" width="50%"  cellspacing="0" cellpadding="0">
<tr>
		<td>ID</td>
		<td>�û���</td>
		<td>����</td>
		<td>�绰</td>
		<td>�ͻ���ַ</td>
		<td>ע������</td>
		<td>����</td>
		</tr>
	   <!-- ��ȡ�������˰󶨵����� -->
		<c:forEach var="user" items="${users}">
		<tr>
		<td>${user.id}</td>
		<td>${user.username}</td>
		<td>${user.password}</td>
		<td>${user.phone}</td>
		<td>${user.addr}</td>
		<td>${user.rdate}</td>
		<td><a href="user_delete.do?id=${user.id}">ɾ��</a>|<a href="user_rivese.do?id=${user.id}">�޸�</a></td>
		</tr>
	</c:forEach>

</table>
</body>
</html>