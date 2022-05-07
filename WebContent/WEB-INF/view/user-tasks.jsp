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
				<div class="accordion-item">
					<h2 class="accordion-header" id="headingOne">
						<button class="accordion-button" type="button"
							data-bs-toggle="collapse" data-bs-target="#collapseOne"
							aria-expanded="true" aria-controls="collapseOne">Java
							programming</button>
					</h2>
					<ul id="collapseOne" class="accordion-collapse collapse show"
						aria-labelledby="headingOne" data-bs-parent="#accordionExample"
						style="list-style-type: none;">

						<c:forEach var="tempUserTask" items="${userTasks}">
							<li class="accordion-body">edit|${tempUserTask.id}|${tempUserTask.branch.id}|${tempUserTask.shortDesc}|delete</li>
						</c:forEach>
					</ul>
				</div>

				





				<div class="accordion-item">
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
				</div>





			</div>


		</div>



	</main>

	<footer>&copy raftsdev 2022</footer>

</body>

</html>









