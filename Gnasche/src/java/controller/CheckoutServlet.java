/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.OrderDAO;
import DAO.OrderDetailDAO;
import DAO.ShippingDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;
import model.Order;
import model.Shipping;

/**
 *
 * @author Admin
 */
@WebServlet(name = "CheckoutServlet", urlPatterns = {"/checkout"})
public class CheckoutServlet extends HttpServlet {

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
            HttpSession session = request.getSession();
            Map<Integer, Cart> carts = (Map<Integer, Cart>) session.getAttribute("carts");
            if (carts == null) {
                carts = new LinkedHashMap<>();
            }

            //total amount tinh lai
            double totalAmount = 0;
            for (Map.Entry<Integer, Cart> entry : carts.entrySet()) {
                Integer producId = entry.getKey();
                Cart cart = entry.getValue();

                totalAmount += cart.getQuantity() * cart.getProduct().getPrice();

            }
            request.setAttribute("totalAmount", totalAmount); //gui sang jsp
            request.setAttribute("carts", carts);

            request.getRequestDispatcher("checkout.jsp").forward(request, response);
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
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String note = request.getParameter("note");

        //Luu tt vao database
        //luu don hang vao shipping
        Shipping shipping = Shipping.builder()
                .name(name)
                .phone(phone)
                .address(address)
                .build();

        int shippingId = new ShippingDAO().createdReturnId(shipping);//return id tu tang cua ban ghi vua lua vao database

        //Luu don hang vao order
        HttpSession session = request.getSession();
        Map<Integer, Cart> carts = (Map<Integer, Cart>) session.getAttribute("carts");
        if (carts == null) {
            carts = new LinkedHashMap<>();
        }

        //total amount
        double totalAmount = 0;
        for (Map.Entry<Integer, Cart> entry : carts.entrySet()) {
            Integer producId = entry.getKey();
            Cart cart = entry.getValue();

            totalAmount += cart.getQuantity() * cart.getProduct().getPrice();

        }

        Order order = Order.builder()
                .accountId(1)
                .totalPrice(totalAmount)
                .note(note)
                .shippingId(shippingId)
                .build();
        //lay id cua order
        int orderId = new OrderDAO().createdReturnId(order);
        
        
        //Luu don hang vao order detail
        
        new OrderDetailDAO().saveCart(orderId, carts);
        
        //Dat hang xong reset cart
        session.removeAttribute("carts");
        
        //thanh toan xong
        response.sendRedirect("confirmation");
        
        
               
      
        
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
