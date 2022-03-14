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

            <%@include file="compo/nav.jsp" %>
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
    <%@include file="compo/footer.jsp" %>
    <script src="https://code.iconify.design/2/2.1.2/iconify.min.js"></script>
</html>

