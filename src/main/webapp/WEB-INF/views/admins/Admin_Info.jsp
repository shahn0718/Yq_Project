<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Information page</title>
</head>
<body>
<form method="post" action="Student_Main_Page.jsp">
<input type="submit" value="뒤로"></form><br><br>
<table cellpadding="20px" style="position:relative; left: 150px; top:20px;">
<c:forEach var="admin" items="${adInfo}">	
<tr>
	<td>관리자 이름 : </td>
	<td>${admin.ad_name}</td>
</tr>
<tr>
	<td>관리자 번호 : </td>
	<td>${admin.ad_id}</td>
</tr>
</c:forEach>
</table>
<br>
<br>
<br>

<form method="post"  action="Foruse.do">
<input type= "submit" value ="사용">


</form>
<!-- <div style="position:absolute; left:180px; bottom:40px"> -->
<!-- <img src="MacintoshHD/Users/ahn/Documents\QR코드.png" width=150px height=150px> -->

</body>
</html>