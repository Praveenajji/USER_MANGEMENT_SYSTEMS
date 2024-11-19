<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@page import="java.util.List"%>
	<%@page import="com.example.ums.entity.User"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		
				List<User> users = (List<User>) request.getAttribute("user");
		%>

		<table>
			<thead>
				<tr>
					<td>Id</td>
					<td>Name</td>
					<td>password</td>
					<td>email</td>
					<td>Edit</td>
					<td>Delete</td>
				</tr>
			</thead>

			<tbody>
				<%	

						for(User user : users) {
				%>
				<tr>
					<td><%=user.getUserid()%></td>
					<td><%=user.getUsername()%></td>
					<td><%=user.getPassword()%></td>
					<td><%=user.getEmail()%></td>
					<td><a href="update-user?user_id=<%=user.getUserid()%>">Edit</a></td>
					<td><a href="delete-user?user_id=<%=user.getUserid()%>">Delete</a></td>

				</tr>

				<%
				}
				%>

			</tbody>
		</table>
</body>
</html>