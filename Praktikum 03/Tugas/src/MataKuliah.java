/*Nama File: MataKuliah.Java
 *Deskripsi: berisi atribut dan method class Mata Kuliah
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 7 Maret 2026 */
public class MataKuliah {
    /* ATRIBUT */
    private String idMatKul;
    private String nama;
    private int sks;
    
    /* Method */
    public MataKuliah() {
        idMatKul = "0";
        nama = "Matkul";
        sks = 0;
    }
    
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }
    
    public String getIdMatKul() {
        return idMatKul;
    }
    
    public String getNama() {  
        return nama;
    }
    
    public int getSks() {
        return sks;
    }
    
    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }
    
    public void setName(String nama) {  
        this.nama = nama;
    }
    
    public void setSks(int sks) {
        this.sks = sks;
    }
}