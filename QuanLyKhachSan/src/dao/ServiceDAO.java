/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Employee;
import entity.Service;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author win
 */
public class ServiceDAO {
    
    public List<entity.Service> getAllService() throws ClassNotFoundException, SQLException
    {
        connection.DatabaseConnection.getInstance();
        Connection con = connection.DatabaseConnection.opConnection();
        List<entity.Service> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Service";
            java.sql.PreparedStatement statement = con.prepareStatement(sql);
            java.sql.ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
                String sID = rs.getString("serviceID");
                String sName = rs.getString("serviceName");
                double sPrice = rs.getDouble("price");
                int sInventory = rs.getInt("inventory");
                entity.Service s = new Service(sID, sName, sPrice, sInventory);
                list.add(s);
            }
        } catch (SQLException e) {
        }
        return list;
    }
    
    public Service getServiceByID( String serviceID ) {
        try {
            Service service = new Service();
            for( Service sv :  getAllService()  ) {
                if(serviceID.equals(sv.getServiceID()) )
                    return sv; 
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null; 
    }
    
    public boolean add(Service s)
    {
        int n = 0;
        try(
                Connection con = connection.DatabaseConnection.opConnection();
                java.sql.PreparedStatement pts = con.prepareStatement("INSERT INTO Service VALUES (?, ?, ?, ?)");
            )
        {
            pts.setString(1, s.getServiceID());
            pts.setString(2, s.getServiceName());
            pts.setDouble(3, s.getPrice());
            pts.setInt(4, s.getInventory());
            n = pts.executeUpdate();
        }
        catch(Exception e)
        {
            System.err.println("add(): connectDB fail!");
            e.printStackTrace();
        }
        return n > 0;
    }
    
    public boolean update(Service s)
    {
        try(
                Connection con = connection.DatabaseConnection.opConnection();
                java.sql.PreparedStatement pts = con.prepareStatement("UPDATE Service SET serviceName = ?, price = ?, inventory = ? WHERE serviceID = ?");
            )
        {
            pts.setString(4, s.getServiceID());
            pts.setString(1, s.getServiceName());
            pts.setDouble(2, s.getPrice());
            pts.setInt(3, s.getInventory());
            return pts.executeUpdate() > 0;
        }
        catch(Exception e)
        {
            System.err.println("update(): connectDB fail!");
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean delete(Service s) {
        try(
            Connection conn = connection.DatabaseConnection.opConnection();  
                java.sql.PreparedStatement pts = conn.prepareStatement("DELETE FROM Service WHERE serviceID =?");)
            {         
                pts.setString(1, s.getServiceID());
                return pts.executeUpdate() > 0;
        } catch (Exception e) {
            System.err.println("delete(): connect db fail");
            e.printStackTrace();
        }
        return false;
    }
    
}
