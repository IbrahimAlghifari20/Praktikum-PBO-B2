/*Nama File: Petani.Java
 *Deskripsi: berisi atribut dan method Sub class Petani
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 25 Maret 2026 */
import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;
    private int C;
    
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        this.C = 1;
        counterPetani++;
    }
    
    public String getAsal_kota() {
        return asal_kota;
    }
    
    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }
    
    public static int getCounterPetani() {
        return counterPetani;
    }
    
    @Override
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(tgl_mulai_kerja, now);
        return period.getYears() + C;
    }
    
    @Override
    public double hitungPajak() {
        return 0;
    }
    
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
        System.out.println("Jenis: Petani");
    }
}