/*Nama File: PNS.Java
 *Deskripsi: berisi atribut dan method Sub class PNS
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 25 Maret 2026 */
import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    
    public PNS(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, "", pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    
    public String getNip() {
        return nip;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public static int getCounterPNS() {
        return counterPNS;
    }
    
    @Override
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(tgl_mulai_kerja, now);
        return period.getYears() + 0;
    }
    
    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }
    
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Jenis: PNS");
    }
}