package Latihan;

import java.util.Scanner;

public class Latihan_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] bilangan = new int[2];

        System.out.print("Masukkan bilangan pertama: ");
        bilangan[0] = scanner.nextInt();
        
        System.out.print("Masukkan bilangan kedua: ");
        bilangan[1] = scanner.nextInt();

        if (bilangan[0] > bilangan[1]) {
            System.out.println("Bilangan yang lebih besar adalah: " + bilangan[0]);
        } else if (bilangan[0] < bilangan[1]) {
            System.out.println("Bilangan yang lebih besar adalah: " + bilangan[1]);
        } else {
            System.out.println("Kedua bilangan sama.");
        }

        scanner.close();
    }
}