/*Nama File: Titik.Java
 *Deskripsi: berisi atribut dan method class Titik
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 19 Februari 2026 */

public class Titik {

    /* ATRIBUT */
    double absis;
    double ordinat;

    /* Method */
    Titik(){
        absis = 0;
        ordinat = 0;
    }
    double getAbsis() {
        return absis;
    }
    double getordinat(){
        return ordinat;
    }
    
    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double x){
        ordinat = x;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}



