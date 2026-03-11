/*Nama File: Persegi.Java
 *Deskripsi: berisi atribut dan method sub class Persegi
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 11 Maret 2026 */
import java.lang.Math;

public class Persegi extends BangunDatar {
    /*Atribut */
    private double sisi;

    /*Method */
    public Persegi(){
        setjmlSisi(4);
    }

    public Persegi(double sisi, String warna, String Border){
        super(4, warna, Border);
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi= sisi;
    }

    public double getLuas(){
        return sisi*sisi;
    }

    public double getKeliling(){
        return 2*(sisi * sisi);
    }

    public double getDiagonal(){
        return Math.sqrt(2) * sisi;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi = " + sisi);
    }


}
