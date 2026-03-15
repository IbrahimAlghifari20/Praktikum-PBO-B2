/*Nama File: Tendik.Java
 *Deskripsi: Class Tendik
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 15 Maret 2026 */
import java.time.LocalDate;

public class Tendik extends Pegawai {
    /*Atribut */
    private String bidang;

    /*Method*/

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    public double getTunjangan() {
        return 0.01 * getMasaKerjaTahun() * getGajiPokok();
    }

    public LocalDate getTanggalPensiun() {
        return getTanggalLahir().plusYears(55).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan         : Tendik");
        System.out.println("Bidang          : " + bidang);
        System.out.println("Masa Kerja      : " + getMasaKerjaLengkap());
        System.out.println("Tanggal Pensiun : " + formatTanggal(getTanggalPensiun()));
        System.out.printf("Gaji Pokok      : Rp %,.2f%n", getGajiPokok());
        System.out.printf("Tunjangan       : 1%% x %d x Rp %,.2f = Rp. %,.2f%n", getMasaKerjaTahun(), getGajiPokok(), getTunjangan());
    }
}