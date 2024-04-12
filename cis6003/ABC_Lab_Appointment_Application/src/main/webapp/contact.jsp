<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%
String userEmail = (String) session.getAttribute("user-email");
String userFirstName = (String) session.getAttribute("user-first-name");
String userRole = (String) session.getAttribute("user-role");
%>

<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="description" content="Orbitor,business,company,agency,modern,bootstrap4,tech,software">
  <meta name="author" content="themefisher.com">
  
  <title>ABC Medical Laboratory</title>
  <link rel="shortcut icon" type="image/x-icon" href="./front-end/images/favicon.png" />
  <link rel="stylesheet" href="./front-end/plugins/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="./front-end/plugins/icofont/icofont.min.css">
  <link rel="stylesheet" href="./front-end/plugins/slick-carousel/slick/slick.css">
  <link rel="stylesheet" href="./front-end/plugins/slick-carousel/slick/slick-theme.css">
  <link rel="stylesheet" href="./front-end/css/style.css">
</head>

<body id="top">

<header>
	<div class="header-top-bar">
		<div class="container">
			<div class="row align-items-center">
				<div class="col-lg-6">
				</div>
				<div class="col-lg-6">
                    <div class="text-right top-right-bar mt-2 mt-lg-0">
						<%
						if (userFirstName == null || userEmail == null) {
						%>
						<a href="registration.jsp" class="btn btn-outline-light btn-solid-white">Register</a>
						<a href="login.jsp" class="btn btn-outline-light btn-solid-white">Log In</a>
						<%
						} else {
						%>
						<a class=""  id="dropdown03" data-toggle="dropdown">
                             Hello, <%= userFirstName %> <i class="icofont-thin-down"></i>
                        </a>
                        <ul class="dropdown-menu mt-3" aria-labelledby="dropdown03">
                            <li><a class="dropdown-item" href="dashbord.jsp">Manage an Appointment</a></li>
                            <li><a class="dropdown-item" href="logout">Log Out</a></li>
                        </ul>
                        <% } %>
                    </div>
                </div>
			</div>
		</div>
	</div>
		<nav class="navbar navbar-expand-lg navigation" id="navbar">
		<div class="container">
		 	 <a class="navbar-brand" href="index.jsp">
			  	<img src="./front-end/images/loginlogo.png" alt="" class="img-fluid">
			  </a>

		  
	    
		
   <a class="nav-link btn btn-main btn-round-full" href="index.jsp">HOME</a>
    <a href="appointment.jsp" class="btn btn-main btn-round-full">BOOK APPOINTMENT</a>
    <a class="nav-link btn btn-main btn-round-full" href="service.jsp">SERVICES</a>	
    <a class="nav-link btn btn-main btn-round-full" href="contact.jsp">CONTACT US</a>				
    </div>

</nav>	  
		   
</header>
<section class="section contact-info">
    <div class="container">
         <div class="row">
            <div class="col-lg-4 col-sm-6 col-md-6">
                <div class="contact-block mb-4 mb-lg-0">
                    <i class="icofont-live-support"></i>
                    <h5>Contact Us</h5>
                      <h5> +94743019982</h5>
                
                </div>
            </div>
            <div class="col-lg-4 col-sm-6 col-md-6">
                <div class="contact-block mb-4 mb-lg-0">
                    <i class="icofont-support-faq"></i>
                    <h5>Email Us</h5>
                     <h5>abcmedicallaboratory@gmail.com</h5>
                   
                </div>
            </div>
            <div class="col-lg-4 col-sm-6 col-md-6">
                <div class="contact-block mb-4 mb-lg-0">
                    <i class="icofont-location-pin"></i>
                    <h5>Location</h5>
                       <h5> Uduppiddy Nelliady, SriLanka</h5>
                    
                </div>
            </div>
        </div>
    </div>
</section>
<section class="page-title bg-1">
  <div class="overlay"></div>
  <div class="container">
    <div class="row">
      <div class="col-md-12">
        <div class="block text-center">
          <h1 class="text-capitalize mb-5 text-lg">Get in Touch with us </h1>
        </div>
      </div>
    </div>
  </div>
</section>
<footer class="footer section">
	<div class="container">
		<div class="row">
			<div class="col-lg-4 mr-auto col-sm-6">
				<div class="widget mb-5 mb-lg-0">
					<div class="logo mb-4">
						<img src="./front-end/images/logo1.png" alt="" class="img-fluid">
					</div>
					<ul class="list-inline footer-socials mt-4">
						<li class="list-inline-item"><a href="#"><i class="icofont-facebook"></i></a></li>
						<li class="list-inline-item"><a href="#"><i class="icofont-twitter"></i></a></li>
						
					</ul>
				</div>
			</div>

			<div class="col-lg-4 col-md-6 col-sm-6">
				<div class="widget mb-5 mb-lg-0">
					<h4 class="text-capitalize mb-3">Quick Links</h4>
					<div class="divider mb-4"></div>

					<ul class="list-unstyled footer-menu lh-35">
						 
						<li><a href="index.jsp">Home </a></li>
						<li><a href="appointment.jsp">Book Appointment</a></li>
						<li><a href="service.jsp">Services</a></li>
						<li><a href="contact.jsp">Contact us</a></li>	
					</ul>
				</div>
			</div>



			<div class="col-lg-4 col-md-6 col-sm-6">
				<div class="widget widget-contact mb-5 mb-lg-0">
					<h4 class="text-capitalize mb-3">Get in Touch with us </h4>
					<div class="divider mb-4"></div>

					<div class="footer-contact-block mb-4">
						
						<h4 class="mt-2"><a href="tel:+943019982">abcmedicallaboratory@gmail.com</a></h4>
					
					<h4 class="mt-2">Monday to Sunday : 08:30 - 19:00</h4>
					</div>
	                 <h4 class="mt-2"><a href="tel:+943019982">+94743019982</a></h4>
					<div class="footer-contact-block">
						</div>
					<h4 class="list-inline-item"><i class="icofont-location-pin mr-2"></i> Uduppiddy South,Nelliady, Sri Lanka</h4>
						<div class="icon d-flex align-items-center">
						
								
						
						</div>
						
					</div>
				</div>
			</div>
		</div>
		
		<div class="footer-btm py-4 mt-5">
			<div class="row align-items-center justify-content-between">
				<div class="col-lg-6">
					<div class="copyright">
						&copy; Copyright Reserved to <span class="text-color">ABC Medical Laboratory</span>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-4">
					
				</div>
			</div>
		</div>
	</div>
</footer>

   
    <script src="./front-end/plugins/jquery/jquery.js"></script>
    <script src="./front-end/plugins/bootstrap/js/popper.js"></script>
    <script src="./front-end/plugins/bootstrap/js/bootstrap.min.js"></script>
    <script src="./front-end/plugins/counterup/jquery.easing.js"></script>
    <script src="./front-end/plugins/slick-carousel/slick/slick.min.js"></script>
    <script src="./front-end/plugins/counterup/jquery.waypoints.min.js"></script>
    <script src="./front-end/plugins/shuffle/shuffle.min.js"></script>
    <script src="./front-end/plugins/counterup/jquery.counterup.min.js"></script>
    <script src="./front-end/plugins/google-map/map.js"></script>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAkeLMlsiwzp6b3Gnaxd86lvakimwGA6UA&callback=initMap"></script>    
    
    <script src="./front-end/js/script.js"></script>
    <script src="./front-end/js/contact.js"></script>

  </body>
</html>