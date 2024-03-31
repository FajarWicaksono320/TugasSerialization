/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasserialization2;

/**
 *
 * @author user
 */
import java.io.Serializable;

public class Siswa implements Serializable {
    private static final long serialVersionUID = 1L;
    private transient String nama;
    private static int nim;
    private transient static String alamat;
    private final String sekolah = "Sekolah Menengah Atas";

    public Siswa(String nama, int nim, String alamat) {
        this.nama = nama;
        Siswa.nim = nim;
        Siswa.alamat = alamat;
    }

    public void printInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Alamat: " + alamat);
        System.out.println("Sekolah: " + sekolah);
    }
}

