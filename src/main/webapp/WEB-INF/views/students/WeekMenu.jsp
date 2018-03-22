<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>주간 메뉴</title>
</head>
<body>

<form method="post" action="Student_Menu.jsp">
<input type="submit" value="뒤로"></form>


<center><h1>주간 메뉴</h1>
   	<table style="width:2000; table-layout:fixed; text-align:center;" borderColor=#000000  cellSpacing=0 cellPadding=0 border=1 align="center">
    			<tr height=50>
            	 <th>일자</th>
            	 <th>위치</th>
            	 <th>종류</th>
            	 <th>메뉴명</th>
            	 <th>가격</th>
				 </tr>
            	 <c:forEach var="Week" items="${weekList}">		
				 <tr height=50>
				 <td width=100>${Week.mn_date}</td>
				 <td width=100>${Week.chain}</td>
				 <td width=100>${Week.mn_type}</td>
				 <td width=100>${Week.mn_name}</td>
				 <td width=100>${Week.mn_price}</td>
				 </tr>
				 </c:forEach>
				 </table>
</center>

</body>
</html>