/*Nama File: Asersi1.Java
 *Deskripsi: Program Test Asersi
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 25 Maret 2026 */
public class Asersi1 {
    public static void main(String[] args){
        int x = 0;
        if (x > 0) {
            System.out.println("x Bilangan Positif");
        }else{
            assert(x<0):"ada kesalahan kode";
            System.out.println("x Bilangan Negatif");
        }
    }
}
