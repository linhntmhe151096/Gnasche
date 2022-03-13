package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
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
      out.write("\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slick.css\"/>\n");
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
      out.write("                        <div>\n");
      out.write("\n");
      out.write("                            <!--                        luu len session-->\n");
      out.write("                            ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"cart\">\n");
      out.write("                            <a href=\"cart\" class=\"bi-bag custom-icon\"></a>\n");
      out.write("                            <div class=\"cart-badge\">\n");
      out.write("                                ");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                        <ul class=\"navbar-nav mx-auto\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link active\" href=\"home\">Home</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"shop\">Shop</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"category?categoryId=1\">Living room</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"category?categoryId=2\">Bedroom</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"category?categoryId=3\">Kitchen & Dinning</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"category?categoryId=4\">Rugs & Decor</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"category?categoryId=5\">Outdoor</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"header-option\">\n");
      out.write("\n");
      out.write("                            <div>\n");
      out.write("\n");
      out.write("                                <!--                        luu len session-->\n");
      out.write("                                ");
      if (_jspx_meth_c_choose_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"cart\">\n");
      out.write("                                <a href=\"cart\" class=\"bi-bag custom-icon\"></a>\n");
      out.write("                                <div class=\"cart-badge\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_choose_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <section class=\"slick-slideshow\">   \n");
      out.write("                <div class=\"slick-custom\">\n");
      out.write("                    <img src=\"images/slideshow/22.jpg\" class=\"img-fluid\" alt=\"\">\n");
      out.write("\n");
      out.write("                    <div class=\"slick-bottom\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-6 col-10\">\n");
      out.write("                                    <h1 class=\"slick-title\">Cool Fashion</h1>\n");
      out.write("\n");
      out.write("                                    <p class=\"lead text-white mt-lg-3 mb-lg-5\">Little fashion template comes with total 8 HTML pages provided by Tooplate website.</p>\n");
      out.write("\n");
      out.write("                                    <a href=\"about.html\" class=\"btn custom-btn\">Learn more about us</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"slick-custom\">\n");
      out.write("                    <img src=\"images/slideshow/13.png\" class=\"img-fluid\" alt=\"\">\n");
      out.write("\n");
      out.write("                    <div class=\"slick-bottom\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-6 col-10\">\n");
      out.write("                                    <h1 class=\"slick-title\">New Design</h1>\n");
      out.write("\n");
      out.write("                                    <p class=\"lead text-white mt-lg-3 mb-lg-5\">Please share this Little Fashion template to your friends. Thank you for supporting us.</p>\n");
      out.write("\n");
      out.write("                                    <a href=\"product.html\" class=\"btn custom-btn\">Explore products</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"slick-custom\">\n");
      out.write("                    <img src=\"images/slideshow/8.jpg\" class=\"img-fluid\" alt=\"\">\n");
      out.write("\n");
      out.write("                    <div class=\"slick-bottom\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-6 col-10\">\n");
      out.write("                                    <h1 class=\"slick-title\">Talk to us</h1>\n");
      out.write("\n");
      out.write("                                    <p class=\"lead text-white mt-lg-3 mb-lg-5\">Tooplate is one of the best HTML CSS template websites for everyone.</p>\n");
      out.write("\n");
      out.write("                                    <a href=\"contact.html\" class=\"btn custom-btn\">Work with us</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Start introduce -->\n");
      out.write("\n");
      out.write("            <div class=\"home page-template page-template-page-blank page-template-page-blank-php page page-id-97 theme-flatsome woocommerce-js yith-wcan-pro lightbox nav-dropdown-has-arrow nav-dropdown-has-shadow nav-dropdown-has-border\" data-rsssl=\"1\">\n");
      out.write("                <div id=\"wrapper\">\n");
      out.write("                    <main id=\"main\">\n");
      out.write("                        <div class=\"content-area\" id=\"content\" role=\"main\">\n");
      out.write("                            <section class=\"section1\" id=\"section_2121254737\">\n");
      out.write("                                <div class=\"section-content relative\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"row row-collapse row-full-width align-equal design_air\" id=\"row-1157485681\">\n");
      out.write("                                        <div class=\"col img_first_left medium-6 small-12 large-6\" id=\"col-1870515198\">\n");
      out.write("                                            <div class=\"col-inner\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <div class=\"img has-hover img_first_left x md-x lg-x y md-y lg-y\" id=\"image_2090707319\">\n");
      out.write("                                                    <a href=\"\">\t\t\t\t\t\t\n");
      out.write("                                                        <div class=\"img-inner image-zoom dark\">\n");
      out.write("                                                            <img width=\"970\" height=\"640\" class=\"attachment-large size-large lazy-load-active\" alt=\"\" src=\"https://nhaxinh.com/wp-content/uploads/2022/01/banner-phong-khach-nha-xinh-chinh-25122.jpg\" data-src=\"https://nhaxinh.com/wp-content/uploads/2022/01/banner-phong-khach-nha-xinh-chinh-25122.jpg\" sizes=\"(max-width: 970px) 100vw, 970px\" data-srcset=\"https://nhaxinh.com/wp-content/uploads/2022/01/banner-phong-khach-nha-xinh-chinh-25122.jpg 970w, https://nhaxinh.com/wp-content/uploads/2022/01/banner-phong-khach-nha-xinh-chinh-25122-606x400.jpg 606w, https://nhaxinh.com/wp-content/uploads/2022/01/banner-phong-khach-nha-xinh-chinh-25122-768x507.jpg 768w, https://nhaxinh.com/wp-content/uploads/2022/01/banner-phong-khach-nha-xinh-chinh-25122-300x198.jpg 300w, https://nhaxinh.com/wp-content/uploads/2022/01/banner-phong-khach-nha-xinh-chinh-25122-600x396.jpg 600w\" srcset=\"https://nhaxinh.com/wp-content/uploads/2022/01/banner-phong-khach-nha-xinh-chinh-25122.jpg 970w, https://nhaxinh.com/wp-content/uploads/2022/01/banner-phong-khach-nha-xinh-chinh-25122-606x400.jpg 606w, https://nhaxinh.com/wp-content/uploads/2022/01/banner-phong-khach-nha-xinh-chinh-25122-768x507.jpg 768w, https://nhaxinh.com/wp-content/uploads/2022/01/banner-phong-khach-nha-xinh-chinh-25122-300x198.jpg 300w, https://nhaxinh.com/wp-content/uploads/2022/01/banner-phong-khach-nha-xinh-chinh-25122-600x396.jpg 600w\">\t\t\t\t\t\t\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </a>\t\t\n");
      out.write("                                                    <style>\n");
      out.write("                                                        #image_2090707319 {\n");
      out.write("                                                            width: 100%;\n");
      out.write("\n");
      out.write("                                                        }\n");
      out.write("                                                    </style>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <div class=\"text ct_design\" id=\"text-1313502397\">\n");
      out.write("\n");
      out.write("                                                    <h1 class=\"hidden\"></h1>\n");
      out.write("                                                    <div class=\"ct_design\">\n");
      out.write("                                                        <h2>Living room</h2>\n");
      out.write("                                                        <p>The living room is the main space of the house, a place for family gatherings.</p>\n");
      out.write("                                                        <p><a href=\"category?categoryId=1\">&nbsp;Designs <i class=\"fal fa-arrow-right\"></i></a></p>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\t\t\n");
      out.write("                                            </div>\t\t\t\t\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"col first_right medium-6 small-12 large-6\" id=\"col-1957583714\">\n");
      out.write("                                            <div class=\"col-inner\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <div class=\"img has-hover img_first_right x md-x lg-x y md-y lg-y\" id=\"image_663450291\">\n");
      out.write("                                                    <a href=\"\">\t\t\t\t\t\t\n");
      out.write("                                                        <div class=\"img-inner image-zoom dark\">\n");
      out.write("                                                            <img width=\"533\" height=\"600\" class=\"attachment-large size-large lazy-load-active\" alt=\"\" src=\"https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-do-trang-tri-25122-chinh.jpg\" data-src=\"https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-do-trang-tri-25122-chinh.jpg\" sizes=\"(max-width: 533px) 100vw, 533px\" data-srcset=\"https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-do-trang-tri-25122-chinh.jpg 533w, https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-do-trang-tri-25122-chinh-355x400.jpg 355w, https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-do-trang-tri-25122-chinh-300x338.jpg 300w\" srcset=\"https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-do-trang-tri-25122-chinh.jpg 533w, https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-do-trang-tri-25122-chinh-355x400.jpg 355w, https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-do-trang-tri-25122-chinh-300x338.jpg 300w\">\t\t\t\t\t\t\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </a>\t\t\n");
      out.write("                                                    <style>\n");
      out.write("                                                        #image_663450291 {\n");
      out.write("                                                            width: 100%;\n");
      out.write("                                                        }\n");
      out.write("                                                    </style>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <div class=\"ct_design\">\n");
      out.write("                                                    <h2>Decorations</h2>\n");
      out.write("                                                    <p>Bring inspiration and vibrancy to the space.</p>\n");
      out.write("                                                    <p><a href=\"https://nhaxinh.com/danh-muc/hang-trang-tri/\">Discover <i class=\"fal fa-arrow-right\"></i></a></p>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row secon_design\" id=\"row-22527802\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"col medium-6 small-12 large-6\" id=\"col-1159427275\">\n");
      out.write("                                            <div class=\"col-inner\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <div class=\"row secon_left\" id=\"row-1286470059\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    <div class=\"col medium-8 small-12 large-8\" id=\"col-1687674917\">\n");
      out.write("                                                        <div class=\"col-inner\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                            <div class=\"img has-hover x md-x lg-x y md-y lg-y\" id=\"image_1338920600\">\n");
      out.write("                                                                <a href=\"https://nhaxinh.com/phong-ngu/\">\t\t\t\t\t\t<div class=\"img-inner image-zoom dark\">\n");
      out.write("                                                                        <img width=\"800\" height=\"639\" class=\"attachment-large size-large lazy-load-active\" alt=\"\" src=\"https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-ngu-bannerchinh-10121.jpg\" data-src=\"https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-ngu-bannerchinh-10121.jpg\" sizes=\"(max-width: 800px) 100vw, 800px\" data-srcset=\"https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-ngu-bannerchinh-10121.jpg 800w, https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-ngu-bannerchinh-10121-501x400.jpg 501w, https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-ngu-bannerchinh-10121-768x613.jpg 768w, https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-ngu-bannerchinh-10121-300x240.jpg 300w, https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-ngu-bannerchinh-10121-600x479.jpg 600w\" srcset=\"https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-ngu-bannerchinh-10121.jpg 800w, https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-ngu-bannerchinh-10121-501x400.jpg 501w, https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-ngu-bannerchinh-10121-768x613.jpg 768w, https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-ngu-bannerchinh-10121-300x240.jpg 300w, https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-ngu-bannerchinh-10121-600x479.jpg 600w\">\t\t\t\t\t\t\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </a>\t\t\n");
      out.write("                                                                <style>\n");
      out.write("                                                                    #image_1338920600 {\n");
      out.write("                                                                        width: 100%;\n");
      out.write("                                                                    }\n");
      out.write("                                                                </style>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    <div class=\"col medium-4 small-12 large-4\" id=\"col-250922260\">\n");
      out.write("                                                        <div class=\"col-inner\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                            <div class=\"ct_design\">\n");
      out.write("                                                                <h2>Bedroom</h2>\n");
      out.write("                                                                <p>The bedroom models of Gnasche bring a feeling of warmth, closeness and comfort</p>\n");
      out.write("                                                                <p><a href=\"https://nhaxinh.com/phong-ngu/\">Bedroom model <i class=\"fal fa-arrow-right\"></i></a></p>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"col secon_right medium-6 small-12 large-6\" id=\"col-718685922\">\n");
      out.write("                                            <div class=\"col-inner\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <div class=\"img has-hover img_secon_right x md-x lg-x y md-y lg-y\" id=\"image_342006159\">\n");
      out.write("                                                    <a href=\"https://nhaxinh.com/phong-an/\">\t\t\t\t\t\t<div class=\"img-inner image-zoom dark\">\n");
      out.write("                                                            <img width=\"850\" height=\"540\" class=\"attachment-large size-large lazy-load-active\" alt=\"\" src=\"https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-an-chinh-banner-25122.jpg\" data-src=\"https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-an-chinh-banner-25122.jpg\" sizes=\"(max-width: 850px) 100vw, 850px\" data-srcset=\"https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-an-chinh-banner-25122.jpg 850w, https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-an-chinh-banner-25122-630x400.jpg 630w, https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-an-chinh-banner-25122-768x488.jpg 768w, https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-an-chinh-banner-25122-300x191.jpg 300w, https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-an-chinh-banner-25122-600x381.jpg 600w\" srcset=\"https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-an-chinh-banner-25122.jpg 850w, https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-an-chinh-banner-25122-630x400.jpg 630w, https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-an-chinh-banner-25122-768x488.jpg 768w, https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-an-chinh-banner-25122-300x191.jpg 300w, https://nhaxinh.com/wp-content/uploads/2022/01/nha-xinh-phong-an-chinh-banner-25122-600x381.jpg 600w\">\t\t\t\t\t\t\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </a>\t\t\n");
      out.write("                                                    <style>\n");
      out.write("                                                        #image_342006159 {\n");
      out.write("                                                            width: 100%;\n");
      out.write("                                                        }\n");
      out.write("                                                    </style>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <div class=\"ct_design\">\n");
      out.write("                                                    <h2>Dining room</h2>\n");
      out.write("                                                    <p>A delicious meal is always the desire of every family. Dining room space plays a very important role in Vietnamese culture.</p>\n");
      out.write("                                                    <p><a href=\"https://nhaxinh.com/phong-an/\">Dining room model <i class=\"fal fa-arrow-right\"></i></a></p>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div></section></div></main></div></div>\n");
      out.write("            <!-- End introduce -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <section class=\"front-product\">\n");
      out.write("                <div class=\"container-fluid p-0\">\n");
      out.write("                    <div class=\"row align-items-center\">\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-6 col-12\">\n");
      out.write("                            <img src=\"images/slideshow/222.jpg\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-6 col-12\">\n");
      out.write("                            <div class=\"px-5 py-5 py-lg-0\">\n");
      out.write("\n");
      out.write("                                <h2 class=\"mb-4\"><span>Retail</span> shop owners</h2>\n");
      out.write("\n");
      out.write("                                <p class=\"lead mb-4\">Credits go to Unsplash and FreePik websites for images used in this Little Fashion by Tooplate.</p>\n");
      out.write("\n");
      out.write("                                <a href=\"products.html\" class=\"custom-link\">\n");
      out.write("                                    Explore Products\n");
      out.write("                                    <i class=\"bi-arrow-right ms-2\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
      out.write("                <div class=\"carousel-indicators\">\n");
      out.write("                  <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                  <div class=\"carousel-item active\">\n");
      out.write("                    <img src=\"images/slideshow/\" class=\"d-block w-100\" alt=\"\">\n");
      out.write("                  </div>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div> -->\n");
      out.write("\n");
      out.write("            <section class=\"featured-product section-padding\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                        <div class=\"col-12 text-center\">\n");
      out.write("                            <h2 class=\"mb-5\">Featured Products</h2>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-4 col-12 mb-3\">\n");
      out.write("                            <div class=\"product-thumb\">\n");
      out.write("                                <a href=\"product-detail.html\">\n");
      out.write("                                    <img src=\"images/product/evan-mcdougall-qnh1odlqOmk-unsplash.jpeg\" class=\"img-fluid product-image\" alt=\"\">\n");
      out.write("                                </a>\n");
      out.write("\n");
      out.write("                                <div class=\"product-top d-flex\">\n");
      out.write("                                    <span class=\"product-alert me-auto\">New Arrival</span>\n");
      out.write("\n");
      out.write("                                    <a href=\"#\" class=\"bi-heart-fill product-icon\"></a>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"product-info d-flex\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <h5 class=\"product-title mb-0\">\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"product-title-link\">Tree pot</a>\n");
      out.write("                                        </h5>\n");
      out.write("\n");
      out.write("                                        <p class=\"product-p\">Original package design from house</p>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <small class=\"product-price text-muted ms-auto mt-auto mb-5\">$25</small>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-4 col-12 mb-3\">\n");
      out.write("                            <div class=\"product-thumb\">\n");
      out.write("                                <a href=\"product-detail.html\">\n");
      out.write("                                    <img src=\"images/product/jordan-nix-CkCUvwMXAac-unsplash.jpeg\" class=\"img-fluid product-image\" alt=\"\">\n");
      out.write("                                </a>\n");
      out.write("\n");
      out.write("                                <div class=\"product-top d-flex\">\n");
      out.write("                                    <span class=\"product-alert\">Low Price</span>\n");
      out.write("\n");
      out.write("                                    <a href=\"#\" class=\"bi-heart-fill product-icon ms-auto\"></a>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"product-info d-flex\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <h5 class=\"product-title mb-0\">\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"product-title-link\">Fashion Set</a>\n");
      out.write("                                        </h5>\n");
      out.write("\n");
      out.write("                                        <p class=\"product-p\">Costume Package</p>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <small class=\"product-price text-muted ms-auto mt-auto mb-5\">$35</small>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-4 col-12\">\n");
      out.write("                            <div class=\"product-thumb\">\n");
      out.write("                                <a href=\"product-detail.html\">\n");
      out.write("                                    <img src=\"images/product/nature-zen-3Dn1BZZv3m8-unsplash.jpeg\" class=\"img-fluid product-image\" alt=\"\">\n");
      out.write("                                </a>\n");
      out.write("\n");
      out.write("                                <div class=\"product-top d-flex\">\n");
      out.write("                                    <a href=\"#\" class=\"bi-heart-fill product-icon ms-auto\"></a>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"product-info d-flex\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <h5 class=\"product-title mb-0\">\n");
      out.write("                                            <a href=\"product-detail.html\" class=\"product-title-link\">Juice Drinks</a>\n");
      out.write("                                        </h5>\n");
      out.write("\n");
      out.write("                                        <p class=\"product-p\">Nature made another world</p>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <small class=\"product-price text-muted ms-auto mt-auto mb-5\">$45</small>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-12 text-center\">\n");
      out.write("                            <a href=\"AllProduct\" class=\"view-all\">View All Products</a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- hi -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("        <!-- JAVASCRIPT FILES -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"js/Headroom.js\"></script>\n");
      out.write("        <script src=\"js/jQuery.headroom.js\"></script>\n");
      out.write("        <script src=\"js/slick.min.js\"></script>\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <button class=\"btn btn-outline-primary ms-lg-2\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.displayName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</button>\n");
        out.write("                                    <i class=\"bi bi-box-arrow-right\">Log out</i>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <a href=\"login\" class=\"bi-person custom-icon me-3\"></a>  \n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(null);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <div class=\"cart-count\">0</div>                                    \n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("                                \n");
        out.write("                                        <div class=\"cart-count\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_c_choose_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_2.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_2.setParent(null);
    int _jspx_eval_c_choose_2 = _jspx_th_c_choose_2.doStartTag();
    if (_jspx_eval_c_choose_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_otherwise_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_choose_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <button class=\"btn btn-outline-primary ms-lg-2\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.displayName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</button>\n");
        out.write("                                        <i class=\"bi bi-box-arrow-right\">Log out</i>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_2.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    int _jspx_eval_c_otherwise_2 = _jspx_th_c_otherwise_2.doStartTag();
    if (_jspx_eval_c_otherwise_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <a href=\"login\" class=\"bi-person custom-icon me-3\"></a>  \n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
    return false;
  }

  private boolean _jspx_meth_c_choose_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_3 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_3.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_3.setParent(null);
    int _jspx_eval_c_choose_3 = _jspx_th_c_choose_3.doStartTag();
    if (_jspx_eval_c_choose_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_otherwise_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_choose_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_3);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_3);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <div class=\"cart-count\">0</div>                                    \n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_3 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_3.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    int _jspx_eval_c_otherwise_3 = _jspx_th_c_otherwise_3.doStartTag();
    if (_jspx_eval_c_otherwise_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("                                \n");
        out.write("                                            <div class=\"cart-count\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_3);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_3);
    return false;
  }
}
