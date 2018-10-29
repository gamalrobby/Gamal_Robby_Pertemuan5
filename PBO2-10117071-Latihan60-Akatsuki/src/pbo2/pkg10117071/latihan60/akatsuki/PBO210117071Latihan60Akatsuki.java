/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan60.akatsuki;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : Program ini berisi Program data Karakter akatsuki menggunakan pewarisan
 */
public class PBO210117071Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=================ANGGOTA AKATSUKI=================");
        System.out.println("");
        
        Anggota anggota1 = new Anggota("Pain", "Amegakure", "Nol", "jempol Kanan"
                , "Konan", "Memiliki besi hitam berupa tindikan di hampir seluruh "
                        + "tubuh, rambut berwarna jingga"
                , "Rine Tensei, Shinra Tensei, BanshoTein, Chibaku Tensei, Kuchiyose");
        anggota1.setPosisi("Pemimpin");
        System.out.println("Posisi \t\t: "+anggota1.getPosisi());
        anggota1.tampilAnggota();
        
        
        Anggota anggota2 = new Anggota("Konan", "Amegakure", "Putih"
                , "Jari Tengah, Tangan Kanan", "Pain"
                , "Memiliki aksesoris origami bunga di kepala, berambut biru."
                , "Shikigami no Mai, Kami Bunshin, kami shuriken, Kami Hasei, "
                        + "Chuumitsu Kamishouheki,kami henge");
        anggota2.setPosisi("Wakil Pemimpin");
        System.out.println("Posisi \t\t: "+anggota2.getPosisi());
        anggota2.tampilAnggota();
        
        
        Anggota anggota3 = new Anggota("Zetsu", "Chakra Kaguya Otsutsuki", 
                "Babi Hutan", "Kelingking kanan", "Tobi/Obito Uchiha"
                , "Berwajah hitam dan putih, mempunyai dua kepribadian, kanibal,"
                        + " memiliki kerudung kepala seperti tumbuhan venus."
                , "Body-Splitting, Kagero, Hoshi no Jutsu, Narikawari no jutsu, Zetsu's Clone Technique");
        anggota3.setPosisi("Anggota");
        System.out.println("Posisi \t\t: "+anggota3.getPosisi());
        anggota3.tampilAnggota();
        
        
        Anggota anggota4 = new Anggota("Tobi (Obito Uchiha)", "Konohagakure"
                , "Berlian", "Jempol kiri", "Zetsu", "Topeng jingga dengan satu "
                        + "lubang mata dengan pola pusaran yang terpusat pada mata kanan"
                , "Genjutsu-Sharingan, Kamui, Tailed Beast Extraction Technique,"
                        + " Uchiha Flame Battle Encampment, Whac-A-Mole Technique");
        anggota4.setPosisi("Anggota");
        System.out.println("Posisi \t\t: "+anggota4.getPosisi());
        anggota4.tampilAnggota();
        
        
        Anggota anggota5 = new Anggota("Kisame Hoshigaki", "Kirigakure", "Selatan"
                , "Jari manis kiri", "Itachi Uchiha", "Memiliki Kulit seperti "
                        + "ikan hiu, bergigi seperti ikan hiu."
                , "senjikizame, mizurapa, bunshin daibakuha, suiton suishoha, baika suikoudan no jutsu");
        anggota5.setPosisi("Anggota");
        System.out.println("Posisi \t\t: "+anggota5.getPosisi());
        anggota5.tampilAnggota();
        
        
        Anggota anggota6 = new Anggota("Itachi Uchiha", "Konohagakure", "Merah Darah"
                , "Jari manis kanan", "Kisame Hoshigaki", "Berambut belah tengah, "
                        + "ahli dalam Genjutsu, memakai sharingan dan mangekyo sharingan"
                , "Amaterasu, Gokakyu no Jutsu, Susanoo");
        anggota6.setPosisi("Anggota");
        System.out.println("Posisi \t\t: "+anggota6.getPosisi());
        anggota6.tampilAnggota();
        
        
        Anggota anggota7 = new Anggota("Deidara", "Iwagakure", "Biru/Hijau", 
                "Telunjuk kanan", "Sasori", "Berambut pirang dan dikuncir, "
                        + "memiliki mulut di kedua tangan dan satu di dada"
                , "C0, C1, C2, C3, C4");
        anggota7.setPosisi("Anggota");
        System.out.println("Posisi \t\t: "+anggota7.getPosisi());
        anggota7.tampilAnggota();
        
        
        Anggota anggota8 = new Anggota("Sasori", "Sunagakure", "Virgo", "Jempol kiri"
                , "Deidara", "Berambut pendek berwarna merah. Bertubuh boneka "
                        + "sehingga tidak bisa menua. Ahli racun."
                , "Chakura no Ito, Hitokugutsu, Satetsu Shigure");
        anggota8.setPosisi("Anggota");
        System.out.println("Posisi \t\t: "+anggota8.getPosisi());
        anggota8.tampilAnggota();
        
        
        Anggota anggota9 = new Anggota("Hidan", "Yugakure", "Tiga", "Telunjuk kiri",
                "Kakuzu", "Tidak bisa Mati, membawa sabit besar bermata tiga, rambut "
                        + "cepak berwarna pucat", "Jujitsu: Shiji Hyoketsu");
        anggota9.setPosisi("Anggota");
        System.out.println("Posisi \t\t: "+anggota9.getPosisi());
        anggota9.tampilAnggota();
        
        
        Anggota anggota10 = new Anggota("Kakuzu", "Takigakure", "Utara", "Jari tengah kiri"
                , "Hidan", "Memakai penutup wajah,tubuh terdiri dari jaring-jaring "
                        + "untuk menyerang dan memanipulasi tubuh yang lain."
                , "Domu, Zokkoku, Gian, Atsugai, Kimen no Bakuen");
        anggota10.setPosisi("Anggota");
        System.out.println("Posisi \t\t: "+anggota10.getPosisi());
        anggota10.tampilAnggota();
        
        
        Anggota anggota11 = new Anggota("Orochimaru", "Konohagakure", "Langit", 
                "Jari Kelingking kiri", "Sasori", "Berambut panjang berwarna hitam, berkulit pucat."
                , "Shoshagan no Jutsu, Kawarimi no Jutsu, Fushi Tensei");
        anggota11.setPosisi("Anggota");
        System.out.println("Posisi \t\t: "+anggota11.getPosisi());
        anggota11.tampilAnggota();
    }
    
}
