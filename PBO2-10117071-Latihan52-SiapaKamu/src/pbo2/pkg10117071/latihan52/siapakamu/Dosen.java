/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan52.siapakamu;

/**
 *
 * @author Destroy Eyes
 */
public class Dosen extends Manusia{
    private String nip;
    private String matakuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya "+nama+" Umur "+umur+" Tahun "+" "
                + "Sedang Mengajar matakuliah "+matakuliah);
    }
    
    @Override
    public void siapaKamu(){
        System.out.println("Saya Dosen");
    }
}
