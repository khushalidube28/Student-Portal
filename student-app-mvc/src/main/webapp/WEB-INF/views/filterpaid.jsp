<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix = "c" uri = "jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<link href='<c:url value="resources/styles/bootstrap.min.css"/>' rel="stylesheet"/>
<link href='<c:url value="resources/styles/style.css"/>' rel="stylesheet"/>
<style>
body{
	margin:0;
	padding:0;
	}
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
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="navbar">
	<div class="nav-left">Fees Management System</div>
	<div class="nav-right">
		<button class="btn" onclick="location.href='/addfees'">Add Details</button>
		<div class="filter-dropdown">
			<button class="btn">Filter</button>
			<div class="dropdown-content">
				<a href="#">PAID</a>
				<a href="#">UNPAID</a>
			</div>
		</div>
	</div>
</div>
<br>
<br>
<div class="container">
<table class="table table-striped table-border">
	<thead>
		<tr>
			<th>Student ID</th>
			<th>QUATER_1</th>
			<th>QUATER_2</th>
			<th>QUATER_3</th>
			<th>QUATER_1</th>
			<th>STATUS</th>
			<th>ACTION</th>
			
		</tr>
	</thead>
	<tbody>
		
			<c:forEach var ="fees" items="${feess}" >
			<tr>
				<td>${fees.id}</td>
				<td>${fees.quater1}</td>
				<td>${fees.quater2}</td>
				<td>${fees.quater3}</td>
				<td>${fees.quater4}</td>
				<td>${fees.status}</td>
				<td>
						<a class="btn btn-warning" href="/updatefees?id=${fees.id}">UPDATE</a>
						<a onclick="return confirm('Do you want to delete it? ')" class="btn btn-danger" href="/deletefees?id=${fees.id}">DELETE</a>
					</td>
			</tr>
			
			</c:forEach>
		
	</tbody>
	</table>
</div>
</body>
</html>