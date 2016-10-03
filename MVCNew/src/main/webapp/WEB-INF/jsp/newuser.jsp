<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="hu.meiit.model.NewUserRequest" %>

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
<form method="post">
Name: <%=(newUserRequest.isNameAlreadyInUse()? "(Already in use)":"") %>
<input type="text" name="userName" value="<%=newUserRequest.getUserName()%>"/><br>
Education: <select name="education">
	<option value="elementary" <%=(newUserRequest.getEducation().equals("elementary")? "selected":"") %>>Elementary school</option>
	<option value="highschool" <%=(newUserRequest.getEducation().equals("highschool")? "selected":"") %>>High school</option>
	<option value="graduate" <%=(newUserRequest.getEducation().equals("graduate")? "selected":"") %>>Graduate</option>
</select><br>
Favourite color: <br>
<input type="checkbox" name="color" value="black" <%= newUserRequest.containsColor("black")? "checked=\"checked\"":"" %>>Black<br>
<input type="checkbox" name="color" value="blue" <%= newUserRequest.containsColor("blue")? "checked=\"checked\"":"" %>>Blue<br>
<input type="checkbox" name="color" value="red" <%= newUserRequest.containsColor("red")? "checked=\"checked\"":"" %>>Red<br>
<input type="checkbox" name="color" value="green" <%= newUserRequest.containsColor("green")? "checked=\"checked\"":"" %>>Green<br>
Gender: <br>
<input type="radio" name="gender" value="female" <%=newUserRequest.getGender().equals("female")? "checked=\"checked\"":"" %>>Female<br>
<input type="radio" name="gender" value="male" <%=newUserRequest.getGender().equals("male")? "checked=\"checked\"":"" %>>Male<br>
<input type="submit" value="submit"/>
</form>
</body>
</html>