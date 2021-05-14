<%@page import="in.kannan.service.MemberDetailService"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ration Card Members</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h1>Hi Jo</h1>
		<form action="AddMemberServlet" method="Get">
			<label>Enter the Person to Add</label> <input type="text" id="text"
				name="name2" placeholder="Enter member to add" autofocus required>
			<br>
			<button>Enter</button>
		</form>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>S.No</th>
					<th>Name</th>
				</tr>
			<tbody>
				<%
				List<String> familyMembers = MemberDetailService.getFamilyMembers();
				int i = 0;

				for (String family : familyMembers) {
					i++;
				%>
				<tr>
					<td><%=i%></td>
					<td><%=family%></td>

				</tr>


				<%
				}
				%>

			</tbody>

		</table>

	</main>
</body>
</html>