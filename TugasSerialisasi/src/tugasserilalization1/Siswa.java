/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasserilalization1;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Siswa implements Serializable{
    private String nama;
    private int nim;
    private String alamat;

    public Siswa(String nama, int nim, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "Siswa{" +
                "nama='" + nama + '\'' +
                ", nim='" + nim + '\'' +
                ", alamat='" + alamat + '\'' +
                '}';
    }
}
