package BinaryOperator;

public class Perbandingan {
    public static void main(String[] args) {
        int a = 80;
        int b = 70;

        // Sama dengan
        boolean hasilSama = (a == b);
        System.out.println("a == b: " + hasilSama);

        // Lebih kecil dari
        boolean hasilKecilDari = (a < b);
        System.out.println("a < b: " + hasilKecilDari);

        // Lebih besar dari
        boolean hasilBesarDari = (a > b);
        System.out.println("a > b: " + hasilBesarDari);

        // Tidak sama dengan
        boolean hasilTidakSama = (a != b);
        System.out.println("a != b: " + hasilTidakSama);
    }
}

