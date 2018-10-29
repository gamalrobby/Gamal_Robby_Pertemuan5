/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan55.handphone;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : Program ini berisi Program data Handphone menggunakan pewarisan
 */
public class PBO210117071Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Handphone handphone = new Handphone("Samsung", "Android", "Grand", 3000000);
  
        Handphone handphone2 = new Handphone("BlackB", "RIM", "Curve", 2000000);
        
        Handphone handphone3 = new Handphone("Nokia", "Win8", "Lumia", 1000000);
        

        Android android = new Android(handphone.manufacture, 
                handphone.operatingSystem, handphone.model, handphone.harga);
        android.setKeyStore("234ibfd3840fo");
        handphone.displayProduct();
        System.out.println("Android Key Store : "+android.getKeyStore());
        System.out.println("");
        
        BlackBerry blackBerry = new BlackBerry(handphone2.manufacture, 
                handphone2.operatingSystem, handphone2.model, handphone2.harga);
        blackBerry.setPinBB("BHS249");
        handphone2.displayProduct();
        System.out.println("PIN : "+blackBerry.getPinBB());
        System.out.println("");
        
        WindowsPhone windowsPhone = new WindowsPhone(handphone3.manufacture, 
                handphone3.operatingSystem, handphone3.model, handphone3.harga);
        windowsPhone.setWpKeyStore("UUUQIJWORj");
        handphone3.displayProduct();
        System.out.println("Wp Key Store : "+windowsPhone.getWpKeyStore());
        
        
    }
    
}
