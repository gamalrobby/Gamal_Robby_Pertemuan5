/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan60.akatsuki;

/**
 *
 * @author Destroy Eyes
 */
public class Anggota extends Akatsuki{
    private String posisi;

    public Anggota(String nama, String asal, String cincin, String posisiCincin, 
            String rekan, String ciri, String jurus) {
        super(nama, asal, cincin, posisiCincin, rekan, ciri, jurus);
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }
    
    
}
