/*Nama File: MainDao.Java
 *Deskripsi: berisi kode Class MainDAO
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 18 Mei 2026 */

public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Ichan");
        DAOManager m = new DAOManager();

        m.setPersonDAO(new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
