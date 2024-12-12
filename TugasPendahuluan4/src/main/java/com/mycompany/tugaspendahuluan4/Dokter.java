/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspendahuluan4;

/**
 *
 * @author Muthia Rihadatul
 */
public class Dokter {
    private String nama, spesialis;
    
    public Dokter(String nama, String spesialis){
        this.nama = nama;
        this.spesialis = spesialis;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setSpesialis(String spesialis){
        this.spesialis = spesialis;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public String getSpesialis(){
        return this.spesialis;
    }
}
