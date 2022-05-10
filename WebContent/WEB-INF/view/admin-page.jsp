<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<!-- reference our style sheet -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>

<title>Administration page</title>
</head>
<body>

	<nav
		class="navbar navbar-expand-sm bg-secondary navbar-light justify-content-end">

		<div class="navbar-header">
			<a href="#"><img style="position: relative; right: 1430%;"
				alt="location on the map"
				src="${pageContext.request.contextPath}/resources/img/Logo-cut-version-70.png"></a>
		</div>
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="userTasks">Main</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="loginPage">Logout</a>

			</li>
			<li class="nav-item"><a class="nav-link" href="contactPage">Contacts</a>
			<li class="nav-item"><a class="nav-link" href="aboutPage">About</a>
			</li>
		</ul>
	</nav>
	<main>
		<div id="board-box" style="text-align: center;">

			<h2>Users in Life Map system</h2>
			<table style="margin: auto;">


				<tr>
					<th>id</th>
					<th>login</th>
					<th>fname</th>
					<th>lname</th>
					<th>email</th>
					<th>Action</th>
				</tr>


				<c:forEach var="tempUser" items="${users}">
					<c:url var="updateUserByAdmin" value="/updateUser">
						<c:param name="userId" value="${tempUser.id}" />
					</c:url>
					<c:url var="deleteUserByAdmin" value="/deleteUser">
						<c:param name="userId" value="${tempUser.id}" />
					</c:url>
					<tr>
						<td>${tempUser.id}</td>
						<td>${tempUser.login}</td>
						<td>${tempUser.fname}</td>
						<td>${tempUser.lname}</td>
						<td>${tempUser.email}</td>
						<td><a href="${updateUserByAdmin}">Update</a>|<a href="${deleteUserByAdmin}"
											onclick="if (!(confirm('Delete this user?'))) return false">Delete</a></td>
					</tr>

				</c:forEach>

			</table>

		</div>
	</main>
	<div class="footer-box">
		<footer>&copy raftsdev 2022</footer>
	</div>
</body>
</html>