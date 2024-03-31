/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasserialization1;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author user
 */
public class Siswa implements Serializable {

    private String id;
    private String nama;
    private List<DataSiswa> data;

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setData(List<DataSiswa> data) {
        this.data = data;
    }

    @Override public String toString() {
        String siswa, datas = "";
        siswa = "Siswa: \r\n" 
                + "Id=" + id + "\r\n" 
                + "Nama=" + nama + "\r\n" 
                + "=======================\r\n"
                + "Data Siswa:\r\n";
        datas = data.stream().map((obj) -> 
                obj.toString()).reduce(datas, String::concat);
        return siswa + datas;
    }
}
