package GenerikPadaClass;

/*Nama File: Main.Java
 *Deskripsi: berisi kode Main
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 26 Maret 2026 */
public class Main {
    public static void main(String[] args) {
        String nama = "Imut";
        int Angka1 = 10;
        int Angka2 = 20;
        Datum<Integer> Ang1;
        Datum<Integer> Ang2;
        Data<Anabul> Larik;
        Larik = new Data<>();
        Ang1 = new Datum<>();
        Ang2 = new Datum<>();
        Ang1.setIsi(Angka1);
        Ang2.setIsi(Angka2);
        Anabul K = new Kucing(nama, 20);
        Anabul Q = new Anjing("Bravo");
        Datum<Anabul> W; 
        Datum<Anabul> E;
        Datum<Kucing> Kuc1;
        Datum<Kucing> Kuc2;
        W = new Datum<>();
        E = new Datum<>();
        Kuc1 = new Datum<>();
        Kuc2 = new Datum<>();
        E.setIsi(Q);
        K.Bersuara();
        K.Gerak();
        K = new Anjing(nama);
        K.Bersuara();
        K.Gerak();
        K = new Burung(nama);
        K.Bersuara();
        K.Gerak();
        W.setIsi(K);
        W.getIsi().Bersuara();
        W.setIsi(new Anggora(nama, 20));
        // W.getIsi().Gerak();
        W.getIsi().Bersuara();
        E.getIsi().Bersuara();
        OperatorGenerik.tukar(W, E);
        System.out.println("Test Operator Generik");
        W.getIsi().Bersuara();
        E.getIsi().Bersuara();
        System.out.println(Ang1.getIsi());
        System.out.println(Ang2.getIsi());
        OperatorGenerik.tukar(Ang1, Ang2);
        System.out.println(Ang1.getIsi());
        System.out.println(Ang2.getIsi());
        Kuc1.setIsi(new KembangTelon("Jack", 500));
        Kuc2.setIsi(new KembangTelon("Els", 500));
        OperatorGenerik.Bobot2(Kuc1, Kuc2);
        Larik.setIsi(1, K);
        Larik.setIsi(2, Q);
        System.out.println("Nyoba Larik");
        Anabul temp1 = Larik.getIsi(1);
        Anabul temp2 = Larik.getIsi(2);
        temp1.Bersuara();
        temp2.Bersuara();


    }
}
