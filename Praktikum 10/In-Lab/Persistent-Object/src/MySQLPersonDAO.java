/*Nama File: MySQLPersonDAO.Java
 *Deskripsi: berisi kode Class MainDAO
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 18 Mei 2026 */
// import library untuk koneksi database
import java.sql.*;

// implementasi PersonDAO untuk MySQL
public class MySQLPersonDAO implements PersonDAO{

    // method untuk menyimpan person ke database
    public void savePerson(Person person) throws Exception{
        //ambil nama person
        String name = person.getName();
        
        //membuat koneksi, nama db,user,password menyesuaikan
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost/pbo","root","Ibrahim20!");
        
        //kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES ('"+name+"')";
        
        // debug query
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        
        //tutup koneksi database
        con.close();
    }
}