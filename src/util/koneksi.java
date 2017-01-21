/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Clock;

/**
 *
 * @author ASUS
 */
public class koneksi {
    public Statement state;
    private Connection conect;
    String namaDatabase = "jdbc:mysql://localhost/db_bakso";
    
    public void KoneksiDatabase(){
        try {
            conect = DriverManager.getConnection(namaDatabase,"root","123");
            state = conect.createStatement();
            System.out.println("koneksi berhasil");
        } catch (SQLException e) {
            System.err.println("GAGAL "+e);
        }
    }
}
