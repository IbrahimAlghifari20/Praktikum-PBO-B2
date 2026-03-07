/*Nama File: Dosen.Java
 *Deskripsi: berisi atribut dan method class Dosen
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 7 Maret 2026 */
public class Dosen {
    /* ATRIBUT */
    private String nip;
    private String nama;
    private String prodi;
    
    /* Method */
    public Dosen() 
    {
        nip = "0";
        nama = "Nama";
        prodi = "Prodi";
    }
    
    public Dosen(String nip, String nama, String prodi) 
    {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }
    
    public String getNip() 
    {
        return nip;
    }
    
    public String getNama() 
    {
        return nama;
    }
    
    public String getProdi() 
    {
        return prodi;
    }
    
    public void setNip(String nip) 
    {
        this.nip = nip;
    }
    
    public void setNama(String nama) 
    {
        this.nama = nama;
    }
    
    public void setProdi(String prodi) 
    {
        this.prodi = prodi;
    }
}