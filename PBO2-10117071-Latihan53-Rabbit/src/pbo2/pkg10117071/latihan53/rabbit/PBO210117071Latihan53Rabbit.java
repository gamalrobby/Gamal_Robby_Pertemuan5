/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan53.rabbit;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : Program ini berisi Program hewan menggunakan pewarisan
 */
public class PBO210117071Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit(true, "grass", 4 , "Grey", "Peter");
        System.out.println("Hallo, His name is "+rabbit.getName());
        System.out.println(rabbit.getName()+" is Vegetarian ? "+rabbit.isVegetarian());
        System.out.println(rabbit.getName()+" eats " + rabbit.getEats());
        System.out.println(rabbit.getName()+" has "+rabbit.getNoOfLegs()+" Legs.");
        System.out.println(rabbit.getName()+" color is "+rabbit.getColor());
    }
    
}
