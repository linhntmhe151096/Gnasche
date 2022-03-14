<%-- 
    Document   : dashboard
    Created on : Mar 14, 2022, 1:59:32 AM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="compo/header.jsp" %>
    <body>
        <main>
            <%@include file="compo/nav.jsp" %>
            
            <section class="user-dashboard page-wrapper">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12">

                            <div class="dashboard-wrapper user-dashboard">
                                <div class="media" style="padding-top: 100px">
                                    <div class="media-body">
                                        <h2 class="media-heading">Welcome Admin</h2>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Unde, iure, est. Sit mollitia est maxime! Eos
                                            cupiditate tempore, tempora omnis. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Enim, nihil. </p>
                                    </div>
                                </div>
                                <div class="total-order mt-20">
                                    <h4>Total Orders</h4>
                                    <div class="table-responsive">
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <th>Order ID</th>                                                   
                                                    <th>Date</th>
                                                    <th>Total Price</th>
                                                    <th>Note</th>
                                                    <th></th>
                                                </tr>
                                            </thead>
                                            <tbody>

                                                <c:forEach items="${requestScope.olist}" var="O">
                                                    <tr>
                                                        <td><a href="">${O.id}</a></td>
                                                        <td>${O.createdDate}</td>
                                                        <td>$${O.totalPrice}</td>
                                                        <td>${O.note}</td>
                                                        <td></td>

                                                    </tr>
                                                </c:forEach>

                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </main>
            <script>

                function showAlert() {
                <c:forEach items="${requestScope.olist}" var="order">
                    var x = "${order.oid}";
                    console.log(x);
                </c:forEach>
                }
            </script>
    </body>
</html>
