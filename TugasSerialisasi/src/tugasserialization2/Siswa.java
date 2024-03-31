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
    
    //Jika sebuah data member dideklarasikan dengan kata kunci "transient",
    //maka nilai dari data member tersebut tidak akan disertakan dalam proses serialisasi.
    private transient String nama;
    
    //Jika sebuah data member dideklarasikan dengan kata kunci "static",
    //maka data member tersebut terkait dengan kelas itu sendiri, bukan dengan objek individu.
    private static int nim;
    
    private transient static String alamat;
    
    //Jika sebuah data member dideklarasikan dengan kata kunci "final",
    //maka nilai dari data member tersebut tidak dapat diubah setelah objek dibuat.
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
