<%@page import="in.kannan.service.MemberDetailService"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Ration Card Members</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">

		<h1>Addition of a member to Card</h1>
		<br>
		
		<form action="AddMemberServlet" method="Get">
			<label>Enter the Person to Add</label> <input type="text" id="text"
				name="name2" placeholder="Enter member to add"> <br> <br>
			<button>Enter</button>
		</form>
		<%
		String errorMessage = (String) request.getAttribute("errorMessage");

		if (errorMessage != null) {
		%>

		<h2 style="color:red;" ><%=errorMessage%></h2>
		<%
		}
		%>


	</main>

</body>
</html>