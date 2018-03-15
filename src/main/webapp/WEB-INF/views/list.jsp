<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>




</head>

<body>
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<c:forEach items="${stulist}" var="c">
			<tr>
			<!--	<td>${c.stu_id}</td> -->
			<!--	<td>${c.stu_name}</td> -->
				<td>${c.stu_pw}</td>
			<!--  <td>${c.stu_change}</td>	-->
			</tr>

		</c:forEach>

	</table>
</body>
</html>