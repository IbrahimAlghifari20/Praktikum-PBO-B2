package Inclusion;
/*Nama File: Anabul.Java
 *Deskripsi: berisi kode Class Anabul
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 26 Maret 2026 */
public class Anabul {
    /*Atribut */
    private String nama;

    /*Method*/
    
    public Anabul(String nama) {
        this.nama = (String) nama;
    }
    public String getNama(){
        return nama;
    }
        
    public void Bersuara() {
        System.out.println((String) nama + " bersuara");
    }
    
    public void Gerak() {
        System.out.println((String) nama + " bergerak");
    }
}