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

public class SiswaSerializer {

    public static void serialize(Siswa siswa, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(siswa);
            System.out.println("Siswa berhasil disimpan ke file: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}