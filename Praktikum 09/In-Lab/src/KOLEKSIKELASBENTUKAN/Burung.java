package KOLEKSIKELASBENTUKAN;

/*Nama File: Burung.Java
 *Deskripsi: berisi kode Class Burung
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 3 Mei 2026 */
public class Burung extends Anabul {
    /*Method */
    public Burung(String nama, String Panggilan) {
        super(nama, Panggilan);
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