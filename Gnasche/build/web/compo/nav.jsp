<%-- 
    Document   : nav
    Created on : Mar 13, 2022, 9:34:20 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<nav class="navbar navbar-expand-lg">
    <div class="container">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <a class="navbar-brand" href="index.html">
            <strong><img src="images/header/2.jpg" alt="" width="40px" height="auto"> <span>Gnasche</span></strong>
        </a>

        <div class="d-lg-none header-option">
            <div class="cart">
                <a href="cart" class="bi-bag custom-icon"></a>
                <div class="cart-badge">
                    <c:choose>
                        <c:when test="${sessionScope.carts == null}">
                            <div class="d-lg-none" ></div>                                    
                        </c:when>
                        <c:otherwise>                                
                            <div class="cart-count" id="">${sessionScope.carts.size()}</div>
                        </c:otherwise>
                    </c:choose>
                </div>
            </div>
            <div>

                <!--                        luu len session-->
                <c:choose>
                    <c:when test="${sessionScope.account != null}">

                        <img src="${sessionScope.account.image}"  ms-lg-2  class="rounded-circle" style=" width: 25px">
                        <a href="logout" style="font-size: 17px;">Log out</a>

                    </c:when>
                    <c:otherwise>
                        <a href="login" class="bi-person custom-icon me-3"></a>  
                    </c:otherwise>
                </c:choose>


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
                <!--                            <li class="nav-item">
                                                <a class="nav-link" href="category?categoryId=4">Rugs & Decor</a>
                                            </li>-->
                <!--                            <li class="nav-item">
                                                <a class="nav-link" href="category?categoryId=5">Outdoor</a>
                                            </li>-->
            </ul>


            <div class="header-option">

                <div class="cart">
                    <a href="cart" class="bi-bag custom-icon" style="font-size: 19px;"></a>
                    <c:choose>
                        <c:when test="${sessionScope.carts == null}">
                            <div class="d-lg-none"></div>                                    
                        </c:when>
                        <c:otherwise>                                
                            <div class="cart-badge">
                                <div class="cart-count" id="cart_number">${sessionScope.carts.size()}</div>
                            </div>
                        </c:otherwise>
                    </c:choose>
                </div>
                <div>

                    <!--                        luu len session-->
                    <c:choose>
                        <c:when test="${sessionScope.account != null}">

                            <img src="${sessionScope.account.image}"  ms-lg-2  class="rounded-circle" style=" width: 25px">
                            <a href="logout" style="font-size: 17px;">Log out</a>

                        </c:when>
                        <c:otherwise>
                            <a href="login" class="bi-person custom-icon me-3"></a>  
                        </c:otherwise>
                    </c:choose>

                </div>
            </div>
        </div>
    </div>
</nav>
