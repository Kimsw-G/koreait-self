<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<c:set var="i" value="4"/>
<c:if test="${i>3}">
	안녕
</c:if>
<br>
<c:forEach var="i" begin="1" end="10">
	${i}점심시간<br>
</c:forEach>

</body>
</html>