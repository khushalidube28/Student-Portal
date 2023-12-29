<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<link href='<c:url value="resources/styles/bootstrap.min.css"/>' rel="stylesheet"/>
<link href='<c:url value="resources/styles/school.css"/>' rel="stylesheet"/>

<style>

.container{
	max-width:500px;
	margin:40px auto;
	padding:20px;
	background-color:
	3fff;
	border-radius:5px;
	box-shadow:0 2px 5px rgba(0,0,0,0.1);
	}
.h1,h2{
	text-align:center;
	margin-bottom:20px;}

form{
	display:flex;
	justofy-content:center;
	align-items:center;
	margin-bottom:20px;
}
label{
	margin-right:10px;}
	
input[type="text"]{
	padding:8px;
	border:1px solid #ccc;
	border-radius:3px;
	outline:none;}
	
button{
	padding:8px 15px;
	background-color:#007BFF;
	color:#fff;
	border:none;
	border-radius:3px;
	cursor:pointer;}
	
button:hover{
	background:color:#0056b3;}
	
#studentData{
	display:flex;
	flex-direction:column;
	align-items:center;
	padding:20px;
	background-color:#f0f0f0;
	border-radius:5px;
	box-shadow:0 2px 5px rgba(0,0,0,0,1);}
	
3studentData h2{
	margin:bottom:10px;
}
studentData div{
	margin-bottom:10px;
	
}
.hidden{
display:none;}

.heading{
	background:skyblue;
	color:white;
	text-align:center;
	padding:20px;
	}
	
.options{
	margin-top:100px;
	margin-left:390px;
	}
</style>
<meta charset="UTF-8">
<title>SCHOOL PORTAL</title>
</head>
<body>
<div class="heading">
	COLLEGE MANAGEMENT SYSTEM
</div>
<div class="options">
	<button type="button" class="btn btn-primary" onclick="location.href='/index'">STUDENT MANAGEMENT</button>
	<button type="button" class="btn btn-primary" onclick="location.href='/fees'">FEES MANAGEMENT</button>
	<button type="button" class="btn btn-primary" onclick="location.href='/course'">COURSE MANAGEMENT</button>
</div>
<br>
<div class="container">
	<form id="studentForm" action="/studentdetails" method="get">
	<label for="studentId">Student ID:</label>
	<input type="text" name="id">
	<button type="submit">SUBMIT</button>
	</form>
</div>
<div class="details">
<table>
	<tbody>
		<tr>
			<td>Student ID</td>
			<td>${details.id}</td>
		</tr>
		<tr>
			<td>Student Name</td>
			<td>${details.name}</td>
		</tr>
	</tbody>
</table>
</div>
</body>
</html>