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
<title>update Student Details</title>
</head>
<body>
<h3 class="text-primary cntralgn">Update Fees Details</h3>
<br>
	<div class="container">
		<f:form modelAttribute="fees" class="col-5" action="/update-fees" method="post">
			<div class="form-group">
				<f:label path="id">Student ID</f:label>
				<f:input path="id" class="form-control"/>
				<f:errors path="id" cssStyle="color:red"></f:errors>
			</div>
			<br>
			<div class="form-group">
				<f:label path="quater1">QUATER 1</f:label>
				<f:input path="quater1" class="form-control"/>
				<f:errors path="quater1" cssStyle="color:red"></f:errors>
			</div>
			<br>
			<div class="form-group">
				<f:label path="quater2">QUATER 2</f:label>
				<f:input path="quater2" class="form-control"/>
				<f:errors path="quater2" cssStyle="color:red"></f:errors>
			</div>
			<br>
			<div class="form-group">
				<f:label path="quater3">QUATER 3</f:label>
				<f:input path="quater3" class="form-control"/>
				<f:errors path="quater3" cssStyle="color:red"></f:errors>
			</div>
			<br>
			<div class="form-group">
				<f:label path="quater4">QUATER4</f:label>
				<f:input path="quater4" class="form-control"/>
				<f:errors path="quater4" cssStyle="color:red"></f:errors>
			</div>
			<br>
			<div class="form-group">
				<f:label path="status">STATUS</f:label>
				<f:input path="status" class="form-control"/>
				<f:errors path="status" cssStyle="color:red"></f:errors>
			</div>
			<br>
			<button class="btn btn-primary">SUBMIT</button>
	
		</f:form>
	</div>
</body>
</html>