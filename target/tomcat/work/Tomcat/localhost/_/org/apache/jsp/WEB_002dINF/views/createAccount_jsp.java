/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-09-17 06:30:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/footer.jspf", Long.valueOf(1505629383000L));
    _jspx_dependants.put("/WEB-INF/views/common/header.jspf", Long.valueOf(1505629383000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Todos Application</title>\n");
      out.write("<link href=\"webjars/bootstrap/3.3.6/css/bootstrap.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<form action=\"/create\" method=\"post\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h1 class=\"well\">Account Opening Form</h1>\n");
      out.write("\t\t\t<div class=\"col-lg-12 well\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>First Name</label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Enter First Name Here..\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"firstname\" required>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Last Name</label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Enter Last Name Here..\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"lastname\" required>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-14 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Address</label>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"address\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Enter Address Here..\" class=\"form-control\" required>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-4 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>City</label> <input type=\"text\" name=\"city\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Enter City Name Here..\" class=\"form-control\" required>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-4 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>State</label> <input type=\"text\" name=\"state\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Enter State Name Here..\" class=\"form-control\" required>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-4 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Zip</label> <input type=\"text\" name=\"zipcode\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Enter Zip Code Here..\" class=\"form-control\" required>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Phone Number</label> <input type=\"text\" name=\"pnumber\"\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Enter Phone Number Here..\" class=\"form-control\" required>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Email Address</label> <input type=\"text\" name=\"email\"\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Enter Email Address Here..\" class=\"form-control\" required>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6 form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Type of Account</label>\n");
      out.write("\t\t\t\t\t\t\t\t<select class=\"col-sm-6 form-control\" name=\"accType\" required>\n");
      out.write("                \t\t\t\t\t<option>Account</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"SB Account\">SB Account</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"Current Account\">Current Account</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"DeMAT Account\">DeMAT Account</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"NRE Account\">NRE Account</option>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default\" value=\"Submit\">Submit</button>\n");
      out.write("\t\t\t\t</div>\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("</form> \n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"webjars/jquery/1.9.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"webjars/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"webjars/bootstrap-datepicker/1.0.1/js/bootstrap-datepicker.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
