/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspendahuluan3;

/**
 *
 * @author Muthia Rihadatul
 */
public class TugasPendahuluan3 {

    public static void main(String[] args) {
        Prodi pr1 = new Prodi("Informatika");
        Prodi pr2 = new Prodi("Rakayasa Perangkat Lunak");
        
        Mahasiswa mhs1 = new Mahasiswa("Muthia Rihadatul Aisyi", pr1);
        Mahasiswa mhs2 = new Mahasiswa("Yuki Kato", pr2);
        
        System.out.println("Informasi Mahasiswa 1 : ");
        mhs1.displayMahasiswa();
        
        System.out.println();
        
        System.out.println("Informasi Mahasiswa 2 : ");
        mhs2.displayMahasiswa();
    }
}
