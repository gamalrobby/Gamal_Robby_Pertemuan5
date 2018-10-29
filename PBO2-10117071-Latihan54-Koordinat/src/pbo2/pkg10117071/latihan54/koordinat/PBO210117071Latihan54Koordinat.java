/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan54.koordinat;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : Program ini berisi Program koordinat menggunakan pewarisan
 */
public class PBO210117071Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat warna = new WarnaKoordinat(10, 4, "Jingga");
        System.out.println("Warna Koordinat : "+warna.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+warna.getX()+", y : "+warna.getY());
    }
    
}
