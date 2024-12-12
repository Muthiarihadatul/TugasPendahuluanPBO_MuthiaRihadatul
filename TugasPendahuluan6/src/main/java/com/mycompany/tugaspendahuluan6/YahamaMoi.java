/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspendahuluan6;

/**
 *
 * @author Muthia Rihadatul
 */
public class YahamaMoi extends SepedaMotor {
    public YahamaMoi(String warna) {
        super(warna);
        this.ukuranTangki = 5;
    }
    
    public boolean jalan() {
        if (!super.jalan()) {
            return false;
        }else{
            String WaktuBensinAbis;
            WaktuBensinAbis = super.cekKapanHabis();
            System.out.println("Motor Baet akan abis bensin pada" + WaktuBensinAbis);
            return true;
        }
        
    }

}
