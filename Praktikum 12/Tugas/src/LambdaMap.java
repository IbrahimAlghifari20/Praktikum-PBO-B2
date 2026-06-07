import java.util.HashMap;
import java.util.Map;

/*Nama File: LambdaMap.Java
 *Deskripsi: Deskripsi: Implementasi lambda pada Map untuk menampilkan key (NIM) dan value (nama mahasiswa)
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 3 Juni 2026 */
public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        
        mahasiswaMap.put("240001", "Ichan");
        mahasiswaMap.put("240002", "Baim");
        mahasiswaMap.put("240003", "Fazl");
        mahasiswaMap.put("240004", "Adam");
        
        System.out.println("Daftar Mahasiswa (NIM : Nama):");
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + " : " + nama));
    }
}