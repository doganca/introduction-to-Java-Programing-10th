package tekrarSoruCozumleri.chapter5;

import java.util.Scanner;

public class Soru17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");

        int sayi = input.nextInt();

        for (int i = 1; i <= sayi ; i++) {
            for (int j = sayi - i; j > 0 ; j--) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
