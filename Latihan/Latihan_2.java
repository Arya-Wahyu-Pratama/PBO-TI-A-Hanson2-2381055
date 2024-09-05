package Latihan;

import java.util.Scanner;

public class Latihan_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];
        System.out.println("Masukkan 3 bilangan:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Bilangan yang paling besar adalah: " + largest);

        scanner.close();
    }
}
