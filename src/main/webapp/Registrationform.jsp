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
		<h2>Registration Form</h2>
		<form action="RegisterMemberServlet" method="Get">
			<br> <label>Enter User Name</label> <input type="text"
				name="name"> <br> <label>Enter User ID</label> <input
				type="number" name="userId"> <br>
			<button>Register</button>
		</form>

		<%
		String errorMessage = (String) request.getAttribute("errorMessage");

		if (errorMessage != null) {
		%>

		<h2 style="color: red;"><%=errorMessage%></h2>
		<%
		}
		%>



		<br> <br> <a href=usersDetail.jsp> Registered users</a>
	</main>
</body>
</html>