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

                <%@include file="compo/nav.jsp" %>
                <header class="site-header section-padding d-flex justify-content-center align-items-center">
                    <div class="container">
                        <div class="row">

                            <div class="col-lg-10 col-12">
                                <c:choose>
                                    <c:when test="${sessionScope.account.role =='admin'}">
                                        <a href="dashboard"> View Dashboard</a>
                                    </c:when>
                                    <c:otherwise>

                                        <h1>
                                            <span class="d-block text-primary">Choose your</span>
                                            <span class="d-block text-dark">favorite stuffs</span>
                                        </h1>
                                    </c:otherwise>
                                </c:choose>

                            </div>
                        </div>
                    </div>
                </header>


                <div class="container-fluid pt-5">
                    <div class="text-center mb-4">
                        <h2 class="section-title px-5"><span class="px-2">Products</span></h2>
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


                    

            </main>

            <%@include file="compo/footer.jsp" %>
            <!-- JAVASCRIPT FILES -->

            <script src="js/jquery.min.js"></script>
            <script src="js/bootstrap.bundle.min.js"></script>
            <script src="js/Headroom.js"></script>
            <script src="js/jQuery.headroom.js"></script>
            <script src="js/slick.min.js"></script>
            <script src="js/custom.js"></script>

        </script>
</body>
</html>
