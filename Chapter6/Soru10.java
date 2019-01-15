package Chapter6;

public class Soru10 {
	public static void main(String[] args) {
		asalSayilariYazdir(10000);
	}

	private static void asalSayilariYazdir(int sayi) {
		final int HER_SATIRDA_YAZILACAK_SAYI_SAYISI = 10;
		int sayac = 0;
		int asalSayi = 2;

		while (asalSayi < sayi) {

			if (asamMi(asalSayi)) {
				sayac++;
				if (sayac % 10 == 0) {
					System.out.printf("%6d\n", asalSayi);
				} else {
					System.out.printf("%6d", asalSayi);
				}
			}
			asalSayi++;
		}

	}

	private static boolean asamMi(int asalSayi) {
		for (int i = 2; i < asalSayi; i++) {
			if (asalSayi % i == 0) {
				return false;
			}

		}
		return true;
	}

}
