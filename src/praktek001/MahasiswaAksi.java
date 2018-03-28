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
public class MahasiswaAksi {
    public static void main(String[] args) {
        Mahasiswa Kendil = new Mahasiswa();
        Kendil.nama="Kendil";
        Kendil.NPM="1663009";
        Kendil.jurusan="Ekonomi";
        Kendil.nohp="089867575";
        Kendil.IPK=3.4;
        
        Mahasiswa Zilong = new Mahasiswa();
        
        Zilong.nama="Zilong";
        Zilong.NPM="16639867";
        Zilong.jurusan="Sastra";
        Zilong.nohp="09643246";
        Zilong.IPK=2.9;
        
        Mahasiswa Miya = new Mahasiswa();
        
        Miya.nama="Miya";
        Miya.NPM="1209867";
        Miya.jurusan="Agama";
        Miya.nohp="08765321";
        Miya.IPK=3.1;
        
        Mahasiswa Lolita = new Mahasiswa();
        
        Lolita.nama="Lolita";
        Lolita.NPM="1308973";
        Lolita.jurusan="Olahraga";
        Lolita.nohp="08123456";
        Lolita.IPK=4.4;
        
        Mahasiswa Akay = new Mahasiswa();
        
        Akay.nama="Akay";
        Akay.NPM="11008877";
        Akay.jurusan="Game";
        Akay.nohp="0088776543";
        Akay.IPK=4.5;
        
        Zilong.cetakInfo();
        Akay.cetakInfo();
        Kendil.cetakInfo();
        Miya.cetakInfo();
        Lolita.cetakInfo();
    }
}
