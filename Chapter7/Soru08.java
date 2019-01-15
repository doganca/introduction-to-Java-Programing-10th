package Chapter7;

import java.util.Scanner;

public class Soru08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("10 adet sayi giriniz");

		double[] sayilar = new double[10];

		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = input.nextDouble();
		}

		System.out.println(dizininOrtalamasi(sayilar));
	}

	static int dizininOrtalamasi(int[] sayi) {
		int[] sayilar = new int[10];
		int ortalama = 0;
		for (int i = 0; i < sayi.length; i++) {
			ortalama += sayilar[i];
		}

		return ortalama / sayilar.length;
	}

	static double dizininOrtalamasi(double[] sayi) {
		double[] sayilar = new double[10];
		double ortalama = 0;
		for (int i = 0; i < sayilar.length; i++) {
			ortalama += sayi[i];
		}
		return ortalama / sayilar.length;
	}
}
