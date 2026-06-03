/*Nama File: LambdaList.Java
 *Deskripsi: Ekspersi Lambda pada list
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 3 Juni 2026 */
import java.util.ArrayList;
public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Ichan");
        mahasiswaList.add("Baim");
        mahasiswaList.add("Fazl");
        mahasiswaList.add("Adam");
        mahasiswaList.add("Raffa");

        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }

}
