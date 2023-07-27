/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author irvin
 */

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.ResultSet;
public class MainClass {
    
    private static final String uname ="root";
    private static final String passwd="";
    private static final String url =
            "jdbc:mysql://localhost:3306/jdbc_sql";
    
    public static void main (String[] args){
        try {
            Connection koneksi = DriverManager.getConnection(url,uname,passwd);
            Statement st =  koneksi.createStatement();
            System.out.println("Database ditemukan");
            ResultSet hasil = st.executeQuery("SELECT * FROM mahasiswa");
            
            while(hasil.next()){
                System.out.println("Nama : " +hasil.getString("nama"));
                System.out.println("NIM : "+hasil.getString(2));
                
            }
            koneksi.close();
            
        } catch (Exception e) {
            System.out.println("data tidak ditemukan");
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null,e);
        }
    }
    
}
