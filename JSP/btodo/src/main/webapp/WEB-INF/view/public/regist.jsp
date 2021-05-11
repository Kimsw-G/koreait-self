<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<div>
	<form action="/member/regist" method="post" id="registForm">
		<label for="id">아이디</label><input type="text" placeholder="아이디" name="id" id="id">
		<button>중복체크</button><br>
		<label for="pw">비밀번호</label><input type="password" placeholder="비밀번호" name="pw" id="pw"><br>
		<label for="pwck">비밀번호 체크</label><input type="password" placeholder="비밀번호 체크" name="pwck" id="pwck"><br>
		<label for="name">이름</label><input type="text" placeholder="이름	" name="name" id="name"><br>
		<label for="tel">전화번호</label>
		<div id="tel[]">
		<%-- 첫 박스는 드롭다운으로 구현 --%>
			<input type="number" name="tel" id="tel1"> 
			<input type="number" name="tel" id="tel2">
			<input type="number" name="tel" id="tel3">		
		</div>
		
	</form>
</div>
</body>
</html>