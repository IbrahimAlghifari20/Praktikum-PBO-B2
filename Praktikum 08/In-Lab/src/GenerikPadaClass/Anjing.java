package GenerikPadaClass;


/*Nama File: Anjing.Java
 *Deskripsi: berisi kode Class Anjing
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 3 Mei 2026 */
public class Anjing extends Anabul {
    /*Method */
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