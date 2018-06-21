<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*, java.text.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
    .tabWrap { width: 900px; height: 2000px; }
    .tab_Menu { margin: 0px; padding: 0px; list-style: none; }
    .tabMenu { width: 150px; margin: 0px; text-align: center;
               padding-top: 10px; padding-bottom: 10px; float: left; }
    .tabMenu a { color: #000000; font-weight: bold; text-decoration: none; }
    .current { background-color: #FFFFFF;
               border: 1px solid black; border-bottom:hidden; }
    .tabPage { width: 900px; height: 470px; float: left;
               border: 1px solid black; }
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>정산</title>
<script src="https://blog.jquery.com/2012/08/09/jquery-1-8-released/"></script>
<script type="text/javascript">
	function goBack() {
		window.history.go(-2);
	}
</script>
</head>
<body>
<input type="button" value="뒤로" onclick="goBack();">
<div class="tabWrap">
    <ul class="tab_Menu">
        <li class="tabMenu current">
            <a href="#tabContent01" >인성관</a>
        </li>
        <li class="tabMenu">
            <a href="#tabContent02" >환경과학대학</a>
        </li>
        <li class="tabMenu">
            <a href="#tabContent03" >생활관</a>
        </li>
    </ul>
    <div class="tab_Content_Wrap">
        <div id="tabContent01" class="tabPage">
        
         <br><br>
        <center>
        <form method="post" action="/controller/admin/total/insung">
        <input type="text" name="date">
        <input type="submit" value="검색">
       	<h3>검색할 월 입력</h3>
       	<h5>(ex)2017년 5월 => 2017-05</h5>
       	</form>
       	</center>
      	<div id="TAB1">
            <br><br>
            <br><br>		
            	 <table style="width=2000; table-layout:fixed;" borderColor=#000000 cellSpacing=0 cellPadding=0 border=1 align="center">
				 <c:forEach var="inSung" items="${insungTot}">
				<tr>
				<td>월별 충전 금액: ${inSung.insungTot}</td>	
				</tr>
				</c:forEach>
				  </table>
				  <br><br>
				  
				 <center>
				 <h3>인성관 인기메뉴</h3>
				 </center>
				 <table style="width=2000; table-layout:fixed;" borderColor=#000000 cellSpacing=0 cellPadding=0 border=1 align="center">
				 <tr height=50>
            	 <th>메뉴 이름</th>
            	 <th>구매 횟수</th>
            	 </tr>
            	 <c:forEach var="inSung" items="${insungMenu}">
            	 <tr>
            	 <td>${inSung.mn_name}
				 <td>${inSung.insungChk}</td>	
				 </tr>
				 </c:forEach>
				 </table>
				
				</div>
				</div>
        <div id="tabContent02" class="tabPage">
              <br><br>
        <center>
        <form method="post" action="/controller/admin/total/hwan">
        <input type="text" name="date">
        <input type="submit" value="검색">
       	<h3>검색할 월 입력</h3>
       	<h5>(ex)2017년 5월 => 2017-05</h5>
       	</form>
       	</center>
      	<div id="TAB2">
            <br><br>
            <br><br>		
            	 <table style="width=2000; table-layout:fixed;" borderColor=#000000 cellSpacing=0 cellPadding=0 border=1 align="center">
				<c:forEach var="hwan" items="${hwanTot}">
				<tr>
				<td>월별 충전 금액: ${hwan.hwanTot}</td>	
				</tr>
				</c:forEach>
				  </table>
				  <br><br>
				 <center>
				 <h3>환과대 인기메뉴</h3>
				 </center>
				 <table style="width=2000; table-layout:fixed;" borderColor=#000000 cellSpacing=0 cellPadding=0 border=1 align="center">
				 <tr height=50>
            	 <th>메뉴 이름</th>
            	 <th>구매 횟수</th>
            	 </tr>
            	 <c:forEach var="hwan" items="${hwanMenu}">
            	 <tr>
            	 <td>${hwan.mn_name}
				 <td>${hwan.hwanChk}</td>	
				 </tr>
				 </c:forEach>
				 </table>
				</div>
				</div>
        <div id="tabContent03" class="tabPage">
               <br><br>
        <center> <form method="post" action="/controller/admin/total/dorm">
        <input type="text" name="date">
        <input type="submit" value="검색">
       	<h3>검색할 월 입력</h3>
       	<h5>(ex)2017년 5월 => 2017-05</h5>
       	</form>
       	</center>
      	<div id="TAB3">
            <br><br>
            <br><br>		
            	 <table style="width=2000; table-layout:fixed;" borderColor=#000000 cellSpacing=0 cellPadding=0 border=1 align="center">
				 <c:forEach var="dorm" items="${dormTot}">
				<tr>
				<td>월별 충전 금액: ${dorm.dormTot}</td>	
				</tr>
				</c:forEach>
				  </table>
				  <br><br>
				 <center>
				 <h3>기숙사 인기메뉴</h3>
				 </center>
				 <table style="width=2000; table-layout:fixed;" borderColor=#000000 cellSpacing=0 cellPadding=0 border=1 align="center">
				 <tr height=50>
            	 <th>메뉴 이름</th>
            	 <th>구매 횟수</th>
            	 </tr>
            	 <c:forEach var="dorm" items="${dormMenu}">
            	 <tr>
            	 <td>${dorm.mn_name}
				 <td>${dorm.dormChk}</td>	
				 </tr>
				 </c:forEach>
				 </table>
				
				</div>
				</div>
				</div>
				</div>
		
	
	
<script type="text/javascript" src="http://code.jquery.com/jquery-1.12.0.min.js" ></script>
<script type="text/javascript">
    function tabSetting() {
        // 탭 컨텐츠 hide 후 현재 탭메뉴 페이지만 show
        $('.tabPage').hide();
        $($('.current').find('a').attr('href')).show();
 
        // Tab 메뉴 클릭 이벤트 생성
        $('li').click(function (event) {
            var tagName = event.target.tagName; // 현재 선택된 태그네임
            var selectedLiTag = (tagName.toString() == 'A') ? $(event.target).parent('li') : $(event.target); // A태그일 경우 상위 Li태그 선택, Li태그일 경우 그대로 태그 객체
            var currentLiTag = $('li[class~=current]'); // 현재 current 클래그를 가진 탭
            var isCurrent = false; 
             
            // 현재 클릭된 탭이 current를 가졌는지 확인
            isCurrent = $(selectedLiTag).hasClass('current');
             
            // current를 가지지 않았을 경우만 실행
            if (!isCurrent) {
                $($(currentLiTag).find('a').attr('href')).hide();
                $(currentLiTag).removeClass('current');
 
                $(selectedLiTag).addClass('current');
                $($(selectedLiTag).find('a').attr('href')).show();
            }
 
            return false;
        });
    }
    $(function () {
        // 탭 초기화 및 설정
        tabSetting();
    });
</script>
</body>
</html>