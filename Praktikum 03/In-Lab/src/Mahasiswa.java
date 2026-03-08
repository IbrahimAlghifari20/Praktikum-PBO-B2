/*Nama File: Mahasiswa.Java
 *Deskripsi: berisi atribut dan method class Mahasiswa
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 7 Maret 2026 */
import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    
    public Mahasiswa() 
    {
        this.listMatKul = new ArrayList<>();
    }
    
    public Mahasiswa(String nim, String nama, String prodi) 
    {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }
    
    public Mahasiswa(String nim, String nama, String prodi, String noPlat, String jenis) 
    {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
        this.kendaraan = new Kendaraan(noPlat, jenis);
    }
    
    public String getNim() 
    {
        return nim;
    }
    
    public String getNama() 
    {
        return nama;
    }
    
    public String getProdi() 
    {
        return prodi;
    }
    
    public Dosen getDosenWali() 
    {
        return dosenWali;
    }
    
    public void setNim(String nim) 
    {
        this.nim = nim;
    }
    
    public void setNama(String nama) 
    {
        this.nama = nama;
    }
    
    public void setProdi(String prodi) 
    {
        this.prodi = prodi;
    }
    
    public void setDosenWali(Dosen dosenWali) 
    {
        this.dosenWali = dosenWali;
    }
    
    public void addMatKul(MataKuliah newMatKul) 
    {
        listMatKul.add(newMatKul);
    }
    
    public int getJumlahSKS() 
    {
        int totalSKS = 0;
        for (int i = 0; i < listMatKul.size(); i++) 
        {
            totalSKS += listMatKul.get(i).getSks();
        }
        return totalSKS;
    }
    
    public int getJumlahMatKul() 
    {
        return listMatKul.size();
    }
    
    public void printMhs() 
    {
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }
    
    public void printDetailMhs() 
    {
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        for(int i = 0; i < listMatKul.size(); i++) 
        {
            System.out.println(listMatKul.get(i).getNama());
        }
        if (kendaraan != null) 
        {
            System.out.println("No Plat : " + kendaraan.getNoPlat());
            System.out.println("Jenis : " + kendaraan.getJenis());
        }
    }
}