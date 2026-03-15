/*Nama File: Dosen.Java
 *Deskripsi: Class Dosen
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 15 Maret 2026 */
import java.time.LocalDate;

public class Dosen extends Pegawai {
    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
    }
}