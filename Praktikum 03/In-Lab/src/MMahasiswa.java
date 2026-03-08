/*Nama File: MMahasiswa.Java
 *Deskripsi: berisi Main 
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 7 Maret 2026 */
public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        MataKuliah STRUKDAT = new MataKuliah("SD", "Struktur Data", 3);
        
        Dosen DI = new Dosen("123", "Andi", "informatika");
        Dosen DN = new Dosen("456", "Budi", "informatika");
        
        Mahasiswa MI = new Mahasiswa("234", "Citra", "Informatika", "H1234AB", "motor");
        Mahasiswa MJ = new Mahasiswa("567", "Budi", "Informatika", "B5678CD", "mobil");
        Mahasiswa MK = new Mahasiswa("789", "Dewi", "Sistem Informasi");
        
        MI.setDosenWali(DI);
        MI.addMatKul(PBO);
        MI.addMatKul(MBD);
        
        MJ.setDosenWali(DI);
        MJ.addMatKul(PBO);
        MJ.addMatKul(STRUKDAT);
        
        MK.setDosenWali(DN);
        MK.addMatKul(MBD);
        MK.addMatKul(STRUKDAT);
        
        MI.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + MI.getJumlahMatKul());
        System.out.println("Jumlah SKS = " + MI.getJumlahSKS());
        
        System.out.println();
        
        MJ.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + MJ.getJumlahMatKul());
        System.out.println("Jumlah SKS = " + MJ.getJumlahSKS());
        
        System.out.println();
        
        MK.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + MK.getJumlahMatKul());
        System.out.println("Jumlah SKS = " + MK.getJumlahSKS());
    }
}