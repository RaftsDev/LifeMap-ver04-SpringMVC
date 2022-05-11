<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
  <link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
<title>Insert title here</title>
</head>
<body>

	<!-- nav
		class="navbar navbar-expand-sm bg-secondary navbar-light justify-content-end">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="userTasks">Main</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="#">Login</a>
			
			</li>
			<li class="nav-item"><a class="nav-link" href="contactPage">Contacts</a>
			<li class="nav-item"><a class="nav-link" href="aboutPage">About</a>
			</li>
		</ul>
	</nav -->
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
		<div style="width: 50%; margin: 3% auto; height: 95vh;">

			<div>
				<h3><p>We are located:</p>
				<p>219 Fort Pitt Blvd # 2, Pittsburgh, PA 15222</p> </h3>
			</div>
			<div><img alt="location on the map" src="${pageContext.request.contextPath}/resources/img/location.png"></div>
		</div>
	</main>
	<footer>&copy raftsdev 2022</footer>
</body>
</html>