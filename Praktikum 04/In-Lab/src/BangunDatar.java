/*Nama File: BangunDatar.Java
 *Deskripsi: berisi atribut dan method super class BangunDatar
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 11 Maret 2026 */
public class BangunDatar {
    /*Atribut */
    private int jmlSisi;
    private String warna;
    private String border;

    /*Method */
    public BangunDatar(){
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        setWarna(warna);
        setBorder(border);
        setjmlSisi(jmlSisi);
    }

    public int getjmlSisi(){
        return jmlSisi;
    }   

    public void setjmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;

    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah sisi= " + jmlSisi);
        System.out.println("Warna= " + warna);
        System.out.println("Border= " + border);
    }

}
