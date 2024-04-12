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
  <meta name="description" content="">
  <meta name="author" content="">
  
  <title>ABC Medical Laboratory</title>
  <link rel="shortcut icon" type="image/x-icon" href="./front-end/images/favicon.png" />
  <link rel="stylesheet" href="./front-end/plugins/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="./front-end/plugins/icofont/icofont.min.css">
  <link rel="stylesheet" href="./front-end/plugins/slick-carousel/slick/slick.css">
  <link rel="stylesheet" href="./front-end/plugins/slick-carousel/slick/slick-theme.css">
  <link rel="stylesheet" href="./././././front-end/css/style.css">
</head>

<body id="top">

<header>
	<div class="header-top-bar" >
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
<section class="banner">
	<div class="container">
		<div class="row">
			<div class="col-lg-6 col-md-12 col-xl-7">
				<div class="block">				
					<h1 class="mb-3 mt-3">YOUR RELIABLE MEDICAL TESTING PARTNER</h1>
					<div class="btn-container ">
						
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
<section class="section service gray-bg">
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-lg-7 text-center">

				<div class="section-title">
					<h2>Recognized Patient Care
					</h2>
					<div class="divider mx-auto my-4"></div>
					<p>Agreed! By understanding the fundamental needs and desires, we can deliver excellent care.
					</p>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-4 col-md-6 col-sm-6">
				<div class="service-item mb-4">
					<div class="icon d-flex align-items-center">
						<i class="icofont-heart-beat-alt text-lg"></i>
						<h4 class="mt-3 mb-3">Heart Health</h4>
					</div>
					<div class="content">
						<p class="mb-4">Comprehensive care for a healthy heart and circulation.</p>
					</div>
				</div>
			</div>			
			<div class="col-lg-4 col-md-6 col-sm-6">
				<div class="service-item mb-4">
					<div class="icon d-flex align-items-center">
						<i class="icofont-tooth text-lg"></i>
						<h4 class="mt-3 mb-3">Dental Care</h4>
					</div>
					<div class="content">
						<p class="mb-4">High-quality dental care for a brilliant smile and optimal oral health.</p>
					</div>
				</div>
			</div>
			<div class="col-lg-4 col-md-6 col-sm-6">
				<div class="service-item mb-4">
					<div class="icon d-flex align-items-center">
						<i class="icofont-crutch text-lg"></i>
						<h4 class="mt-3 mb-3">Aesthetic Treatments</h4>
					</div>
					<div class="content">
						<p class="mb-4">Elevating your innate beauty through secure and efficient procedures..</p>
					</div>
				</div>
			</div>
<div class="col-lg-4 col-md-6 col-sm-6">
				<div class="service-item mb-4">
					<div class="icon d-flex align-items-center">
						<i class="icofont-laboratory text-lg"></i>
						<h4 class="mt-3 mb-3">Diagnostic Testing
					</h4>
					</div>

					<div class="content">
						<p class="mb-4">
Precise diagnostics for accurate healthcare decisions</p>
					</div>
				</div>
			</div>
			<div class="col-lg-4 col-md-6 col-sm-6">
				<div class="service-item mb-4">
					<div class="icon d-flex align-items-center">
						<i class="icofont-brain-alt text-lg"></i>
						<h4 class="mt-3 mb-3">Neurological Health</h4>
					</div>
					<div class="content">
						<p class="mb-4">Advanced therapies for neurological conditions, ensuring optimal brain...</p>
					</div>
				</div>
			</div>
			
			<div class="col-lg-4 col-md-6 col-sm-6">
				<div class="service-item mb-4">
					<div class="icon d-flex align-items-center">
						<i class="icofont-dna-alt-1 text-lg"></i>
						<h4 class="mt-3 mb-3">Women's Wellness</h4>
					</div>
					<div class="content">
						<p class="mb-4">Tailored healthcare addressing the requirements of women across all stages.</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>

<section class="section appoinment">
	<div class="container">
		<div class="row align-items-center">
			<div class="col-lg-6 ">
				<div class="appoinment-content">
					<img src="./front-end/images/about/img-3.jpg" alt="" class="img-fluid">
					<div class="emergency">
						<h2 class="text-lg"><i class="icofont-phone-circle text-lg"></i>+94743019982</h2>
					</div>
				</div>
			</div>
			<div class="col-lg-6 col-md-10 ">
				<div class="appoinment-wrap mt-5 mt-lg-0">
					<h2 class="mb-2 title-color">Book Appointment</h2>
					<p class="mb-4">Welcome to our online booking system! Whether you're a new or returning patient, scheduling your appointments is simple and convenient.</p>
                    <p class="mb-4">To get started, please log in or register to access your account. Once logged in, choose your desired date, time, and type of appointment. After booking, you'll receive a confirmation email containing all the necessary details. You can easily manage your appointments, including rescheduling or canceling, in the "Manage Appointments" section of your account..</p>
                    <p class="mb-4"> ABC Medical Laboratory, we value your time and well-being. Book your appointment today and embark on your journey to improved health with us.</p>
				
                </div>
			</div>
		</div>
	</div>
</section>
<section class="section testimonial-2 gray-bg">
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-lg-7">
				<div class="section-title text-center">
					<h2>We've Assisted Over 10,000 Patients</h2>
					<div class="divider mx-auto my-4"></div>
					<p>
Explore how our expertise and compassionate care can meet your needs. Whether you're seeking relief from discomfort or searching for solutions, we're here to support and guide you.</p>
				</div>
			</div>
		</div>
	</div>
	<section class="section appoinment">
	<div class="container">
		<div class="row align-items-center">
			<div class="col-lg-6 ">
				<div class="appoinment-content">
					<img src="./front-end/images/about/img-3.jpg" alt="" class="img-fluid">
					<div class="emergency">
						<h2 class="text-lg"><i class="icofont-phone-circle text-lg"></i>+94743019982</h2>
					</div>
				</div>
			</div>
			
				
				
					<div class="feature-item mb-5 mb-lg-0">
						<div class="feature-icon mb-4">
							<i class="icofont-support"></i>
						</div>
						<h4 class="mb-3">Online Appointments</h4>
						<p class="mb-4">We provide 24/7 emergency support and emphasize family medicine for comprehensive healthcare.</p>
					
						<p>
Access continuous support for emergencies. We've implemented the foundation of laboratory medicine. Reach out to us for any immediate requirements.</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>

<section class="features">
	
						
	<div class="container">
		<div class="row align-items-center">
			
			<div class="col-lg-12 testimonial-wrap-2">
				
				<div class="testimonial-block style-2  gray-bg">
					<i class="icofont-quote-right"></i>

					<div class="testimonial-thumb">
						<img src="./front-end/images/team/test-thumb3.jpg" alt="" class="img-fluid">
					</div>


					<div class="client-info">
						<h4>Efficient Services!</h4>
						<span>kaviya</span>
						<p>
							I was impressed with how quickly they processed my tests.  
					</div>
					
					<i class="icofont-quote-right"></i>
				</div>

				<div class="testimonial-block style-2  gray-bg">
					<div class="testimonial-thumb">
						<img src="./front-end/images/team/test-thumb4.jpg" alt="" class="img-fluid">
					</div>
					<div class="client-info">
						<h4>Excellent Customer Care!</h4>
						<span>sathana</span>
						<p>
							The customer service team went above and beyond to assist me with my queries. 
						</p>
					</div>
					<i class="icofont-quote-right"></i>
				</div>

				<div class="testimonial-block style-2  gray-bg">
					<div class="testimonial-thumb">
						<img src="./front-end/images/team/test-thumb1.jpg" alt="" class="img-fluid">
					</div>

					<div class="client-info">
						<h4>Reliable Results!</h4>
						<span>Mathusan</span>
						<p>
							I trust the accuracy of the test results provided by this laboratory.
						</p>
					</div>
					<i class="icofont-quote-right"></i>
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