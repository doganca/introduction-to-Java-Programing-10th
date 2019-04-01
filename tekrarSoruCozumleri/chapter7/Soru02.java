package tekrarSoruCozumleri.chapter7;

import java.util.Scanner;

public class Soru02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" 10 tane sayi giriniz");

        int[] sayilar = new int[10];

        sayileriGir(input, sayilar);

        String[] sayilarTerstenYazilis = new String[10];

        reverse(sayilar, sayilarTerstenYazilis);

        System.out.println(" Girilen sayi ---------- Tersen yazilisi");
        for (int i = 0; i < sayilar.length ; i++) {
            System.out.println(sayilar[i] + " ------------ " + sayilarTerstenYazilis[i]);
        }
    }

    private static void reverse(int[] sayilar, String[] sayilarTerstenYazilis) {
        for (int i = 0; i < sayilar.length; i++) {
            sayilarTerstenYazilis[i] = reverse(sayilar[i]);
        }
    }

    private static void sayileriGir(Scanner input, int[] sayilar) {
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = input.nextInt();
        }
    }


    public static String reverse(int sayi) {
        String sayiStr = "";

        while (sayi != 0) {
            sayiStr += sayi % 10;
            sayi /= 10;
        }

        return sayiStr;
    }
}
