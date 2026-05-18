/*Nama File: DAOManager.Java
 *Deskripsi: berisi kode Class MainDAO
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 18 Mei 2026 */
public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
