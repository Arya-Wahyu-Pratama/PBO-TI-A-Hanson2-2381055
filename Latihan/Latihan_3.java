package Latihan;

import java.util.Scanner;

public class Latihan_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan dua bilangan:");
        System.out.print("Bilangan pertama: ");
        int a = scanner.nextInt();
        System.out.print("Bilangan kedua: ");
        int b = scanner.nextInt();

        System.out.println("Pilih operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = (double) a / b;
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
        }

        System.out.printf("Hasil: %d %c %d = %.2f%n", a, operator, b, result);

        scanner.close();
    }
}