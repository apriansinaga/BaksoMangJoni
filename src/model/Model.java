/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ASUS
 */
public class Model {
    String menuId, nama, namaPembeli, namaBarang, jumlahBeli,yangDiBeli,totalJumlah;

    public String getYangDiBeli() {
        return yangDiBeli;
    }

    public void setYangDiBeli(String yangDiBeli) {
        this.yangDiBeli = yangDiBeli;
    }

    public String getTotalJumlah() {
        return totalJumlah;
    }

    public void setTotalJumlah(String totalJumlah) {
        this.totalJumlah = totalJumlah;
    }
    int harga, totalBayar;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(String jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(int totalBayar) {
        this.totalBayar = totalBayar;
    }
    
    
}
