/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek001;

/**
 *
 * @author JKendil
 */
public class Mahasiswa {
    String nama;
    String NPM;
    String jurusan;
    String nohp;
    double IPK;
    
    void cetakInfo(){
        System.out.println("Nama    :"+nama);
        System.out.println("NPM     :"+NPM);
        System.out.println("Jurusan :"+jurusan);
        System.out.println("No Hp   :"+nohp);
        System.out.println("IPK     :"+IPK);
    }
}
