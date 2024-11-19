<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@page import="com.example.ums.entity.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
			
				User user = (User) request.getAttribute("user");
			%>
<form action="update-user" method="post">
	<input type="text" name="userid" value="<%=user.getUserid()%>">
	<input type="text" name="username" value="<%=user.getUsername()%>">
	<input type="text" name="password" value="<%=user.getPassword()%>">
	<input type="text" name="email" value="<%=user.getEmail()%>">
	<input type="submit" value="Update">
</form>


</body>
</html>