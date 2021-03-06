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
import model.Product;

/**
 *
 * @author Admin
 */
public class ProductDAO {

    public List<Product> getALLProducts() {
        List<Product> listPro = new ArrayList<>();
        try {
            String sql = "select * from Product";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //   Category category = new Category(rs.getInt(1), rs.getString(2));
                Product product = Product.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .quantity(rs.getInt(3))
                        .price(rs.getDouble(4))
                        .description(rs.getString(5))
                        .imageUrl(rs.getString(6))
                        .createdDate(rs.getString(7))
                        .categoryId(rs.getInt(8))
                        .subid(rs.getInt(9)).build();

                listPro.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listPro;
    }

    public List<Product> getProductByCategoryId(int categoryId) {
        List<Product> listPro = new ArrayList<>();
        try {
            String sql = "select * from Product where category_id = ?";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, categoryId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //   Category category = new Category(rs.getInt(1), rs.getString(2));
                Product product = Product.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .quantity(rs.getInt(3))
                        .price(rs.getDouble(4))
                        .description(rs.getString(5))
                        .imageUrl(rs.getString(6))
                        .createdDate(rs.getString(7))
                        .categoryId(rs.getInt(8))
                        .subid(rs.getInt(9)).build();
                listPro.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listPro;

    }

    public Product getProductById(int productId) {

        try {
            String sql = "select * from Product where id = ?";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, productId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //   Category category = new Category(rs.getInt(1), rs.getString(2));
                Product product = Product.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .quantity(rs.getInt(3))
                        .price(rs.getDouble(4))
                        .description(rs.getString(5))
                        .imageUrl(rs.getString(6))
                        .createdDate(rs.getString(7))
                        .categoryId(rs.getInt(8))
                        .subid(rs.getInt(9)).build();
                return product;
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public void deleteProduct(int productid) {
        String sql = "delete from Product where id = ?";
        try {

            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, productid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void addProduct(String name, int quantity, Double price, String descrip,
            String image, String date, String cate, int subid) {
        String sql = "INSERT INTO [Decor].[dbo].[Product]\n"
                + "           ([name]\n"
                + "           ,[quantity]\n"
                + "           ,[price]\n"
                + "           ,[description]\n"
                + "           ,[image_url]\n"
                + "           ,[created_date]\n"
                + "           ,[category_id]\n"
                + "           ,[subcategory_int])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?)";

        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, quantity);
            ps.setDouble(3, price);
            ps.setString(4, descrip);
            ps.setString(5, image);
            ps.setString(6, date);
            ps.setString(7, cate);
            ps.setInt(8, subid);
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }

    public void updateProduct(int id, String name, int quantity, double price, String descrip, String image, String date, String cate, int subid) {
        String sql = "UPDATE [dbo].[Product]\n"
                + "   SET [name] = ?\n"
                + "      ,[quantity] = ?\n"
                + "      ,[price] = ?\n"
                + "      ,[description] = ?\n"
                + "      ,[image_url] = ?\n"
                + "      ,[created_date] = ?\n"
                + "      ,[category_id] = ?\n"
                + "      ,[subcategory_int] = ?\n"
                + " WHERE id =?";

        try {
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, quantity);
            ps.setDouble(3, price);
            ps.setString(4, descrip);
            ps.setString(5, image);
            ps.setString(6, date);
            ps.setString(7, cate);
            ps.setInt(8, subid);
            ps.setInt(9, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Product> getListByPage(List<Product> listP, int start, int end) {
        List<Product> list = new ArrayList<>();
        for (int i = start; i < end; i++) {
            list.add(listP.get(i));
        }
        return list;
    }

    public List<Product> getProductByPage(int page, int PAGE_SIZE) {
        List<Product> listPro = new ArrayList<>();
        try {
            String sql = "SELECT * from  (select *, ROW_NUMBER() over (order by id asc) as row_num from Product) as product\n"
                    + " where row_num >= (?-1)*?+1 and row_num <= ?*?";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, page);
            ps.setInt(2,PAGE_SIZE);
            ps.setInt(3, page);
            ps.setInt(4,PAGE_SIZE);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //   Category category = new Category(rs.getInt(1), rs.getString(2));
                Product product = Product.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .quantity(rs.getInt(3))
                        .price(rs.getDouble(4))
                        .description(rs.getString(5))
                        .imageUrl(rs.getString(6))
                        .createdDate(rs.getString(7))
                        .categoryId(rs.getInt(8))
                        .subid(rs.getInt(9)).build();

                listPro.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listPro;

    }
    
    public int countTotalProducts() {
        
        try {
            String sql = "select COUNT(id) from Product";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //   Category category = new Category(rs.getInt(1), rs.getString(2));
               return rs.getInt(1);
                
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public List<Product> search(String keyword) {
        List<Product> listPro = new ArrayList<>();
        try {
            String sql = "select * from Product where name like ?";
            Connection conn = new DBContext().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,"%"+keyword+"%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                Product product = Product.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .quantity(rs.getInt(3))
                        .price(rs.getDouble(4))
                        .description(rs.getString(5))
                        .imageUrl(rs.getString(6))
                        .createdDate(rs.getString(7))
                        .categoryId(rs.getInt(8))
                        .subid(rs.getInt(9)).build();

                listPro.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listPro;
    }
    

}
