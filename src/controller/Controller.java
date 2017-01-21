/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Model;
import util.koneksi;

/**
 *
 * @author ASUS
 */
public class Controller {
    koneksi koneksi = new koneksi();

    public void simpanData(Model mb) {//memanggil kelas Model kesalahan dan membuat objek km
        koneksi.KoneksiDatabase();
        String query = "insert into tbl_menu(menuid,nama,harga) values ('"+mb.getMenuId()+"','"+mb.getNama()+"','"+mb.getHarga()+"')";
        try {
            koneksi.state.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Tidak berhasil disimpan");
            System.err.println(""+e);
        }

    }
    
    public void simpanTransaki(Model mb) {//memanggil kelas Model kesalahan dan membuat objek km
        koneksi.KoneksiDatabase();
        String query = "insert into tbl_transaksi(namaPembeli,namaBarang,jumlahBeli,totalBayar,tanggal) values ('"+mb.getNamaPembeli()+"','"+mb.getYangDiBeli()+"','"+mb.getTotalJumlah()+"','"+mb.getTotalBayar()+"',now())";
        try {
            koneksi.state.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Tidak berhasil disimpan");
            System.err.println(""+e);
        }

    }

    public void hapusData(Model mb) {
    try {
            koneksi.KoneksiDatabase();
            String query = "delete from tbl_menu where menuid=('"+mb.getMenuId()+"')";
            koneksi.state.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus..");
            //koneksi.connect.close();
        } catch (SQLException e) {
            System.err.println("Error : "+e);
            JOptionPane.showMessageDialog(null, "Data TIDAK terhapus");
        }
    }

    public void ubahData(Model mb) {
         koneksi.KoneksiDatabase();
         try {
            String menuid = mb.getMenuId();
            String nama = mb.getNama();
            int harga = mb.getHarga();

            String query = "UPDATE tbl_menu SET nama = '"+nama+"',\n" +
"harga = '"+harga+"' WHERE menuid ='"+menuid+"';";
            koneksi.state.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate..");
        } catch (SQLException e) {
            System.err.println("Error : " + e);
            JOptionPane.showMessageDialog(null, "Data TIDAK terubah");
        }
    }
    
    
}
