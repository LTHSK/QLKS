/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.DatabaseConnection;
import entity.BookRoom;
import entity.Customer;
import entity.Employee;
import entity.Room;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
/**
 *
 * @author thule
 */
public class BookRoomDAO {
    private final EmployeeDAO eDAO=new EmployeeDAO();
    private final EmployeeTypeDAO etDAO=new EmployeeTypeDAO();
    private CustomerDAO customerDAO;
    private RoomDAO roomDAO;
    private EmployeeDAO employeeDAO;
    public ArrayList<BookRoom> getAlLBookRooms() {
        customerDAO = new CustomerDAO();
        roomDAO = new RoomDAO();
        employeeDAO=new EmployeeDAO();

        ArrayList<BookRoom> bookRooms = new ArrayList<>();
        try (Connection conn = DatabaseConnection.opConnection();
                PreparedStatement pstmt = conn.prepareStatement("Select * from bookroom")) {
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    String maDDP = rs.getString("bookroomID");
                    String ngayDat = rs.getString("bookdate");
                    String gioDat = rs.getString("booktime");
                    String ngayNhan = rs.getString("checkindate");
                    String gioNhan = rs.getString("checkintime");

                    Customer customer = customerDAO.getCustomerID(rs.getString("customerid"));
                    Room room = roomDAO.findRoomById(rs.getString("roomid"));
                    Employee employee = employeeDAO.findEmpID(rs.getString("employeeid"));

                    BookRoom bookRoom = new BookRoom(maDDP, ngayDat, gioDat, ngayNhan, gioNhan,  customer, employee,room);
                    bookRooms.add(bookRoom);
                }

                return bookRooms;
            } catch (Exception e) {
                System.err.println("get data fail");
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.err.println("connect db fail");
            e.printStackTrace();
        }

        return null;
    }

    public boolean add(BookRoom bookRoom) {
        try (Connection conn = DatabaseConnection.opConnection();
                PreparedStatement pstmt = conn.prepareStatement("INSERT INTO bookroom(bookroomid,bookdate,booktime,checkindate,checkintime,customerid,employeeid,roomid)"
            + " VALUES(?,?,?,?,?,?,?,?)")) {
            Customer c=customerDAO.getCustomerByCCCD(bookRoom.getCustomer().getCCCD());
            Employee e=eDAO.findEmpID(bookRoom.getEmployee().getEmployeeID());
            
            
            java.sql.Date bookDate= java.sql.Date.valueOf(bookRoom.getBookDate());
            java.sql.Date checkInDate =  java.sql.Date.valueOf(bookRoom.getCheckInDate());
             
            
            java.sql.Time bookTime=Time.valueOf(bookRoom.getBookTime());
            java.sql.Time checkInTime=Time.valueOf(bookRoom.getCheckInTime());
            
            
            pstmt.setString(1, bookRoom.getBookRoomID());
            pstmt.setDate(2, bookDate);
            pstmt.setTime(3, bookTime);
            pstmt.setDate(4,checkInDate );
            pstmt.setTime(5, checkInTime);
            pstmt.setString(6, c.getCustomerID());
            pstmt.setString(7, e.getEmployeeID());
            pstmt.setString(8, bookRoom.getRoom().getRoomID());
        return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            System.err.println("add(BookRoom bookRoom): connect db fail");
            e.printStackTrace();
        }
        return false;
    }

}
