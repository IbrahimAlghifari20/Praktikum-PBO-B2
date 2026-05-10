package KOLEKSIKELASBENTUKAN;
/*Nama File: Anggora.Java
 *Deskripsi: berisi kode Class Anggora
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 3 Mei 2026 */
public class Anggora extends Kucing {
    /*Method */
    public Anggora(String nama, Integer bobot, String Panggilan) {
        super(nama, bobot, Panggilan);
    }
    
    @Override
    public void Bersuara() {
        System.out.println(this.getNama() + " Bersuara Meong lembut");
    }

}