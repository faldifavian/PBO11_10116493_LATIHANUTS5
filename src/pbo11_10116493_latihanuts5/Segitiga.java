/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11_10116493_latihanuts5;

/**
 *
 * @author faldi
 */
public class Segitiga implements BangunDatar{

    private int luas;
    private int keliling;
    private final int sisiAb;
    private final int sisiBc;
    private final int sisiCa;
    private final int alas;
    private final int tinggi;
    
    public Segitiga(int sisiAb, int sisiBc, int sisiCa, int alas, int tinggi ){
    this.sisiAb=sisiAb;
    this.sisiBc=sisiBc;
    this.sisiCa=sisiCa;
    this.alas=alas;
    this.tinggi=tinggi;
    
    }
    
    @Override
    public void hitungLuas() {
        luas = alas * tinggi;
        System.out.println("Luas Segitiga : " + luas);
    }

    @Override
    public void hitungKeliling() {
        keliling = sisiAb + sisiBc + sisiCa;
        System.out.println("Keliling Segitiga : "+ keliling);
    }
    
    
    
}
