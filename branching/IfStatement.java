package branching;

import java.util.Scanner;
public class IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nomor hari (1-7):");
        int nomerHari = input.nextInt();

        String namaHari = "";

        if (nomerHari == 1) {
            namaHari = "Minggu";
        } else if (nomerHari == 2) {
            namaHari = "Senin";
        } else if (nomerHari == 3) {
            namaHari = "Selasa";
        } else if (nomerHari == 4) {
            namaHari = "Rabu";
        } else if (nomerHari == 5) {
            namaHari = "Kamis";
        } else if (nomerHari == 6) {
            namaHari = "Jumat";
        } else if (nomerHari == 7) {
            namaHari = "Sabtu";
        } else {
            namaHari = "Nomor hari tidak valid";
        }

        System.out.println("Hari ke-" + nomerHari + " adalah " + namaHari);

        input.close();
    }
}

