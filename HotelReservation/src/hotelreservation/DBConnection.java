/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotelreservation;
import java.sql.*;
/**
 *
 * @author Sandusha
 */
public class DBConnection {
public Connection GetConnection() 
    {
        Connection con=null;
    
    try
     {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con=DriverManager.getConnection("jdbc:odbc:MyDB");
        }
     catch(Exception ex)
     {
         System.out.println("Error connecting to database "+ex);
     
     }
     return con;
    
}
    
}
