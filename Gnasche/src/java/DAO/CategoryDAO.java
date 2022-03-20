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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;

/**
 *
 * @author Admin
 */
public class CategoryDAO {//thao tac voi bang category

    public List<Category> getAllCategory() {
        List<Category> listCate = new ArrayList<>();
        try {
            String sql = "select * from Category";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
             //   Category category = new Category(rs.getInt(1), rs.getString(2));
             Category category = Category.builder()
                     .id(rs.getInt(1))
                     .name(rs.getString(2))
                     .imageUrl(rs.getString(3)).build();
                listCate.add(category);
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listCate;
    }
    
}
