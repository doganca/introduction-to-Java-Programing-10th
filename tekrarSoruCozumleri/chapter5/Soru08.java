package tekrarSoruCozumleri.chapter5;

import java.util.Scanner;

public class Soru08 {
    /*
     *  Kullanıcıdan toplam öğrenci sayısını  ve her öğrencinin adı ve puanını alan,
     *  bunun ardından en yüksek puana sahip öğrencinin adını gösteren bir program yazınız.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ogrenci sayisini giriniz");
        int ogrenciSayisi = input.nextInt();

        int enYuksekPuan = 0;
        String enYuksekPuanAlanOgrenciAdi = "";

        String ogrenciAdi = "";
        int puan = 0;

        System.out.println("Ogrenci adini ve puanini giriniz : ");
        for (int i = 0; i < ogrenciSayisi; i++) {
            ogrenciAdi = input.next();
            puan = input.nextInt();

            if (puan > enYuksekPuan) {
                enYuksekPuan = puan;
                enYuksekPuanAlanOgrenciAdi = ogrenciAdi;
            }
        }

        System.out.println("En yuksek puan alan ogrenci : " + enYuksekPuanAlanOgrenciAdi + " , puani : " + enYuksekPuan);
    }
}
