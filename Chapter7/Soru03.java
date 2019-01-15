package Chapter7;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] sayilar = new int[100];

		sayilariDiziyeEkle(input, sayilar);
		sayiTekrariniYazdir(sayilar);
	}

	public static void sayilariDiziyeEkle(Scanner input, int[] sayilar) {
		System.out.println("0-100 kadar sayi giriniz, 0 girince sayi girisi sonlanacak");
		int sayi;
		do {
			sayi = input.nextInt();
			if (sayiKontrol(sayi)) {
				sayilar[sayi - 1]++;
			}
		} while (sayi != 0);
	}

	private static boolean sayiKontrol(int sayi) {
		if (sayi >= 1 && sayi <= 100) {
			return true;
		}
		return false;
	}

	private static void sayiTekrariniYazdir(int[] sayilar) {
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] > 0) {
				System.out.println((i + 1) + " sayisi " + sayilar[i] + " kere yazildi");
			}
		}
	}
}