/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.DatabaseConnection;
import entity.Customer;
import entity.CustomerType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thule
 */
public class CustomerDAO {
    private final CustomerTypeDAO ctd=new CustomerTypeDAO();
    private ArrayList<Customer> list;
    public Customer getCustomerByCCCD(String cccd) {
        try (Connection conn = DatabaseConnection.opConnection();
                PreparedStatement pstmt = conn.prepareStatement("select * from Customer where cccd = ?")) {
            pstmt.setString(1, cccd);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {  
                    CustomerType ct=ctd.timLoaiKHBangMa(rs.getString("CustomerTypeID"));
                    Customer c = new Customer(rs.getString("customerID"), rs.getString("customerName"),ct,rs.getString("CCCD"),rs.getString("gender"), rs.getString("phone"), rs.getString("email"), rs.getInt("point"));


                    return c;
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
    public ArrayList<Customer> getalltbKhachHang() {
        list = new ArrayList<Customer>();
        try {
            DatabaseConnection.getInstance();
            Connection con = DatabaseConnection.opConnection();
            String sql = "select * from Customer";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                String maNV = rs.getString("CustomerID");
                String tenKH = rs.getString("CustomerName");
                String cccd = rs.getString("cccd");
                String soDienThoai = rs.getString("phone");
                String email = rs.getString("email");
                int diemTichLuy = rs.getInt("point");
                String gioiTinh = rs.getString("gender");
                CustomerType ct=ctd.timLoaiKHBangMa(rs.getString("CustomerTypeID"));
                Customer kh = new Customer(maNV, tenKH,ct,cccd,gioiTinh,soDienThoai,email,diemTichLuy);
                list.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void add(Customer customer) {
        try (Connection conn = DatabaseConnection.opConnection();
                PreparedStatement pstmt = conn.prepareStatement("INSERT INTO Customer(customeid,customerName,cccd,phone,point,customertypeid,gender) values(?,?,?,?,?,?,?,?)")) {
            pstmt.setString(1, customer.getCustomerID());
            pstmt.setString(2, customer.getCustomerName());
            pstmt.setString(3, customer.getCCCD());
            pstmt.setString(4, customer.getPhone());
            pstmt.setInt(5, customer.getPoints());
            pstmt.setString(6, customer.getCustomerType().getCustomerTypeID());
            pstmt.setString(7, customer.getGender());

        } catch (Exception e) {
            System.err.println("connect db fail");
            e.printStackTrace();
        }
    }
    public Customer getCustomerID(String id) {
        try (Connection conn = DatabaseConnection.opConnection();
                PreparedStatement pstmt = conn.prepareStatement("select * from Customer where customerid = ?")) {
            pstmt.setString(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {  
                    CustomerType ct=ctd.timLoaiKHBangMa(rs.getString("CustomerTypeID"));
                    Customer c = new Customer(rs.getString("customerID"), rs.getString("customerName"),ct,rs.getString("CCCD"),rs.getString("gender"), rs.getString("phone"), rs.getString("email"), rs.getInt("point"));


                    return c;
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
