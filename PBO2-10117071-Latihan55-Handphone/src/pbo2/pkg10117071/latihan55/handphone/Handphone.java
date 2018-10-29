/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan55.handphone;

/**
 *
 * @author Destroy Eyes
 */
public class Handphone {
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    public Handphone(String man, String os, String model, int harga) {
        manufacture=man;
        operatingSystem=os;
        this.model=model;
        this.harga=harga;
    }
    
    public void displayProduct(){
        System.out.println("Manufakture : "+manufacture);
        System.out.println("OS : "+operatingSystem);
        System.out.println("Model : "+model);
        System.out.println("Harga : "+harga);
    }
    
    
}
