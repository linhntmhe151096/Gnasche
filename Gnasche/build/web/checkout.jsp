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

            <%@include file="compo/nav.jsp" %>


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
                                <input type="text" class="form-control" id="name" name="name" placeholder="" required>
                            </div>
                            <div class="form-group">
                                <label for="phone">Phone</label>
                                <input type="text" class="form-control" id="phone" name="phone" placeholder="" required>
                            </div>
                            <div class="form-group">
                                <label for="address">Address</label>
                                <input type="text" class="form-control" id="address" name="address" placeholder="" required>
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
        <%@include file="compo/footer.jsp" %>
    </body>
</html>
