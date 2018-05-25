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
<title>충전 페이지</title>
</head>
<body>


<input type="button" value="뒤로" onclick="goBack()">
<form method="post" action="recharge/complete">
<br>
<br>
<br>
<br>
<%-- <% session.getAttribute("stu_id");%> --%>
<table align="center">
	<tr align="center">
		<td>충전가격</td>
	</tr>
	<br>
	<br>
	<tr>
		
		<!--  <td><input type="text" name="recharge_mn" value="" size=" "></td>-->
		<td><input type="radio" name="recharge_mn" value="1000">1000</td>
		<td><input type="radio" name="recharge_mn" value="3000">3000</td>
		<td><input type="radio" name="recharge_mn" value="5000">5000</td>
		<td><input type="radio" name="recharge_mn" value="10000">10000</td>
		
	</tr>
</table>

<br>
<br>
<br>

<br>
<br>
<br>
<input type="submit" value="충전">

</form>
</body>
</html>