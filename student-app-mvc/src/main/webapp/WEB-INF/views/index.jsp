<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<link href='<c:url value="resources/styles/bootstrap.min.css"/>' rel="stylesheet"/>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h3 class="text-primary">Student Management System</h3>
<br>
<form action="/add">
<button class="btn btn-primary">Add Student</button>
</form>
<br>
<!--<form action="/fees">
<button class="btn btn-primary" >FEES DATA</button>
</form>-->
<br>
<table class="table table-striped table-border">
	<thead>
		<tr>
			<th>Student ID</th>
			<th>Name</th>
			<th>Gender</th>
			<th>DOB ID</th>
			<th>Contact</th>
			<th>Email ID</th>
			<th>Action</th>
			
		</tr>
	</thead>
	<tbody>
		
			<c:forEach var ="student" items="${students}" >
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.gender}</td>
				<td>${student.dob}</td>
				<td>${student.contact}</td>
				<td>${student.email}</td>
				<td>
						<a class="btn btn-warning" href="/update?id=${student.id}">UPDATE</a>
						<a onclick="return confirm('Do you want to delete it? ')" class="btn btn-danger" href="/delete?id=${student.id}">DELETE</a>
					</td>
			</tr>
			
			</c:forEach>
		
	</tbody>
</table>
</div>
<br>


</body>
</html>