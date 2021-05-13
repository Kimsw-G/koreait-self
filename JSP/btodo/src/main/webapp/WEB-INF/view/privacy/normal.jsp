<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${memberVO.m_name}'s TODO</title>
<link href="/css/privacy/normal.css" rel="stylesheet" type="text/css" />
</head>
<body>

	<div id="wrapper">
		<jsp:include page="./todonav/todoNav.jsp"/>
		<div id="todoList" class="normal">
		<%-- 스크롤 설정하기! --%>
		<c:forEach var="todo" items="${todoList}">
			<input type="checkbox">
			<p>${todo.ctnt}</p>
			<p>${todo.regDate}</p>		
		</c:forEach>
		</div>
		<form action="/todo/normal" method="post">
			<input type="text" name="ctnt">
			<input type="submit" value="등록">		
		</form>
	</div>
</body>
</html>