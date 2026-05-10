package KOLEKSIKELASBENTUKAN;

/*Nama File: Anabul.Java
 *Deskripsi: berisi kode Class Anabul
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 3 Mei 2026 */
public class Anabul {
    /*Atribut */
    private String nama;
    private String panggilan;

    /*Method*/
    public Anabul(String Nama, String Panggilan) {
        nama = Nama;
        panggilan = Panggilan;
    }
    public String getNama(){
        return nama;
    }

    public String getPanggilan() { 
        return panggilan; 
    }
    public void setPanggilan(String panggilan) { 
        this.panggilan = panggilan; 
    }
        
    public void Bersuara() {
        System.out.println("bersuara");
    }
    
    public void Gerak() {
        System.out.println("bergerak");
    }
}