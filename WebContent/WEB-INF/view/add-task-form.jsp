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
			<h2>Add task</h2>
		</div>

		<form:form action="saveNewTask" modelAttribute="task" method="POST">
			<table>
				<tr>
					<td><label>Description:</label></td>
					<td><form:input path="shortDesc" />
						</form></td>
				</tr>
				<tr>
					<td><label>Urgency level:</label></td>
					<td><form:input path="urgencyLevel" />
						</form></td>
				</tr>
				<tr>
					<td><label></label></td>
					<td><input type="submit" value="Save" path="urgencyLevel" />
						</form></td>
				</tr>
			</table>
		</form:form>
	</div>

</body>
</html>