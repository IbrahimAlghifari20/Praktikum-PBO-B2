package KOLEKSIKELASBENTUKAN;

public class Main {
    public static void main(String[] args) {
        Piaraan Hewan = new Piaraan();
        Anabul A = new Kucing("Jack", 100, "Antek Asing");
        Anabul B = new Anjing("Ngabers", "WIWOK");
        Anabul C = new Burung("Johnny", "Yes Papa");

        Hewan.enqueueAnabul(A);
        Hewan.enqueueAnabul(B);
        Hewan.enqueueAnabul(C);

        Hewan.showAnabul();

        Anabul D = new Anggora("Gufron",100, "Syududu");

        Hewan.enqueueAnabul(D);

        Hewan.showAnabul();
    }
}
