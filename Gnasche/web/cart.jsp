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
        <!--
        
        Tooplate 2127 Little Fashion
        
        https://www.tooplate.com/view/2127-little-fashion
        
        -->
    </head>

    <body>

        <!--        <section class="preloader">
                    <div class="spinner">
                        <span class="sk-inner-circle"></span>
                    </div>
                </section>-->

        <main>

            <%@include file="compo/nav.jsp" %>



            <header class="site-header section-padding1 d-flex justify-content-center align-items-center">
                <div class="container">
                    <div class="row">

                        <div class="col-lg-10 col-12">
                            <h3>
                                <span class="d-block text-primary text-center">Cart</span>

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

                                    <form action="update-quantity">
                                        <tr>
                                        <input type="hidden" name="pId" value="${C.value.product.id}">

                                        <td>
                                            <div>
                                                <img width="80" src="${C.value.product.imageUrl}" alt="" />
                                                <a href="#!">${C.value.product.name}</a>
                                            </div>
                                        </td>
                                        <td class="align-middle">$${C.value.product.price}</td>

                                        <td class="align-middle">
                                            <div class="input-group quantity mx-auto" style="width: 100px;">
                                                <div class="">
                                                    <button class="btn btn-sm btn-minus" >                                                            
                                                        <i class="bi-dash"></i>                                                                                                                                
                                                    </button>
                                                </div>
                                                <!--                                                    attrib-->
                                                <input onchange="this.form.submit()"  class="form-control form-control-sm  text-center" name="quantity" value="${C.value.quantity}">
                                                <div class="">
                                                    <button class="btn btn-sm btn-plus">
                                                        <i class="bi-plus"></i>
                                                    </button>
                                                </div>
                                            </div>
                                        </td>
                                        </td>
                                        <td class="align-middle">$${C.value.product.price*C.value.quantity}</td>

                                        <td class="align-middle">

                                            <a class=" bi bi-x-circle" href="delete-cart?productId=${C.value.product.id}"></a>
                                        </td>
                                        </tr>
                                    </form>
                                </c:forEach>
                                </tbody>
                            </table>
                            <h6>Total Amount: $${totalAmount}</h6>
                            <a href="checkout" class="btn btn-dark">Checkout</a>
                        </c:otherwise>
                    </c:choose>                   
                </div>
            </div>
        </main>
        <br><br>




        <%@include file="compo/footer.jsp" %>



        <!-- JAVASCRIPT FILES -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.bundle.min.js"></script>
        <script src="js/Headroom.js"></script>
        <script src="js/jQuery.headroom.js"></script>
        <script src="js/slick.min.js"></script>
        <script src="js/custom.js"></script>

    </body>
    <script>
                                                    function notice(idDelete) {
                                                        var option = confirm('Do you want delete this product?');
                                                        if (option === true) {
                                                            window.location.href = 'delete-cart?productId=' + idDelete;
                                                        }
                                                    }
    </script>
</html>