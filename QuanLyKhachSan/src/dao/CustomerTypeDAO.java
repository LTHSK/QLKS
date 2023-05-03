/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.DatabaseConnection;
import entity.CustomerType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author thule
 */
public class CustomerTypeDAO {
    public CustomerType timLoaiKHBangMa(String ma) {
        try(
            Connection con = DatabaseConnection.opConnection();
            PreparedStatement pts = con.prepareStatement("Select * from CustomerType where CustomerTypeID = ? ")){
            pts.setString(1,ma );
                try(ResultSet rs = pts.executeQuery()){
                    if (rs.next()){
                        CustomerType lkh=new CustomerType(rs.getString("CustomerTypeID"),rs.getString("CustomerTypeName"));
                        return lkh;
                    }
                }
        }catch(Exception e){
           e.printStackTrace();
       }
       return null;
    }
}
