<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BananaTodo</title>

</head>
<body>
<c:if test="">
	<jsp:forward page="/todo/main"/>
</c:if>

<c:if test="${flag}"> <%--로그인 실패시 스크립트로 알람 띄우기--%>

</c:if>


<div id="wrapper">
	<form action="/member/login" method="post" id="loginFrom">
		<input type="text" name="id" placeholder="아이디">
		<input type="password" name="pw" placeholder="비밀번호">
		<button type="submit" form="loginForm">로그인</button>
		<button onclick="location.href='/member/regist'">회원가입</button>
		<%-- 후에 구글, 네이버 로그인 기능 구현해주기 --%>
	</form>
</div>

</body>
</html>