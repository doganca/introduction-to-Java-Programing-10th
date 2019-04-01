package tekrarSoruCozumleri.chapter5;

import java.util.Scanner;

public class Soru02 {
    // 1 ve 15 tam sayıları arasında,
    // on tane rastgele toplama sorusu oluşturun. Toplam sayıyı ve test zamanını gösterin.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kacSoru = 0;
        int dogruCevapSayisi = 0;

        long baslangicZamani = System.currentTimeMillis();

        while (kacSoru != 10) {
            int sayi1 = (int) (Math.random() * 14) + 1;
            int sayi2 = (int) (Math.random() * 14) + 1;
            System.out.println(sayi1 + " + " + sayi2 + " ?");
            int cevap = input.nextInt();
            if (cevap == (sayi1 + sayi2)) {
                dogruCevapSayisi++;
            }
            kacSoru++;
        }

        long bitisZamani = System.currentTimeMillis();
        int soruCozmeSuresi = ((int) (bitisZamani - baslangicZamani)) / 1000;

        System.out.println("Dogru bildiginiz soru sayisi : " + dogruCevapSayisi +
                "\nYanlis soru sayisi : " + (kacSoru - dogruCevapSayisi) +
                "\nSoru cozme zamani " + soruCozmeSuresi + " saniyedir ");
    }
}
