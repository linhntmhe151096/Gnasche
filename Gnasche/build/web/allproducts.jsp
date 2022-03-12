<%-- 
    Document   : allproducts
    Created on : Mar 10, 2022, 12:41:18 AM
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

        <title>Tooplate's Little Fashion - Products</title>

        <!-- CSS FILES -->
        <link rel="preconnect" href="https://fonts.googleapis.com">

        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>

        <link href="https://fonts.googleapis.com/css2?family=Inter:wght@100;300;400;700;900&display=swap" rel="stylesheet">

        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/bootstrap-icons.css" rel="stylesheet">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

        <link rel="stylesheet" href="css/slick.css"/>
        <link rel="stylesheet" href="css/style.css"/>

        <link href="css/tooplate-little-fashion.css" rel="stylesheet">
        <!--
        
        Tooplate 2127 Little Fashion
        
        https://www.tooplate.com/view/2127-little-fashion
        
        -->
    </head>

    <body>

        <a href="">

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
                                    <a class="nav-link active" href="shop">Shop</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link active" href="category?categoryId=1">Living room</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link active" href="category?categoryId=2">Bedroom</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link active" href="category?categoryId=3">Kitchen & Dinning</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link active" href="category?categoryId=4">Rugs & Decor</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link active" href="category?categoryId=5">Outdoor</a>
                                </li>
                            </ul>


                            <!--                            <li class="nav-item dropdown">
                                                            <a href="shop" class="nav-link active dropdown-toggle" id="navbarDarkDropdownMenuLink"  data-bs-toggle="dropdown" aria-expanded="false">
                                                                Shop
                                                            </a>
                                                            <ul class="dropdown-menu" aria-labelledby="navbarDarkDropdownMenuLink">
                                                                <li><a class="dropdown-item" href="category?categoryId=1">Living room</a></li>
                                                                <li><a class="dropdown-item" href="category?categoryId=2">Bedroom</a></li>
                                                                <li><a class="dropdown-item" href="category?categoryId=3">Kitchen & Dinning</a></li>
                                                                <li><a class="dropdown-item" href="category?categoryId=4">Rugs & Decor</a></li>
                                                                <li><a class="dropdown-item" href="category?categoryId=5">Outdoor</a></li>
                                                            </ul>      
                                                        </li>-->




                            <div class=" header-option">
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
                        </div>
                    </div>
                </nav>

                <header class="site-header section-padding d-flex justify-content-center align-items-center">
                    <div class="container">
                        <div class="row">

                            <div class="col-lg-10 col-12">
                                <h1>
                                    <span class="d-block text-primary">Choose your</span>
                                    <span class="d-block text-dark">favorite stuffs</span>
                                </h1>
                            </div>
                        </div>
                    </div>
                </header>


                <div class="container-fluid pt-5">
                    <div class="text-center mb-4">
                        <h2 class="section-title px-5"><span class="px-2">Trendy Products</span></h2>
                    </div>  
                    <div class="row px-xl-5 pb-3">  
                        <c:forEach items="${listProducts}" var= "Pro">
                            <div class="col-lg-3 col-md-6 col-sm-12 pb-1">
                                <div class="card product-item border-0 mb-4">
                                    <div class="card-header product-img position-relative overflow-hidden bg-transparent border p-0">
                                        <a href="detail?productId=${Pro.id}"> <img class="img-fluid w-100" src="${Pro.imageUrl}" alt=""></a>
                                    </div>

                                    <div class="card-body border-left border-right text-center p-0 pt-4 pb-3">
                                        <h6 class="text-truncate mb-3 "><a href="category?categoryId=${Pro.categoryId}" class="active">${Pro.name}</a></h6>
                                        <div class="d-flex justify-content-center">
                                            <h6>$${Pro.price}</h6><h6 class="text-muted ml-2"><del>$${Pro.price}</del></h6>
                                        </div>
                                    </div>
                                    <div class="card-footer d-flex justify-content-between bg-light border">
                                        <a href="detail?productId=${Pro.id}" class="btn btn-sm text-dark p-0"><i class="fas fa-eye text-primary mr-1"></i>View Detail</a>
                                        <a href="add-to-cart?productId=${Pro.id}" class="btn btn-sm text-dark p-0"><i class="fas fa-shopping-cart text-primary mr-1"></i>Add To Cart</a>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>


                    <section class="products section-padding">
                        <div class="container">
                            <div class="row">

                                <div class="col-12">
                                    <h2 class="mb-5">New Arrivals</h2>
                                </div>

                                <div class="col-lg-4 col-12 mb-3">
                                    <div class="product-thumb">
                                        <a href="product-detail.html">
                                            <img src="images/product/evan-mcdougall-qnh1odlqOmk-unsplash.jpeg" class="img-fluid product-image" alt="">
                                        </a>

                                        <div class="product-top d-flex">
                                            <span class="product-alert me-auto">New Arrival</span>

                                            <a href="#" class="bi-heart-fill product-icon"></a>
                                        </div>

                                        <div class="product-info d-flex">
                                            <div>
                                                <h5 class="product-title mb-0">
                                                    <a href="product-detail.html" class="product-title-link">Tree pot</a>
                                                </h5>

                                                <p class="product-p">Original package design from house</p>
                                            </div>

                                            <small class="product-price text-muted ms-auto">$25</small>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-lg-4 col-12 mb-3">
                                    <div class="product-thumb">
                                        <a href="product-detail.html">
                                            <img src="images/product/jordan-nix-CkCUvwMXAac-unsplash.jpeg" class="img-fluid product-image" alt="">
                                        </a>

                                        <div class="product-top d-flex">
                                            <span class="product-alert">Discounted Price</span>

                                            <a href="#" class="bi-heart-fill product-icon ms-auto"></a>
                                        </div>

                                        <div class="product-info d-flex">
                                            <div>
                                                <h5 class="product-title mb-0">
                                                    <a href="product-detail.html" class="product-title-link">Fashion set</a>
                                                </h5>

                                                <p class="product-p">Costume package</p>
                                            </div>

                                            <small class="product-price text-muted ms-auto">$35</small>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-lg-4 col-12">
                                    <div class="product-thumb">
                                        <a href="product-detail.html">
                                            <img src="images/product/nature-zen-3Dn1BZZv3m8-unsplash.jpeg" class="img-fluid product-image" alt="">
                                        </a>

                                        <div class="product-top d-flex">
                                            <a href="#" class="bi-heart-fill product-icon ms-auto"></a>
                                        </div>

                                        <div class="product-info d-flex">
                                            <div>
                                                <h5 class="product-title mb-0">
                                                    <a href="product-detail.html" class="product-title-link">Juice Drinks</a>
                                                </h5>

                                                <p class="product-p">Nature made another world</p>
                                            </div>

                                            <small class="product-price text-muted ms-auto">$45</small>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-12">
                                    <h2 class="mb-5">Popular</h2>
                                </div>

                                <div class="col-lg-4 col-12 mb-3">
                                    <div class="product-thumb">
                                        <a href="product-detail.html">
                                            <img src="images/product/team-fredi-8HRKoay8VJE-unsplash.jpeg" class="img-fluid product-image" alt="">
                                        </a>

                                        <div class="product-top d-flex">
                                            <span class="product-alert">Trending</span>

                                            <a href="#" class="bi-heart-fill product-icon ms-auto"></a>
                                        </div>

                                        <div class="product-info d-flex">
                                            <div>
                                                <h5 class="product-title mb-0">
                                                    <a href="product-detail.html" class="product-title-link">Package</a>
                                                </h5>

                                                <p class="product-p">Original package design from house</p>
                                            </div>

                                            <small class="product-price text-muted ms-auto">$50</small>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-lg-4 col-12 mb-3">
                                    <div class="product-thumb">
                                        <a href="product-detail.html">
                                            <img src="images/product/quokkabottles-kFc1_G1GvKA-unsplash.jpeg" class="img-fluid product-image" alt="">
                                        </a>

                                        <div class="product-top d-flex">
                                            <a href="#" class="bi-heart-fill product-icon ms-auto"></a>
                                        </div>

                                        <div class="product-info d-flex">
                                            <div>
                                                <h5 class="product-title mb-0">
                                                    <a href="product-detail.html" class="product-title-link">Bottle</a>
                                                </h5>

                                                <p class="product-p">Package design</p>
                                            </div>

                                            <small class="product-price text-muted ms-auto">$100</small>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-lg-4 col-12 mb-3">
                                    <div class="product-thumb">
                                        <a href="product-detail.html">
                                            <img src="images/product/anis-m-WnVrO-DvxcE-unsplash.jpeg" class="img-fluid product-image" alt="">
                                        </a>

                                        <div class="product-top d-flex">
                                            <a href="#" class="bi-heart-fill product-icon ms-auto"></a>
                                        </div>

                                        <div class="product-info d-flex">
                                            <div>
                                                <h5 class="product-title mb-0">
                                                    <a href="product-detail.html" class="product-title-link">Medicine</a>
                                                </h5>

                                                <p class="product-p">Original design from house</p>
                                            </div>

                                            <small class="product-price text-muted ms-auto">$200</small>
                                        </div>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </section>

            </main>

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
        </a>
    </body>
</html>
