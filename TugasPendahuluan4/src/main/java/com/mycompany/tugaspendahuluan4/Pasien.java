/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspendahuluan4;

/**
 *
 * @author Muthia Rihadatul
 */
public class Pasien {
    private String nama;
    private int umur;
    
    public Pasien(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public int getUmur(){
        return this.umur;
    }
}
