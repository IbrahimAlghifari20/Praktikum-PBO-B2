/*Nama File: Garis.Java
 *Deskripsi: berisi atribut dan method class Garis
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 26 Februari 2026 */

public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(-2);
        T1.setOrdinat(0);
        Titik T2 = new Titik();
        T2.setAbsis(0);
        T2.setOrdinat(4);
        Garis G1 = new Garis(T1, T2);
        G1.getAwal().printTitik();
        G1.printGaris();
        String test = G1.PersamaanGaris();
        System.out.println(test);

    }
}
