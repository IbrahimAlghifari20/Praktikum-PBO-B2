package Inclusion;

/*Nama File: Burung.Java
 *Deskripsi: berisi kode Class Burung
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 26 Maret 2026 */
public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }
    
    @Override
    public void Bersuara() {
        System.out.println(this.getNama() + " Bersuara Cuit");
    }
    
    @Override
    public void Gerak() {
        System.out.println(this.getNama() + " Bergerak Terbang");
    }
}