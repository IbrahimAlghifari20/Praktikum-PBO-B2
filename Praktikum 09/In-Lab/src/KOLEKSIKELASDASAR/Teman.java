package KOLEKSIKELASDASAR;

import java.util.ArrayList;

public class Teman {
    private int nbelm;
    private ArrayList<String> Lnama;

    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    public int getNbelm(){
        return nbelm;
    }
    public void setNama(int idx, String Nama){
        Lnama.set(idx, Nama);
    }

    public String getnama(int idx){
        return Lnama.get(idx);  
    }

    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    public void delNama(String nama){
        if (Lnama.contains(nama)) {
            Lnama.remove(nama);
            nbelm--;
        }
    }

    public boolean isMember(String Nama){
        return Lnama.contains(Nama);
    }

    public void gantiNama(String Nama,String NamaBaru){
        int idx = Lnama.indexOf(Nama);
        if (idx != -1) {
            Lnama.set(idx, NamaBaru);
        }
    }

    public Integer countNama(String Nama){
        Integer count = 0;
        for (String S : Lnama) {
            if (S.equals(Nama)) {
                count ++;
            }
        }
        return count;
    }

    public void showTeman(){
        for (int i = 0; i < nbelm; i++) {
            System.out.println(Lnama.get(i) + "\n");
        }
    }

}
