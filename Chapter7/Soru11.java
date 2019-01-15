package Chapter7;

import java.util.Scanner;

public class Soru11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("10 sayi giriniz");
		double[] sayilar = diziyeDegerEkle(input);
		ortalamaBul(sayilar);
		standartSapma(sayilar);

	}


	public static double[] diziyeDegerEkle(Scanner input) {
		final int DIZI_BUYUKLUGU = 10;
		double[] sayilar = new double[DIZI_BUYUKLUGU];
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = input.nextDouble();
		}
		return sayilar;
	}

	private static void ortalamaBul(double[] sayilar) {
		double toplam = sayilarinToplami(sayilar);

		double ortalama = toplam / sayilar.length;
		System.out.printf("Dizinin ortalamasi : %2.2f \n", ortalama);
	}

	public static double sayilarinToplami(double[] sayilar) {
		double toplam = 0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}
		return toplam;
	}
	
	private static void standartSapma(double[] sayilar) {
		double sayilarinToplami = sayilarinToplami(sayilar);
		double sayrilarinUsToplami = standartSapmaToplami(sayilar);
		
		double standartSapma = Math.sqrt((sayrilarinUsToplami - (Math.pow(sayilarinToplami, 2) / sayilar.length)) / (sayilar.length - 1));
		
		System.out.printf("Sayilarin Standart Sapmasi : %2.5f", standartSapma);
		
	}
	
	private static double standartSapmaToplami(double[] sayilar) {
		double toplam = 0;
		
		for (int i = 0; i < sayilar.length; i++) {
			toplam += Math.pow(sayilar[i], 2);
		}
		
		return toplam;
		
		
		
	}

}
