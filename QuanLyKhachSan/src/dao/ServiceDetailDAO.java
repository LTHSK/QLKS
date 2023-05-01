/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import entity.*;
import java.util.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author win
 */
public class ServiceDetailDAO {
    
    public List<ServiceDetail> getAllServicesAdded() throws SQLException, ClassNotFoundException
    {
        List<ServiceDetail> list = new ArrayList<>();
        String sql = "SELECT r.roomID, s.ServiceName, sd.quantity,(sd.quantity*s.price) AS TongTien" 
                    + "FROM ServiceDetail AS sd" 
                    + "INNER JOIN OrderDetail AS od ON sd.OrderDetailID = od.OrderDetailID" 
                    + "INNER JOIN BookRoom AS br ON  sd.bookRoomID = br.BookRoomID" 
                    + "INNER JOIN Room AS r ON br.RoomID = r.RoomID" 
                    + "INNER JOIN Service AS s ON sd.ServiceID = s.ServiceID" 
                    + "INNER JOIN RoomType AS rt ON r.RoomTypeID = rt.RoomTypeID" 
                    + "GROUP BY r.roomID, s.ServiceName, sd.quantity, s.price" 
                    + "ORDER BY r.roomID ASC"
                
                ;
        try
            (
                Connection con = connection.DatabaseConnection.opConnection();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql)
                
            )
        {
                while(rs.next())
                {
                    OrderDetail od = new OrderDetail();
                    ServiceDetail sd = new ServiceDetail();
                    Service s = new Service();
                    Room r = new Room();
                    BookRoom br = new BookRoom();
                    RoomType rt = new RoomType();
                    
                    int quantity = rs.getInt("quantity");
                    
                    r.setRoomID(rs.getString("roomID"));
                    br.setRoom(r);
                    sd.setBookRoom(br);
                    
                    s.setServiceName(rs.getString("ServiceName"));
                    sd.setService(s);
                    
                    double thanhTien = rs.getDouble("TongTien");
                    
                    ServiceDetail sdl = new ServiceDetail(s, br, quantity);
                    list.add(sdl);
                }
                return list;
        }
            
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
    
    
    public List<ServiceDetail> getListSericeByRoomID(String id) throws ClassNotFoundException, SQLException
    {
        List<ServiceDetail> list = new ArrayList<>();
        String sql = "SELECT r.roomID, s.ServiceName, sd.quantity,(sd.quantity*s.price) AS TongTien\n" +
"FROM ServiceDetail AS sd\n" +
"INNER JOIN OrderDetail AS od ON sd.OrderDetailID = od.OrderDetailID\n" +
"INNER JOIN BookRoom AS br ON  sd.bookRoomID = br.BookRoomID\n" +
"INNER JOIN Room AS r ON br.RoomID = r.RoomID\n" +
"INNER JOIN Service AS s ON sd.ServiceID = s.ServiceID\n" +
"INNER JOIN RoomType AS rt ON r.RoomTypeID = rt.RoomTypeID\n" +
"WHERE r.roomID = ?";
        try(
                Connection con = connection.DatabaseConnection.opConnection();
                PreparedStatement pstmt = con.prepareStatement(sql)
                )
        {
            pstmt.setString(1, id);
            try(ResultSet rs = pstmt.executeQuery())
            {
                while(rs.next())
                {
                    OrderDetail od = new OrderDetail();
                    ServiceDetail sd = new ServiceDetail();
                    Service s = new Service();
                    Room r = new Room();
                    BookRoom br = new BookRoom();
                    RoomType rt = new RoomType();
                    
                    int quantity = rs.getInt("quantity");
                    
                    r.setRoomID(rs.getString("roomID"));
                    br.setRoom(r);
                    sd.setBookRoom(br);
                    
                    s.setServiceName(rs.getString("ServiceName"));
                    sd.setService(s);
                    
                    double thanhTien = rs.getDouble("TongTien");
                    
                    ServiceDetail sdl = new ServiceDetail(s, br, quantity);
                    list.add(sdl);
                }
                return list;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
        
    }
    
}
