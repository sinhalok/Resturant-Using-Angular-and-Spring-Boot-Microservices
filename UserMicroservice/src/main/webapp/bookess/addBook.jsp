<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<style>
body {
	background-image: url("assets/Background.jpg");
	background-repeat: no-repeat;
	background-position: center;
	background-size: cover;
}
</style>
</head>
<body>
	<!-- header -->
	<nav class="navbar navbar-dark bg-dark justify-content-between">
		<h1 class="btn btn-outline-info my-2 my-sm-0">Add Book Here</h1>
		<form class="form-inline">

			<%
				HttpSession httpSession = request.getSession();
				if (httpSession != null) {
			%>

			<h2 class="text-white my-2 my-sm-0">
				<span class="mr-2"><%=httpSession.getAttribute("name")%></span><span
					class="mr-4"><i class="fa fa-user text-success"></i></span>
			</h2>
			<%
				}
			%>
			<button class="btn btn-outline-info my-2 my-sm-0 mr-2">
				<a style="text-decoration: none" class="text-white" href="logout">logout</a>
			</button>
		</form>
	</nav>
	<!-- main container  -->
	<div class='container pt-5 pb-5'>
		<div class="row">
			<div class="col-lg-3"></div>
			<div class="col-lg-6 col-lg-offset-3">
				<form action="addBook" method="post"
					class="bg-info pt-5 pb-5 pl-5 pr-5 border border-dark rounded">
					<%
						String msg = (String) request.getAttribute("error");
						if (msg != null) {
					%>
					<h2 class="offset-sm-2 offset-md-2 offset-lg-2"
						style="color: #7d2a60"><%=msg%></h2>
					<thead>
						<%
							}
						%>

						<h3 class='text-center'>Please Book Enter Details</h3>
						<div class="form-group">
							<label for="name"><h4>Book name</h4></label> <input type="text"
								class="form-control" id="name" placeholder="Enter book name"
								name="name">
						</div>
						<div class="form-group">
							<label for="author"><h4>Author</h4></label> <input type="text"
								class="form-control" id="author" placeholder="Enter auhtor name"
								name="author">
						</div>
						<div class="form-group">
							<label for="price"><h4>Price</h4></label> <input type="text"
								class="form-control" id="price" placeholder="Enter Password"
								name="price">
						</div>
						<div align="center">
							<button type="submit"
								class="btn btn-outline-info my-2 my-sm-0 bg-dark" name="addBook"
								value="addBook">Save Book</button>
						</div>
				</form>
			</div>
			<div class="col-lg-3"></div>
		</div>
	</div>

	<!-- footer -->
	<div class="jumbotron text-center text-info" style="margin-bottom: 0">
		<div class="col-sm-12">
			<h3 class="mt-2 p-1">Java Full Stack Developer</h3>
			<div class="row">
				<div class="col-sm-12 col-md-12 col-lg-4 mb-5">
					<div class="bg-dark p-2" style="border-radius: 10px;">
						<h4>Address</h4>
						<p>Mariamma Nagar</p>
						<p>DR AB ROAD</p>
						<p>Lotus, Worli</p>
						<p>Mumbai, Maharashtra, 400018</p>
					</div>

				</div>
				<div class="col-sm-12 col-md-12 col-lg-4 mb-5">
					<div class="bg-dark p-2" style="border-radius: 10px;">
						<h4>How To Contact Me</h4>
						<p>
							<i class="fa fa-phone-square" aria-hidden="true"></i> :
							9151516292
						</p>
						<p>
							<i class="fa fa-envelope-o" aria-hidden="true"></i> :
							vishal210198p@gmail.com
						</p>
						<p>
							<i class="fa fa-gitlab" aria-hidden="true"></i> :
							https://gitlab.com/Vishal21HCL
						</p>
						<p>
							<i class="fa fa-facebook-square" aria-hidden="true"></i> :
							https://www.facebook.com/vishal21
						</p>
					</div>
				</div>
				<div class="col-sm-12 col-md-12 col-lg-4 mb-5">
					<div class="bg-dark p-2" style="border-radius: 10px;">
						<h4>Technoloy</h4>
						<p>HTML, CSS, Boostrap4</p>
						<p>C,Java,JavaScriot,Python,PHP</p>
						<p>Spring Boot, Jquery, YII2</p>
						<p>MySQL</p>
					</div>
				</div>
			</div>
		</div>
		<h4 class="mt-2">© Copyright 2021 www.TipOnMove.com. All rights
			reserved. Developed by Vishal Bharti.</h4>

	</div>
</body>
</html>