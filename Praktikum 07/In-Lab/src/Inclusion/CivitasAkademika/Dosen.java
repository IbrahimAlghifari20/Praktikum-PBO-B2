package Inclusion.CivitasAkademika;

/*Nama File: Dosen.Java
 *Deskripsi: berisi kode Class Dosen
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 26 Maret 2026 */
public class Dosen extends CivitasAkademika {
    /*Atribut */
    private String nip;
    
    /*Method */
    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }
    
    public String getNip() {
        return nip;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    @Override
    public String getNomor() {
        return nip;
    }
}