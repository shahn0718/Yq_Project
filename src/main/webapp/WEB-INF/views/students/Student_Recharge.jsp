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


<input type="button" value="뒤로" onclick="goBack();">
<form method="post" action="recharge/complete">
<br>
<br>
<br>
<br>
<%-- <% session.getAttribute("stu_id");%> --%>
<table>
	<tr>
		<td>충전 가격</td>
		<td><input type="text" name="recharge_mn" value="" size=" "></td>
	</tr>
	
</table>

	
<%-- <h1>${loginUser.stu_id}</h1> --%>
<%-- <input type="text" name=${loginUser.stu_id} value='${stu_id}'></h1> --%>
<br>
<br>
<br>

<br>
<br>
<br>
<input type= "submit" value = "등록">

</form>
</body>
</html>