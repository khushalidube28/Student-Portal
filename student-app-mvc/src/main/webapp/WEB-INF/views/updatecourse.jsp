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
<title>update Course Details</title>
</head>
<body>
<h3 class="text-primary cntralgn">Update Course Details</h3>
<br>
	<div class="container">
		<f:form modelAttribute="course" class="col-5" action="/update-course" method="post">
			<div class="form-group">
				<f:label path="id">Student ID</f:label>
				<f:input path="id" class="form-control"/>
				<f:errors path="id" cssStyle="color:red"></f:errors>
			</div>
			<br>
			<div class="form-group">
				<f:label path="branch">BRANCH</f:label>
				<f:input path="branch" class="form-control"/>
				<f:errors path="branch" cssStyle="color:red"></f:errors>
			</div>
			<br>
			<div class="form-group">
				<f:label path="year">YEAR</f:label>
				<f:input path="year" class="form-control"/>
				<f:errors path="year" cssStyle="color:red"></f:errors>
			</div>
			<br>
			<div class="form-group">
				<f:label path="result">RESULT</f:label>
				<f:input path="result" class="form-control"/>
				<f:errors path="result" cssStyle="color:red"></f:errors>
			</div>
			<br>
			<button class="btn btn-primary">SUBMIT</button>
	
		</f:form>
	</div>

</body>
</html>