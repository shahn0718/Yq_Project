<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*, java.text.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>사용자 비밀번호 찾기</title>
</head>
<body>
<form method="post" action="Admin_Main_Page.jsp">
<input type="submit" value="뒤로">
</form>
<br><br><br>
<form method="post" action="/controller/admin/findpw">
<center><h1>비밀번호 찾기</h1></center><br><br>
<!-- <form method="post" action="AdminPw.do"> -->

<table cellpadding="10px">
 	<tr>
		<td width="40%">학&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;번</td>
		<td><input type="text" name="stu_id" size="20"></td>
		<td><input type="submit" value="찾기"></td>
	</tr>
</table>
</form>
<table cellpadding = "10px">
<c:forEach var="info" items="${findPw}">
	<tr>
		<td>이름</td>	
		<td>${info.stu_name}</td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td>${info.stu_pw}</td>
	</tr>	
	</c:forEach>
</table>
<br>
	
	

<!-- 	<a href='#' onclick="history.go(0)">새로고침</a> -->
	<h2>${message}</h2>
</form>
</body>
</body>
</html>