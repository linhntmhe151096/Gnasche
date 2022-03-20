<%-- 
    Document   : addproduct
    Created on : Mar 15, 2022, 7:21:35 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
        <%@include file="compo/header.jsp" %>
      <body>
        <%@include file="compo/navCrud.jsp" %>

        <div class="container tm-mt-big tm-mb-big">
            <div class="row">
                <div class="col-xl-9 col-lg-10 col-md-12 col-sm-12 mx-auto">
                    <div class="tm-bg-primary-dark tm-block tm-block-h-auto" style="padding-top: 150px;">
                        <div class="row">
                            <div class="col-12">
                                <h3 class="tm-block-title d-inline-block">Add Product</h3>
                            </div>
                        </div>
                        <div class="row tm-edit-product-row">
                            <div class="col-xl-6 col-lg-6 col-md-12">
                                <form action="add-product" method="post" class="tm-edit-product-form">
                                    <div class="form-group mb-3">
                                        <label>Product Name</label>
                                        <input name="name" type="text" class="form-control validate" required/>
                                    </div>
                                    <div class="form-group mb-3">
                                        <label>Description</label>
                                        <textarea name="description" class="form-control validate" rows="3" required></textarea>
                                    </div>
                                    <div class="form-group mb-3">
                                        <label>Category</label>
                                        <select class="custom-select tm-select-accounts" name="category">

                                            <option selected>Select category</option>
                                            <c:forEach items="${listCategorys}" var="c">

                                                <option value="${c.id}">${c.name}</option>
                                            </c:forEach>

                                        </select>
                                    </div>
                                    <div class="row">
                                        <div class="form-group mb-3 col-xs-12 col-sm-6">
                                            <label>Units In Stock</label>
                                            <input name="stock" type="text" class="form-control validate" required/>
                                        </div>
                                        <div class="form-group mb-3 col-xs-12 col-sm-6">
                                            <label>Price</label>
                                            <input name="price" type="text" class="form-control validate" />
                                        </div>

                                    </div>
                                    <div class="row">

                                        <div class="form-group mb-3 col-xs-12 col-sm-6">
                                            <label>SubCategory</label>
                                            <input name="subid" type="text" class="form-control validate"  />
                                        </div>
                                        <div class="form-group mb-3 col-xs-12 col-sm-6">
                                            <label>Date</label>
                                            <input name="date" type="text" class="form-control validate"  />
                                        </div>
                                    </div>


                                    
                                       
                                        <div class="form-group mb-3 col-xs-12 col-sm-6">
                                            <label>Image</label>
                                            <input name="image" type="text" class="form-control validate" />
                                        </div>

                                  
                                    <div class="col-12">
                                        <button type="submit" class="btn btn-primary btn-block text-uppercase">Add Product Now</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
