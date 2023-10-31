/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author irvin
 */


import java.sql.*;
import javax.swing.JOptionPane;

public class dbkoneksi {
   
     private static final String uname ="root";
    private static final String passwd="";
    private static final String url =
            "jdbc:mysql://localhost:3306/oopdb";
   
    
    public static Connection getConnection()throws SQLException{
        try {
            DriverManager.getConnection(url,uname,passwd);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return  DriverManager.getConnection(url,uname,passwd);
    }
   
}
