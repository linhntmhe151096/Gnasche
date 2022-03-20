<%-- 
    Document   : navCrud
    Created on : Mar 15, 2022, 7:22:06 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<nav class="navbar navbar-expand-xl">
    <div class="container h-100">
        <a class="navbar-brand" href="index.html">
            <h2 class="tm-site-title mb-0">Admin <i class="bi bi-emoji-wink"></i></h2>
        </a>
        <button
            class="navbar-toggler ml-auto mr-0"
            type="button"
            data-toggle="collapse"
            data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent"
            aria-expanded="false"
            aria-label="Toggle navigation"
            >
            <i class="fas fa-bars tm-nav-icon"></i>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mx-auto h-100">
                <li class="nav-item">
                    <a class="nav-link" href="http://localhost:8080/Gnasche/admin/dashboard">
                        <i class="fas fa-tachometer-alt"></i> Dashboard
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="">
                        <i class="fas fa-file-alt"></i>
                        Reports
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="http://localhost:8080/Gnasche/admin/products">
                        <i class="fas fa-shopping-cart"></i>
                        Products
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="accounts.html">
                        <i class="far fa-user"></i>
                        Accounts
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="http://localhost:8080/Gnasche/home">
                     <i class="bi bi-eye-fill"></i>
                        Gnasche
                    </a>
                </li>

            </ul>
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link d-block" href="http://localhost:8080/Gnasche/login">
                        Admin, <b>Logout</b>
                    </a>
                </li>
            </ul>
        </div>
    </div>
</nav>
