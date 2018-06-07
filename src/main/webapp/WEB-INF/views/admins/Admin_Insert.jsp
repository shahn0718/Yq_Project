<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>관리자 메뉴등록</title>
</head>
<script type="text/javascript">
	function goBack() {
		window.history.back();
	}
</script>

<body>
<input type="button" value="뒤로" onclick="goBack();">
<form method="post" action="/controller/admin/insertok">
<br>
<br>
<table cellspacing="10px" align="center">
  <h2>메뉴 등록</h2>
  <tr>
		<td>일련번호</td>
		<td><input type="text" name="mn_id" value="" size=""></td>
	</tr>
	<tr>
		<td>날짜</td>
		<td><input type="text" name="mn_date" size=""></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input type="text" name="mn_name" size=""></td>
	</tr>
	<tr>
		<td>가격</td>
		<td><input type="radio" name="mn_price" value="2500">2500
		<input type="radio" name="mn_price" value="3000">3000</td>
		<td><input type="radio" name="mn_price" value="3500">3500
		<input type="radio" name="mn_price" value="4000">4000</td>
	
	
	</tr>
	<tr>
		<td>장소 </td>
		<td>
		<input type="radio" name="chain" value="인성관">인성관
		<input type="radio" name="chain" value="생활관">생활관
		</td>
		<td>
		<input type="radio" name="chain" value="환경과학대">환과대
		</td>
	</tr>
	<tr>
		<td>타입</td>
		<td><input type="text" name="mn_type" size=""></td>
	</tr>
</table>
<br>
<br>
<br>
<input type="submit" value="등록">

</form>
</body>
</html>