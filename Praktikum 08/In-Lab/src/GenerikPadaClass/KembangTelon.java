package GenerikPadaClass;
/*Nama File: KembangTelon.Java
 *Deskripsi: berisi kode Class KembangTelon
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 3 Mei 2026 */
public class KembangTelon extends Kucing {
    /*Method */
    public KembangTelon(String nama, Integer bobot) {
        super(nama, bobot);
    }
    
    @Override
    public void Bersuara() {
        System.out.println(this.getNama() + " Bersuaru Miau");
    }

    
}
