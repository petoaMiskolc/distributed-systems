<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="hu.meiit.model.NewUserRequest" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><spring:message code="messages.newuser.title"/></h1>
<%
NewUserRequest newUserRequest = (NewUserRequest)request.getAttribute("newUserRequest");
%>
<form:form modelAttribute="newUserRequest" method="post">
<spring:message code="messages.newuser.name"/>: <%=(newUserRequest.isNameAlreadyInUse()? "(Already in use)":"") %>
<form:input type="text" path="userName"/><br>
<spring:message code="messages.newuser.education"/>: 
<form:select path="education">
	<form:option value="elementary"><spring:message code="messages.newuser.education.elementary"/></form:option>
	<form:option value="highschool"><spring:message code="messages.newuser.education.highschool"/></form:option>
	<form:option value="graduate"><spring:message code="messages.newuser.education.graduate"/></form:option>
</form:select><br>
<spring:message code="messages.newuser.color"/>: <br>
<form:checkbox path="color" value="black"/><spring:message code="messages.newuser.color.black"/><br>
<form:checkbox path="color" value="blue" /><spring:message code="messages.newuser.color.blue"/><br>
<form:checkbox path="color" value="red"/><spring:message code="messages.newuser.color.red"/><br>
<form:checkbox path="color" value="green"/><spring:message code="messages.newuser.color.green"/><br>
<spring:message code="messages.newuser.gender"/>: <br>
<form:radiobutton path="gender" value="female"/><spring:message code="messages.newuser.gender.female"/><br>
<form:radiobutton path="gender" value="male"/><spring:message code="messages.newuser.gender.male"/><br>
<input type="submit" value="submit"/>
</form:form>
</body>
</html>