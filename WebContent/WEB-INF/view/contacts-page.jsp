<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
  <link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>

<!-- nav class="navbar navbar-expand-sm bg-secondary navbar-light justify-content-end">
 <ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="userTasks">Main</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="#">Login</a>
			
			</li>
			<li class="nav-item"><a class="nav-link" href="contactPage">Contacts</a>
			<li class="nav-item"><a class="nav-link" href="aboutPage">About</a>
			</li>
		</ul>
</nav-->
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

<div class="header" style="text-align:center; width:35%; margin:3% auto;"><h5 class="mt-3">
We glad to respond you back for any request )))</h5></div>

      <form action="">
    <div class="mb-3 mt-3">
      <div class="row w-25 mx-auto my-1">

          <input type="text" class="form-control" id="fName" placeholder="Enter first name" name="fNAme">

      </div>
      <div class="row w-25 mx-auto my-1">

          <input type="text" class="form-control" id="lName" placeholder="Enter last name" name="lNAme">

      </div>
      <!--label for="email" class="form-label">Email:</label-->
      <div class="row w-25 mx-auto my-1">

          <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">

      </div>
    </div>
    <!--div class="mb-3">
      <label for="pwd" class="form-label">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
    </div-->
<div class="row  w-25 mx-auto my-1">
  <textarea class="form-control" rows="5" id="comment" placeholder="Text message to us )))"name="text"></textarea>
</div>
    <div class="row mx-auto my-1 w-25">
        <button type="submit" class="btn btn-primary mx-auto">Submit</button>
    </div>

  </form>
    </main>
    <footer>&copy raftsdev 2022</footer>
  </body>

</html>
