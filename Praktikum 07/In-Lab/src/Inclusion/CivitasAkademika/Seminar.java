package Inclusion.CivitasAkademika;
/*Nama File: Seminar.Java
 *Deskripsi: berisi kode Class Seminar
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 26 Maret 2026 */
public class Seminar {
    /*Atribut */
    private CivitasAkademika[] Peserta;
    private int banyakPeserta;

    /*Method*/
    int MAKS_PESERTA = 100;
    
    public Seminar() {
        this.Peserta = new CivitasAkademika[MAKS_PESERTA];
        this.banyakPeserta = 0;
    }
    
    public int countPeserta() {
        return banyakPeserta;
    }
    
    public void registrasi(CivitasAkademika peserta) {
        if (banyakPeserta < MAKS_PESERTA) {
            Peserta[banyakPeserta] =  peserta;
            banyakPeserta++;
            System.out.println("Registrasi berhasil: " + peserta.getNama());
        } else {
            System.out.println("Maaf, kapasitas seminar sudah penuh!");
        }
    }
    
    public void tampilPeserta() {
        System.out.println("Total peserta: " + banyakPeserta);
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println((i+1) + ". " + Peserta[i].getNomor() + " - " + Peserta[i].getNama());
        }
    }
    
    public int countMahasiswa() {
        int jumlah = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (Peserta[i] instanceof Mahasiswa) {
                jumlah++;
            }
        }
        return jumlah;
    }
}