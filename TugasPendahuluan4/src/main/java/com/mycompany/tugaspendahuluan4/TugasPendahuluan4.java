/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspendahuluan4;

/**
 *
 * @author Muthia Rihadatul
 */
public class TugasPendahuluan4 {

    public static void main(String[] args) {
        
        Dokter dt1 = new Dokter("Maulana Malik", "Mata");
        Dokter dt2 = new Dokter("Fahryan trasno", "Gigi");
        Dokter dt3 = new Dokter("Priyagung Makmur", "telinga");
        
        Pasien ps1 = new Pasien("Adil Bahri", 20);
        Pasien ps2 = new Pasien("Adam rafif", 55);
        Pasien ps3 = new Pasien("Alif Taufiq", 37);
        
        Pemesanan psn[] = new Pemesanan[5];
        psn[0] = new Pemesanan(dt1,ps1,"Selasa");
        psn[1] = new Pemesanan(dt2,ps1,"kamis");
        psn[2] = new Pemesanan(dt2,ps2,"Selasa");
        psn[3] = new Pemesanan(dt3,ps2,"jumat");
        psn[4] = new Pemesanan(dt1,ps3,"Senin");
        
        for(int i=0 ;i<5 ;i++){
            System.out.println("Urutan ke" + (i+1));
            System.out.println("Nama Dokter : " + psn[i].getDokter().getNama());
            System.out.println("Sesialis :" + psn[i].getDokter().getSpesialis());
            System.out.println("nama Pasien : " + psn[i].getPasien().getNama() + "(" 
                    + psn[i].getPasien().getUmur() + ")" );
            System.out.println("Hari : " + psn[i].getHari());
            System.out.println();
        }
    }
}
