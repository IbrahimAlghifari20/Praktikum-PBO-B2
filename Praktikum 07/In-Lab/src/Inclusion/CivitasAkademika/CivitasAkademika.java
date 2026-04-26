package Inclusion.CivitasAkademika;

/*Nama File: CivitasAkademika.Java
 *Deskripsi: berisi kode Class CivitasAkademika
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 26 Maret 2026 */
public abstract class CivitasAkademika {
    /*Atribut */
    protected String nama;
    
    /*Method */
    public CivitasAkademika(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public abstract String getNomor();
}