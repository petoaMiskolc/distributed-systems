<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="hu.meiit.model.NewUserRequest" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Add new user</h1>
<%
NewUserRequest newUserRequest = (NewUserRequest)request.getAttribute("newUserRequest");
%>
<form:form modelAttribute="newUserRequest" method="post">
Name: <%=(newUserRequest.isNameAlreadyInUse()? "(Already in use)":"") %>
<form:input type="text" path="userName"/><br>
Education: 
<form:select path="education">
	<form:option value="elementary">Elementary school</form:option>
	<form:option value="highschool">High school</form:option>
	<form:option value="graduate">Graduate</form:option>
</form:select><br>
Favourite color: <br>
<form:checkbox path="color" value="black"/>Black<br>
<form:checkbox path="color" value="blue" />Blue<br>
<form:checkbox path="color" value="red"/>Red<br>
<form:checkbox path="color" value="green"/>Green<br>
Gender: <br>
<form:radiobutton path="gender" value="female"/>Female<br>
<form:radiobutton path="gender" value="male"/>Male<br>
<input type="submit" value="submit"/>
</form:form>
<h2>Log out</h2>
<c:url var="logoutUrl" value="/logout"/>
<form action="${logoutUrl}" method="post">
    <input type="submit" value="Logout"/>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
</body>
</html>