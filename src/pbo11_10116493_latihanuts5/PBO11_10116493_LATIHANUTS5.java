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
public class PBO11_10116493_LATIHANUTS5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JajarGenjang oJajarGenjang = new JajarGenjang(50, 60, 70, 80, 100, 120);
        Segitiga oSegitiga = new Segitiga(50, 60, 70, 100, 120);
        
        oJajarGenjang.hitungKeliling();
        oJajarGenjang.hitungLuas();
        oSegitiga.hitungKeliling();
        oSegitiga.hitungLuas();
        
       
    }
    
}
