/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;
/**
 *
 * @author user
 */
import java.io.Serializable;

public class ProductItem implements Serializable {
    private transient String nama; // transient: tidak diserialisasi
    private double harga;
    private final static double DEFAULT_HARGA = 0.0; // static dan final: nilai tetap untuk semua objek

    public ProductItem(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "\r\nNama=" + nama + "\r\nHarga=" + harga + "\r\n";
    }
}