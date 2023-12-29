<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix = "c" uri = "jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href='<c:url value="resources/styles/bootstrap.min.css"/>' rel="stylesheet"/>
<link href='<c:url value="resources/styles/style.css"/>' rel="stylesheet"/>

<title>Course Page</title>
<style>
body{
	margin:0;
	padding:0;
	}
.searchbar{
	float:right;}

.navbar{
	display:felx;
	justify-content:space-between;
	align-items:center;
	background-color:skyblue;
	padding:10px;
	color:white;
}
.nav-left{
	font-weight:bold;
	padding-left:20px;
	}
.nav-right{
	display:flex;
	align-items:center;
	padding-right:50px;
	}
	
.nav-buttons{
	display:flex;
	align-items:center;
}
.btn{
	padding:8px 16px;
	margin-left:10px;
	border:none;
	border-radius:4px;
	background:color:white;
	color:black;
	cursor:pointer;
	}

.filter-dropdown{
	position:relative;}

.dropdown-content{
	display:none;
	position:absolute;
	background-color:skyblue;
	min-width:100px;
	box-shadow:0 8px 16px 0 rgba(0,0,0,0.2);
	z-index:1;
	}

.dropdown-content a{
	display:block;
	padding:8px 12px;
	text-decoration:none;
	color:white;}

.dropdown-content a:hover{
	background-color:#2196F3;}

.filter-dropdown:hover .dropdown-content{
	display:block;
	}
</style>
</head>
<body>
<div class="navbar">
	<div class="nav-left">Course Management System</div>
	<div class="nav-right">
		<button class="btn" onclick="location.href='/addfees'">Add Details</button>
		<div class="filter-dropdown">
			
		</div>
	</div>
</div>
<br>
<div class="searchbar">
	<form id="studentForm" action="/direct" method="get">
			<label for="studentId">Filter:</label>
			<input type="text" name="filter">
			<button type="submit">Search</button>
	</form>
</div>

<div class="container">
	
	<br>
	<table class="table table-striped table-border table-hover">
	<thead>
		<tr>
			<th>Student ID</th>
			<th>BRANCH</th>
			<th>YEAR</th>
			<th>RESULT</th>
			
			<th>ACTION</th>
			
		</tr>
	</thead>
	<tbody>
		
			<c:forEach var ="course" items="${courses}" >
			<tr>
				<td>${course.id}</td>
				<td>${course.branch}</td>
				<td>${course.year}</td>
				<td>${course.result}</td>
				
				
				<td>
						<a class="btn btn-warning" href="/updatecourse?id=${course.id}">UPDATE</a>
						<a onclick="return confirm('Do you want to delete it? ')" class="btn btn-danger" href="/deletecourse?id=${course.id}">DELETE</a>
					</td>
			</tr>
			
			</c:forEach>
		
	</tbody>
	</table>
</div>
</body>
</html>