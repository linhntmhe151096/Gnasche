package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addcart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Tooplate's Little Fashion - Product Detail</title>\n");
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
      out.write("        <!--\n");
      out.write("        \n");
      out.write("        Tooplate 2127 Little Fashion\n");
      out.write("        \n");
      out.write("        https://www.tooplate.com/view/2127-little-fashion\n");
      out.write("        \n");
      out.write("        -->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <section class=\"preloader\">\n");
      out.write("            <div class=\"spinner\">\n");
      out.write("                <span class=\"sk-inner-circle\"></span>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
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
      out.write("                            <a href=\"orderdetail\" class=\"bi-bag custom-icon\"></a>\n");
      out.write("                            <div class=\"cart-badge\">\n");
      out.write("                                <div class=\"cart-count\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                        <ul class=\"navbar-nav mx-auto\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link active\" href=\"home\">Home</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link active\" href=\"shop\">Shop</a>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <div class=\" header-option\">\n");
      out.write("                            <a href=\"sign-in.html\" class=\"bi-person custom-icon me-3\"></a>\n");
      out.write("\n");
      out.write("                            <div class=\"cart\">\n");
      out.write("                                <a href=\"orderdetail\" class=\"bi-bag custom-icon\"></a>\n");
      out.write("                                <div class=\"cart-badge\">\n");
      out.write("                                    <div class=\"cart-count\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("\n");
      out.write("            <header class=\"site-header section-padding d-flex justify-content-center align-items-center\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-10 col-12\">\n");
      out.write("                            <h1>\n");
      out.write("                                <span class=\"d-block text-primary\">We provide you</span>\n");
      out.write("                                <span class=\"d-block text-dark\">Fashionable Stuffs</span>\n");
      out.write("                            </h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-8 col-md-offset-2\">\n");
      out.write("                        <div class=\"block\">\n");
      out.write("                            <div class=\"product-list\">\n");
      out.write("                                <form method=\"post\">\n");
      out.write("                                    <table class=\"table\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th class=\"\">Item Name</th>\n");
      out.write("                                                <th class=\"\">Item Price</th>\n");
      out.write("                                                <th class=\"\">Actions</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            <tr class=\"\">\n");
      out.write("                                                <td class=\"\">\n");
      out.write("                                                    <div class=\"product-info\">\n");
      out.write("                                                        <img width=\"80\" src=\"images/shop/cart/cart-1.jpg\" alt=\"\" />\n");
      out.write("                                                        <a href=\"#!\">Sunglass</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"\">$200.00</td>\n");
      out.write("                                                <td class=\"\">\n");
      out.write("                                                    <a class=\"product-remove\" href=\"#!\">Remove</a>\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr class=\"\">\n");
      out.write("                                                <td class=\"\">\n");
      out.write("                                                    <div class=\"product-info\">\n");
      out.write("                                                        <img width=\"80\" src=\"images/shop/cart/cart-2.jpg\" alt=\"\" />\n");
      out.write("                                                        <a href=\"#!\">Airspace</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"\">$200.00</td>\n");
      out.write("                                                <td class=\"\">\n");
      out.write("                                                    <a class=\"product-remove\" href=\"#!\">Remove</a>\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr class=\"\">\n");
      out.write("                                                <td class=\"\">\n");
      out.write("                                                    <div class=\"product-info\">\n");
      out.write("                                                        <img width=\"80\" src=\"images/shop/cart/cart-3.jpg\" alt=\"\" />\n");
      out.write("                                                        <a href=\"#!\">Bingo</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td class=\"\">$200.00</td>\n");
      out.write("                                                <td class=\"\">\n");
      out.write("                                                    <a class=\"product-remove\" href=\"#!\">Remove</a>\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                    <a href=\"checkout.html\" class=\"btn btn-main pull-right\">Checkout</a>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <footer class=\"site-footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-10 me-auto mb-4\">\n");
      out.write("                        <h4 class=\"text-white mb-3\"><a href=\"index.html\">Little</a> Fashion</h4>\n");
      out.write("                        <p class=\"copyright-text text-muted mt-lg-5 mb-4 mb-lg-0\">Copyright © 2022 <strong>Little Fashion</strong></p>\n");
      out.write("                        <br>\n");
      out.write("                        <p class=\"copyright-text\">Designed by <a href=\"https://www.tooplate.com/\" target=\"_blank\">Tooplate</a></p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-5 col-8\">\n");
      out.write("                        <h5 class=\"text-white mb-3\">Sitemap</h5>\n");
      out.write("\n");
      out.write("                        <ul class=\"footer-menu d-flex flex-wrap\">\n");
      out.write("                            <li class=\"footer-menu-item\"><a href=\"about.html\" class=\"footer-menu-link\">Story</a></li>\n");
      out.write("\n");
      out.write("                            <li class=\"footer-menu-item\"><a href=\"#\" class=\"footer-menu-link\">Products</a></li>\n");
      out.write("\n");
      out.write("                            <li class=\"footer-menu-item\"><a href=\"#\" class=\"footer-menu-link\">Privacy policy</a></li>\n");
      out.write("\n");
      out.write("                            <li class=\"footer-menu-item\"><a href=\"#\" class=\"footer-menu-link\">FAQs</a></li>\n");
      out.write("\n");
      out.write("                            <li class=\"footer-menu-item\"><a href=\"#\" class=\"footer-menu-link\">Contact</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-4\">\n");
      out.write("                        <h5 class=\"text-white mb-3\">Social</h5>\n");
      out.write("\n");
      out.write("                        <ul class=\"social-icon\">\n");
      out.write("\n");
      out.write("                            <li><a href=\"#\" class=\"social-icon-link bi-youtube\"></a></li>\n");
      out.write("\n");
      out.write("                            <li><a href=\"#\" class=\"social-icon-link bi-whatsapp\"></a></li>\n");
      out.write("\n");
      out.write("                            <li><a href=\"#\" class=\"social-icon-link bi-instagram\"></a></li>\n");
      out.write("\n");
      out.write("                            <li><a href=\"#\" class=\"social-icon-link bi-skype\"></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <!-- CART MODAL -->\n");
      out.write("        <div class=\"modal fade\" id=\"cart-modal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered modal-lg\">\n");
      out.write("                <div class=\"modal-content border-0\">\n");
      out.write("                    <div class=\"modal-header flex-column\">\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-6 col-12 mt-4 mt-lg-0\">\n");
      out.write("                                <img src=\"images/product/evan-mcdougall-qnh1odlqOmk-unsplash.jpeg\" class=\"img-fluid product-image\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-lg-6 col-12 mt-3 mt-lg-0\">\n");
      out.write("                                <h3 class=\"modal-title\" id=\"exampleModalLabel\">Tree pot</h3>\n");
      out.write("\n");
      out.write("                                <p class=\"product-price text-muted mt-3\">$25</p>\n");
      out.write("\n");
      out.write("                                <p class=\"product-p\">Quatity: <span class=\"ms-1\">4</span></p>\n");
      out.write("\n");
      out.write("                                <p class=\"product-p\">Colour: <span class=\"ms-1\">Black</span></p>\n");
      out.write("\n");
      out.write("                                <p class=\"product-p pb-3\">Size: <span class=\"ms-1\">S/S</span></p>\n");
      out.write("\n");
      out.write("                                <div class=\"border-top mt-4 pt-3\">\n");
      out.write("                                    <p class=\"product-p\"><strong>Total: <span class=\"ms-1\">$100</span></strong></p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <div class=\"row w-50\">\n");
      out.write("                            <button type=\"button\" class=\"btn custom-btn cart-btn ms-lg-4\">Checkout</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- JAVASCRIPT FILES -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"js/Headroom.js\"></script>\n");
      out.write("        <script src=\"js/jQuery.headroom.js\"></script>\n");
      out.write("        <script src=\"js/slick.min.js\"></script>\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
