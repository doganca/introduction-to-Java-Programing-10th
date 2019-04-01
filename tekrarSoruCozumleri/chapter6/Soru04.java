package tekrarSoruCozumleri.chapter6;

import java.util.Scanner;

public class Soru04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tersini gostermek istediginiz sayiyi giriniz : ");

        int sayi = input.nextInt();

        String tersi = reverse(sayi);

        System.out.println(sayi + " nin tersi " + tersi);

    }

    public static String reverse(int sayi) {
        String tersi = "";

        while (sayi != 0) {
            tersi += sayi % 10;
            sayi /= 10;
        }

        return tersi;
    }
}
