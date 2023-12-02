/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConeccionDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Coneccion {
  
   public static Connection cone;
    
    private String ip="localhost";
    private String puerto="3306";
    private static final String URL="jdbc:mysql://localhost:3306/proyectofinal?serverTimezone=UTC";

    
  public static Connection EstablacerConnection()
  {
    if (cone==null) {
      try {
        cone=DriverManager.getConnection(URL, "root", "root");
      } catch (SQLException ex) {
        System.out.println(ex);
      }
    } 
    return cone;
  }
}

