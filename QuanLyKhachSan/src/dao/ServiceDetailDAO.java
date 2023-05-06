/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.DatabaseConnection;
import entity.*;
import java.util.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author win
 */
public class ServiceDetailDAO {

//        ArrayList<Order> list = new ArrayList<>();
//        try (Connection conn = DatabaseConnection.opConnection();
//                PreparedStatement pstmt = conn.prepareStatement("SELECT *  FROM [QLKS].[dbo].[Order]")) {
//            try (ResultSet rs = pstmt.executeQuery()) {
//                while (rs.next()) {
//                    String ma = rs.getString("orderID");
//                    String checkOutDate = rs.getString("checkOutDate");
//                    String checkOutTime = rs.getString("checkOutTime");
//
//                    BookRoom bookRoom =brDAO.getBookRoomByID(rs.getString("bookroomid"));
//                    Employee employee = eDAO.findEmpID(rs.getString("employeeid"));
//                    ArrayList<BookRoom> brs=new ArrayList<>();
//                    brs.add(bookRoom);
//                    String status =rs.getString("status");
//                    Order o =new Order(ma, checkOutDate, checkOutTime,brs, employee,status);
//                    list.add(o);
//                }
//
//                return list;
//            } catch (Exception e) {
//                System.err.println("getAlLOrder(): get data fail");
//                e.printStackTrace();
//            }
//        } catch (Exception e) {
//            System.err.println("getAlLOrder(): connect db fail");
//            e.printStackTrace();
//        }
//
//        return null;
//    }
    public ArrayList<ServiceDetail> getAlLServiceDetail() {
        try {
            ArrayList<ServiceDetail> ds = new ArrayList<ServiceDetail>();
            Connection conn = DatabaseConnection.opConnection();
            PreparedStatement stm = conn.prepareStatement("select * from ServiceDetail");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                String id = rs.getString("ServiceDetailID");
                Service sv = new ServiceDAO().getServiceByID(rs.getString("ServiceID"));
                BookRoom br = new BookRoomDAO().getBookRoomByID(rs.getString("bookRoomID"));
                int quantity = rs.getInt("quantity");

                ds.add(new ServiceDetail(id, sv, br, quantity));
            }

            return ds;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServiceDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public ServiceDetail getServiceDetailByID(String id) {
        for (ServiceDetail sv : getAlLServiceDetail()) {
            if (sv.getServiceDetailID().equals(id)) {
                return sv;
            }
        }
        return null;
    }

    public ArrayList<ServiceDetail> getListServiceDetailByOrderID(String OrderID) {
        try {
            Connection conn = DatabaseConnection.opConnection();
            ArrayList<ServiceDetail> ds = new ArrayList<ServiceDetail>();
            PreparedStatement stm = conn.prepareStatement("select * from ServiceDetail \n"
                    + "inner join [dbo].[Order] on ServiceDetail.bookRoomID = [dbo].[Order].bookRoomID\n"
                    + "where [dbo].[Order].orderID = ?");
            stm.setString(1, OrderID);
            ResultSet rs = stm.executeQuery(); 
            while(rs.next()) {
                String id = rs.getString("ServiceDetailID"); 
                Service service = new ServiceDAO().getServiceByID( rs.getString("ServiceID")); 
                BookRoom br = new BookRoomDAO().getBookRoomByID( rs.getString("bookRoomID")); 
                int quantity = rs.getInt("quantity"); 
                
                ds.add( new ServiceDetail(id, service, br, quantity));
            }
            
            
            return ds; 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServiceDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null; 
    }
}
