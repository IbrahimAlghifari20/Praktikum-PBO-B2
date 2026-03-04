/*Nama File: Titik.Java
 *Deskripsi: berisi atribut dan method class Titik
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 25 Februari 2026 */

public class Titik {

    /* ATRIBUT */
    double absis;
    double ordinat;

    /* Method */
    Titik(){
        absis = 0;
        ordinat = 0;
    }

    Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
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

    double getkuadran(){
        if (absis > 0 && ordinat >0) {
            return 1;
        }else if (absis > 0 && ordinat < 0) {
                return 4;
            }else if (absis < 0 && ordinat < 0) {
                  return 3;  
                }else if (absis < 0 && ordinat > 0) {
                        return 2;
                    }else
                        return 0;
                }

    double getjarakpusat(){
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    double getjarak(Titik T){
        return Math.sqrt(Math.pow(this.absis - T.getAbsis(), 2) + Math.pow(this.ordinat - T.getordinat(), 2));
    }
    
    void refleksiX(){
        ordinat = ordinat * -1;
    }

    void refleksiY(){
        absis = absis * -1;
    }

    Titik getrefleksiX(){
        Titik temp = new Titik(this.absis, this.ordinat * -1); 
        return temp;
    }

    Titik getrefleksiY(){
        Titik temp = new Titik(this.absis * -1, this.ordinat); 
        return temp;
    }
    }
        
    





