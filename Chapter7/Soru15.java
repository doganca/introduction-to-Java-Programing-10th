package Chapter7;

import java.util.Scanner;

public class Soru15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("10 sayi giriniz");

		int[] sayilar = new int[10];

		sayilariDiziyeEkle(input, sayilar);

		sayilariYazdir(sayilar);

		int[] farkliSayilar = farkliSayilariBul(sayilar);

		System.out.println();

		sayilariYazdir(farkliSayilar);

	}

	public static int[] farkliSayilariBul(int[] sayilar) {
		int[] farkliSayilar = new int[10];

		for (int i = 0; i < farkliSayilar.length; i++) {
			int sayi = sayilar[i];
			for (int j = 0; j < farkliSayilar.length; j++) {
				if (!sayiVarMi(sayi, farkliSayilar)) {
					farkliSayilar[i] = sayi;
				}
			}
		}
		return farkliSayilar;
	}

	public static void sayilariYazdir(int[] sayilar) {
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] > 0)
				System.out.print(sayilar[i] + " ");
		}
	}

	public static void sayilariDiziyeEkle(Scanner input, int[] sayilar) {
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = input.nextInt();
		}
	}

	private static boolean sayiVarMi(int sayi, int[] farkliSayilar) {
		for (int i = 0; i < farkliSayilar.length; i++) {
			if (sayi == farkliSayilar[i]) {
				return true;
			}
		}

		return false;
	}
}