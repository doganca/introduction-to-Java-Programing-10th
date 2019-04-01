package tekrarSoruCozumleri.chapter6;

import java.util.Scanner;

public class Soru03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ters cevrilicek sayiyi giriniz : ");
        int sayi = input.nextInt();

        int tersineCevrilmisSayi = reverse(sayi);

        if (sayiPolidromMu(tersineCevrilmisSayi, sayi)) {
            System.out.println("Sayi polidrom");
        } else {
            System.out.println("Sayi polidrom degil");
        }
    }

    private static boolean sayiPolidromMu(int tersineCevrilmisSayi, int sayi) {
        return tersineCevrilmisSayi == sayi ? true : false;
    }

    public static int reverse(int TersCevrilecekSayi) {
        String tersSayi = sayiyiTersCevir(TersCevrilecekSayi);

        int sayi = Integer.parseInt(tersSayi);

        return sayi;
    }

    private static String sayiyiTersCevir(int tersCevirilecekSayi) {
        String sayi = "";

        while (tersCevirilecekSayi != 0) {
            sayi += tersCevirilecekSayi % 10;
            tersCevirilecekSayi /= 10;
        }

        return sayi;
    }
}
