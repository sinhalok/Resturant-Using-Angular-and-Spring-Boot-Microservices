<%@page import="com.admin.demo.model.BookBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book List</title>
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
	background-image: url("assets/Background1.jpg");
	background-repeat: no-repeat;
	background-position: center;
	background-size: cover;
}
</style>
</head>
<body>
	<!-- header -->
	<nav class="navbar navbar-dark bg-dark justify-content-between">
		<h1 class="btn btn-outline-info my-2 my-sm-0">Admin Dashboard</h1>
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
	<nav class="navbar navbar-dark justify-content-between">
		<h1></h1>
		<form class="form-inline">
			<button class="btn btn-outline-info bg-dark my-2 my-sm-0 mr-2">
				<a style="text-decoration: none;" class="text-white" href="addBook">Add
					Book</a>
			</button>
			<button class="btn btn-outline-info bg-dark my-2 my-sm-0 mr-3">
				<a style="text-decoration: none;" class="text-white" href="allUsers">User
					List</a>
			</button>
		</form>
	</nav>
	<!-- main container  -->
	<div class='container'>
		<div class="row">

			<table class="table table-dark mt-3">

				<h2 class="offset-sm-2 offset-md-2 offset-lg-2"
					style="color: #7d2a60">${error}</h2>
				<thead>
					<tr>
						<th scope="col">Book Id</th>
						<th scope="col">Book Name</th>
						<th scope="col">Book Author</th>
						<th scope="col">Book Price</th>
						<th scope="col">Read Later</th>
						<th scope="col">Like Book</th>
					</tr>
				</thead>
				<tbody class="text-info">
					<%
							List<BookBean> books = (List<BookBean>) request.getAttribute("books");

							for (BookBean book : books) {
						%>
					<tr>
						<td><p><%=book.getId()%></p></td>
						<td><p><%=book.getName()%></p></td>
						<td><p><%=book.getAuthor()%></p></td>
						<td><p><%=book.getPrice()%></p></td>
						<td><a href='editBook?bookId=<%=book.getId()%>'><i
								class="fa fa-edit text-warning"
								style="font-size: 24px; text-decoration: none;"></i></a></td>
						<td><a href='deleteBook?bookId=<%=book.getId()%>'><i
								class="fa fa-trash text-danger" style="font-size: 24px;"></i></a></td>
					</tr>
					<%
							}
						%>

				</tbody>
			</table>
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