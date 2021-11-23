/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Hoang Pham
 */
public class Conn {
    public static Connection OpenConnection()throws Exception
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connUrl = "jdbc:sqlserver://localhost;database=Quanlycanbo1";
        String username = "sa";
        String Password = "abc123!@#";
        Connection conn = DriverManager.getConnection(connUrl, username, Password);
        
        return conn;        
    }
    
    

    
}
