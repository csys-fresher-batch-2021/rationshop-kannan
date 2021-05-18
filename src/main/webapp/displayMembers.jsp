<!DOCTYPE html>
<%@page import="in.kannan.service.MemberDetailService"%>
<%@page import="java.util.List"%>
<html lang="en">
<head>
<title>Family members</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3>Card Members</h3>
		<table class="table table-bordered">
			<caption></caption>
			<thead>
				<tr>
					<th id="S.No">S.No</th>
					<th id="Name">Name</th>
					<th id="Action">Actions</th>
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
					<td><a class="btn btn-danger"
						href="http://localhost:8080/app/DeleteMemberServlet?user=<%=family%>">Delete</a></td>


				</tr>


				<%
				}
				%>

			</tbody>


		</table>


	</main>
</body>
</html>
