package Chapter6;

import java.util.Scanner;

public class Soru31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Kredi karti numarasi giriniz ");
		long kartNumarasi = input.nextLong();

		kartGecerliMi(kartNumarasi);

	}

	private static void kartGecerliMi(long kartNumarasi) {
		if (sayiUzunlugu(kartNumarasi) && sayilarToplami(kartNumarasi)) {
			System.out.println("Kart gecerli");
		} else {
			System.out.println("Kart gecersiz");
		}

	}

	private static boolean sayiUzunlugu(long kartNumarasi) {
		String kart = kartNumarasi + "";
		if (kart.length() >= 13 && kart.length() <= 16) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean sayilarToplami(long kartNumarasi) {
		int sayilarToplam = sagdanCiftSayilarToplami(kartNumarasi) + sagdanTekSayilarToplami(kartNumarasi);
		if (sayilarToplam % 10 == 0) {
			return true;
		} else {
			return false;
		}
	}

	private static int sagdanCiftSayilarToplami(long kartNumarasi) {
		long kart = kartNumarasi;
		int toplam = 0;
		int sayi = 0;

		while (kart > 0) {
			kart /= 10;
			sayi = (int) (kart % 10) * 2;
			if (sayi > 9) {
				toplam += ikiBasamakliSayi(sayi);
			} else {
				toplam += sayi;
			}
			kart /= 10;

		}
		return toplam;

	}

	private static int sagdanTekSayilarToplami(long kartNumarasi) {
		long kart = kartNumarasi;
		int toplam = 0;
		int sayi = 0;

		while (kart > 0) {
			sayi = (int) (kart % 10);
			if (sayi > 9) {
				toplam += ikiBasamakliSayi(sayi);
			} else {
				toplam += sayi;
			}
			kart /= 100;

		}
		return toplam;
	}

	private static int ikiBasamakliSayi(int ikiBasamakliSayi) {
		int sayi = ikiBasamakliSayi;
		int toplam = 0;

		while (sayi > 0) {
			toplam += sayi % 10;
			sayi /= 10;
		}
		return toplam;
	}
}
