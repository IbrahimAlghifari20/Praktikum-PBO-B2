/*Nama File: Person.Java
 *Deskripsi: berisi kode Class Person
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 18 Mei 2026 */
public class Person {
    /*Atribut */
    private int id;
    private String name;

    public Person (String N){
        name = N;
    }

    
    public Person (int i, String N){
        id = i;
        name = N;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
