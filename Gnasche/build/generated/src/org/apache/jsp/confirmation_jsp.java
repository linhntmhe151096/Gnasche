package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class confirmation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Gnasche Furniture</title>\n");
      out.write("\n");
      out.write("        <!-- CSS FILES -->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@100;300;400;700;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slick.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("\n");
      out.write("        <link href=\"css/tooplate-little-fashion.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main>\n");
      out.write("\n");
      out.write("            <nav class=\"navbar navbar-expand-lg\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("                        <strong><img src=\"images/header/2.jpg\" alt=\"\" width=\"40px\" height=\"auto\"> <span>Gnasche</span></strong>\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                    <div class=\"d-lg-none header-option\">\n");
      out.write("                        <a href=\"sign-in.html\" class=\"bi-person custom-icon me-3\"></a>\n");
      out.write("\n");
      out.write("                        <div class=\"cart\">\n");
      out.write("                            <a href=\"cart\" class=\"bi-bag custom-icon\"></a>\n");
      out.write("                            <div class=\"cart-badge\">\n");
      out.write("                                <c:choose>\n");
      out.write("                                    <c:when test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts == null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                        <div class=\"cart-count\">0</div>                                    \n");
      out.write("                                    </c:when>\n");
      out.write("                                    <c:otherwise>                                \n");
      out.write("                                        <div class=\"cart-count\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                    </c:otherwise>\n");
      out.write("                                </c:choose>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                        <ul class=\"navbar-nav mx-auto\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"home\">Home</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"shop\">Shop</a>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"category?categoryId=1\">Living room</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"category?categoryId=2\">Bedroom</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"category?categoryId=3\">Kitchen & Dinning</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"category?categoryId=4\">Rugs & Decor</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"category?categoryId=5\">Outdoor</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <div class=\" header-option\">\n");
      out.write("                            <a href=\"sign-in.html\" class=\"bi-person custom-icon me-3\"></a>\n");
      out.write("\n");
      out.write("                            <div class=\"cart\" >\n");
      out.write("                                <a href=\"cart\" class=\"bi-bag custom-icon\"></a>\n");
      out.write("                                <div class=\"cart-badge active\">\n");
      out.write("                                    <c:choose>\n");
      out.write("                                        <c:when test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts == null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                            <div class=\"cart-count\">0</div>                                    \n");
      out.write("                                        </c:when>\n");
      out.write("                                        <c:otherwise>                                \n");
      out.write("                                            <div class=\"cart-count\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                        </c:otherwise>\n");
      out.write("                                    </c:choose>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <!-- Page Wrapper -->\n");
      out.write("            <section class=\"page-wrapper\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 col-md-12\">\n");
      out.write("                            <div class=\"text-center\" style=\"padding-top: 100px;\">\n");
      out.write("                                <i class=\"bi-check-circle-fill\" style=\"font-size: 100px;color:green;\"></i>\n");
      out.write("                                <h2 class=\"text-center\">Thank you! For your payment</h2>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Inventore, sed.</p>\n");
      out.write("                                <a href=\"home\" class=\"btn btn-dark mt-20\">Continue Shopping</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section><!-- /.page-warpper -->\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("    </body>\n");
      out.write("    <script src=\"https://code.iconify.design/2/2.1.2/iconify.min.js\"></script>S\n");
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
