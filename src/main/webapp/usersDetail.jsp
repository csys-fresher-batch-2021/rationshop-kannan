
<%@page import="in.kannan.model.UserDetails"%>
<%@page import="java.util.List"%>
<%@page import="in.kannan.service.UserDetailService"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h2>User's Details</h2>

		<table class="table table-bordered">
			<caption></caption>
			<thead>
				<tr>
					<th id="S.No">S.No</th>
					<th id="Name">Name</th>
					<th id="age">Age</th>
					<th id="gender">Gender</th>
				</tr>
			<tbody>
				<%
				List<UserDetails> users = UserDetailService.userDetails();
				int i = 0;
				for (UserDetails user : users) {
					i++;
					out.println(user);
				%>
				<tr>
					<td><%=i%></td>
					<td><%=user.getName()%></td>
					<td><%=user.getAge()%></td>
					<td><%=user.getGender()%></td>
					<td><a class="btn btn-danger"
						href="http://localhost:8080/app/DeleteMemberServlet?user=<%=user%>">Delete</a></td>

					<%
					}
					%>
				
		</table>
		
		




	</main>
</body>
</html>