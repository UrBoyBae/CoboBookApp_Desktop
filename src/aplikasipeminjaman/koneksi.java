/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasipeminjaman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class koneksi {
    Connection c;
    Statement s;
    ResultSet rs;
    PreparedStatement ps;
    String query;
    
    // koneksi ke driver dan database
    void setDriver () {
        
        // koneksi ke driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Gagal Koneksi ke driver" + ex);
        }
        
        // koneksi ke database
        String local = "jdbc:mysql://localhost:3306/cobobook";
        try {
            c = DriverManager.getConnection(local,"root","");
            
        } catch (SQLException e) {
            System.out.println("Gagal Koneksi ke database" + e);
        }
    }
    
    // method utk query select
    void read() {
        try {
            s = c.createStatement();
            rs = s.executeQuery(query);
            
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }
            
        
    }
    
    // method utk query insert, update, delete
    void CUD() {
        try {
            ps = c.prepareStatement(query);
            
        } catch (SQLException ex) {
            System.out.println("Error"+ex);
        }
    }
}

