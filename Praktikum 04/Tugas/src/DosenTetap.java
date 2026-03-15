/*Nama File: DosenTetap.Java
 *Deskripsi: Class DosenTetap
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 15 Maret 2026 */
import java.time.LocalDate;

public class DosenTetap extends Dosen {
    /*Atribut */
    private String nidn;
    private String fakultas;

    /*Method*/
    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String nidn, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.nidn = nidn;
        this.fakultas = fakultas;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public double getTunjangan() {
        return 0.02 * getMasaKerjaTahun() * getGajiPokok();
    }

    public LocalDate getTanggalPensiun() {
        return getTanggalLahir().plusYears(65).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN            : " + nidn);
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Masa Kerja      : " + getMasaKerjaLengkap());
        System.out.println("Tanggal Pensiun : " + formatTanggal(getTanggalPensiun()));
        System.out.printf("Gaji Pokok      : Rp %,.2f%n", getGajiPokok());
        System.out.printf("Tunjangan       : 2%% x %d x Rp %,.2f = Rp. %,.2f%n", getMasaKerjaTahun(), getGajiPokok(), getTunjangan());
    }
}