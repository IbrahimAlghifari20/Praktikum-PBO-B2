/*Nama File: MBangunDatar.Java
 *Deskripsi: Main Driver
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 25 Maret 2026 */
public class MBangunDatar {
    public static void main(String[] args) {
        BangunDatar P1 = new Persegi(4, "Biru", "Hitam");
        P1.printInfo();
        BangunDatar L1 = new Lingkaran(10, "Hijau", "Putih");
        L1.printInfo();
        double luasP = P1.getLuas();
        double luasL = L1.getLuas();
        System.out.println("Luas Persegi = " + luasP);
        System.out.println("Luas Lingkaran = " + luasL);
        
        if (P1.isEqualLuas(P1)) {
            System.out.println("Sama");
        }else{
            System.out.println("Beda");
        }
}
}
