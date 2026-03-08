/*Nama File: Kendaraan.Java
 *Deskripsi: berisi atribut dan method class Kendaraan
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 7 Maret 2026 */
public class Kendaraan {
    /* ATRIBUT */
    private String noPlat;
    private String jenis;
    
    /* Method */
    public Kendaraan() 
    {
        noPlat = "0";
        jenis = "Standar";
    }
    
    public Kendaraan(String noPlat, String jenis) 
    {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }
    
    public String getNoPlat() 
    {
        return noPlat;
    }
    
    public String getJenis() 
    {
        return jenis;
    }
    
    public void setNoPlat(String noPlat) 
    {
        this.noPlat = noPlat;
    }
    
    public void setJenis(String jenis) 
    {
        this.jenis = jenis;
    }
}