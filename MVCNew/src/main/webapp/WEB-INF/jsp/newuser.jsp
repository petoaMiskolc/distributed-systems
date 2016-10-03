<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Add new user</h1>
<form method="post">
Name: 
<input type="text" name="userName"/><br>
Education: <select name="education">
	<option value="elementary">Elementary school</option>
	<option value="highschool">High school</option>
	<option value="graduate">Graduate</option>
</select><br>
Favourite color: <br>
<input type="checkbox" name="color" value="black">Black<br>
<input type="checkbox" name="color" value="blue">Blue<br>
<input type="checkbox" name="color" value="red">Red<br>
<input type="checkbox" name="color" value="green">Green<br>
Gender: <br>
<input type="radio" name="gender" value="female">Female<br>
<input type="radio" name="gender" value="male">Male<br>
<input type="submit" value="submit"/>
</form>
</body>
</html>