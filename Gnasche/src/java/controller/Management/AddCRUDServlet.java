/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Management;

import DAO.CategoryDAO;
import DAO.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Category;
import model.Product;
import model.Shipping;

/**
 *
 * @author Admin
 */
@WebServlet(name = "AddCRUDServlet", urlPatterns = {"/add-product"})
public class AddCRUDServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            List<Category> listCategory = new CategoryDAO().getAllCategory();
            //List<Product> listProducts = new ProductDAO().getALLProducts();
            request.setAttribute("listCategorys", listCategory);
           // request.setAttribute("listProducts", listProducts);
            request.getRequestDispatcher("addproduct.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String descrip = request.getParameter("description");
        String cate =  (String) request.getParameter("category");
       double price =  Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("stock"));
        String date = (String) request.getParameter("date");
        String image = request.getParameter("image");
        int subid = Integer.parseInt(request.getParameter("subid"));
//        Product pro = Product.builder()
//                .name(name)
//                .phone(phone)
//                .address(address)
//                .build();
        ProductDAO insert = new ProductDAO();
        insert.addProduct(name, quantity, price, descrip, image, date, cate, subid);
        response.sendRedirect("products");
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
