package tekrarSoruCozumleri.chapter5;

import java.util.Scanner;

public class Soru09 {
    /*
     * Kullanıcıdan toplam öğrenci sayısını  ve her öğrencinin adı ve puanını alan,
     * bunun ardından en yüksek ve en yüksek ikinci puana sahip öğrencilerin
     * adını ve puanını gösteren bir program yazınız.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Toplam ogrenci sayisini giriniz");
        int ogrenciSayisi = input.nextInt();

        String ogrenciAdi = "";
        int ogrenciPuan = 0;

        String enYuksekIkinciPuanAlanOgrenciIsmi = "";
        int enYuksekIkinciPuan = 0;

        String enYuksekPuanAlanOgrenci = "";
        int enYuksekPuan = 0;

        for (int i = 0; i < ogrenciSayisi; i++) {
            ogrenciAdi = input.next();
            ogrenciPuan = input.nextInt();

            if (ogrenciPuan > enYuksekPuan) {
                enYuksekIkinciPuan = enYuksekPuan;
                enYuksekIkinciPuanAlanOgrenciIsmi = enYuksekPuanAlanOgrenci;

                enYuksekPuan = ogrenciPuan;
                enYuksekPuanAlanOgrenci = ogrenciAdi;
            }
        }

        System.out.println("En yuksek puan ogrenci : " + enYuksekPuanAlanOgrenci + " , puani : " + enYuksekPuan);
        System.out.println("En yuksek puan  ikinci ogrenci : " + enYuksekIkinciPuanAlanOgrenciIsmi + " , puani : " + enYuksekIkinciPuan);

    }
}
