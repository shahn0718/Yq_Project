<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>관리자 페이지</title>
<script type="text/javascript" src="script/admin.js"></script>
</head>
<body>
<br><br>
<center><h1>관리자 페이지</h1></center><br><br>
<center>
<form method="post" action="AdminLogin.do" name="frm">
<table cellpadding="10px">
	<tr>
		<td width="40%">학&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;번</td>
		<td><input type="text" name="ad_id" value="${ad_id}" size="20"></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type="password" name="ad_pw"  size="21"></td>
	</tr>
</table><br>
<input type="submit" value="로그인" onclick="return loginCheck()">
<input type="reset" value="취소">
<h2>${message }</h2>
</form>
<form method= "post" action="Student_Login_Page.jsp">
<input type="submit" value="학생로그인">
</form>