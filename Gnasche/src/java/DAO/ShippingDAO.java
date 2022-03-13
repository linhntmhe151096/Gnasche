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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Shipping;

/**
 *
 * @author Admin
 */
public class ShippingDAO {

    public int createdReturnId(Shipping shipping) {
        try {
            String sql = "INSERT INTO [dbo].[Shipping]\n"
                    + "           ([name]\n"
                    + "           ,[phone]\n"
                    + "           ,[address])\n"
                    + "     VALUES\n"
                    + "           (?,?,?)";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);//sau khi thuc thi return key tu tang
            //truyen param cho ?
            ps.setString(1, shipping.getName());
            ps.setString(2, shipping.getPhone());
            ps.setString(3, shipping.getAddress());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();//lay ra cac id tu tang
            
            if(rs.next()){ 
                return rs.getInt(1); //tra ve id tu tang
            }

        } catch (Exception ex) {
            Logger.getLogger(ShippingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }
}
