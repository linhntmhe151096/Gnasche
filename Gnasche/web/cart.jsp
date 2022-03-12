<%-- 
    Document   : cart
    Created on : Mar 11, 2022, 2:57:42 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <meta name="description" content="">
        <meta name="author" content="">

        <title>Tooplate's Little Fashion - Product Detail</title>

        <!-- CSS FILES -->
        <link rel="preconnect" href="https://fonts.googleapis.com">

        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>

        <link href="https://fonts.googleapis.com/css2?family=Inter:wght@100;300;400;700;900&display=swap" rel="stylesheet">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/bootstrap-icons.css" rel="stylesheet">

        <link rel="stylesheet" href="css/slick.css"/>
        <link rel="stylesheet" href="css/style.css"/>

        <link href="css/tooplate-little-fashion.css" rel="stylesheet">
        <!--
        
        Tooplate 2127 Little Fashion
        
        https://www.tooplate.com/view/2127-little-fashion
        
        -->
    </head>

    <body>

        <section class="preloader">
            <div class="spinner">
                <span class="sk-inner-circle"></span>
            </div>
        </section>

        <main>

            <nav class="navbar navbar-expand-lg">
                <div class="container">
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>

                    <a class="navbar-brand" href="index.html">
                        <strong><img src="images/header/2.jpg" alt="" width="40px" height="auto"> <span>Gnasche</span></strong>
                    </a>

                    <div class="d-lg-none header-option">
                        <a href="sign-in.html" class="bi-person custom-icon me-3"></a>

                        <div class="cart">
                            <a href="cart" class="bi-bag custom-icon"></a>
                            <div class="cart-badge">
                                <c:choose>
                                    <c:when test="${sessionScope.carts == null}">
                                        <div class="cart-count">0</div>                                    
                                    </c:when>
                                    <c:otherwise>                                
                                        <div class="cart-count">${sessionScope.carts.size()}</div>
                                    </c:otherwise>
                                </c:choose>
                            </div>
                        </div>
                    </div>

                    <div class="collapse navbar-collapse" id="navbarNav">
                        <ul class="navbar-nav mx-auto">
                            <li class="nav-item">
                                <a class="nav-link" href="home">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="shop">Shop</a>

                            </li>

                            <li class="nav-item">
                                <a class="nav-link" href="category?categoryId=1">Living room</a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link" href="category?categoryId=2">Bedroom</a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link" href="category?categoryId=3">Kitchen & Dinning</a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link" href="category?categoryId=4">Rugs & Decor</a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link" href="category?categoryId=5">Outdoor</a>
                            </li>
                        </ul>

                        <div class=" header-option">
                            <a href="sign-in.html" class="bi-person custom-icon me-3"></a>

                            <div class="cart" >
                                <a href="cart" class="bi-bag custom-icon"></a>
                                <div class="cart-badge active">
                                    <c:choose>
                                        <c:when test="${sessionScope.carts == null}">
                                            <div class="cart-count">0</div>                                    
                                        </c:when>
                                        <c:otherwise>                                
                                            <div class="cart-count">${sessionScope.carts.size()}</div>
                                        </c:otherwise>
                                    </c:choose>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </nav>



            <header class="site-header section-padding d-flex justify-content-center align-items-center">
                <div class="container">
                    <div class="row">

                        <div class="col-lg-10 col-12">
                            <h3>
                                <span class="d-block text-primary">Cart</span>
                                <!--                                <span class="d-block text-dark">Fashionable Stuffs</span>-->
                            </h3>
                        </div>
                    </div>
                </div>
            </header>






            <div class="container">
                <div class="row">
                    <c:choose>
                        <c:when test="${sessionScope.carts.size()==0|| sessionScope.carts==null}">
                            <h6 class="text-center"><br><br>Don't have any product in your cart.</h6>
                            </c:when>
                            <c:otherwise >
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th class="">Item Name</th>
                                        <th class="">Item Price</th>
                                        <th class="">Quantity</th>
                                        <th class="">Total price</th>                                                   
                                        <th class=""></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${carts}" var="C">

                                        <tr class="">
                                            <td class="">
                                                <div class="product-info">
                                                    <img width="80" src="${C.value.product.imageUrl}" alt="" />
                                                    <a href="#!">${C.value.product.name}</a>
                                                </div>
                                            </td>
                                            <td class="text-center">$${C.value.product.price}</td>
                                            <td class="text-center">${C.value.quantity}</td>
                                            <td class="">$${C.value.product.price*C.value.quantity}</td>

                                            <td class="text-center">

                                                <a class="product-remove bi bi-x-circle" href="delete-cart?productId=${C.value.product.id}"></a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                            <h6>Total Amount: $${totalAmount}</h6>
                            <a href="checkout.html" class="btn btn-dark">Checkout</a>
                        </c:otherwise>
                    </c:choose>                   
                </div>
            </div>
        </main>
        <br><br>




        <footer class="site-footer">
            <div class="container">
                <div class="row">

                    <div class="col-lg-3 col-10 me-auto mb-4">
                        <h4 class="text-white mb-3"><a href="index.html">Little</a> Fashion</h4>
                        <p class="copyright-text text-muted mt-lg-5 mb-4 mb-lg-0">Copyright © 2022 <strong>Little Fashion</strong></p>
                        <br>
                        <p class="copyright-text">Designed by <a href="https://www.tooplate.com/" target="_blank">Tooplate</a></p>
                    </div>

                    <div class="col-lg-5 col-8">
                        <h5 class="text-white mb-3">Sitemap</h5>

                        <ul class="footer-menu d-flex flex-wrap">
                            <li class="footer-menu-item"><a href="about.html" class="footer-menu-link">Story</a></li>

                            <li class="footer-menu-item"><a href="#" class="footer-menu-link">Products</a></li>

                            <li class="footer-menu-item"><a href="#" class="footer-menu-link">Privacy policy</a></li>

                            <li class="footer-menu-item"><a href="#" class="footer-menu-link">FAQs</a></li>

                            <li class="footer-menu-item"><a href="#" class="footer-menu-link">Contact</a></li>
                        </ul>
                    </div>

                    <div class="col-lg-3 col-4">
                        <h5 class="text-white mb-3">Social</h5>

                        <ul class="social-icon">

                            <li><a href="#" class="social-icon-link bi-youtube"></a></li>

                            <li><a href="#" class="social-icon-link bi-whatsapp"></a></li>

                            <li><a href="#" class="social-icon-link bi-instagram"></a></li>

                            <li><a href="#" class="social-icon-link bi-skype"></a></li>
                        </ul>
                    </div>

                </div>
            </div>
        </footer>



        <!-- JAVASCRIPT FILES -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.bundle.min.js"></script>
        <script src="js/Headroom.js"></script>
        <script src="js/jQuery.headroom.js"></script>
        <script src="js/slick.min.js"></script>
        <script src="js/custom.js"></script>

    </body>
</html>