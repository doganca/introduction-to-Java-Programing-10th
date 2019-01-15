package Chapter7;

import java.util.Scanner;

public class Soru14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("5 adet sayi giriniz");

		int[] sayilar = sayilariEkle(input);
		getGcd(sayilar);
	}

	public static int[] sayilariEkle(Scanner input) {
		int[] sayilar = new int[5];

		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = input.nextInt();
		}

		return sayilar;
	}

	private static void getGcd(int[] sayilar) {
		int obeb = 1;
		int bolen = 2;

		int enKucukSayi = enKucukSayi(sayilar);

		while (bolen <= enKucukSayi) {
			if (hepsiniBoluyorMu(sayilar, bolen)) {
				obeb = bolen;
			}
			bolen++;
		}

		System.out.println("obeb : " + obeb);

	}

	private static int enKucukSayi(int[] sayilar) {
		int enKucukSayi = sayilar[0];

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] <= enKucukSayi) {
				enKucukSayi = sayilar[i];
			}
		}
		return enKucukSayi;
	}

	private static boolean hepsiniBoluyorMu(int[] i, int bolen) {
		for (int j : i) {
			if (j % bolen != 0) {
				return false;
			}
		}
		return true;
	}

}
