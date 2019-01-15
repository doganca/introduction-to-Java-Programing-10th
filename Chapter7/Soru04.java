package Chapter7;

import java.util.Scanner;

public class Soru04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Notlari giriniz, negatif sayi girince not girisi sonlanacak");

		int[] notlar = new int[100];
		int sayac = 0;
		while (true) {
			int not = input.nextInt();
			if (not < 0) {
				break;
			}
			notlar[sayac] = not;
			sayac++;
		}

		ortalamaCevabi(notlar, sayac);
	}

	public static void ortalamaCevabi(int[] not, int sayac) {
		int[] notlar = notlariYeniDiziyeKopyala(not, sayac);
		int ortalama = ortalamaHesapla(notlar);
		int ortalamaUstunde = ortalamaUstunde(ortalama, notlar);
		int ortalamaEsit = ortalamaEsit(ortalama, notlar);
		int ortalamaAltinda = ortalamaAltinda(ortalama, notlar);

		System.out.println(sayac + " not girdiniz, " + ortalama + " not ortalamasi \n" + ortalamaUstunde
				+ " tane not ortalamanin ustunde \n" + ortalamaEsit + " tane not ortalamaya esit \n" + ortalamaAltinda
				+ " tane not ortalamnin altinda");
	}

	private static int[] notlariYeniDiziyeKopyala(int[] not, int sayac) {
		int[] notlar = new int[sayac];

		for (int i = 0; i < notlar.length; i++) {
			notlar[i] = not[i];
		}
		return notlar;
	}

	private static int ortalamaHesapla(int[] notlar) {
		int ortalama = 0;
		for (int i = 0; i < notlar.length; i++) {
			ortalama += notlar[i];
		}
		return ortalama / notlar.length;
	}

	private static int ortalamaUstunde(int ortalama, int[] notlar) {
		int sayac = 0;
		for (int i = 0; i < notlar.length; i++) {
			if (notlar[i] > ortalama) {
				sayac++;
			}
		}
		return sayac;
	}

	private static int ortalamaEsit(int ortalama, int[] notlar) {
		int sayac = 0;
		for (int i = 0; i < notlar.length; i++) {
			if (notlar[i] == ortalama) {
				sayac++;
			}
		}
		return sayac;
	}

	private static int ortalamaAltinda(int ortalama, int[] notlar) {
		int sayac = 0;
		for (int i = 0; i < notlar.length; i++) {
			if (notlar[i] < ortalama) {
				sayac++;
			}
		}
		return sayac;
	}
}
