package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reponse_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>PAGE D'INSCRIPTION CHEZ SIMPLON</title>\n");
      out.write("\t\t<style>\n");
      out.write("\t\t\tbody{\n");
      out.write("\t\t\t\tbox-shadow: 1px 6px 17px;\n");
      out.write("\t\t\t\tmargin-right: 35%;\n");
      out.write("\t\t\t\tmargin-left: 35%;\n");
      out.write("\t\t\t\tmargin-top: 20%;\n");
      out.write("\t\t\t\tpadding-top: 10px;\n");
      out.write("\t\t\t\tpadding-bottom: 10px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t</style>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<h1 align=\"center\">PAGE D'INSCRIPTION CHEZ SIMPLON</h1>\n");
      out.write("                <form action=\"dpage.jsp\" method=\"post\">\n");
      out.write("\t\t\t<table align=\"center\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"right\">Nom</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"nom\" placeholder=\"entrez votre nom\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"right\">Preom</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"prenom\" placeholder=\"entrez votre prenom\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"right\">Telephone</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"tel\" placeholder=\"entrez votre contact\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"right\">Email</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"mail\" placeholder=\"entrez votre adresse mail\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t<td><input type=\"submit\" name=\"valider\" value=\"Enregistrer\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</form>\t\t\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
