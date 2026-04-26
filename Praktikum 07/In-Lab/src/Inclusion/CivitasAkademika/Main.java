package Inclusion.CivitasAkademika;

/*Nama File: Main.Java
 *Deskripsi: berisi kode Main
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 26 Maret 2026 */
public class Main {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("Pak Anton", "123456789");
        Dosen d2 = new Dosen("Bu Putri", "987654321");

        Mahasiswa m1 = new Mahasiswa("Baim", "240001");
        Mahasiswa m2 = new Mahasiswa("Ichan", "240002", d1);
        Mahasiswa m3 = new Mahasiswa("Rizky", "240003");
        Mahasiswa m4 = new Mahasiswa("Faiq", "240004", d2);
        Mahasiswa m5 = new Mahasiswa("Dewangga", "240005");

        Seminar seminar = new Seminar();

        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);

        seminar.tampilPeserta();

        System.out.println("\nJumlah Peserta: " + seminar.countPeserta());
        System.out.println("Jumlah Mahasiswa: " + seminar.countMahasiswa());

        System.out.println("\nData Mahasiswa Sebelum Set Wali:");
        m1.tampilDataMahasiswa();

        m1.setWali(d2);
        System.out.println("\nSetelah Set Wali:");
        m1.tampilDataMahasiswa();

        System.out.println("\nSemua Data Mahasiswa:");
        Mahasiswa[] semuaMhs = {m1, m2, m3, m4, m5};
        for (Mahasiswa m : semuaMhs) {
            m.tampilDataMahasiswa();
            System.out.println();
        }
    }
}