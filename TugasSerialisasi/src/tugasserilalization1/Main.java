/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasserilalization1;

/**
 *
 * @author user
 */
import java.io.*;

public class Main {

    public static void main(String[] args) {
        // Lokasi file untuk menyimpan siswa
        String filePath = "siswa.ser";

        // Membuat objek siswa
        Siswa siswa = new Siswa("Fajar Wicaksono", 22090064, "Slawi");

        // Serialisasi siswa ke file
        serializeSiswa(siswa, filePath);

        // Menampilkan siswa yang telah diserialisasi
        Siswa deserializedSiswa = deserializeSiswa(filePath);
        System.out.println("Siswa yang telah diserialisasi:");
        System.out.println(deserializedSiswa);
    }

    // Metode untuk serialisasi siswa ke file
    private static void serializeSiswa(Siswa siswa, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(siswa);
            System.out.println("Siswa berhasil disimpan ke file: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Metode untuk membaca siswa dari file yang telah diserialisasi
    private static Siswa deserializeSiswa(String filePath) {
        Siswa siswa = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            siswa = (Siswa) ois.readObject();
            System.out.println("Siswa berhasil dibaca dari file: " + filePath);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return siswa;
    }
}


