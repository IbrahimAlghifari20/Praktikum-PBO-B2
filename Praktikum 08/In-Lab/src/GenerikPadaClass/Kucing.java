package GenerikPadaClass;
/*Nama File: Kucing.Java
 *Deskripsi: berisi kode Class Kucing
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 3 Mei 2026 */
public class Kucing extends Anabul {
    /*Atribut */
    private Integer Bobot;
    public Kucing(String nama, Integer bobot) {
        super(nama);
        this.Bobot = bobot;
    }

    /*Method */
    public Integer getBobot() {
        return Bobot;
    }

    public void setBobot(Integer bobot) {
        this.Bobot = bobot;
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