/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan52.siapakamu;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : Program ini berisi Program Siapa kamu menggunakan pewarisan
 */
public class PBO210117071Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN : "+dosen.getNip());
        
        dosen.siapaKamu();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMatakuliah("PBO");
        dosen.mengajarApa();
        
        System.out.println("");
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10110269");
        System.out.println("NIM MAHASISWA : "+mahasiswa.getNim());
        
        mahasiswa.siapaKamu();
        mahasiswa.setNama("Nindi");
        mahasiswa.setUmur(17);
        mahasiswa.setKelas("PBO2");
        mahasiswa.kelasApa();
    }
    
}
