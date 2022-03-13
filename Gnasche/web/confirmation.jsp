<%-- 
    Document   : confirmation
    Created on : Mar 13, 2022, 6:04:48 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <meta name="description" content="">
        <meta name="author" content="">

        <title>Gnasche Furniture</title>

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
    </head>
    <body>
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
            <!-- Page Wrapper -->
            <section class="page-wrapper">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6 col-md-12">
                            <div class="text-center" style="padding-top: 100px;">
                                <i class="bi-check-circle-fill" style="font-size: 100px;color:green;"></i>
                                <h3 class="text-center">Thank you! For your payment</h3>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Inventore, sed.</p>
                                <a href="home" class="btn btn-dark mt-20">Continue Shopping</a>
                            </div>
                        </div>
                    </div>
                </div>
            </section><!-- /.page-warpper -->

        </main>
    </body>
    <script src="https://code.iconify.design/2/2.1.2/iconify.min.js"></script>S
</html>

