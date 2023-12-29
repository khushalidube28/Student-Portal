<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "jakarta.tags.core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<link href='<c:url value="resources/styles/bootstrap.min.css"/>' rel="stylesheet"/>
<link href='<c:url value="resources/styles/style.css"/>' rel="stylesheet"/>
<meta charset="UTF-8">
<title>Add Student Details</title>
</head>
<body>
<h3 class="text-primary cntralgn">Add Student Details</h3>
<br>
<div class="container">
<f:form class="col-4" modelAttribute="student" action="/add-student" method="post">
	<div class="form-group">
		<f:label path="id" >Student ID</f:label>
		<f:input path="id" class="form-control" ></f:input>
		<f:errors  path="id" cssStyle="color:red"></f:errors>
	</div>
	<br>
	<div class="form-group">
		<f:label path="name" >Name</f:label>
		<f:input path="name" class="form-control" ></f:input>
		<f:errors  path="name" cssStyle="color:red"></f:errors>
	</div>
	<br>
	<div class="form-group">
	<label>Gender</label><br>
		<div class="form-check-inline">
			<f:radiobutton path="gender" value="Male" class="form-check-input"/>
			<f:label class="form-check-label" path="gender" >Male</f:label>
	</div>
	<br>
		<div class="form-check-inline">
			<f:radiobutton path="gender" value="Female" class="form-check-input"/>
			<f:label class="form-check-inline" path="gender" >Female</f:label>
		</div>
	</div>
	<br>
	<div class="form-group">
		<f:label path="dob" >Date of Birth</f:label>
		<f:input path="dob" class="form-control" ></f:input>
		<f:errors  path="dob" cssStyle="color:red"></f:errors>
	</div>
	<br>
	<div class="form-group">
		<f:label path="contact" >Contact</f:label>
		<f:input path="contact" class="form-control" ></f:input>
		<f:errors  path="contact" cssStyle="color:red"></f:errors>
	</div>
	<br>
	<div class="form-group">
		<f:label path="email" >Email ID</f:label>
		<f:input path="email" class="form-control" ></f:input>
		<f:errors  path="email" cssStyle="color:red"></f:errors>
	</div>
	
	<br>
	<button class="btn btn-primary">SUBMIT</button>
</f:form>
</div>
</body>
</html>