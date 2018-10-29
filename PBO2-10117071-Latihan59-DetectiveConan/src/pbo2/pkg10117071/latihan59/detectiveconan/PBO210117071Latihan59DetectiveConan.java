/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan59.detectiveconan;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : Program ini berisi Program data karakter detective conan menggunakan pewarisan
 */
public class PBO210117071Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("=======KELUARGA ANGKAT CONAN=======");
        Keluarga keluarga1 = new Keluarga("Conan Edogawa", "pekerja keras", "Anak Angkat");
        Keluarga keluarga2 = new Keluarga("Kogoro Mouri", "ceroboh/pemalas", "Ayah Angkat");
        Keluarga keluarga3 = new Keluarga("Eri Kisaki", "pekerja keras", "Ibu Angkat");
        Keluarga keluarga4 = new Keluarga("Ran mouri", "bisa diandalkan", "Teteh Angkat");
        keluarga1.tampilDetective();
        keluarga2.tampilDetective();
        keluarga3.tampilDetective();
        keluarga4.tampilDetective();
        
        System.out.println("===============TEMAN===============");
        Teman teman1 = new Teman("Ayumi Yoshida", "Periang", "Teman conan");
        Teman teman2 = new Teman("Mitsuhiko Tsuburaya", "Penyuka teknologi", "Teman conan");
        Teman teman3 = new Teman("Genta Kojima", "penyuka makanan", "Teman conan");
        Teman teman4 = new Teman("Ai Haibara", "Cuek/Dingin", "Teman conan");
        Teman teman5 = new Teman("Sonoko Suzuki", "Centil", "Teman Ran");
        Teman teman6 = new Teman("Kazuha Tooyama", "Terampil", "Teman Heiji");
        teman1.tampilTeman();
        teman2.tampilTeman();
        teman3.tampilTeman();
        teman4.tampilTeman();
        teman5.tampilTeman();
        teman6.tampilTeman();
        
        
        System.out.println("===========PROFESSOR===========");
        Professor professor = new Professor("Agasa Hiroshi", "Ramah dan Linglung", "Professor");
        professor.tampilProfessor();
        
        
        System.out.println("===============DETECTIVE===============");
        Detective detective1 = new Detective("Conan Edogawa", "pekerja keras", "Detective");
        Detective detective2 = new Detective("Heiji Hattori", "pekerja keras", "Detective");
        detective1.tampilDetective();
        detective2.tampilDetective();
        
    }
    
}
