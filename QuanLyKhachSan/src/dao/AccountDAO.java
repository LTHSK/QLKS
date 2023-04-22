/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.DatabaseConnection;
import entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author thule
 */
public class AccountDAO {
       public Account getAccountById(String id) {
        try (Connection conn = DatabaseConnection.opConnection();
                PreparedStatement pstmt = conn.prepareStatement("select * from Account where roomid = ?")) {
            pstmt.setString(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {  

                    Account acc = new Account(rs.getString("roomid"), rs.getString("roomName"));


                    return acc;
                }
            } catch (Exception e) {
                System.err.println("getAccountById(): get data fail");
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.err.println("getAccountById(): connect db fail");
            e.printStackTrace();
        }

        return null;
    }
}
