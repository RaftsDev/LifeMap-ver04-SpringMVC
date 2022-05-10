<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Update user</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Update user</h2>
		</div>
	</div>
	<div id="container">

		<form:form action="saveUser" modelAttribute="user" method="POST">

			<form:hidden path="id" />
			<form:hidden path="pwd" />

			<table>
				<tbody>
					
					<tr>
						<td><label>Login</label></td>
						<td><form:input path="login" /></td>
					</tr>
					<tr>
						<td><label>First name</label></td>
						<td><form:input path="fname" /></td>
					</tr>
					<tr>
						<td><label>Last name</label></td>
						<td><form:input path="lname" /></td>
					</tr>
					<tr>
						<td><label>email</label></td>
						<td><form:input path="email" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>
	</div>
</body>
</html>