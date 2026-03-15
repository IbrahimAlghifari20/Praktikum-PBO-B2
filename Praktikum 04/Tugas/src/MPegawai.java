/*Nama File: MPegawai.Java
 *Deskripsi: Main Driver
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 15 Maret 2026 */
import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        DosenTetap dosen1 = new DosenTetap(
            "9545647548", 
            "Andi", 
            LocalDate.of(1990, 5, 5), 
            LocalDate.of(2015, 1, 1), 
            5000000.0, 
            "78647324", 
            "Fakultas Sains dan Matematika"
        );

        dosen1.printInfo();
    }
}