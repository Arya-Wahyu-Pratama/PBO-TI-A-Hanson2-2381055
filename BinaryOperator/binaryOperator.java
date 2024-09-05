package BinaryOperator;

public class binaryOperator {
    public static void main(String[] args){
        // 1. Operator asigment dasar
        int angka = 10;
        String name = "Mala";
        System.out.println("Nilai angka :"+ angka);
        System.out.println("Nama :"+ name);

        int x = 5;
        x += 3;
        System.out.println("Nilai x setelah += 3:"+ x);
        int y = 3;
        y -= 2;
        System.out.println("Nilai y setelah -= 2:"+ y);
        int z = 6;
        z *= 3;
        System.out.println("Nilai z setelah *= 3:"+ z);
        int a = 40;
        a /= 2;
        System.out.println("Nilai a setelah /= 2:"+ a);
        int b = 30;
        b %= 2;
        System.out.println("Nilai b setelah += 2:"+ b);
    }
}
