/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspendahuluan6;

/**
 *
 * @author Muthia Rihadatul
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SepedaMotor {
    private String warnaMotor;
    protected int ukuranTangki;
    private LocalDateTime waktuIsiBensin;

    public SepedaMotor(String warnaMotor) {
        this.warnaMotor = warnaMotor;
        this.ukuranTangki = 3;
        this.waktuIsiBensin = null;
    }
    
    public void isiTangkiFull(){
        this.waktuIsiBensin = LocalDateTime.now();
    }

    public String cekKapanHabis() {
        if (waktuIsiBensin != null) {
        LocalDateTime waktuHabis = waktuIsiBensin.plusHours(ukuranTangki);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return waktuHabis.format(formatter);
    } else {
        return "Tangki belum diisi.";
    }
    }
    
    public boolean jalan() {
        if (waktuIsiBensin == null) {
            System.out.println("Bensin Habis, sepeda motor tidak dapat berjalan");
            System.out.println("False");
            return false;
        } else {
            System.out.println("Sepeda motor sedang berjalan");
            return true;
        }
    }

}
