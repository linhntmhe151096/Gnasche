package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class allproducts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <title>Tooplate's Little Fashion - Products</title>\n");
      out.write("\n");
      out.write("        <!-- CSS FILES -->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@100;300;400;700;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
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
      out.write("        <a href=\"\">\n");
      out.write("\n");
      out.write("            <section class=\"preloader\">\n");
      out.write("                <div class=\"spinner\">\n");
      out.write("                    <span class=\"sk-inner-circle\"></span>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <main>\n");
      out.write("\n");
      out.write("                <nav class=\"navbar navbar-expand-lg\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("                            <strong><img src=\"images/header/2.jpg\" alt=\"\" width=\"40px\" height=\"auto\"> <span>Gnasche</span></strong>\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                        <div class=\"d-lg-none\">\n");
      out.write("                            <a href=\"sign-in.html\" class=\"bi-person custom-icon me-3\"></a>\n");
      out.write("                            <a href=\"product-detail.html\" class=\"bi-bag custom-icon\"></a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                            <ul class=\"navbar-nav mx-auto\">\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"home\">Home</a>\n");
      out.write("\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category==1?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" href=\"category?categoryId=1\">Living room</a>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category==2?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \" href=\"category?categoryId=2\">Bedroom</a>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"category?categoryId=3\">Kitchen & Dinning</a>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"category?categoryId=4\">Rugs & Decor</a>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"category?categoryId=5\">Outdoor</a>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                            <div class=\"d-none d-lg-block\">\n");
      out.write("                                <a href=\"sign-in.html\" class=\"bi-person custom-icon me-3\"></a>\n");
      out.write("                                <a href=\"product-detail.html\" class=\"bi-bag custom-icon\"></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <header class=\"site-header section-padding d-flex justify-content-center align-items-center\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("\n");
      out.write("                            <div class=\"col-lg-10 col-12\">\n");
      out.write("                                <h1>\n");
      out.write("                                    <span class=\"d-block text-primary\">Choose your</span>\n");
      out.write("                                    <span class=\"d-block text-dark\">favorite stuffs</span>\n");
      out.write("                                </h1>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"container-fluid pt-5\">\n");
      out.write("                    <div class=\"text-center mb-4\">\n");
      out.write("                        <h2 class=\"section-title px-5\"><span class=\"px-2\">Trendy Products</span></h2>\n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"row px-xl-5 pb-3\">  \n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <section class=\"products section-padding\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("\n");
      out.write("                                <div class=\"col-12\">\n");
      out.write("                                    <h2 class=\"mb-5\">New Arrivals</h2>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-lg-4 col-12 mb-3\">\n");
      out.write("                                    <div class=\"product-thumb\">\n");
      out.write("                                        <a href=\"product-detail.html\">\n");
      out.write("                                            <img src=\"images/product/evan-mcdougall-qnh1odlqOmk-unsplash.jpeg\" class=\"img-fluid product-image\" alt=\"\">\n");
      out.write("                                        </a>\n");
      out.write("\n");
      out.write("                                        <div class=\"product-top d-flex\">\n");
      out.write("                                            <span class=\"product-alert me-auto\">New Arrival</span>\n");
      out.write("\n");
      out.write("                                            <a href=\"#\" class=\"bi-heart-fill product-icon\"></a>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"product-info d-flex\">\n");
      out.write("                                            <div>\n");
      out.write("                                                <h5 class=\"product-title mb-0\">\n");
      out.write("                                                    <a href=\"product-detail.html\" class=\"product-title-link\">Tree pot</a>\n");
      out.write("                                                </h5>\n");
      out.write("\n");
      out.write("                                                <p class=\"product-p\">Original package design from house</p>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <small class=\"product-price text-muted ms-auto\">$25</small>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-lg-4 col-12 mb-3\">\n");
      out.write("                                    <div class=\"product-thumb\">\n");
      out.write("                                        <a href=\"product-detail.html\">\n");
      out.write("                                            <img src=\"images/product/jordan-nix-CkCUvwMXAac-unsplash.jpeg\" class=\"img-fluid product-image\" alt=\"\">\n");
      out.write("                                        </a>\n");
      out.write("\n");
      out.write("                                        <div class=\"product-top d-flex\">\n");
      out.write("                                            <span class=\"product-alert\">Discounted Price</span>\n");
      out.write("\n");
      out.write("                                            <a href=\"#\" class=\"bi-heart-fill product-icon ms-auto\"></a>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"product-info d-flex\">\n");
      out.write("                                            <div>\n");
      out.write("                                                <h5 class=\"product-title mb-0\">\n");
      out.write("                                                    <a href=\"product-detail.html\" class=\"product-title-link\">Fashion set</a>\n");
      out.write("                                                </h5>\n");
      out.write("\n");
      out.write("                                                <p class=\"product-p\">Costume package</p>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <small class=\"product-price text-muted ms-auto\">$35</small>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-lg-4 col-12\">\n");
      out.write("                                    <div class=\"product-thumb\">\n");
      out.write("                                        <a href=\"product-detail.html\">\n");
      out.write("                                            <img src=\"images/product/nature-zen-3Dn1BZZv3m8-unsplash.jpeg\" class=\"img-fluid product-image\" alt=\"\">\n");
      out.write("                                        </a>\n");
      out.write("\n");
      out.write("                                        <div class=\"product-top d-flex\">\n");
      out.write("                                            <a href=\"#\" class=\"bi-heart-fill product-icon ms-auto\"></a>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"product-info d-flex\">\n");
      out.write("                                            <div>\n");
      out.write("                                                <h5 class=\"product-title mb-0\">\n");
      out.write("                                                    <a href=\"product-detail.html\" class=\"product-title-link\">Juice Drinks</a>\n");
      out.write("                                                </h5>\n");
      out.write("\n");
      out.write("                                                <p class=\"product-p\">Nature made another world</p>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <small class=\"product-price text-muted ms-auto\">$45</small>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-12\">\n");
      out.write("                                    <h2 class=\"mb-5\">Popular</h2>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-lg-4 col-12 mb-3\">\n");
      out.write("                                    <div class=\"product-thumb\">\n");
      out.write("                                        <a href=\"product-detail.html\">\n");
      out.write("                                            <img src=\"images/product/team-fredi-8HRKoay8VJE-unsplash.jpeg\" class=\"img-fluid product-image\" alt=\"\">\n");
      out.write("                                        </a>\n");
      out.write("\n");
      out.write("                                        <div class=\"product-top d-flex\">\n");
      out.write("                                            <span class=\"product-alert\">Trending</span>\n");
      out.write("\n");
      out.write("                                            <a href=\"#\" class=\"bi-heart-fill product-icon ms-auto\"></a>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"product-info d-flex\">\n");
      out.write("                                            <div>\n");
      out.write("                                                <h5 class=\"product-title mb-0\">\n");
      out.write("                                                    <a href=\"product-detail.html\" class=\"product-title-link\">Package</a>\n");
      out.write("                                                </h5>\n");
      out.write("\n");
      out.write("                                                <p class=\"product-p\">Original package design from house</p>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <small class=\"product-price text-muted ms-auto\">$50</small>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-lg-4 col-12 mb-3\">\n");
      out.write("                                    <div class=\"product-thumb\">\n");
      out.write("                                        <a href=\"product-detail.html\">\n");
      out.write("                                            <img src=\"images/product/quokkabottles-kFc1_G1GvKA-unsplash.jpeg\" class=\"img-fluid product-image\" alt=\"\">\n");
      out.write("                                        </a>\n");
      out.write("\n");
      out.write("                                        <div class=\"product-top d-flex\">\n");
      out.write("                                            <a href=\"#\" class=\"bi-heart-fill product-icon ms-auto\"></a>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"product-info d-flex\">\n");
      out.write("                                            <div>\n");
      out.write("                                                <h5 class=\"product-title mb-0\">\n");
      out.write("                                                    <a href=\"product-detail.html\" class=\"product-title-link\">Bottle</a>\n");
      out.write("                                                </h5>\n");
      out.write("\n");
      out.write("                                                <p class=\"product-p\">Package design</p>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <small class=\"product-price text-muted ms-auto\">$100</small>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-lg-4 col-12 mb-3\">\n");
      out.write("                                    <div class=\"product-thumb\">\n");
      out.write("                                        <a href=\"product-detail.html\">\n");
      out.write("                                            <img src=\"images/product/anis-m-WnVrO-DvxcE-unsplash.jpeg\" class=\"img-fluid product-image\" alt=\"\">\n");
      out.write("                                        </a>\n");
      out.write("\n");
      out.write("                                        <div class=\"product-top d-flex\">\n");
      out.write("                                            <a href=\"#\" class=\"bi-heart-fill product-icon ms-auto\"></a>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"product-info d-flex\">\n");
      out.write("                                            <div>\n");
      out.write("                                                <h5 class=\"product-title mb-0\">\n");
      out.write("                                                    <a href=\"product-detail.html\" class=\"product-title-link\">Medicine</a>\n");
      out.write("                                                </h5>\n");
      out.write("\n");
      out.write("                                                <p class=\"product-p\">Original design from house</p>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <small class=\"product-price text-muted ms-auto\">$200</small>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </section>\n");
      out.write("\n");
      out.write("            </main>\n");
      out.write("\n");
      out.write("            <footer class=\"site-footer\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-3 col-10 me-auto mb-4\">\n");
      out.write("                            <h4 class=\"text-white mb-3\"><a href=\"index.html\">Little</a> Fashion</h4>\n");
      out.write("                            <p class=\"copyright-text text-muted mt-lg-5 mb-4 mb-lg-0\">Copyright © 2022 <strong>Little Fashion</strong></p>\n");
      out.write("                            <br>\n");
      out.write("                            <p class=\"copyright-text\">Designed by <a href=\"https://www.tooplate.com/\" target=\"_blank\">Tooplate</a></p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-5 col-8\">\n");
      out.write("                            <h5 class=\"text-white mb-3\">Sitemap</h5>\n");
      out.write("\n");
      out.write("                            <ul class=\"footer-menu d-flex flex-wrap\">\n");
      out.write("                                <li class=\"footer-menu-item\"><a href=\"about.html\" class=\"footer-menu-link\">Story</a></li>\n");
      out.write("\n");
      out.write("                                <li class=\"footer-menu-item\"><a href=\"#\" class=\"footer-menu-link\">Products</a></li>\n");
      out.write("\n");
      out.write("                                <li class=\"footer-menu-item\"><a href=\"#\" class=\"footer-menu-link\">Privacy policy</a></li>\n");
      out.write("\n");
      out.write("                                <li class=\"footer-menu-item\"><a href=\"#\" class=\"footer-menu-link\">FAQs</a></li>\n");
      out.write("\n");
      out.write("                                <li class=\"footer-menu-item\"><a href=\"#\" class=\"footer-menu-link\">Contact</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-3 col-4\">\n");
      out.write("                            <h5 class=\"text-white mb-3\">Social</h5>\n");
      out.write("\n");
      out.write("                            <ul class=\"social-icon\">\n");
      out.write("\n");
      out.write("                                <li><a href=\"#\" class=\"social-icon-link bi-youtube\"></a></li>\n");
      out.write("\n");
      out.write("                                <li><a href=\"#\" class=\"social-icon-link bi-whatsapp\"></a></li>\n");
      out.write("\n");
      out.write("                                <li><a href=\"#\" class=\"social-icon-link bi-instagram\"></a></li>\n");
      out.write("\n");
      out.write("                                <li><a href=\"#\" class=\"social-icon-link bi-skype\"></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("            <!-- JAVASCRIPT FILES -->\n");
      out.write("            <script src=\"js/jquery.min.js\"></script>\n");
      out.write("            <script src=\"js/bootstrap.bundle.min.js\"></script>\n");
      out.write("            <script src=\"js/Headroom.js\"></script>\n");
      out.write("            <script src=\"js/jQuery.headroom.js\"></script>\n");
      out.write("            <script src=\"js/slick.min.js\"></script>\n");
      out.write("            <script src=\"js/custom.js\"></script>\n");
      out.write("        </a>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listProducts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("Pro");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <div class=\"col-lg-3 col-md-6 col-sm-12 pb-1\">\n");
          out.write("                                <div class=\"card product-item border-0 mb-4\">\n");
          out.write("                                    <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\n");
          out.write("                                        <img class=\"img-fluid w-100\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Pro.imageUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                                    </div>\n");
          out.write("\n");
          out.write("                                    <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\n");
          out.write("                                        <h6 class=\"text-truncate mb-3 \"><a href=\"category?categoryId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Pro.categoryId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"active\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Pro.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h6>\n");
          out.write("                                        <div class=\"d-flex justify-content-center\">\n");
          out.write("                                            <h6>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Pro.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6><h6 class=\"text-muted ml-2\"><del>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Pro.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</del></h6>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"card-footer d-flex justify-content-between bg-light border\">\n");
          out.write("                                        <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-eye text-primary mr-1\"></i>View Detail</a>\n");
          out.write("                                        <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-shopping-cart text-primary mr-1\"></i>Add To Cart</a>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
