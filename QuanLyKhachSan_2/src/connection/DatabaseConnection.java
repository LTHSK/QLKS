package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//Huy 
public class DatabaseConnection {
    private static DatabaseConnection instance = new DatabaseConnection();
    public static DatabaseConnection getInstance()
    {
        return instance;
    }
    
    public static Connection opConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost;database=QLKS"; 
        String user = "sa";
        String pass = "123456";
        Connection con = DriverManager.getConnection(connectionUrl,user,pass);
        return con;
    }
}
