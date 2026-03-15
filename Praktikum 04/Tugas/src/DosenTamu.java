/*Nama File: DosenTamu.Java
 *Deskripsi: Class DosenTamu
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 15 Maret 2026 */
import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {
    /*Atribut */
    private String nidk;
    private String fakultas;
    private LocalDate tanggalBerakhirKontrak;

    /*Method*/

    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String nidk, String fakultas, LocalDate kontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.nidk = nidk;
        this.fakultas = fakultas;
        this.tanggalBerakhirKontrak = kontrak;
    }

    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public String getNidk() {
        return nidk;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setTanggalBerakhirKontrak(LocalDate tanggalBerakhirKontrak) {
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    public LocalDate getTanggalBerakhirKontrak() {
        return tanggalBerakhirKontrak;
    }

    public double getTunjangan() {
        return 0.025 * getGajiPokok();
    }

    public int getSisaKontrakBulan() {
        Period p = Period.between(LocalDate.now(), tanggalBerakhirKontrak);
        return (p.getYears() * 12) + p.getMonths();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK            : " + nidk);
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Sisa Kontrak    : " + getSisaKontrakBulan() + " bulan");
        System.out.printf("Gaji Pokok      : Rp %,.2f%n", getGajiPokok());
        System.out.printf("Tunjangan       : 2,5%% x Rp %,.2f = Rp. %,.2f%n",  getGajiPokok(), getTunjangan());
    }
}