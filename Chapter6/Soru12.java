package Chapter6;

public class Soru12 {
	public static void main(String[] args) {
		karakterleriGoster('a', 'z', 6);
	}

	private static void karakterleriGoster(char ch1, char ch2, int satirdakiKarakterSayisi) {
		int sayac = 1;
		if (sayiFiltele(ch1, ch2)) {
			for (int i = hangisiKucuk(ch1, ch2) + 1; i < hangisiBuyuk(ch1, ch2); i++) {
				if (sayac % satirdakiKarakterSayisi != 0) {
					System.out.print((char) i + " ");
				} else {
					System.out.println(((char) i));
				}
				sayac++;
			}
		} else {
			System.out.println("Yanlis karakter girdiniz, sadece harf ve sayi giriniz");
		}

	}

	private static boolean sayiFiltele(char ch1, char ch2) {
		if (sayiFiltrele(ch1, ch2) || buyukHarfFilitrele(ch1, ch2) || kucukHarfFilitrele(ch1, ch2)) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean sayiFiltrele(char ch1, char ch2) {
		if (ch1 >= 48 && ch1 <= 57 || ch2 >= 48 && ch2 <= 57) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean buyukHarfFilitrele(char ch1, char ch2) {
		if (ch1 >= 65 && ch1 <= 90 || ch2 >= 65 && ch2 <= 90) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean kucukHarfFilitrele(char ch1, char ch2) {
		if (ch1 >= 97 && ch1 <= 122 || ch2 >= 97 && ch2 <= 122) {
			return true;
		} else {
			return false;
		}
	}

	private static int hangisiBuyuk(char ch1, char ch2) {
		int buyukOlan = 0;
		if (ch1 > ch2) {
			buyukOlan = ch1;
		} else {
			buyukOlan = ch2;
		}
		return buyukOlan;
	}

	private static int hangisiKucuk(char ch1, char ch2) {
		int kucukOlan = 0;
		if (ch1 < ch2) {
			kucukOlan = ch1;
		} else {
			kucukOlan = ch2;
		}
		return kucukOlan;
	}
}
