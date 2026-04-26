package Overloading;
/*Nama File: Mahasiswa.Java
 *Deskripsi: berisi kode untuk mencoba Overloading
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 25 Maret 2026 */
public class Mahasiswa {
    /*Atribut */
    private int nim;
    private String nama;
    private String programStudi;
    
    /*Method*/
    public Mahasiswa() {
        this.nim = -999;
        this.nama = "n/a";
        this.programStudi = "n/a";
    }
    

    public Mahasiswa(int nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }
    
    public Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }
    
    public int getNim() {
        return nim;
    }
    
    public void setNim(int nim) {
        this.nim = nim;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getProgramStudi() {
        return programStudi;
    }
    
    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }
    
    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }
    
    public void setProgramStudi(Mahasiswa m) {
        this.programStudi = m.programStudi;
    }
    
    public void PrintInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Program Studi: " + programStudi);
    }
}