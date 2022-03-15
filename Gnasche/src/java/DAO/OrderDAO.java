/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAL.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Order;

/**
 *
 * @author Admin
 */
public class OrderDAO {

    public int createdReturnId(Order order) {
        try {
            String sql = "INSERT INTO [dbo].[Orders]\n"
                    + "           ([account_id]\n"
                    + "           ,[totalPrice]\n"
                    + "           ,[note]\n"
                    + "           ,[shipping_id])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?)";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);//sau khi thuc thi return key tu tang
            //truyen param cho ?
            ps.setInt(1, order.getAccountId());
            ps.setDouble(2, order.getTotalPrice());
            ps.setString(3, order.getNote());
            ps.setInt(4, order.getShippingId());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();//lay ra cac id tu tang

            if (rs.next()) {
                return rs.getInt(1); //tra ve id tu tang
            }

        } catch (Exception ex) {
            Logger.getLogger(ShippingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    public List<Order> getAllOrder() {
        List<Order> listOrder = new ArrayList<>();
        try {
            String sql = "SELECT * FROM orders ";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

           while (rs.next()) {
                Order order = Order.builder()
                        .id(rs.getInt(1))
                        .accountId(rs.getInt(2))
                        .totalPrice(rs.getDouble(3))
                        .note(rs.getString(4))
                        .createdDate(rs.getString(5))
                        .shippingId(rs.getInt(6)).build();
                listOrder.add(order);

            }

        } catch (Exception ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listOrder;
    }

    

        

}
