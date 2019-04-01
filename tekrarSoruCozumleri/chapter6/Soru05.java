package tekrarSoruCozumleri.chapter6;

import java.util.Scanner;

public class Soru05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Siralamak istediginiz sayi adetini giriniz");
        int kacSayi = input.nextInt();

        int[] sayi = new int[kacSayi];

        System.out.println("Sayilari giriniz");
        sayilariEkle(input, sayi);

        sayilariSirala(sayi);

        saylariYazdir(sayi);
    }

    private static void saylariYazdir(int[] sayi) {
        for (int i = 0; i < sayi.length; i++) {
            System.out.print(sayi[i] + " ");
        }
    }

    private static void sayilariSirala(int[] sayi) {
        for (int i = 0; i < sayi.length; i++) {
            for (int j = i + 1; j < sayi.length; j++) {
                if (sayi[i] > sayi[j]) {
                    int temp = sayi[i];
                    sayi[i] = sayi[j];
                    sayi[j] = temp;
                }
            }
        }
    }

    private static void sayilariEkle(Scanner input, int[] sayi) {
        for (int i = 0; i < sayi.length; i++) sayi[i] = input.nextInt();
    }
}
