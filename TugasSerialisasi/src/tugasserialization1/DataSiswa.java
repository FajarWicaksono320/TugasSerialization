/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasserialization1;

import java.io.Serializable;
/**
 *
 * @author user
 */

public class DataSiswa implements Serializable {
    String nama;
    String kelas;
    
    public DataSiswa(String nama, String kelas) {
        this.nama = nama;
        this.kelas = kelas;
    }

    @Override
    public String toString() {
        return "\r\nNama=" + nama + "\r\nKelas=" + kelas + "\r\n";
    }
}