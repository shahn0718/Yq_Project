<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
 function goBack(){
	 window.history.back();
 }

</script>
<title>학생 정보</title>
</head>
<body>
<input type="button"  value="뒤로" onclick="goBack();"><br><br>
<table cellpadding="20px" style="position:relative; left: 150px; top:20px;">
<c:forEach var="student" items="${stuInfo}">	
<tr>
	<td>이름 : </td>
	<td>${student.stu_name}</td>
</tr>
<tr>
	<td>학번 : </td>
	<td>${student.stu_id}</td>
</tr>
<tr>
	<td>잔액 : </td>
	<td>${student.stu_change}</td>
</tr>
</c:forEach>
</table>
<br>
<br>
<br>

<form method="post"  action="pay">
<input type= "submit" value ="사용">

</form>
</body>
</html>