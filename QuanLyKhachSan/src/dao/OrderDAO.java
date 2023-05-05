/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.DatabaseConnection;
import entity.BookRoom;
import entity.Customer;
import entity.Employee;
import entity.Order;
import entity.Room;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author thule
 */
public class OrderDAO {
    private final BookRoomDAO brDAO=new BookRoomDAO();
    private final EmployeeDAO eDAO=new EmployeeDAO();
    
    public ArrayList<Order> getAlLOrder() {
        
        ArrayList<Order> list = new ArrayList<>();
        try (Connection conn = DatabaseConnection.opConnection();
                PreparedStatement pstmt = conn.prepareStatement("SELECT *  FROM [QLKS].[dbo].[Order]")) {
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    String ma = rs.getString("orderID");
                    String checkOutDate = rs.getString("checkOutDate");
                    String checkOutTime = rs.getString("checkOutTime");

                    BookRoom bookRoom =brDAO.getBookRoomByID(rs.getString("bookroomid"));
                    Employee employee = eDAO.findEmpID(rs.getString("employeeid"));
                    ArrayList<BookRoom> brs=new ArrayList<>();
                    brs.add(bookRoom);
                    String status =rs.getString("status");
                    Order o =new Order(ma, checkOutDate, checkOutTime,brs, status,employee);
                    list.add(o);
                }

                return list;
            } catch (Exception e) {
                System.err.println("getAlLOrder(): get data fail");
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.err.println("getAlLOrder(): connect db fail");
            e.printStackTrace();
        }

        return null;
    }
    public boolean add(Order order) {
        try (Connection conn = DatabaseConnection.opConnection();
                PreparedStatement pstmt = conn.prepareStatement("INSERT INTO [QLKS].[dbo].[Order](orderid,employeeid,bookroomid,status)"
            + " VALUES(?,?,?)")) {
            Employee e=eDAO.findEmpID(order.getEmployee().getEmployeeID());
            
            
            
            BookRoom br=brDAO.getBookRoomByID(order.getBookRooms().get(0).getBookRoomID());
            
            pstmt.setString(1, order.getOrderID());
            pstmt.setString(2, e.getEmployeeID());
            pstmt.setString(3, br.getBookRoomID());
            pstmt.setString(4, order.getStatus());
        return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            System.err.println("add(Order order): connect db fail");
            e.printStackTrace();
        }
        return false;
    }
}
