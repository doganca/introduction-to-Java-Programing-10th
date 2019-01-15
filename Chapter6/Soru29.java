package Chapter6;

public class Soru29 {
	/*
	 * (İkili asal sayılar) İkili asal sayılar aralarında iki sayı fark olan bir
	 * çift asal sayıdır. Örneğin, 3 ve 5 , 5 ve 7 , 11 ve 13 ikili asal sayılardır.
	 * 1000’den küçük olan tüm ikili asal sayıları bulan bir program yazınız.
	 * Programın sonucunu aşağıdaki gibi gösteriniz: (3, 5) (5, 7) ...
	 */
	public static void main(String[] args) {
		ikiliAsalSayi(1000);
	}

	private static void ikiliAsalSayi(int kacSayi) {
		int sayi = 1;
		int asal = 0;

		while (sayi <= kacSayi) {
			if (asalMi(sayi)) {
				if (ikiliMi(sayi, asal)) {
					System.out.println("(" + asal + "," + sayi + ")");
				}
				asal = sayi;
			}
			sayi++;
		}

	}

	private static boolean asalMi(int sayi) {
		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean ikiliMi(int sayi, int asal) {
		if (sayi - asal == 2) {
			return true;
		} else {
			return false;
		}

	}
}
