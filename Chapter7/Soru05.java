package Chapter7;

import java.util.Scanner;

public class Soru05 {
	/*
	 * (Birbirinden farklı sayıları göster) On tane sayı okuyan ve birbirinden
	 * farklı sayıları aralarında bir boşluk olacak şekilde gösteren bir program
	 * yazınız. (Ör: eğer sayı birçok kez girilmişse bu sayıyı yalnızca bir kez
	 * gösterin.) (İpucu: Okuduğunuz sayı daha önce girilmediyse bunu diziye
	 * ekleyin. Eğer sayı daha önce diziye eklenmişse, bunu atlayın.) Giriş işlemi
	 * sona erdiğinde dizide sadece farklı sayılar olacaktır. Programın örnek
	 * akışını inceleyiniz On sayi giriniz: 1 2 3 2 1 6 3 4 5 2 Birbirinden farkli
	 * olan sayi adedi 6 Farkli sayilar: 1 2 3 6 4 5
	 * 
	 * soruyu yaparken zorlandim
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("On tane sayi giriniz");

		int[] sayilar = sayilariArrayeKaydet(input);
		farkliSayiSayisi(sayilar);
	}

	private static int[] sayilariArrayeKaydet(Scanner input) {
		int[] sayilar = new int[10];
		int sayi;
		for (int i = 0; i < sayilar.length; i++) {
			sayi = input.nextInt();
			sayilar[sayi - 1]++;
		}
		return sayilar;
	}

	private static void farkliSayiSayisi(int[] sayilar) {
		int doluArraySayisi = doluArraySayisi(sayilar);
		System.out.println("Birbirinden farkli olan sayi adeti : " + doluArraySayisi);
		sayilariYazdir(sayilar);
	}


	public static int doluArraySayisi(int[] sayilar) {
		int sayac = 0;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] > 0) {
				sayac++;
			}
		}
		return sayac;
	}
	
	private static void sayilariYazdir(int[] sayilar) {
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i] != 0) {
				System.out.print((i + 1) + " ");
			}
		}
		
	}
}
