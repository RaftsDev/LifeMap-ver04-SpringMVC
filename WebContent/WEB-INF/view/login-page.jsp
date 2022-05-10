<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
	
<title>Welcome to LifeMap!!!</title>
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
		
<div id="header">
				<h2>Welcome to LifeMap!!!</h2>
			</div>
			<div id="board-box">
			<!-- <form action="checkLogin" method="post">
  <label for="username">Username:</label><br>
  <input type="text" id="username" name="username"><br>
  <label for="pwd">Password:</label><br>
  <input type="password" id="pwd" name="pwd"><br>
  
  <input type="submit" value="Submit">
</form> -->

<form:form action="checkLogin" modelAttribute="user" method="POST">
			
			
		
				<label for="username">Username:</label>
					<form:input path="login" />
						
			    <label for="pwd">Password:</label>
					<form:input type="password" path="pwd" />
						
				<label></label>
					<input type="submit" value="Save"  />
						
				
		</form:form>
			
			</div>
	</main>
<footer>&copy raftsdev 2022</footer>

</body>
</html>