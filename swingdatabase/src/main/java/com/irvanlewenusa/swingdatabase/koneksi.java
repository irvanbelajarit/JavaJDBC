/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.irvanlewenusa.swingdatabase;

/**
 *
 * @author irvin
 */

import java.sql.*;

public class koneksi {
     private static final String uname ="root";
    private static final String passwd="";
    private static final String url =
            "jdbc:mysql://localhost:3306/jdbc_swing";
    
    public static Connection getConnection()throws SQLException{
        return  DriverManager.getConnection(url,uname,passwd);
    }
    
//    public static void main(String[] args) throws SQLException{
//        getConnection();
//    }
    
}
