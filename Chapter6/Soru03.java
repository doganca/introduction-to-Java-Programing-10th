package Chapter6;

import java.util.Arrays;

public class Soru03 {
	public static void main(String[] args) {
		tersYazma(565);

	}

	private static void tersYazma(int sayi) {
		int basamak = 0;
		int girilenSayi = sayi;
		String deger = "";
		
		while (sayi > 0) {
			basamak = (sayi % 10);
			sayi /= 10;
			deger += basamak;
		}
		if (sayiPolinomMu(deger, girilenSayi)) {
			System.out.println(girilenSayi + " sayisi polinomdur");
		} else {
			System.out.println(girilenSayi + " sayisi polinom degildir");
		}
	}

	private static boolean sayiPolinomMu(String deger, int sayi) {
		String sayiStr = "";
		sayiStr += sayi;
		
		if (sayiStr.equals(deger)) {
			return true;
		} else {
			return false;
		}
		
	}
}
