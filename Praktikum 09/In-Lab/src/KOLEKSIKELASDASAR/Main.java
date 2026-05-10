package KOLEKSIKELASDASAR;

public class Main {
    public static void main(String[] args) {
        Teman t = new Teman();
        t.addNama("Ichan");
        t.addNama("Bang Rap");
        t.addNama("Fazl");
        t.addNama("Adam");

        t.showTeman();
        System.out.println("Jumlah teman: " + t.getNbelm());
    }
}
