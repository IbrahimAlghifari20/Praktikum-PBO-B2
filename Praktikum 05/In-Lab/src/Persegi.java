/*Nama File: Persegi.Java
 *Deskripsi: berisi atribut dan method sub class Persegi
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 25 Maret 2026 */
import java.lang.Math;

public class Persegi extends BangunDatar implements IResize{
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

    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;  
    }

    @Override
    public void zoom(int percent) {
        sisi = sisi * percent/100;
    }


}
