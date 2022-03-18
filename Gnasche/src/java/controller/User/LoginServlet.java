/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.User;

import DAO.AccountDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;

/**
 *
 * @author Admin
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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

        //Ktra ac luu cookie co hop le voi database hay khong
        //Lay tat ca cookie tren trinh duyet
        Cookie[] cookies = request.getCookies();
        String username = null;
        String password = null;
        for (Cookie cooky : cookies) {
            if (cooky.getName().equals("username")) {
                username = cooky.getValue();
            } else if (cooky.getName().equals("password")) {
                username = cooky.getValue();
            } else if (username != null && password != null) {
                break;
            }
        }

        if (username != null && password != null) {
            Account account = new AccountDAO().AccountByUsernameAndPassword(username, password);
            if (account != null) { //cookies hop le thi cho dang nhap
                request.getSession().setAttribute("account", account);
                return;

            }
        }
        request.getRequestDispatcher("login.jsp").forward(request, response);
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
        //Sign in
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean remember = request.getParameter("remember") != null;

        AccountDAO dao = new AccountDAO();
        Account ac = dao.AccountByUsernameAndPassword(username, password);

        if (ac == null) {
            request.setAttribute("error", "Username or password is incorrect!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else { //Hop le, luu tren session

            if (ac.getRole().equals(Account.ADMIN)) {

                HttpSession session = request.getSession();
                session.setAttribute("account", ac);
                if (remember) {
                    Cookie c_user = new Cookie("username", username);
                    Cookie c_pass = new Cookie("password", password);

                    c_user.setMaxAge(3600 * 24 * 20);
                    c_pass.setMaxAge(3600 * 24 * 20);
                    //Luu tren trinh duyet may ng dung
                    response.addCookie(c_pass);
                    response.addCookie(c_user);

                }
                response.sendRedirect("admin/dashboard");
            } else if(ac.getRole().equals(Account.USER)) {                
                HttpSession session = request.getSession();
                session.setAttribute("account", ac);
                if (remember) {
                    Cookie c_user = new Cookie("username", username);
                    Cookie c_pass = new Cookie("password", password);

                    c_user.setMaxAge(3600 * 24 * 20);
                    c_pass.setMaxAge(3600 * 24 * 20);
                    //Luu tren trinh duyet may ng dung
                    response.addCookie(c_pass);
                    response.addCookie(c_user);

                }
                response.sendRedirect("home");
            }

        }

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
