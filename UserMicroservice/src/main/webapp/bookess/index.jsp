<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bookess</title>
<!-- font awesome link-->
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
	background-image: url('assets/Background.jpg');
	background-repeat: no-repeat;
	background-position: center;
	background-size: cover;
}
</style>
</head>
<body>
	<nav class="navbar navbar-dark bg-dark justify-content-between">
		<h1 class="btn btn-outline-info my-2 my-sm-0">Bookess</h1>
		<form class="form-inline">
			<button class="btn btn-outline-info my-2 my-sm-0">
				<a style="text-decoration: none;" class="text-white" href="bookList">Show
					Book List</a>
			</button>
		</form>
	</nav>

	<div class="container">
		<div class="row">
			<div class="col-12">
				<marquee direction="left">
					<h1 style="color: #230461">
						Welcome to the online book reading platform.
						<h1>
				</marquee>
				<h1 class="text-info">User Guideline</h1>
				<ol type="1" style="font-size: 20px; color: #230461">
					<li>I used h2-console database(In memory database) for tables in the admin microservice. I have inserted
						some dummy data.</li>
					<li>Click on Show Book List button upper right side, You will
						get all the book data.</li>
					<li>On the booklist page you will get a login button on upper
						right side. When you click on this page login page will be open.</li>
					<li>On login page please enter the email id and password. If
						you have already register then you will be able to login.</li>
					<li>On login page besides of login button have user register
						and admin register button. When you click on user register or
						admin register button then register page will be open
						respectively.</li>
					<li>On user register or admin register page enter details heat
						the register button. if the user not already registered then it
						will be able to register and redirect on the login page.</li>
					<li>Once you logged in as user register then now you on your
						user dashboard. Here you will see the all book list with 2 column
						Read Later and like Book.</li>
					<li>When you click on the icon of book then this book will be
						added in your read later list. If you have already this book in
						read later list then it will not add.</li>
					<li>When you click on heart icon the book will add in your
						liked book list. If you have already this book in your liked book
						list then it will not add in your list.</li>
					<li>On nav bar you have two button Read Later List and Liked
						Book List. When you click on those two button then you will get
						the data respective.</li>
					<li>When you logged in as admin then you will be redirect on
						the admin dashboard page. By default you will be able see all book
						list as admin you can perform crud operation on book.</li>
					<li>On dmin dashboard you see the user list button, when you
						click on this button you will be redirect on the user list page
						and as admin you can perform crud operation on user.</li>
					<li><strong>Note* : When you logout and go back any
							page regarding dashboard, you will get blank page. </strong></li>
					<li><strong>Note* : Same person can not register as
							admin as well as user. </strong></li>
				</ol>
			</div>
		</div>
	</div>

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