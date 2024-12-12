/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspendahuluan3;

/**
 *
 * @author Muthia Rihadatul
 */
public class Mahasiswa {
    private String nama;
    private Prodi prodi;
    
    public Mahasiswa(String nama, Prodi prodi){
        this.nama = nama;
        this.prodi = prodi;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setProdi(Prodi prodi){
        this.prodi = prodi;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public String getProdi(){
        return this.prodi.getNama();
    }
    
    public void displayMahasiswa(){
        System.out.println("Nama Mahasiswa :" + this.nama);
        System.out.println("Program Studi : " + this.getProdi());
    }
}
