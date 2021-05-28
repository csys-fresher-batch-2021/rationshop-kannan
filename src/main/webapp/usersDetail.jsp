<%@page import="in.kannan.dao.RationShopUserDisplayDAO"%>
<%@page import="in.kannan.dao.AddMemberDAOCall"%>
<%@page import="in.kannan.model.UserDetails"%>
<%@page import="java.util.List"%>

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
					<th id="userId">User Id</th>

				</tr>
			<tbody>
				<%
				List<UserDetails> users = RationShopUserDisplayDAO.getAllUsers();
				int i = 0;
				for (UserDetails user : users) {
					i++;
				%>
				<tr>
					<td><%=i%></td>
					<td><%=user.getName()%></td>
					<td><%=user.getUserId()%></td>



					<%
					}
					%>
				
		</table>






	</main>
</body>
</html>