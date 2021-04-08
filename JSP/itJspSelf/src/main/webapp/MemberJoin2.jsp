<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2> 회원가입 양식 </h2>
	<form action="Mproc2" method="post">
	<table width="400" border="1" bordercolor="gray">
		<tr height="40">
			<td width="150" align="center"> 아이디
			<td width="250"><input type="text" name="id">
		</tr>
		<tr height="40">
			<td width="150" align="center"> 패스워드
			<td width="250"><input type="password" name="password">
		</tr>
		<tr height="40">
			<td width="150" align="center"> 이메일
			<td width="250"><input type="email" name="email">
		</tr>
		<tr height="40">
			<td width="150" align="center"> 전화
			<td width="250"><input type="tel" name="tel">
		</tr>
		<tr height="40">
			<td width="150" align="center"> 주소
			<td width="250"><input type="text" name="address">
		</tr>
		<tr height="40">
			<td colspan="2"> <input type="submit" value="회원가입">
		</tr>
	</table>
	</form>

</body>
</html>