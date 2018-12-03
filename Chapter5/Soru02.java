package Chapter5;

import java.util.Scanner;

public class Soru02 {
	/*
	 * (Toplama) Madde 5.4 SubtractionQuizLoop.java beş adet rastgele çıkarma sorusu
	 * üretmektedir. Programı tekrar düzenleyerek 1 ve 15 tam sayıları arasında, on
	 * tane rastgele toplama sorusu oluşturun. Toplam sayıyı ve test zamanını
	 * gösterin.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int soruSayisi = 0; // toplam soru sayisini tutuyorum ilerde donguyu bitirecek olan sayi
		int dogruCevap = 0; // kullanicinin dogru cevap verdigi soru sayisi
		int yanlisCevap = 0; // kullanicinin yanlis cevap verdigi soru sayisi

		long baslayanMiliSaniye = System.currentTimeMillis(); // 1970 den gunumuze gecen milisaniyeyi aldim
		long miliSaniyeToNormalSaniye = baslayanMiliSaniye / 1000; // gecen mili saniyeyi saniyeye donusturdum

		while (soruSayisi != 10) { // soru sayisi 10 esit oldugunda donguyu bitiriyorum
			int sayi1 = (int) (Math.random() * 16); // 1 - 25 arasinda rasgele sayi olusturdum
			int sayi2 = (int) (Math.random() * 16);

			System.out.println(sayi1 + " + " + sayi2 + " = ? "); // kullaniciya soruyu soruyorum
			int cevap = input.nextInt(); // kullanicidan cevap aliyorum

			if (cevap == (sayi1 + sayi2)) { // eger cevap dogru ise dogru cevap degiskenini bir arttiriyorum
				dogruCevap++;
			} else { // eger cevap yanlis ise yanlis cevap degiskenini bir eksiltiyorum
				yanlisCevap++;
			}
			soruSayisi++; // sorulan soru sayisi degiskenini bir arttiriyorum
		}

		long kullaniciMiliSaniye = System.currentTimeMillis(); // kullanici ilsemi bitirdiginde gecen milisaniye
		long kullaniciSaniye = kullaniciMiliSaniye / 1000; // milisaniye saniye donusumu
		long gecenSaniye = kullaniciSaniye - miliSaniyeToNormalSaniye; // kullanici saniyesi ile program baslangiz
																		// saniyesini cikariyorum

		System.out.println("Toplam soru sayisi : " + soruSayisi + "\nDogru cevap sayisi : " + dogruCevap
				+ "\nYanlis cevap sayisi : " + yanlisCevap + "\nToplam gecen sure : " + gecenSaniye + " saniyedir.");
	}

}
