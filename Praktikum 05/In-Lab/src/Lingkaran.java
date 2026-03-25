/*Nama File: iingkaran.Java
 *Deskripsi: berisi atribut dan method Sub class Lingkaran
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 25 Maret 2026 */
public class Lingkaran extends BangunDatar implements IResize{
    /*Atribut */
    private double jari;

    /*Method */ 
    public Lingkaran(){
        setjmlSisi(1);
    }

    public Lingkaran(double jari, String warna, String border){
        super(1, warna, border);
        this.jari = jari;
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    @Override
    public double getLuas() {
        return 3.14 * jari * jari;
    }

    @Override
    public double getKeliling() {
        return 2 * 3.14 * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-Jari" + jari);
    }

        @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;  
    }

    @Override
    public void zoom(int percent) {
        jari = jari * percent/100;
    }
}
