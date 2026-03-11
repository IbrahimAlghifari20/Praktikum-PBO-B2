/*Nama File: MBangunDatar.Java
 *Deskripsi: Main Driver
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 11 Maret 2026 */
public class MBangunDatar {
    public static void main(String[] args) {
        Persegi P1 = new Persegi(4, "Biru", "Hitam");
        P1.printInfo();
        Lingkaran L1 = new Lingkaran(10, "Hijau", "Putih");
        L1.printInfo();
        double luasP = P1.getLuas();
        double luasL = L1.getLuas();
        System.out.println("Luas Persegi = " + luasP);
        System.out.println("Luas Lingkaran = " + luasL);
    
}
}
