/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class ConnectionProvider {
  public static Connection getCon() throws SQLException, ClassNotFoundException
  {
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","Debu!24");
          return con;
      }
      catch(SQLException e)
      {
          System.out.println(e);
          return null;
      }
  }
}
