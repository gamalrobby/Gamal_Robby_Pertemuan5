/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : Program ini berisi Program Gaji Karyawan menggunakan pewarisan
 */
public class PBO210117071Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();
        Manager manager = new Manager();
        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);
        
        System.out.println("===PROGRAM PERHITUNGAN GAJI KARYAWAN===");
        System.out.print("Masukkan NIK \t : ");
        karyawan.setNik(scn.nextLine());
        System.out.print("Masukkan NAMA \t : ");
        karyawan.setNama(scn.nextLine());
        System.out.print("Masukkan GOLONGAN(1/2/3) \t: ");
        karyawan.setGolongan(scn.nextInt());
        System.out.print("Masukkan JABATAN (Manager/kabag): ");
        karyawan.setJabatan(scn.next());
        System.out.print("Masukkan JUMLAH KEHADIRAN \t: ");
        manager.setKehadiran(scn1.nextInt());
        
        System.out.println("");
        System.out.println("===HASIL PERHITUNGAN===");
        System.out.println("NIK \t\t: " + karyawan.getNik());
        System.out.println("NAMA \t\t: "+ karyawan.getNama());
        System.out.println("GOLONGAN \t: "+karyawan.getGolongan());
        System.out.println("JABATAN \t: "+karyawan.getJabatan());
        System.out.println("");
        
        System.out.println("TUNJANGAN GOLONGAN \t: "+manager.tunjaganGolongan(karyawan.getGolongan()));
        System.out.println("TUNJANGAN JABATAN \t: "+manager.tunjaganJabatan(karyawan.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN \t: "+manager.tunjanganKehadiran(manager.getKehadiran()));
        
        System.out.println("");
        System.out.println("GAJI TOTAL \t: "+manager.gajiTotal());
    }
    
}
