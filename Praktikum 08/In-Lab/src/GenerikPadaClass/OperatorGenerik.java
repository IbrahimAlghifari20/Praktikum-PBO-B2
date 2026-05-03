package GenerikPadaClass;
/*Nama File: OperatorGenerik.Java
 *Deskripsi: berisi kode Class OperatorGenerik
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 3 Mei 2026 */
public class OperatorGenerik {
    /*Method */
    public static <T> void tukar(Datum<T> a, Datum<T> b){
        T Temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(Temp);

    }
    public static <T> void Bobot2(Datum<? extends Kucing> a, Datum<? extends Kucing> b){
        System.out.println("Bobot Total = " + (a.getIsi().getBobot() + b.getIsi().getBobot()));
    }
}
