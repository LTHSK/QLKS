/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.sun.jdi.connect.spi.Connection;
import connection.DatabaseConnection;
import entity.Order;
import entity.OrderDetail;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KHANH PC
 */
public class OrderDetailDAO {
    private ArrayList<OrderDetail> getListOrderDetaiByOrderID( Order order ) {
        ArrayList<OrderDetail> dsAll = new ArrayList<OrderDetail>();
        ArrayList<OrderDetail> ds = new ArrayList<OrderDetail>();
        try {
            java.sql.Connection conn = DatabaseConnection.opConnection(); 
            String sql1 = "select * from OrderDetail where OrderID = ?";
            PreparedStatement stm = conn.prepareStatement(sql1); 
            stm.setString(0, order.getOrderID());
            
            ResultSet rs = stm.executeQuery(); 
            while(rs.next()) {
                OrderDetail od = new OrderDetail(); 
                od.setOrder(order);
                
                // thêm ds serviceDetail
            }
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ds;
    }
}
