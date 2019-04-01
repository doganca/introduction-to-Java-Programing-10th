package tekrarSoruCozumleri.chapter7;

import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ogrenci sayisini giriniz : ");
        int ogrenciSayisi = input.nextInt();

        int[] ogrenciler = arrayOlustur(ogrenciSayisi);

        System.out.println(ogrenciSayisi + " puan giriniz");
        notlariGir(ogrenciler,input);
       int enIyiNot = enIyiNot(ogrenciler);
        notlariYazdir(ogrenciler, enIyiNot);
    }

    private static void notlariYazdir(int[] ogrenciler, int eniyiNot) {
        for (int i = 0; i < ogrenciler.length ; i++) {
            System.out.println(i + " ogrencinin puani " + ogrenciler[i] + " notu " + notuHesapla(ogrenciler[i],eniyiNot));
        }
    }

    private static String notuHesapla(int i, int enIyiNot) {
        if(i >= (enIyiNot - 10)){
            return "A";
        }else if (i >= (enIyiNot - 20)){
            return "B";
        }else if (i >= enIyiNot - 30){
            return "C";
        }else if (i >= enIyiNot - 40){
            return "D";
        }else {
            return "F";
        }
    }

    private static void notlariGir(int[] ogrenciler, Scanner input) {
        for (int i = 0; i < ogrenciler.length; i++) {
            ogrenciler[i] = input.nextInt();
        }
    }

    public static int[] arrayOlustur(int arrayBoyutu){
        int[] array = new int[arrayBoyutu];

        return array;
    }

    public static int enIyiNot(int[] ogrenciler){
        int eniyi = 0;
        for (int i = 0; i <ogrenciler.length ; i++) {
            if(eniyi < ogrenciler[i]){
                eniyi = ogrenciler[i];
            }
        }
        return eniyi;
    }
}
