/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan59.detectiveconan;

/**
 *
 * @author Destroy Eyes
 */
public class Teman extends DetectiveConan{

    public Teman(String nama, String sifat, String peran) {
        super(nama, sifat, peran);
    }
    
    public void tampilTeman(){
        System.out.println("Nama    : "+this.getNama());
        System.out.println("Peran   : "+this.getPeran());
        System.out.println("Sifat   : "+this.getSifat());
        System.out.println("");
    }
}
