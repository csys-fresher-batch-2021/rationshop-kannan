<%@page import="in.kannan.service.MemberDetailService"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en"> 
<head>
<meta charset="ISO-8859-1">
<title>Family Members</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
	<h1>Ration Card Members</h1>

		<table class="table table-bordered">
			<thead>
				<tr>
					<th>S.No</th>
					<th>NAME</th>
					
				</tr>
			</thead>
			<tbody>
				<%
				List<String> familyMembers= MemberDetailService.getFamilyMembers();
						int i=0;
						for(String family : familyMembers){
							i++;
				%>
				<tr>
				<td><%=i%></td>
				<td><%=family %></td>
				
				</tr>
				
				
				<%} %>
				

			</tbody>
		</table>
</main>
</body>
</html>