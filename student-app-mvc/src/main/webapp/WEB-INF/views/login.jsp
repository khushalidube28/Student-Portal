<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<link href='<c:url value="resources/styles/bootstrap.min.css"/>' rel="stylesheet"/>
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght
,FILL,GRAD@20..48,100..700,0..1,-50..200" /><meta charset="UTF-8">

<style>

body{
background-color:skyblue;
margin:0;
display:flex;
justify-content:center;
align-items:center;
height:100vh;
font-family:Arial,sans-serif;
}

.header{
	top:0;
	text-align:center;
	padding:20px;
}

.header h1{
	color:white;
	margin:0;}

.container{
	width:400px;
	background-color:white;
	border-radius:8px;
	box-shadow:0 4px 8px rgba(0,0,0,0.1);
	padding:20px;
}

.login-form{
text-align:center;}
h1{
margin-bottom:20px;}
label{
display:block;
margin-bottom:10px;}

input{
	width:100%;
	padding:8px;
	border:1px solid #ccc;
	border-radius:4px;
	margin-bottom:20px;
	
}

button{
	background-color:skyblue;
	color:white;
	border:none;
	padding:10px 20px;
	border-radius:4px;
	cursore:pointer;
	font-size:16px;
}

button:hover{
background-color:#0099cc;}

</style>
<title>Insert title here</title>
</head>
<body>
<div class="header">
<h1>Student Management System</h1>
</div>
<div class="container">
	<div class="login-form">
		<h2>Login</h2>
		<span style="color:red;">${message}</span>
		<form action="school" method="post">
			<label for="username">Username</label>
			<input type="text" id="username" name="username" required>
			<br>
			<label for="password">Password</label>
			<input type="password" id="password" name="password" required>
			<br>
			<button type="submit" >LOGIN</button>
		</form>
	</div>
</div>

</body>
</html>