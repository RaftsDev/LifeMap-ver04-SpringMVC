<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Collapsible List Group</h2>
  <p>Click on the collapsible panel to open and close it.</p>
  <div class="panel-group">
    <div class="panel panel-default">
      <div class="panel-heading">
       <a data-toggle="collapse" href="#collapse2">Collapsible list group</a>
       <div id="collapse2" class="panel-collapse collapse">
        <h4 class="panel-title">
          <a data-toggle="collapse" href="#collapse1">Collapsible list group</a>
        </h4>
      </div>
      <div id="collapse1" class="panel-collapse collapse">
        <ul class="list-group">
          <li class="list-group-item">One</li>
          <li class="list-group-item">Two</li>
          <li class="list-group-item">Three</li>
        </ul>
        <div class="panel-footer">Footer</div>
        </div>
      </div>
    </div>
  </div>
</div>
    
</body>
</html>