<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${memberVO.m_name}'s TODO</title>
</head>
<body>
	<div id="wrapper">
		<jsp:include page="./todonav/todoNav.jsp"/>
		<div id="todoList" class="daily">
		<c:forEach var="todo" items="${todoList}">
			<input type="checkbox">
			<p>${todo.dday_pk}</p> <%-- 이걸 통해서 값 가져오기! --%>
			<p>${todo.ctnt}</p>
			<p>${todo.regDate}</p>
		</c:forEach>
		</div>
		<%-- 별도의 페이지에서 daily todo를 작성하기 --%>
		<button onclick="location.href='/todo/dailyWrite'">+</button>
	</div>
</body>
</html>