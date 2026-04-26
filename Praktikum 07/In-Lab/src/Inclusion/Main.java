package Inclusion;
/*Nama File: Main.Java
 *Deskripsi: berisi kode Main
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 26 Maret 2026 */
public class Main {
    public static void main(String[] args) {
        String nama = "Imut";
        Anabul K = new Kucing(nama);
        K.Bersuara();
        K.Gerak();
        K = new Anjing(nama);
        K.Bersuara();
        K.Gerak();
        K = new Burung(nama);
        K.Bersuara();
        K.Gerak();
    }
}
