package GenerikPadaClass;
/*Nama File: Datum.Java
 *Deskripsi: berisi kode Class Datum
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 3 Mei 2026 */
public class Datum<T> {
    /*Atribut*/
    private T isi;
    /*Method */
    public T getIsi() {
        return isi;
    }
    
    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }
}
