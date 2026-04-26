package Inclusion;
/*Nama File: Kucing.Java
 *Deskripsi: berisi kode Class Kucing
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 26 Maret 2026 */
public class Kucing extends Anabul {
    public Kucing(String nama) {
        super((String) nama);
    }
    
    @Override
    public void Bersuara() {
        System.out.println(this.getNama() + " Bersuara Meong");
    }
    
    @Override
    public void Gerak() {
        System.out.println(this.getNama() + " Bergerak Melata");
    }
}