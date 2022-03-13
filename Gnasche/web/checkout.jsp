<%-- 
    Document   : checkout
    Created on : Mar 13, 2022, 4:05:57 AM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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



            <header class="site-header section-padding1 d-flex justify-content-center align-items-center">
                <div class="container">
                    <div class="row">

                        <div class="col-lg-10 col-12">
                            <h3>
                                <span class="d-block text-primary text-center">Check out</span>

                            </h3>
                        </div>
                    </div>
                </div>
            </header>



            <div class="container">
                <div class="row" style="padding-top: 25px">
                    <div class="col-md-8"> 
                        <h5 class="">Billing Details</h5>
                        <form class="checkout-form" action="checkout" method="post">
                            <div class="form-group">
                                <label for="name">Full Name</label>
                                <input type="text" class="form-control" id="name" name="name" placeholder="">
                            </div>
                            <div class="form-group">
                                <label for="phone">Phone</label>
                                <input type="text" class="form-control" id="phone" name="phone" placeholder="">
                            </div>
                            <div class="form-group">
                                <label for="address">Address</label>
                                <input type="text" class="form-control" id="address" name="address" placeholder="">
                            </div>

                            <div class="form-group" >
                                <label for="note">Note</label>
                                <input type="text" class="form-control" id="note" name="note" value="">
                            </div>

                            <button type="submit" class="btn btn-dark mt-20">Place Order</button>
                        </form>
                    </div>


                    <div class="col-md-4">
                        <div class="product-checkout-details">
                            <div class="block">
                                <h5 class="">Order Summary</h5>
                                <c:forEach items="${carts}" var="C">
                                    <div class="media product-card">
                                        <input type="hidden" name="pId" value="${C.value.product.id}">
                                        <a class="pull-left" href="">
                                            <img class="media-object" src="${C.value.product.imageUrl}" alt="Image" />
                                        </a>
                                        <div class="media-body">
                                            <h4 class="media-heading"><a href="">${C.value.product.name}</a></h4>
                                            <p class="price">${C.value.quantity} x $${C.value.product.price}</p>

                                        </div>
                                    </div>
                                </c:forEach>

                                <div class="summary-total">
                                    <span><b>Total</b></span>
                                    <span>$${totalAmount}</span>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </main>
    </body>
</html>
