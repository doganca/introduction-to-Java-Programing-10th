package Chapter5;

import java.util.Scanner;

public class Soru08 {
	/*
	 * (En yüksek puanı bulma.) Kullanıcıdan toplam öğrenci sayısını ve her
	 * öğrencinin adı ve puanını alan, bunun ardından en yüksek puana sahip
	 * öğrencinin adını gösteren bir program yazınız.
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Toplam ogrenci sayisini giriniz");
		int ogrenciSayisi = input.nextInt();
		
		int enYuksekPuan = 0;
		String enYuksekIsim = " ";

		for (int i = 0; i < ogrenciSayisi; i++) {
			System.out.println("ogrencinin adini ve puanini giriniz");
			String isim = input.next();
			int puan = input.nextInt();
		
			if (puan > enYuksekPuan) {
				enYuksekPuan = puan;
				enYuksekIsim = isim;
			}
		}
		System.out.println("en yuksek puana sahip ogrenci : " + enYuksekIsim + " ,  puani : " + enYuksekPuan);

	}
}
