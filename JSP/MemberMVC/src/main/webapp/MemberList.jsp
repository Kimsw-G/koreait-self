<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2> 회원 정보</h2>
<table width="800" border="1" bordercolor="gray">
	<tr>
		<td align="center" widht="100">아이디
		<td align="center" widht="100">이메이
		<td align="center" widht="100">전화
		<td align="center" widht="100">취미
		<td align="center" widht="100">직업
		<td align="center" widht="100">나이	
	</tr>
	<c:forEach var="bean" items="${v }">
	<tr>
		<td align="center" widht="100">${bean.id }
		<td align="center" widht="100">${bean.email }
		<td align="center" widht="100">${bean.tel }
		<td align="center" widht="100">${bean.hobby }
		<td align="center" widht="100">${bean.job }
		<td align="center" widht="100">${bean.age }
	</tr>
	</c:forEach>

</table>


</body>
</html>