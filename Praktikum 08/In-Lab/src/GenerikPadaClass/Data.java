package GenerikPadaClass;
/*Nama File: Data.Java
 *Deskripsi: berisi kode Class Data
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 3 Mei 2026 */
public class Data<T> {
    /*Atribut */
    private T[] ruang;
    private int banyak;
    int Kapasitas = 100;
    
    /*Method */
    public Data() {
        ruang = (T[]) new Object[Kapasitas]; 
        banyak = 0;
    }
    
    public void setIsi(int posisi, T x) {
        if (posisi >= 1 && posisi <= Kapasitas) {
            if (ruang[posisi-1] == null) {
                banyak++;
            }
            ruang[posisi-1] = x;
        } 
    }
    
    public T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= Kapasitas) {
            return ruang[posisi-1];
        } else {
            System.out.println("Posisi diluar jangkauan");
            return null;
        }
    }
    
    public int getSize() {
        return banyak;
    }
}