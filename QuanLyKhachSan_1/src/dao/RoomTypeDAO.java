/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.DatabaseConnection;
import entity.RoomType;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author thule
 */
public class RoomTypeDAO {
    private final String SELECT_ALL_ROOMTYPE_BY_ID = "SELECT * FROM LOAIPHONG WHERE MALOAIPHONG = ?";
    private final String SELECT_ROOMTYPE_BY_NAME = "SELECT * FROM LOAIPHONG WHERE TENLOAIPHONG  = ?";
    public List<RoomType> getAllRoomTypes() {
        List<RoomType> roomTypeList = new ArrayList<>();
        try(Connection conn = DatabaseConnection.opConnection();
                PreparedStatement pstmt = conn.prepareStatement("select * from roomtype")) {
            try(ResultSet rs = pstmt.executeQuery();) {
                while(rs.next()) {
                    String maLP = rs.getString("roomtypeid");
                    String tenLP = rs.getString("roomtypename");
                    Double donGia = rs.getDouble("price");
                    
                    RoomType roomType = new RoomType(maLP, tenLP, donGia);
                    roomTypeList.add(roomType);
                }
                
                return roomTypeList;
            }
        }catch(Exception e) {
             System.err.println("getAllRoomType(): connect db fail");
            e.printStackTrace();
        }
        
        return null;
    }
    public RoomType findRoomTypeById(String id) {
        try(Connection conn = DatabaseConnection.opConnection();
               PreparedStatement pstmt = conn.prepareStatement("") ) {
            pstmt.setString(1, id);
            
            try(ResultSet rs = pstmt.executeQuery()) {
                if(rs.next()) {
                    String maLP = rs.getString("roomtypeid");
                    String tenLP = rs.getString("roomtypename");
                    Double donGia = rs.getDouble("price");
                    
                    RoomType roomType = new RoomType(maLP, tenLP, donGia);
                    return roomType;
                }
            }
        }catch(Exception e) {
             System.err.println("findRoomTypeById(): connect db fail");
            e.printStackTrace();
        }
        
        return null;
    }
}
