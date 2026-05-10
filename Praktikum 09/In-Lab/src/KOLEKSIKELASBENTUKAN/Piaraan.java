package KOLEKSIKELASBENTUKAN;
/*Nama File: Piaraan.Java
 *Deskripsi: berisi kode Class Piaraan
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 10 Mei 2026 */
import java.util.*;

public class Piaraan {
    /*Atribut */
    private int nbelm;
    private Queue<Anabul> Lanabul;

    /*Method */
    public Piaraan(){
        this.Lanabul= new LinkedList<>();
        this.nbelm= 0;
    }
    public int getNbelm(){
        return nbelm;
    }

    // public void enqueueAnabul(Anabul X){
    //     Lanabul.offer(X);
    //     nbelm++;
    // }

    public boolean isMember(Anabul X){
        return Lanabul.contains(X);
    }

    public Anabul getAnabul(){
        return Lanabul.peek();
    }

    public Anabul dequeueAnabul(){
        Anabul a = Lanabul.poll();
        if (a != null) {
            nbelm --;
        }
        return a;
    }

    public void showAnabul() {
    System.out.println("--- Daftar Panggilan Antrean Anabul ---");
    for (Anabul a : Lanabul) {
            System.out.println("- " + a.getPanggilan());
        }
    }

    public void enqueueAnabul(Anabul X){
        Lanabul.offer(X);
        nbelm++;
    }

        public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public int countAnjing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Anjing) {
                count++;
            }
        }
        return count;
    }


        public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                totalBobot += ((Kucing) a).getBobot();
            }
        }
        return totalBobot;
    }

    public void showJenisAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama() + " (" + a.getClass().getName() + ")");
        }
    }
}
