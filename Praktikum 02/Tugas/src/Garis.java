/*Nama File: Garis.Java
 *Deskripsi: berisi atribut dan method class Garis
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 26 Februari 2026 */

import java.lang.Math;
public class Garis {
    /* ATRIBUT */
    Titik awal;
    Titik akhir;
    static int counterGaris;

    /* Method */
    Garis(){
        awal = new Titik();
        akhir = new Titik();
        awal.absis = 0;
        awal.ordinat = 0;
        akhir.absis = 1;
        akhir.ordinat = 1;
        counterGaris++;
    }

    Garis(Titik awal, Titik akhir){
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }

    Titik getAwal(){
        return awal;
    }

    Titik getAkhir(){
        return akhir;
    }

    void setAwal(Titik x){
        awal = x;
    }

    void setAkhir(Titik x){
        akhir = x;
    }
    
    static int getCounterGaris(){
        return counterGaris;
    }

    double Panjang(){
        return Math.sqrt(Math.pow((akhir.getAbsis() - awal.getAbsis()),2) + (Math.pow(akhir.getordinat() - awal.getordinat(), 2)));
    }

    double gradien(){
        return (akhir.getordinat() - awal.getordinat())/(akhir.getAbsis() - awal.getAbsis());
    }

    void Tengah(Titik mid){
        mid = new Titik();
        mid.setAbsis((akhir.getAbsis() + awal.getAbsis())/2);
        mid.setOrdinat((akhir.getordinat() + awal.getordinat())/2);
    }

    void printGaris(){

        System.out.println("(" + awal.getAbsis() + "," + awal.getkuadran() + ")" + "(" + akhir.getAbsis() + "," + akhir.getkuadran() +")");
    }

    boolean isSejajar(Garis G){
        return this.gradien() == G.gradien();
    }

    boolean isTegakLurus(Garis G){
        return this.gradien() * G.gradien() == -1;
    }

String PersamaanGaris() {
    double m = gradien();
    double c = awal.getordinat() - (m * awal.getAbsis());
    return "Persamaan Garis = " + m + "x + " + c;   
    
}

}
