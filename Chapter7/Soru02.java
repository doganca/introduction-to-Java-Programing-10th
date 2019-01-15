package Chapter7;

import java.util.Scanner;

public class Soru02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] girilenSayilar = new double[10];

		System.out.println("On tane sayi giriniz");
		for (int i = 0; i < girilenSayilar.length; i++) {
			girilenSayilar[i] = input.nextDouble();
		}

		double[] tersSayilar = sayilariTersCevir(girilenSayilar);
		sayilariYazdir(tersSayilar);
	}

	private static double[] sayilariTersCevir(double[] girilenSayilar) {
		double[] sayilarTersYazimi = new double[girilenSayilar.length];

		for (int i = girilenSayilar.length - 1, j = 0; i >= 0; i--, j++) {
			sayilarTersYazimi[j] = girilenSayilar[i];
		}
		return sayilarTersYazimi;
	}

	private static void sayilariYazdir(double[] tersSayilar) {
		for (int i = 0; i < tersSayilar.length; i++) {
			System.out.print((int)tersSayilar[i] + ", ");
		}

	}
}
