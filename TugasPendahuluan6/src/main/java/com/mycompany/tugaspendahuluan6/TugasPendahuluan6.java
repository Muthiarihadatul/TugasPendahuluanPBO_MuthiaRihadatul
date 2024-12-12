/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspendahuluan6;

/**
 *
 * @author Muthia Rihadatul
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TugasPendahuluan6 {

    public static void main(String[] args) {
        String jamSekarang = LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss"));
        SepedaMotor sp = new SepedaMotor("Hitam");
        Handobaet hb = new Handobaet("Biru");
        YahamaMoi ym = new YahamaMoi("Merah");

        System.out.println("\nStatus Awal Sepeda Motor: ");
        sp.jalan();
        System.out.println("\nStatus Awal Hando Baet: ");
        hb.jalan();
        System.out.println("\nStatus Awal Yahama Moi: ");
        ym.jalan();


        System.out.println("\n=============================");
        sp.isiTangkiFull();
        hb.isiTangkiFull();
        ym.isiTangkiFull();
        
        
        System.out.println("\nStatus Terbaru Sepeda Motor:");
        System.out.println("Waktu saat ini :" + jamSekarang);
        sp.jalan();
        String tangki = sp.cekKapanHabis();
        System.out.println(tangki);
        
        System.out.println("\nStatus Terbaru Honda Baet:");
        System.out.println("Waktu saat ini :" + jamSekarang);
        hb.jalan();
        hb.cekKapanHabis();

        System.out.println("\nStatus Terbaru Yahama Moi:");
        System.out.println("Waktu saat ini :" + jamSekarang);
        ym.jalan();
        ym.cekKapanHabis();
        }

}
