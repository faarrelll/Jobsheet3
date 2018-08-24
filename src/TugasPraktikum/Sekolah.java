/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author ASUS
 */
public class Sekolah {
    private int id_guru;
    private String nama_guru;
    
    public Sekolah(int id_guru, String nama_guru){
        this.id_guru=id_guru;
        this.nama_guru=nama_guru;
    }
    public void keluaran(){
        System.out.println("Nama : "+this.nama_guru);
        System.out.println("Id Guru : "+this.id_guru);
    }
    
}
