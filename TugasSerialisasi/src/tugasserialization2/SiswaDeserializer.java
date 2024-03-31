/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasserialization2;

/**
 *
 * @author user
 */
import java.io.*;

public class SiswaDeserializer {

    public static Siswa deserialize(String filePath) {
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

