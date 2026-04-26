package Inclusion.CivitasAkademika;
/*Nama File: Mahasiswa.Java
 *Deskripsi: berisi kode Class Mahasiswa
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 26 Maret 2026 */
public class Mahasiswa extends CivitasAkademika {
    /*Atribut */
    private String nim;
    private Dosen dosenWali;
    
    /*Method */
    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
        this.dosenWali = null;
    }
    
    public Mahasiswa(String nama, String nim, Dosen dosenWali) {
        super(nama);
        this.nim = nim;
        this.dosenWali = dosenWali;
    }
    
    public String getNim() {
        return nim;
    }
    
    public void setNim(String nim) {
        this.nim =  nim;
    }
    
    public Dosen getDosenWali() {
        return dosenWali;
    }
    
    public void setWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }
    
    @Override
    public String getNomor() {
        return  nim;
    }
    
    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        if (dosenWali != null) {
            System.out.println("Dosen Wali: " + dosenWali.getNama() + " (NIP: " + dosenWali.getNip() + ")");
        } else {
            System.out.println("Dosen Wali: Belum ditentukan");
        }
    }
}