<%-- 
    Document   : CRUD
    Created on : Mar 15, 2022, 6:15:09 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="compo/header.jsp" %>
    <body>
        <%@include file="compo/navCrud.jsp" %>
        <div class="container mt-5">
            <div class="row tm-content-row" style="padding-top: 120px">
                <div class="col-sm-12 col-md-12 col-lg-9 col-xl-9 tm-block-col">
                    <div class="tm-bg-primary-dark tm-block tm-block-products">
                        <div class="tm-product-table-container">
                            <table class="table table-hover tm-table-small tm-product-table">
                                <thead>
                                    <tr>
                                        <th scope="col">&nbsp;</th>
                                        <th scope="col">ID</th>
                                        <th scope="col">PRODUCT NAME</th>
                                        <th scope="col">UNIT SOLD</th>
                                        <th scope="col">IN STOCK</th>
                                        <th scope="col">EXPIRE DATE</th>
                                        <th scope="col">&nbsp;</th>
                                    </tr>
                                </thead>
                                <tbody>
                                        <c:forEach items="${listProducts}" var="pro">
                                    <tr>
                                    
                                        <th scope="row"><input type="checkbox" /></th>
                                        <td>${pro.id}</td>
                                        <td class="tm-product-name">${pro.name}</td>
                                        <td>1,450</td>
                                        <td>550</td>
                                        <td>${pro.createdDate}</td>
                                        <td>
                                            <a href="delete?productId=${pro.id}" class="tm-product-delete-link">
                                                <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                            </a>
                                        </td>
                                    </tr>
                                </c:forEach>
                                        
                                    
                                </tbody>
                            </table>
                        </div>
                        <!-- table container -->
                        <a
                            href="add-product"
                            class="btn btn-primary btn-block text-uppercase mb-3">Add new product</a>
                        <button class="btn btn-primary btn-block text-uppercase">
                            Delete selected products
                        </button>
                    </div>
                </div>
                <div class="col-sm-12 col-md-12 col-lg-3 col-xl-3 tm-block-col">
                    <div class="tm-bg-primary-dark tm-block tm-block-product-categories">
                        <h5 class="tm-block-title">Product Categories</h5>
                        <div class="tm-product-table-container">
                            <table class="table tm-table-small tm-product-table">
                                <tbody>
                                    <c:forEach items="${listCategory}" var="C">
                                        
                                    <tr>
                                        <td class="tm-product-name">${C.name}</td>
                                        <td class="text-center">
                                            <a href="delete" class="tm-product-delete-link">
                                                <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                            </a>
                                        </td>
                                    </tr>
                                    </c:forEach>
                                    
                                    
                                    
                                </tbody>
                            </table>
                        </div>
                        <!-- table container -->
                        <button class="btn btn-primary btn-block text-uppercase mb-3">
                            Add new category
                        </button>
                    </div>
                </div>
            </div>
        </div>
        <footer class="tm-footer row tm-mt-small">
            <div class="col-12 font-weight-light">
                <p class="text-center text-white mb-0 px-4 small">
                    Copyright &copy; <b>2018</b> All rights reserved. 

                    Design: <a rel="nofollow noopener" href="https://templatemo.com" class="tm-footer-link">Template Mo</a>
                </p>
            </div>
        </footer>

        <script src="js/jquery-3.3.1.min.js"></script>
        <!-- https://jquery.com/download/ -->
        <script src="js/bootstrap.min.js"></script>
        <!-- https://getbootstrap.com/ -->
        <script>
            $(function () {
                $(".tm-product-name").on("click", function () {
                    window.location.href = "edit-product.html";
                });
            });
        </script>
    </body>
</html>

