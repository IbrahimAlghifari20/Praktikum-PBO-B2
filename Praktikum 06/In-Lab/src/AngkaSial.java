/**
 * File : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 * Pengenalan klausa 'throw' dan 'throws'
 * Pertanyaan: 
 * Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 * Jawab:
 * Baris 12 yaitu System.out.println(angka + " bukan angka sial"); hanya di eksekusi ketika method belom melempar Error Sehingga pada driver ketika objek menjalankan method cobaangka(13) method melempar pesan error dan menghentikan driver, namun untuk yang cobaangka(10), baris ke 12 di eksekusi karena tidak melempar pesan error
 * Pertanyaan:
 * Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 * Jawab:
 * Baris 21 yaitu catch (AngkaSialException ase) dieksekusi karena ketika dijalankan method cobaangka(13) method melempar pesan, dan baris kode catch (AngkaSialException ase) menangkap error dan menjalankan perintahnya
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 25 Maret 2026 */

public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}