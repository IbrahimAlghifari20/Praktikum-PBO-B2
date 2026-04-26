package Overloading;
public class AplikasiMahasiswa {
    public static void main(String[] args) {
        
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("Objek m1 (konstruktor default):");
        m1.PrintInfo();
        
        Mahasiswa m2 = new Mahasiswa(12345, "Ibrahim", "Informatika");
        System.out.println("\nObjek m2 (3 parameter):");
        m2.PrintInfo();
        
        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.println("\nObjek m3 (konstruktor kloning):");
        m3.PrintInfo();
        
        Mahasiswa m4 = new Mahasiswa(67890, "Jack", "");
        System.out.println("Objek m4:");
        m4.PrintInfo();
        
        m4.setProgramStudi();
        System.out.println("\nHasil setProgramStudi()=");
        m4.PrintInfo();
        
        m4.setProgramStudi("Sistem Informasi");
        System.out.println("\nHasil setProgramStudi(String programStudi)=");
        m4.PrintInfo();
        
        m4.setProgramStudi(m2);
        System.out.println("\nHasil setProgramStudi(Mahasiswa m)=");
        m4.PrintInfo();
        
        System.out.println("\nKonstruktor Mahasiswa()");
        Mahasiswa defaultMhs = new Mahasiswa();
        defaultMhs.PrintInfo();
        
        System.out.println("\nKonstruktor Mahasiswa(int nim, String nama, String programStudi)");
        Mahasiswa m5 = new Mahasiswa(11111, "Ichan", "Teknik Komputer");
        m5.PrintInfo();
        
        System.out.println("\nKonstruktor Mahasiswa(Mahasiswa m)");
        Mahasiswa m6 = new Mahasiswa(m5);
        m6.PrintInfo();
    }
}