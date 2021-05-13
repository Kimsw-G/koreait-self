<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${memberVO.m_name}'s TODO</title>
</head>
<body>
	<div id="wrapper">
		<jsp:include page="./todonav/todoNav.jsp"/>
		<div id="todoList" class="dday">
		<c:forEach var="todo" items="${todoList}">
		<input type="hidden" name="dday" value="${todo.dday}"> <%-- 이 값을 js로 넘기기 --%>
			<p>D
			<c:choose>
				<c:when test="${todo.nowDday eq 0}">-DAY</c:when>
				<c:when test="${todo.nowDday gt 0}">+${todo.nowDday}</c:when>
				<c:otherwise>${todo.nowDday}</c:otherwise>
			</c:choose>
			</p>
			<p>${todo.content }</p>
			<button>삭제하기</button>
		</c:forEach>
		<button onclick="location.href='/todo/ddayWrite'">+</button>
		</div>
	</div>

</body>
</html>