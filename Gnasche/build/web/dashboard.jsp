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
            <div class="" id="home">
                <%@include file="compo/navCrud.jsp" %>
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <p class="text-white mt-5 mb-5">Welcome back, <b>Admin</b></p>
                        </div>
                    </div>
                    <!-- row -->
                    <div class="row tm-content-row">


                        <div class="col-12 tm-block-col">
                            <div class="tm-bg-primary-dark tm-block tm-block-taller tm-block-scroll">
                                <h3 class="tm-block-title">Orders List</h3>
                                <table class="table" border="1">
                                    <thead>
                                        <tr>
                                            <th scope="col">ORDER NO.</th>
                                            <th scope="col">START DATE</th>
                                            <!--                                            <th scope="col">OPERATORS</th>
                                                                                        <th scope="col">LOCATION</th>
                                                                                        <th scope="col">DISTANCE</th>-->
                                            <th scope="col">TOTAL PRICE</th>
                                            <th scope="col">NOTE</th>
                                        </tr>
                                    </thead>
                                    <tbody>

                                        <c:forEach items="${olist}" var="O">                                                                                        
                                            <tr>
                                                <th scope="row"><b>${O.id}</b></th>
                                                <!--                                            <td>
                                                                                                <div class="tm-status-circle moving">
                                                                                                </div>Moving
                                                                                            </td>-->
                                                <td><b>${O.createdDate}</b></td>
                                                <td><b>${O.totalPrice}</b></td>
                                                <td><b>${O.note}</b></td>
                                                <!--                                            <td>16:00, 12 NOV 2018</td>
                                                                                            <td>08:00, 18 NOV 2018</td>-->
                                            </tr>
                                        </c:forEach>

                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
        </main>
        <footer class="tm-footer row tm-mt-small">
            <div class="col-12 font-weight-light">
                <p class="text-center text-white mb-0 px-4 small">
                    Copyright &copy; <b>2018</b> All rights reserved. 

                    Design: <a rel="nofollow noopener" href="https://templatemo.com" class="tm-footer-link">Template Mo</a>
                </p>
            </div>
        </footer>
    </div>

    <script src="js/jquery-3.3.1.min.js"></script>
    <!-- https://jquery.com/download/ -->
    <script src="js/moment.min.js"></script>
    <!-- https://momentjs.com/ -->
    <script src="js/Chart.min.js"></script>
    <!-- http://www.chartjs.org/docs/latest/ -->
    <script src="js/bootstrap.min.js"></script>
    <!-- https://getbootstrap.com/ -->
    <script src="js/tooplate-scripts.js"></script>
    <script>
        Chart.defaults.global.defaultFontColor = 'white';
        let ctxLine,
                ctxBar,
                ctxPie,
                optionsLine,
                optionsBar,
                optionsPie,
                configLine,
                configBar,
                configPie,
                lineChart;
        barChart, pieChart;
        // DOM is ready
        $(function () {
            drawLineChart(); // Line Chart
            drawBarChart(); // Bar Chart
            drawPieChart(); // Pie Chart

            $(window).resize(function () {
                updateLineChart();
                updateBarChart();
            });
        })
    </script>




</body>
</html>
