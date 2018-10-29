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
public class Akatsuki {
    private String nama;
    private String asal;
    private String cincin;
    private String posisiCincin;
    private String rekan;
    private String ciri;
    private String jurus;

    public Akatsuki(String nama, String asal, String cincin, String posisiCincin, 
            String rekan, String ciri, String jurus) {
        this.nama = nama;
        this.asal = asal;
        this.cincin = cincin;
        this.posisiCincin = posisiCincin;
        this.rekan = rekan;
        this.ciri = ciri;
        this.jurus = jurus;
        
        
    }
    
    public void tampilAnggota(){
        System.out.println("Nama \t\t: "+nama);
        System.out.println("Asal \t\t: "+asal);
        System.out.println("Cincin \t\t: "+cincin);
        System.out.println("Posisi Cincin \t: "+posisiCincin);
        System.out.println("Rekan \t\t: "+rekan);
        System.out.println("Ciri \t\t: "+ciri);
        System.out.println("Jurus \t\t: "+jurus);
        System.out.println("-----------------------------------------------");
    }
    
    
}
