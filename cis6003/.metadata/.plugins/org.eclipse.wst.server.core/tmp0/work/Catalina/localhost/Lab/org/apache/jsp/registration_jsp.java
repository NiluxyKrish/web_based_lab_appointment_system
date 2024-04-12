/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-04-09 09:13:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import core.SessionManage;
import controller.UserController;
import modal.User;
import java.util.List;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(5);
    _jspx_imports_classes.add("core.SessionManage");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("modal.User");
    _jspx_imports_classes.add("controller.UserController");
    _jspx_imports_classes.add("java.util.Map");
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

      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    ");

    if (session.getAttribute("user-email") != null) {
      response.sendRedirect("dashbord.jsp");
    }
    
    Map<String, String> fieldErrors = (Map<String, String>) session.getAttribute("fieldErrors");
    String firstNameError = SessionManage.getFiledValue(fieldErrors, "f_name");
    String lastNameError = SessionManage.getFiledValue(fieldErrors, "l_name");
    String emailError = SessionManage.getFiledValue(fieldErrors, "email");
    String passwordError = SessionManage.getFiledValue(fieldErrors, "password");
    String confirmPasswordError = SessionManage.getFiledValue(fieldErrors, "confPassword");
    String telephoneNumberError = SessionManage.getFiledValue(fieldErrors, "telephone");
    String nicError = SessionManage.getFiledValue(fieldErrors, "nic");
    String dobError = SessionManage.getFiledValue(fieldErrors, "db");
    session.removeAttribute("fieldErrors");
    
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta\r\n");
      out.write("      name=\"viewport\"\r\n");
      out.write("      content=\"width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0\"\r\n");
      out.write("    />\r\n");
      out.write("    <title>ABC Laboratories</title>\r\n");
      out.write("    <meta name=\"description\" content=\"\" />\r\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"./back-end/assets/img/favicon/favicon.ico\" />\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\" />\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin />\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://fonts.googleapis.com/css2?family=Public+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&display=swap\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("    />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./back-end/assets/vendor/fonts/boxicons.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./back-end/assets/vendor/css/core.css\" class=\"template-customizer-core-css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./back-end/assets/vendor/css/theme-default.css\" class=\"template-customizer-theme-css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./back-end/assets/css/demo.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./back-end/assets/vendor/libs/perfect-scrollbar/perfect-scrollbar.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./back-end/assets/vendor/css/pages/page-auth.css\" />\r\n");
      out.write("    <script src=\"./back-end/assets/vendor/js/helpers.js\"></script>\r\n");
      out.write("    <script src=\"./back-end/assets/js/config.js\"></script>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"container-xxl\">\r\n");
      out.write("      <div class=\"authentication-wrapper authentication-basic container-p-y\">\r\n");
      out.write("        <div class=\"\">\r\n");
      out.write("          <div class=\"card\">\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("              <div class=\"app-brand justify-content-center\">\r\n");
      out.write("                <a href=\"index.jsp\" class=\"app-brand-link gap-2\">\r\n");
      out.write("                  <span class=\"app-brand-text demo text-body fw-bolder\">ABC Laboratories</span>\r\n");
      out.write("                </a>\r\n");
      out.write("              </div>\r\n");
      out.write("              <h4 class=\"mb-2 mt-4\">Adventure starts here</h4>\r\n");
      out.write("              <p class=\"mb-4\">Make your app appointment management easy and fun!</p>\r\n");
      out.write("\r\n");
      out.write("              <form method=\"post\" action=\"register\" class=\"mb-3\" id=\"register-form\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-6\">\r\n");
      out.write("                        <div class=\"mb-3\">\r\n");
      out.write("                            <label for=\"f_name\" class=\"form-label\">First Name</label>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                              <input type=\"text\" class=\"form-control\" id=\"f_name\" name=\"f_name\" placeholder=\"First Name\" autofocus />\r\n");
      out.write("                              ");

                              if (firstNameError != null) {
                              
      out.write("\r\n");
      out.write("                              <span style=\"color: red;\">");
      out.print(firstNameError);
      out.write("</span>\r\n");
      out.write("                              ");

                              }
                              
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-6\">\r\n");
      out.write("                      <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"l_name\" class=\"form-label\">Last Name</label>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                          <input type=\"text\" class=\"form-control\" id=\"l_name\" name=\"l_name\" placeholder=\"Last Name\" />\r\n");
      out.write("                          ");

                          if (lastNameError != null) {
                          
      out.write("\r\n");
      out.write("                          <span style=\"color: red;\">");
      out.print(lastNameError);
      out.write("</span>\r\n");
      out.write("                          ");

                          }
                          
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-lg-6\">\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                      <label for=\"nic\" class=\"form-label\">NIC</label>\r\n");
      out.write("                      <div class=\"form-group\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"nic\" name=\"nic\" placeholder=\"NIC\" />\r\n");
      out.write("                        ");

                        if (nicError != null) {
                        
      out.write("\r\n");
      out.write("                        <span style=\"color: red;\">");
      out.print(nicError);
      out.write("</span>\r\n");
      out.write("                        ");

                        }
                        
      out.write("\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-lg-6\">\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                      <label for=\"telephone\" class=\"form-label\">Telephone Number</label>\r\n");
      out.write("                      <div class=\"form-group\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"telephone\" name=\"telephone\" placeholder=\"Telephone Number\" autofocus />\r\n");
      out.write("                        ");

                        if (telephoneNumberError != null) {
                        
      out.write("\r\n");
      out.write("                        <span style=\"color: red;\">");
      out.print(telephoneNumberError);
      out.write("</span>\r\n");
      out.write("                        ");

                        }
                        
      out.write("\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-6\">\r\n");
      out.write("                  <div class=\"mb-3\">\r\n");
      out.write("                    <label for=\"dob\" class=\"form-label\">Date of Birth</label>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                      <input type=\"date\" class=\"form-control\" id=\"dob\" name=\"dob\" placeholder=\"date of birth\" autofocus />\r\n");
      out.write("                      ");

                      if (dobError != null) {
                      
      out.write("\r\n");
      out.write("                      <span style=\"color: red;\">");
      out.print(dobError);
      out.write("</span>\r\n");
      out.write("                      ");

                      }
                      
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-6\">\r\n");
      out.write("                  <div class=\"mb-3\">\r\n");
      out.write("                    <label for=\"email\" class=\"form-label\">Email</label>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                      <input type=\"text\" class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Enter your email\" />\r\n");
      out.write("                      ");

                      if (emailError != null) {
                      
      out.write("\r\n");
      out.write("                      <span style=\"color: red;\">");
      out.print(emailError);
      out.write("</span>\r\n");
      out.write("                      ");

                      }
                      
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-lg-6\">\r\n");
      out.write("                    <div class=\"mb-3 form-password-toggle\">\r\n");
      out.write("                      <label class=\"form-label\" for=\"pass\">Password</label>\r\n");
      out.write("                      <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"input-group input-group-merge\">\r\n");
      out.write("                            <input type=\"password\" id=\"pass\" class=\"form-control\" name=\"password\" placeholder=\"&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;\" aria-describedby=\"password\" />\r\n");
      out.write("                            <span class=\"input-group-text cursor-pointer\"><i class=\"bx bx-hide\"></i></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");

                        if (passwordError != null) {
                        
      out.write("\r\n");
      out.write("                        <span style=\"color: red;\">");
      out.print(passwordError);
      out.write("</span>\r\n");
      out.write("                        ");

                        }
                        
      out.write("\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-lg-6\">\r\n");
      out.write("                    <div class=\"mb-3 form-password-toggle\">\r\n");
      out.write("                      <label class=\"form-label\" for=\"confPassword\">Confirm Password</label>\r\n");
      out.write("                      <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"input-group input-group-merge\">\r\n");
      out.write("                          <input type=\"password\" id=\"confPassword\" class=\"form-control\" name=\"confPassword\" placeholder=\"&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;&#xb7;\" aria-describedby=\"password\" />\r\n");
      out.write("                          <span class=\"input-group-text cursor-pointer\"><i class=\"bx bx-hide\"></i></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");

                        if (confirmPasswordError != null) {
                        
      out.write("\r\n");
      out.write("                        <span style=\"color: red;\">");
      out.print(confirmPasswordError);
      out.write("</span>\r\n");
      out.write("                        ");

                        }
                        
      out.write("\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"form-check\">\r\n");
      out.write("                        <input class=\"form-check-input\" type=\"checkbox\" id=\"agree-term\" name=\"agree-term\" />\r\n");
      out.write("                        <label class=\"form-check-label\" for=\"agree-term\">\r\n");
      out.write("                            I agree to\r\n");
      out.write("                            <a href=\"javascript:void(0);\">privacy policy & terms</a>\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button class=\"btn btn-primary d-grid w-100 form-submit\" type=\"submit\" name=\"signup\" id=\"signup\" value=\"Register\">Sign up</button>\r\n");
      out.write("            </form>            \r\n");
      out.write("          </div>\r\n");
      out.write("              <p class=\"text-center\">\r\n");
      out.write("                <span>Already have an account?</span>\r\n");
      out.write("                <a href=\"login.jsp\">\r\n");
      out.write("                  <span>Sign in instead</span>\r\n");
      out.write("                </a>\r\n");
      out.write("              </p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write(">\r\n");
      out.write("    <script src=\"./back-end/assets/vendor/libs/jquery/jquery.js\"></script>\r\n");
      out.write("    <script src=\"./back-end/assets/vendor/libs/popper/popper.js\"></script>\r\n");
      out.write("    <script src=\"./back-end/assets/vendor/js/bootstrap.js\"></script>\r\n");
      out.write("    <script src=\"./back-end/assets/vendor/libs/perfect-scrollbar/perfect-scrollbar.js\"></script>\r\n");
      out.write("    <script src=\"./back-end/assets/js/jquery.validate.min.js\"></script>\r\n");
      out.write("    <script src=\"./back-end/assets/js/jquery.validate-init.js\"></script>\r\n");
      out.write("    <script src=\"./back-end/assets/vendor/js/menu.js\"></script>\r\n");
      out.write("    <script src=\"./back-end/assets/js/main.js\"></script>\r\n");
      out.write("    <script async defer src=\"https://buttons.github.io/buttons.js\"></script>\r\n");
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
