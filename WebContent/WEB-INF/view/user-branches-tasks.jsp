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
		
		 <div class="navbar-header">
      <a  href="#"><img style="position: relative; right:1430%;" alt="location on the map" src="${pageContext.request.contextPath}/resources/img/Logo-cut-version-70.png"></a>
    </div>
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="userBranchesTasks">Main</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="loginPage">Logout</a>
			
			</li>
			<li class="nav-item"><a class="nav-link" href="contactPage">Contacts</a>
			<li class="nav-item"><a class="nav-link" href="aboutPage">About</a>
			</li>
		</ul>
	</nav>

	<main>
<div><u><h3 style="margin:1% 10%;">Hello <c:out value = "${user.fname}"/><c:out value = " ${user.lname}"/>!</h3></u></div>
		<div id="board-box">
		
			<div id="header">
				<h2>To Do list of user's tasks</h2>
			</div>

<!--                      Collapsable  -->

<c:forEach var="tempUserParentBranch" items="${userBranchesTasks}">

<div class="container mt-3">
  <!-- >h2>Simple Collapsible</h2>
  <p>Click on the button to toggle between showing and hiding content.</p -->
  <button type="button" class="btn btn-primary" data-bs-toggle="collapse" data-bs-target="#demo${tempUserParentBranch.getKey().id}">${tempUserParentBranch.getKey().shortDesc}</button>
  <div id="demo${tempUserParentBranch.getKey().id}" class="collapse">
  
<!--     Collapsable    -->




        
        <!--          Accordion            -->
        <div id="accordion-outer-box">

				<div class="accordion" id="accordionExample"></div>


				<!--  External loop -->
				<!--  get element as a varibale from List-->
				<c:forEach var="tmpChildBranches" items="${tempUserParentBranch.getValue()}">

					<!-- create url for getting branch id -->
					<c:url var="addTaskLink" value="/addTask">
						<c:param name="branchId" value="${tmpChildBranches.id}" />
					</c:url>
					<div class="accordion-item">
						<h2 class="accordion-header"
							id="heading${tmpChildBranches.id}">
							<div class="branch-action-outter">
								<div class="branch-left-fill-box"> </div>
								<div class="branch-action-box">
									 <a
										href="${addTaskLink}" style="font-size: 0.5em;">Add task</a>
								</div>
							</div>

							<button class="accordion-button" type="button"
								data-bs-toggle="collapse"
								data-bs-target="#collapse${tmpChildBranches.id}"
								aria-expanded="true"
								aria-controls="collapse${tmpChildBranches.id}">
								${tmpChildBranches.shortDesc}</button>

						</h2>

						<ul id="collapse${tmpChildBranches.id}"
							class="accordion-collapse collapse show"
							aria-labelledby="heading${tmpChildBranches.id}"
							data-bs-parent="#accordionExample" style="list-style-type: none;">
							<!--  Internal loop -->
							<c:forEach var="tempUserTask"
								items="${tmpChildBranches.getTasks()}">
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




			</div>
			
			<!--       Accordion end -->



    
  </div>
</div>

			
			<!--     Collapsable  end   -->
			
			
</c:forEach>

		</div>



	</main>

<div class="footer-box"><footer>&copy raftsdev 2022</footer></div>
	

</body>

</html>









