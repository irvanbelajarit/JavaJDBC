/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.irvanlewenusa.swingdatabase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author irvin
 */
public class MahasiswaController {
    
    public void simpanData(Mahasiswa m)throws SQLException{
        Connection konek = koneksi.getConnection();
        
         PreparedStatement ps = konek.prepareStatement("INSERT into mahasiswa (nim,nama,jurusan)values(?,?,?)");
   
 ps.setString(1,m.getNIM());
    ps.setString(2,m.getNama());
    ps.setString(3,m.getJurusan());
    ps.executeUpdate();
    ps.close();
    konek.close();
    }
    
    public void deleteData(String nim)throws SQLException{
         Connection konek = koneksi.getConnection();
         PreparedStatement ps = konek.prepareStatement("delete from mahasiswa where nim =?");   
            ps.setString(1,nim);
    
            ps.executeUpdate();
        
            ps.close();
         
         konek.close();
    }
    
    
    public void updateData(Mahasiswa m)throws SQLException{
            Connection konek = koneksi.getConnection();
            
            
            
            PreparedStatement ps = konek.prepareStatement("UPDATE mahasiswa set nama =?, jurusan =?  where nim =?");   
 ps.setString(1,m.getNama());
    ps.setString(2,m.getJurusan());
    ps.setString(3,m.getNIM());
    ps.executeUpdate();
            
              ps.close();
         
         konek.close();
    }
    
    
    public List<Mahasiswa> tampilDataAll() throws SQLException{
        
        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        
           Connection konek = koneksi.getConnection();
            Statement st =  konek.createStatement();
            ResultSet hasil = st.executeQuery("SELECT * FROM mahasiswa");
            
            while(hasil.next()){
                Mahasiswa m = new Mahasiswa();
                
                m.setNIM(hasil.getString(2));
                m.setNama(hasil.getString(3));
                m.setJurusan(hasil.getString(4));
                daftarMahasiswa.add(m);
                     
            }
            return daftarMahasiswa;
    }
    
}
