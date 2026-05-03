package GenerikPadaClass;
/*Nama File: Anggora.Java
 *Deskripsi: berisi kode Class Anggora
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 3 Mei 2026 */
public class Anggora extends Kucing {
    /*Method */
    public Anggora(String nama, Integer bobot) {
        super(nama, bobot);
    }
    
    @Override
    public void Bersuara() {
        System.out.println(this.getNama() + " Bersuara Meong lembut");
    }

}