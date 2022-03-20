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

        <title>Shop</title>

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

        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="description" content="Construction Html5 Template">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=5.0">
        <meta name="author" content="Themefisher">
        <meta name="generator" content="Themefisher Constra HTML Template v1.0">

        <!-- Favicon -->
        <link rel="shortcut icon" type="image/x-icon" href="images/favicon.png" />

        <!-- Themefisher Icon font -->
        <link rel="stylesheet" href="plugins/themefisher-font/style.css">
        <!-- bootstrap.min css -->
        <!--<link rel="stylesheet" href="plugins/bootstrap/css/bootstrap.min.css">-->

        <!-- Animate css -->
        <link rel="stylesheet" href="plugins/animate/animate.css">-->
        <!-- Slick Carousel -->
        <link rel="stylesheet" href="plugins/slick/slick.css">
        <link rel="stylesheet" href="plugins/slick/slick-theme.css">

        <!-- Main Stylesheet -->
        <link rel="stylesheet" href="css/style_1.css">
        <style>
            .banner-small {
                display: flex !important;
                text-align: center;
                padding-bottom: 20px;
                font-weight: 400;
            }



            .wrapper {
                *zoom: 1 ;
                max-width: 1350px;
                margin: 0 auto;
                padding: 0 15px;
            }
            /* @media screen and (min-width:480px) */
            .wrapper {
                padding: 0 30px;
                
            }
            .wrapper::after {
                content: "";
                display: table;
                clear: both;
            }
            #catalog_web {
                padding: 50px 0px 30px 0px;
            }
            article, aside, details, figcaption, figure, footer, header, hgroup, main, nav, section, summary {
                display: block;
            }
            .main-content {
                display: block;
            }
            #PageContainer {
                overflow: hidden;
            }

            .cl01 {
                border: 1px solid #dbdbdb;
                background: #fff;
                height: 200px;
                width: 300px;
            }

            a, .text-link {
                color: #2a3167;
                text-decoration: none;
                background: transparent;
            }
            img, iframe {
                max-width: 100%;
            }
            img {
                vertical-align: middle;
            }



            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                font-family: 'Poppins', sans-serif
            }

            .wrapper {
                padding: 30px;
                padding-bottom: 0px;
                padding-top: 0px;
                max-width: 1200px;
                margin: auto
            }

            .h3 {
                font-weight: 900
            }

            .views {
                font-size: 0.85rem
            }

            .btn {
                color: #666;
                font-size: 0.85rem
            }

            .btn:hover {
                color: #61b15a
            }

            .green-label {
                background-color: #defadb;
                color: #48b83e;
                border-radius: 5px;
                font-size: 0.8rem;
                margin: 0 3px
            }

            .radio,
            .checkbox {
                padding: 6px 10px
            }

            .border {
                border-radius: 12px
            }

            .options {
                position: relative;
                padding-left: 25px
            }

            .radio label,
            .checkbox label {
                display: block;
                font-size: 14px;
                cursor: pointer;
                margin: 0
            }

            .options input {
                opacity: 0
            }

            .checkmark {
                position: absolute;
                top: 0px;
                left: 0;
                height: 20px;
                width: 20px;
                background-color: #f8f8f8;
                border: 1px solid #ddd;
                border-radius: 50%
            }

            .options input:checked~.checkmark:after {
                display: block
            }

            .options .checkmark:after {
                content: "";
                width: 9px;
                height: 9px;
                display: block;
                background: white;
                position: absolute;
                top: 52%;
                left: 51%;
                border-radius: 50%;
                transform: translate(-50%, -50%) scale(0);
                transition: 300ms ease-in-out 0s
            }

            .options input[type="radio"]:checked~.checkmark {
                background: #61b15a;
                transition: 300ms ease-in-out 0s
            }

            .options input[type="radio"]:checked~.checkmark:after {
                transform: translate(-50%, -50%) scale(1)
            }

            .count {
                font-size: 0.8rem
            }

            label {
                cursor: pointer
            }

            .tick {
                display: block;
                position: relative;
                padding-left: 23px;
                cursor: pointer;
                font-size: 0.8rem;
                margin: 0
            }

            .tick input {
                position: absolute;
                opacity: 0;
                cursor: pointer;
                height: 0;
                width: 0
            }

            .check {
                position: absolute;
                top: 1px;
                left: 0;
                height: 18px;
                width: 18px;
                background-color: #f8f8f8;
                border: 1px solid #ddd;
                border-radius: 3px
            }

            .tick:hover input~.check {
                background-color: #f3f3f3
            }

            .tick input:checked~.check {
                background-color: #61b15a
            }

            .check:after {
                content: "";
                position: absolute;
                display: none
            }

            .tick input:checked~.check:after {
                display: block;
                transform: rotate(45deg) scale(1)
            }

            .tick .check:after {
                left: 6px;
                top: 2px;
                width: 5px;
                height: 10px;
                border: solid white;
                border-width: 0 3px 3px 0;
                transform: rotate(45deg) scale(2)
            }

            #country {
                font-size: 0.8rem;
                border: none;
                border-left: 1px solid #ccc;
                padding: 0px 10px;
                outline: none;
                font-weight: 900
            }

            .close {
                font-size: 1.2rem
            }

            div.text-muted {
                font-size: 0.85rem
            }

            #sidebar {
                width: 25%;
                float: left
            }

            .category {
                font-size: 16px;
                cursor: pointer
            }

            .list-group-item {
                border: none;
                padding: 0.3rem 0.4rem 0.3rem 0rem
            }

            .badge-primary {
                background-color: #defadb;
                color: #48b83e
            }

            .brand .check {
                background-color: #fff;
                top: 3px;
                border: 1px solid #666
            }

            .brand .tick {
                font-size: 1rem;
                padding-left: 25px
            }

            .rating .check {
                background-color: #fff;
                border: 1px solid #666;
                top: 0
            }

            .rating .tick {
                font-size: 0.9rem;
                padding-left: 25px
            }

            .rating .fas.fa-star {
                color: #ffbb00;
                padding: 0px 3px
            }

            .brand .tick:hover input~.check,
            .rating .tick:hover input~.check {
                background-color: #f9f9f9
            }

            .brand .tick input:checked~.check,
            .rating .tick input:checked~.check {
                background-color: #61b15a
            }

            #products {
                width: 75%;
                padding-left: 30px;
                margin: 0;
                float: right
            }

            .card:hover {
                transform: scale(1.1);
                transition: all 0.5s ease-in-out;
                cursor: pointer
            }

            .card-body {
                padding: 0.5rem
            }

            .card-body .description {
                font-size: 0.78rem;
                padding-bottom: 8px
            }

            div.h6,
            h6 {
                margin: 0
            }

            .product .fa-star {
                font-size: 0.9rem
            }

            .rebate {
                font-size: 0.9rem
            }

            .btn.btn-primary {
                background-color: #48b83e;
                color: #fff;
                border: 1px solid #008000;
                border-radius: 10px;
                font-weight: 800
            }

            .btn.btn-primary:hover {
                background-color: #48b83ee8
            }

            /*            img {
                            width: 192px;
                            height: 132px;
                            object-fit: contain
                        }*/

            .clear {
                clear: both
            }

            .btn.btn-success {
                visibility: hidden
            }

            @media(min-width:992px) {

                .filter,
                #mobile-filter {
                    display: none
                }
            }

            @media(min-width:768px) and (max-width:991px) {

                .radio,
                .checkbox {
                    padding: 6px 10px;
                    width: 49%;
                    float: left;
                    margin: 5px 5px 5px 0px
                }

                .filter,
                #mobile-filter {
                    display: none
                }
            }

            @media(min-width:576px) and (max-width:767px) {
                #sidebar {
                    width: 35%
                }

                #products {
                    width: 65%
                }

                .filter,
                #mobile-filter {
                    display: none
                }

                .h3+.ml-auto {
                    margin: 0
                }
            }

            @media(max-width:575px) {
                .wrapper {
                    padding: 10px
                }

                .h3 {
                    font-size: 1.3rem
                }

                #sidebar {
                    display: none
                }

                #products {
                    width: 100%;
                    float: none
                }

                #products {
                    padding: 0
                }

                .clear {
                    float: left;
                    width: 80%
                }

                .btn.btn-success {
                    visibility: visible;
                    margin: 10px 0px;
                    color: #fff;
                    padding: 0.2rem 0.1rem;
                    width: 20%
                }

                .green-label {
                    width: 50%
                }

                .btn.text-success {
                    padding: 0
                }

                .content,
                #mobile-filter {
                    clear: both
                }
            }
            .pagination {
                display: flex;
                padding-left: 0;
                list-style: none;
            }



            .page-link {
                position: relative;
                display: block;
                padding: 0.5rem 0.75rem;
                margin-left: -1px;
                line-height: 1.25;
                color: #48b83e;
                background-color: #fff;
                border: 1px solid #dee2e6;
            }

            .page-link:hover {
                z-index: 2;
                color: #48b83e;
                text-decoration: none;
                background-color: #e9ecef;
                border-color: #dee2e6;
            }

            .page-link:focus {
                z-index: 3;
                outline: 0;
                box-shadow: none;
            }

            .page-item:first-child .page-link {
                margin-left: 0;
            }

            .page-item.active .page-link  {
                z-index: 3;
                color: #fff;
                background-color: #48b83e;
                border-color: #48b83e;
            }

            .page-item.disabled .page-link {
                color: #6c757d;
                pointer-events: none;
                cursor: auto;
                background-color: #fff;
                border-color: #dee2e6;
            }



        </style>


        <%@include file="compo/nav.jsp"%>
    </head>

    <body>



        <div class="hero-slider" style="padding-top: 50px;">
            <div class="slider-item th-fullpage hero-area" style="background-image: url(images/slideshow/10.jfif);">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 text-center">
                            <p data-duration-in=".3" data-animation-in="fadeInUp" data-delay-in=".1">PRODUCTS</p>
                            <h1 data-duration-in=".3" data-animation-in="fadeInUp" data-delay-in=".5">The beauty of nature <br> is hidden in details.</h1>
                            <a data-duration-in=".3" data-animation-in="fadeInUp" data-delay-in=".8" class="btn" href="shop.html">Shop Now</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="slider-item th-fullpage hero-area" style="background-image: url(images/slideshow/11.jfif);">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 text-left">
                            <p data-duration-in=".3" data-animation-in="fadeInUp" data-delay-in=".1">PRODUCTS</p>
                            <h1 data-duration-in=".3" data-animation-in="fadeInUp" data-delay-in=".5">The beauty of nature <br> is hidden in details.</h1>
                            <a data-duration-in=".3" data-animation-in="fadeInUp" data-delay-in=".8" class="btn" href="shop.html">Shop Now</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="slider-item th-fullpage hero-area" style="background-image: url(images/slideshow/13.png);">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8 text-right">
                            <p data-duration-in=".3" data-animation-in="fadeInUp" data-delay-in=".1">PRODUCTS</p>
                            <h1 data-duration-in=".3" data-animation-in="fadeInUp" data-delay-in=".5">The beauty of nature <br> is hidden in details.</h1>
                            <a data-duration-in=".3" data-animation-in="fadeInUp" data-delay-in=".8" class="btn" href="shop.html">Shop Now</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <!--        <div class="container">
                    <div class="row">
                        <div class="col-md-12 text-center">
                            <h4>Product Category</h4>
                        </div>
                        <div class=" template-index">
                            <div id="PageContainer">
                                <main class="main-content" role="main">
                                    <div id="catalog_web">
                                        <div class="wrapper">
                                            <div class="inner">
                                                <div class="banner-small">
        <c:forEach items="${listCategory}" var="C">
            <div class="cl01"><a href="category?categoryId=${C.id}" target="_blank">
                    <img src="${C.imageUrl}"></a>${C.name}
            </div>
        </c:forEach>
    </div>
</div>
</div>
</div>
</main>
</div>
</div>
</div>
</div>-->





        <main>

            <div class="wrapper">
                <div class="d-md-flex align-items-md-center">
                    <!--                    <div class="h3">Furniture</div>-->
                    <div class="ml-auto d-flex align-items-center views"> <span class="btn text-success"> <span class="fas fa-th px-md-2 px-1"></span><span>Grid view</span> </span> <span class="btn"> <span class="fas fa-list-ul"></span><span class="px-md-2 px-1">List view</span> </span> <span class="green-label px-md-2 px-1">428</span> <span class="text-muted">Products</span> </div>
                </div>
                <div class="d-lg-flex align-items-lg-center pt-2">
                    <div class="form-inline d-flex align-items-center my-2 mr-lg-2 radio bg-light border"> 
                        <label class="options">Most Popular <input type="radio" name="radio"><span class="checkmark"></span> </label> 
                        <label class="options">Cheapest <input type="radio" name="radio" checked> <span class="checkmark"></span> </label> 
                    </div>


                    <div class="form-inline d-flex align-items-center my-2 checkbox bg-light border mx-lg-2"> <label class="tick">Czech republic <input type="checkbox"> <span class="check"></span> </label> <span class="border px-1 mx-2 mr-3 font-weight-bold count"> 12</span> <select name="country" id="country" class="bg-light">
                            <option value="" hidden>Country</option>
                            <option value="India">India</option>
                            <option value="USA">USA</option>
                            <option value="Uk">UK</option>
                        </select> </div>


                    <form action="">
                        <div class="input-group" style="padding-top: 15px;margin-right: 80px;margin-left: 100px;border-radius: 3px; height: 15px;">
                            <input type="text" class="form-control" placeholder="Search for products">
                            <div class="input-group-append">
                                <span class="input-group-text bg-transparent text-primary">
                                    <i class="fa fa-search"></i>
                                </span>
                            </div>
                        </div>
                    </form>
                </div>

                <div class="d-sm-flex align-items-sm-center pt-2 clear">
                    <div class="text-muted filter-label">Applied Filters:</div>
                    <div class="green-label font-weight-bold p-0 px-1 mx-sm-1 mx-0 my-sm-0 my-2">Selected Filtre <span class=" px-1 close">&times;</span> </div>
                    <div class="green-label font-weight-bold p-0 px-1 mx-sm-1 mx-0">Selected Filtre <span class=" px-1 close">&times;</span> </div>
                </div>
                <div class="filters"> <button class="btn btn-success" type="button" data-toggle="collapse" data-target="#mobile-filter" aria-expanded="true" aria-controls="mobile-filter">Filter<span class="px-1 fas fa-filter"></span></button> </div>
                <div class="content py-md-0 py-3">
                    <section id="sidebar">
                        <div class="py-3">
                            <h5 class="font-weight-bold">Categories</h5>
                            <ul class="list-group">

                                <c:forEach items="${listCategory}" var="C">
                                    <li class="list-group-item list-group-item-action d-flex justify-content-between align-items-center category"><a href="category?categoryId=${C.id}">${C.name}</a></li>

                                </c:forEach>
                            </ul>
                        </div>
                        <div class="py-3">
                            <h5 class="font-weight-bold">Brands</h5>
                            <form class="brand">
                                <div class="form-inline d-flex align-items-center py-1"> <label class="tick">Royal Fields <input type="checkbox"> <span class="check"></span> </label> </div>
                                <div class="form-inline d-flex align-items-center py-1"> <label class="tick">Crasmas Fields <input type="checkbox" checked> <span class="check"></span> </label> </div>
                                <div class="form-inline d-flex align-items-center py-1"> <label class="tick">Vegetarisma Farm <input type="checkbox" checked> <span class="check"></span> </label> </div>
                                <div class="form-inline d-flex align-items-center py-1"> <label class="tick">Farmar Field Eve <input type="checkbox"> <span class="check"></span> </label> </div>
                                <div class="form-inline d-flex align-items-center py-1"> <label class="tick">True Farmar Steve <input type="checkbox"> <span class="check"></span> </label> </div>
                            </form>
                        </div>
                        <div class="py-3">
                            <h5 class="font-weight-bold">Rating</h5>
                            <form class="rating">
                                <div class="form-inline d-flex align-items-center py-2"> <label class="tick"><span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <input type="checkbox"> <span class="check"></span> </label> </div>
                                <div class="form-inline d-flex align-items-center py-2"> <label class="tick"> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="far fa-star px-1 text-muted"></span> <input type="checkbox"> <span class="check"></span> </label> </div>
                                <div class="form-inline d-flex align-items-center py-2"> <label class="tick"><span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="far fa-star px-1 text-muted"></span> <span class="far fa-star px-1 text-muted"></span> <input type="checkbox"> <span class="check"></span> </label> </div>
                                <div class="form-inline d-flex align-items-center py-2"> <label class="tick"><span class="fas fa-star"></span> <span class="fas fa-star"></span> <span class="far fa-star px-1 text-muted"></span> <span class="far fa-star px-1 text-muted"></span> <span class="far fa-star px-1 text-muted"></span> <input type="checkbox"> <span class="check"></span> </label> </div>
                                <div class="form-inline d-flex align-items-center py-2"> <label class="tick"> <span class="fas fa-star"></span> <span class="far fa-star px-1 text-muted"></span> <span class="far fa-star px-1 text-muted"></span> <span class="far fa-star px-1 text-muted"></span> <span class="far fa-star px-1 text-muted"></span> <input type="checkbox"> <span class="check"></span> </label> </div>
                            </form>
                        </div>
                    </section> <!-- Products Section -->
                    <section id="products">
                        <div class="container py-3">
                            <div class="row">
                                <c:forEach items="${listProducts}" var="P">
                                    <div class="col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1">
                                        <div class="product-item">
                                            <div class="product-thumb">
                                                <span class="bage">Sale</span>
                                                <img class="img-responsive" src="${P.imageUrl}" alt="product-img" />
                                                <div class="preview-meta">
                                                    <ul>
                                                        <li>
                                                            <a href="detail?productId=${P.id}">
                                                                <i  class="tf-ion-ios-search-strong"></i>
                                                            </a>
                                                        </li>
                                                        <li>
                                                            <a href="#!" ><i class="tf-ion-ios-heart"></i></a>
                                                        </li>
                                                        <li>
                                                            <a href="add-to-cart?productId=${P.id}"><i class="tf-ion-android-cart"></i></a>
                                                        </li>
                                                    </ul>
                                                </div>
                                            </div>
                                            <div class="product-content product-title">
                                                <h4><a href="detail?productId=${P.id}">${P.name}</a></h4>
                                                <h6 class="price">$${P.price}</h6>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                    </section>

                </div>
            </div> 
            <nav aria-label="Page navigation example" class="d-flex justify-content-lg-end" style="padding-bottom: 70px;padding-right: 180px;">
                <ul class="pagination">
                    <li class="page-item" style="">
                        <a class="page-link" href="shop?page=${page-1}" aria-label="Previous" style="color:#48b83e">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </li>

                    <c:forEach begin="1" end="${totalPage}" var="i">
                        <li class="page-item ${i==page?"active":""}"><a class="page-link" href="shop?page=${i}">${i}</a></li>

                    </c:forEach>

                    <li class="page-item">
                        <a class="page-link" href="shop?page=${page+1}" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li>
                </ul>
            </nav>
        </main>

















        <%@include file="compo/footer.jsp" %>

        <!-- JAVASCRIPT FILES -->

        <!--    <script src="js/jquery.min.js"></script>
            <script src="js/bootstrap.bundle.min.js"></script>
            <script src="js/Headroom.js"></script>
            <script src="js/jQuery.headroom.js"></script>
            <script src="js/slick.min.js"></script>
            <script src="js/custom.js"></script>
        -->            <script src="plugins/jquery/dist/jquery.min.js"></script>
        <!-- Bootstrap 3.1 -->
        <script src="plugins/bootstrap/js/bootstrap.min.js"></script>
        <!-- Bootstrap Touchpin -->
        <script src="plugins/bootstrap-touchspin/dist/jquery.bootstrap-touchspin.min.js"></script>
        <!-- Instagram Feed Js -->
        <script src="plugins/instafeed/instafeed.min.js"></script>
        <!-- Video Lightbox Plugin -->
        <script src="plugins/ekko-lightbox/dist/ekko-lightbox.min.js"></script>
        <!-- Count Down Js -->
        <script src="plugins/syo-timer/build/jquery.syotimer.min.js"></script>

        <!-- slick Carousel -->
        <script src="plugins/slick/slick.min.js"></script>
        <script src="plugins/slick/slick-animation.min.js"></script>

        <!-- Google Mapl -->
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCC72vZw-6tGqFyRhhg5CkF2fqfILn2Tsw"></script>
        <script type="text/javascript" src="plugins/google-map/gmap.js"></script>

        <!-- Main Js File -->
        <script src="js/script.js"></script>
    </body>
</html>
