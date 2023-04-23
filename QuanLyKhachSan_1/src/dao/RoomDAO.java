/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import connection.DatabaseConnection;
import entity.Room;
import entity.RoomStatusType;
import entity.RoomType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thule
 */
public class RoomDAO {
    private final RoomTypeDAO roomTypeDAO = new RoomTypeDAO();
    private final RoomStatusTypeDAO roomStatusTypeDAO = new RoomStatusTypeDAO();
    
    
    public List<Room> getAllRooms() {
        List<Room> rooms = new ArrayList<>();

        try (Connection conn = DatabaseConnection.opConnection();
                PreparedStatement pstmt = conn.prepareStatement("select * from room")) {
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    RoomType roomType = roomTypeDAO.findRoomTypeById(rs.getString("roomtypeid"));
                    RoomStatusType romStatusType = roomStatusTypeDAO.finRoomStatusTypeById(rs.getString("roomstatustypeid"));

                    Room room = new Room(rs.getString("roomid"), rs.getString("roomName"), roomType, romStatusType,rs.getString("describe"));
                    rooms.add(room);
                }

                return rooms;
            } catch (Exception e) {
                System.err.println("get data fail");
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.err.println("getAllRooms(): connect db fail");
            e.printStackTrace();
        }

        return null;
    }
    
    public Room findRoomById(String id) {
        try (Connection conn = DatabaseConnection.opConnection();
                PreparedStatement pstmt = conn.prepareStatement("select * from Room where roomid = ?")) {
            pstmt.setString(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    RoomType roomType = roomTypeDAO.findRoomTypeById(rs.getString("roomtypeid"));
                    RoomStatusType romStatusType = roomStatusTypeDAO.finRoomStatusTypeById(rs.getString("roomstatustypeid"));
                    

                    Room room = new Room(rs.getString("roomid"), rs.getString("roomName"), roomType, romStatusType,rs.getString("describe"));


                    return room;
                }
            } catch (Exception e) {
                System.err.println("findRoomById(): get data fail");
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.err.println("findRoomById(): connect db fail");
            e.printStackTrace();
        }

        return null;
    }
    
    public List<Room> findRoomByIDLoaiPhong(String IDLoaiPhong) {
        List<Room> rooms = new ArrayList<>();

        try (Connection conn = DatabaseConnection.opConnection();
                PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM ROOM WHERE ROOMTYPEID = ?")) {
            pstmt.setString(1, IDLoaiPhong);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    RoomType roomType = roomTypeDAO.findRoomTypeById(rs.getString("roomtypeid"));
                    RoomStatusType romStatusType = roomStatusTypeDAO.finRoomStatusTypeById(rs.getString("roomstatustypeid"));

                    Room room = new Room(rs.getString("roomid"), rs.getString("roomName"), roomType, romStatusType,rs.getString("describe"));
                    rooms.add(room);
                }

                return rooms;
            } catch (Exception e) {
                System.err.println("get data fail");
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.err.println("findRoomByIDLoaiPhong(): connect db fail");
            e.printStackTrace();
        }
        return null;
    }
}
