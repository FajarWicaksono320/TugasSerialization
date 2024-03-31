/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasserialization2;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        // Lokasi file untuk menyimpan siswa
        String filePath = "siswa.ser";

        // Membuat objek siswa
        Siswa siswa = new Siswa("Fajar Wicaksono", 22090064, "Slawi");

        // Serialisasi siswa ke file
        SiswaSerializer.serialize(siswa, filePath);
        
        // Deserialisasi siswa dari file
        Siswa deserializedSiswa = SiswaDeserializer.deserialize(filePath);

        // Menampilkan siswa yang telah diserialisasi
        System.out.println("Siswa yang telah diserialisasi:");
        deserializedSiswa.printInfo();
    }
}

