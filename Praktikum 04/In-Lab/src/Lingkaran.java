/*Nama File: iingkaran.Java
 *Deskripsi: berisi atribut dan method Sub class Lingkaran
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 11 Maret 2026 */
public class Lingkaran extends BangunDatar{
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

    public double getLuas(){
        return jari * (1/4) * 3.14;
    }

    public double getKeliling(){
        return 2*3.14*jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-Jari" + jari);
    }
}
