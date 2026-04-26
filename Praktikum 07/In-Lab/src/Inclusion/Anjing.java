package Inclusion;

/*Nama File: Anjing.Java
 *Deskripsi: berisi kode Class Anjing
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 26 Maret 2026 */
public class Anjing extends Anabul {
    public Anjing(String nama) {
        super((String) nama);
    }
    
    @Override
    public void Bersuara() {
        System.out.println(this.getNama()+ " Bersuaru Guk-Guk");
    }
    
    @Override
    public void Gerak() {
        System.out.println(this.getNama() + " Bergerak Melata");
    }
}