<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Save</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">

</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Save task</h2>
		</div>
	</div>
	<div id="container">

		<form:form action="saveTask" modelAttribute="task"
			method="POST">
			
			<form:hidden path="id"/>
			<form:hidden path="branch.id"/>
			
			<table>
				<tbody>
					<!-- tr>
						<td><label>Group Id</label></td>
						<td><form:input path="branch.id" /></td>
					</tr-->
					<tr>
						<td><label>Description</label></td>
						<td><form:input path="shortDesc" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save"/></td>
					</tr>
				</tbody>
			</table>
		</form:form>
	</div>
</body>
</html>