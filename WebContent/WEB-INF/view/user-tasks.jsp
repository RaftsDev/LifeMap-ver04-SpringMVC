<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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

<title>List Tasks</title>
</head>

<body>
	<nav
		class="navbar navbar-expand-sm bg-secondary navbar-light justify-content-end">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="#">Main</a></li>
			<li class="nav-item"><a class="nav-link" href="login.jsp">Login</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="about.jsp">About</a>
			</li>
		</ul>
	</nav>

	<main>

		<div id="board-box">
			<div id="header">
				<h2>To Do list of user's tasks</h2>
			</div>



			<div id="accordion-outer-box">

				<div class="accordion" id="accordionExample"></div>


				<!--  External loop -->
				<c:forEach var="tempUserBranch" items="${userBranchesTasks}">

					<!-- create url for getting branch id -->
					<c:url var="addTaskLink" value="/addTask">
						<c:param name="branchId" value="${tempUserBranch.getKey().id}" />
					</c:url>
					<div class="accordion-item">
						<h2 class="accordion-header"
							id="heading${tempUserBranch.getKey().id}">
							<div class="branch-action-outter">
								<div class="branch-left-fill-box"> </div>
								<div class="branch-action-box">
									<a href="allTasks" style="font-size: 0.5em;">Edit</a> <a
										href="allTasks" style="font-size: 0.5em;">Delete</a> <a
										href="${addTaskLink}" style="font-size: 0.5em;">Add task</a>
								</div>
							</div>

							<button class="accordion-button" type="button"
								data-bs-toggle="collapse"
								data-bs-target="#collapse${tempUserBranch.getKey().id}"
								aria-expanded="true"
								aria-controls="collapse${tempUserBranch.getKey().id}">
								${tempUserBranch.getKey().shortDesc}</button>

						</h2>

						<ul id="collapse${tempUserBranch.getKey().id}"
							class="accordion-collapse collapse show"
							aria-labelledby="heading${tempUserBranch.getKey().id}"
							data-bs-parent="#accordionExample" style="list-style-type: none;">
							<!--  Internal loop -->
							<c:forEach var="tempUserTask"
								items="${tempUserBranch.getValue()}">
								<c:url var="updateLink" value="/updateTask">
									<c:param name="taskId" value="${tempUserTask.id}" />
								</c:url>

								<c:url var="deleteLink" value="/deleteTask">
									<c:param name="taskId" value="${tempUserTask.id}" />
								</c:url>
								<li class="accordion-body"><div class="element-description">${tempUserTask.shortDesc}</div>
									<div class="button-update-container">
										<a href="${updateLink}">Edit</a>
									</div>
									<div class="button-del-container">
										<a href="${deleteLink}"
											onclick="if (!(confirm('Delete this task?'))) return false">Delete</a>
									</div></li>
							</c:forEach>
						</ul>
					</div>
				</c:forEach>








				<!--  div class="accordion-item">
					<h2 class="accordion-header" id="headingTwo">
						<button class="accordion-button collapsed" type="button"
							data-bs-toggle="collapse" data-bs-target="#collapseTwo"
							aria-expanded="false" aria-controls="collapseTwo">
							Professional development</button>
					</h2>
					<div id="collapseTwo" class="accordion-collapse collapse"
						aria-labelledby="headingTwo" data-bs-parent="#accordionExample">
						<div class="accordion-body">
							<strong>This is the second item's accordion body.</strong> It is
							hidden by default, until the collapse plugin adds the appropriate
							classes
							<code>.accordion-body</code>
							, though the transition does limit overflow.
						</div>
					</div>
				</div-->





			</div>


		</div>



	</main>

	<footer>&copy raftsdev 2022</footer>

</body>

</html>









