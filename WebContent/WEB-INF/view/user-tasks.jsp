<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
<title>List Tasks</title>
<!-- reference our style sheet -->

<!--  link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" /-->

</head>

<body>

	<div id="wraper">
		<div id="header">
			<h2>To Do list of user's tasks</h2>
		</div>

		<div id="container">

			<input type="button" value="Add Customer"
				onclick="window.location.href='showFormForAdd'; return false;"
				class="add-button" />
			<table>
				<tr>
					<th>First name</th>
					<th>Last name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				<c:forEach var="tempUserTask" items="${userTasks}">

					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${tempUserTask.id}" />
					</c:url>

					<c:url var="deleteLink" value="/customer/delete">
						<c:param name="customerId" value="${tempUserTask.id}" />
					</c:url>

					<tr>
						<td>${tempUserTask.id}</td>
						<td>${tempUserTask.shortDesc}</td>
						<td>${tempUserTask.longDesc}</td>
						<td>${tempUserTask.urgencyLevel}</td>
						<td>${tempUserTask.branch}</td>

						<td><a href="${updateLink}">Update</a> | <a
							href="${deleteLink}"
							onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a></td>
					</tr>
				</c:forEach>
			</table>

		</div>
	</div>





</body>

</html>









