/*Nama File: PolimorfismeCoersion.Java
 *Deskripsi: berisi kode untuk mencoba Coersion
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 25 Maret 2026 */
public class PolimorfismeCoersion {
    public static void main(String[] args) {
        
        int nilaiInt = 65;
        System.out.println("Nilai Awal(Integer): " + nilaiInt);
        
        char nilaiChar = (char) nilaiInt;
        System.out.println("Casting ke Character: " + nilaiChar);
        
        double nilaiReal = (double) nilaiInt;
        System.out.println("Casting ke Real: " + nilaiReal);
        
        String strAngka = "100";
        int konversiInt = Integer.parseInt(strAngka);
        System.out.println("String '100' ke integer =" + konversiInt);
        
        double konversiDouble = Double.parseDouble(strAngka);
        System.out.println("String '100' ke double =" + konversiDouble);
        
        int angka = 200;
        String konversiString = Integer.toString(angka);
        System.out.println("Integer 200 ke String =" + konversiString);
        
        System.out.println("\nBagian B");
        
        int nilaiIntBaru = (int) nilaiReal;
        System.out.println("Real =" + nilaiReal);
        System.out.println("Real to Integer ="+nilaiIntBaru); 
        
        System.out.println("\nBagian C");
        
        String X = "1234";
        String Y = "5678";
        
        String S = X + Y;
        System.out.println("Konkatenasi X + Y = " + S);
        
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Penjumlahan X + Y " + Z);
        
        System.out.println("\nBagian D");
        
        String P = "12.34";
        String Q = "56.78";
        
        String R = P + Q;
        System.out.println("Konkatenasi P + Q = " + R);
        
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Penjumlahan P + Q (casting String ke double): " + D);
        
        System.out.println("\nBagian E");
        
        Integer A = Integer.parseInt(S);
        System.out.println("Nilai S = " + S);
        System.out.println("Nilai A = " + A);
        
        System.out.println("\nBagian F");
        
        String T = A.toString();
        System.out.println("Nilai A = " + A);
        System.out.println("Nilai T = " + T);

    }
}