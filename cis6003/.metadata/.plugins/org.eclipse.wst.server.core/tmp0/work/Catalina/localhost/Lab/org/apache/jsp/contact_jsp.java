/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-04-09 09:13:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write('	');

String userEmail = (String) session.getAttribute("user-email");
String userFirstName = (String) session.getAttribute("user-first-name");
String userRole = (String) session.getAttribute("user-role");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("  <meta name=\"description\" content=\"Orbitor,business,company,agency,modern,bootstrap4,tech,software\">\r\n");
      out.write("  <meta name=\"author\" content=\"themefisher.com\">\r\n");
      out.write("  <title>ABC Laboratories</title>\r\n");
      out.write("  <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"./front-end/images/favicon.png\" />\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"./front-end/plugins/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"./front-end/plugins/icofont/icofont.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"./front-end/plugins/slick-carousel/slick/slick.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"./front-end/plugins/slick-carousel/slick/slick-theme.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"./front-end/css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"top\">\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("	<div class=\"header-top-bar\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row align-items-center\">\r\n");
      out.write("				<div class=\"col-lg-6\">\r\n");
      out.write("					<ul class=\"top-bar-info list-inline-item pl-0 mb-0\">\r\n");
      out.write("						<li class=\"list-inline-item\"><a href=\"mailto:abclaboratories@email.com\"><i class=\"icofont-support-faq mr-2\"></i>abclaboratories@email.com</a></li>\r\n");
      out.write("						<li class=\"list-inline-item\"><i class=\"icofont-location-pin mr-2\"></i>Address Kururnegala, Sri Lanka </li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-6\">\r\n");
      out.write("                    <div class=\"text-right top-right-bar mt-2 mt-lg-0\">\r\n");
      out.write("						");

						if (userFirstName == null || userEmail == null) {
						
      out.write("\r\n");
      out.write("						<a href=\"registration.jsp\" class=\"btn btn-outline-light btn-solid-white\">Register</a>\r\n");
      out.write("						<a href=\"login.jsp\" class=\"btn btn-outline-light btn-solid-white\">Log In</a>\r\n");
      out.write("						");

						} else {
						
      out.write("\r\n");
      out.write("						<a class=\"\"  id=\"dropdown03\" data-toggle=\"dropdown\">\r\n");
      out.write("                             Hi, ");
      out.print( userFirstName );
      out.write(" <i class=\"icofont-thin-down\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"dropdown-menu mt-3\" aria-labelledby=\"dropdown03\">\r\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"dashbord.jsp\">Manage Appointment</a></li>\r\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"logout\">Log Out</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        ");
 } 
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navigation\" id=\"navbar\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("		 	 <a class=\"navbar-brand\" href=\"index.jsp\">\r\n");
      out.write("			  	<img src=\"./front-end/images/logo.png\" alt=\"\" class=\"img-fluid\">\r\n");
      out.write("			  </a>\r\n");
      out.write("\r\n");
      out.write("		  	<button class=\"navbar-toggler collapsed\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarmain\" aria-controls=\"navbarmain\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"icofont-navigation-menu\"></span>\r\n");
      out.write("		  </button>\r\n");
      out.write("	  \r\n");
      out.write("		  <div class=\"collapse navbar-collapse\" id=\"navbarmain\">\r\n");
      out.write("			<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"index.jsp\">Home</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"service.jsp\">Services</a></li>\r\n");
      out.write("				<li class=\"nav-item active\"><a class=\"nav-link\" href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"appoiment.jsp\">Make appoinment </a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		  </div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("</header>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section class=\"page-title bg-1\">\r\n");
      out.write("  <div class=\"overlay\"></div>\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-md-12\">\r\n");
      out.write("        <div class=\"block text-center\">\r\n");
      out.write("          <span class=\"text-white\">Contact Us</span>\r\n");
      out.write("          <h1 class=\"text-capitalize mb-5 text-lg\">Get in Touch</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<section class=\"section contact-info\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("         <div class=\"row\">\r\n");
      out.write("            <div class=\"col-lg-4 col-sm-6 col-md-6\">\r\n");
      out.write("                <div class=\"contact-block mb-4 mb-lg-0\">\r\n");
      out.write("                    <i class=\"icofont-live-support\"></i>\r\n");
      out.write("                    <h5>Call Us</h5>\r\n");
      out.write("                    +45-0456-6588\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-4 col-sm-6 col-md-6\">\r\n");
      out.write("                <div class=\"contact-block mb-4 mb-lg-0\">\r\n");
      out.write("                    <i class=\"icofont-support-faq\"></i>\r\n");
      out.write("                    <h5>Email Us</h5>\r\n");
      out.write("                    abclaboratories@email.com\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-4 col-sm-6 col-md-6\">\r\n");
      out.write("                <div class=\"contact-block mb-4 mb-lg-0\">\r\n");
      out.write("                    <i class=\"icofont-location-pin\"></i>\r\n");
      out.write("                    <h5>Location</h5>\r\n");
      out.write("                     Kururnegala, Sri Lanka\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<footer class=\"footer section\">\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-lg-4 mr-auto col-sm-6\">\r\n");
      out.write("				<div class=\"widget mb-5 mb-lg-0\">\r\n");
      out.write("					<div class=\"logo mb-4\">\r\n");
      out.write("						<img src=\"./front-end/images/logo1.png\" alt=\"\" class=\"img-fluid\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<p>Welcome to our online appointment booking system! Whether you're a returning patient or new to our services, scheduling your appointments is quick and easy.</p>\r\n");
      out.write("\r\n");
      out.write("					<ul class=\"list-inline footer-socials mt-4\">\r\n");
      out.write("						<li class=\"list-inline-item\"><a href=\"#\"><i class=\"icofont-facebook\"></i></a></li>\r\n");
      out.write("						<li class=\"list-inline-item\"><a href=\"#\"><i class=\"icofont-twitter\"></i></a></li>\r\n");
      out.write("						<li class=\"list-inline-item\"><a href=\"#\"><i class=\"icofont-linkedin\"></i></a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"col-lg-4 col-md-6 col-sm-6\">\r\n");
      out.write("				<div class=\"widget mb-5 mb-lg-0\">\r\n");
      out.write("					<h4 class=\"text-capitalize mb-3\">Quick Links</h4>\r\n");
      out.write("					<div class=\"divider mb-4\"></div>\r\n");
      out.write("\r\n");
      out.write("					<ul class=\"list-unstyled footer-menu lh-35\">\r\n");
      out.write("						<li><a href=\"index.jsp\">Home </a></li>\r\n");
      out.write("						<li><a href=\"service.jsp\">Services</a></li>\r\n");
      out.write("						<li><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("						<li><a href=\"appoiment.jsp\">Make Appoinment</a></li>\r\n");
      out.write("						<li><a href=\"login.jsp\">Login</a></li>\r\n");
      out.write("						<li><a href=\"registration.jsp\">Register</a></li>\r\n");
      out.write("						<li><a href=\"dashbord.jsp\">Manage Appoinment</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div class=\"col-lg-4 col-md-6 col-sm-6\">\r\n");
      out.write("				<div class=\"widget widget-contact mb-5 mb-lg-0\">\r\n");
      out.write("					<h4 class=\"text-capitalize mb-3\">Get in Touch</h4>\r\n");
      out.write("					<div class=\"divider mb-4\"></div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"footer-contact-block mb-4\">\r\n");
      out.write("						<div class=\"icon d-flex align-items-center\">\r\n");
      out.write("							<i class=\"icofont-email mr-3\"></i>\r\n");
      out.write("							<span class=\"h6 mb-0\">Support Available for 24/7</span>\r\n");
      out.write("						</div>\r\n");
      out.write("						<h4 class=\"mt-2\"><a href=\"tel:+23-345-67890\">abclaboratories@email.com</a></h4>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"footer-contact-block\">\r\n");
      out.write("						<div class=\"icon d-flex align-items-center\">\r\n");
      out.write("							<i class=\"icofont-support mr-3\"></i>\r\n");
      out.write("							<span class=\"h6 mb-0\">Mon to Fri : 08:30 - 18:00</span>\r\n");
      out.write("						</div>\r\n");
      out.write("						<h4 class=\"mt-2\"><a href=\"tel:+23-345-67890\">+45-0456-6588</a></h4>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"footer-btm py-4 mt-5\">\r\n");
      out.write("			<div class=\"row align-items-center justify-content-between\">\r\n");
      out.write("				<div class=\"col-lg-6\">\r\n");
      out.write("					<div class=\"copyright\">\r\n");
      out.write("						&copy; Copyright Reserved to <span class=\"text-color\">ABC Laboratories</span>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-lg-4\">\r\n");
      out.write("					<a class=\"backtop js-scroll-trigger\" href=\"#top\">\r\n");
      out.write("						<i class=\"icofont-long-arrow-up\"></i>\r\n");
      out.write("					</a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"./front-end/plugins/jquery/jquery.js\"></script>\r\n");
      out.write("    <script src=\"./front-end/plugins/bootstrap/js/popper.js\"></script>\r\n");
      out.write("    <script src=\"./front-end/plugins/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"./front-end/plugins/counterup/jquery.easing.js\"></script>\r\n");
      out.write("    <script src=\"./front-end/plugins/slick-carousel/slick/slick.min.js\"></script>\r\n");
      out.write("    <script src=\"./front-end/plugins/counterup/jquery.waypoints.min.js\"></script>\r\n");
      out.write("    <script src=\"./front-end/plugins/shuffle/shuffle.min.js\"></script>\r\n");
      out.write("    <script src=\"./front-end/plugins/counterup/jquery.counterup.min.js\"></script>\r\n");
      out.write("    <script src=\"./front-end/plugins/google-map/map.js\"></script>\r\n");
      out.write("    <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyAkeLMlsiwzp6b3Gnaxd86lvakimwGA6UA&callback=initMap\"></script>    \r\n");
      out.write("    <script src=\"./front-end/js/script.js\"></script>\r\n");
      out.write("    <script src=\"j./front-end/s/contact.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
