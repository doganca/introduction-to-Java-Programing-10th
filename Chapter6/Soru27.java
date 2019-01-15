package Chapter6;

public class Soru27 {
	/*
	 * (Lasa) Lasa (asal’ın tersten yazılışı) palindrom olmayan asal sayıların
	 * tersten yazılışları da asal sayı olan sayılardır. Örneğin 17 asal sayıdır ve
	 * tersi olan 71 de asal sayıdır. Bu durumda 17 ve 71 sayıları lasa’dır. İlk yüz
	 * lasa’yı gösteren bir program yazınız. Her satırda 10 sayı ve aralarında bir
	 * boşluk olacak şekilde gösteriniz. 13 17 31 37 71 73 79 97 107 113 149 157 167
	 * 179 199 311 337 347 359 389
	 */
	public static void main(String[] args) {
		lasaSayilari(100);
	}

	private static void lasaSayilari(int kacLasaSayi) {
		int sayac = 1;
		int sayi = 2;

		while (true) {
			if (asalMi(sayi) && !polindromMu(sayi) && asalTerstenYazdir(sayi)) {
				if (sayac % 10 != 0) {
					System.out.printf("%5d ", sayi);
				} else {
					System.out.println(sayi);
				}
				sayac++;
			}
			if (sayac >= kacLasaSayi + 1) {
				break;
			}
			sayi++;
		}

	}

	private static boolean asalMi(int sayi) {
		boolean asalMi = true;

		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				asalMi = false;
			}
		}
		return asalMi;

	}

	private static boolean asalTerstenYazdir(int sayi) {
		String terstenYazdir = "";
		terstenYazdir += sayi;

		String tersYazilis = "";

		for (int i = terstenYazdir.length() - 1; i >= 0; i--) {
			tersYazilis += terstenYazdir.charAt(i);
		}

		int terstenInt = Integer.parseInt(tersYazilis);

		if ((!polindromMu(terstenInt)) && (asalMi(terstenInt))) {
			return true;
		} else {
			return false;
		}

	}

	private static boolean polindromMu(int sayi) {
		String sayiStr = "";
		sayiStr += sayi;
		String terstenYazma = "";
		boolean polindromMu = false;

		if (terstenYazma.length() == 1) {
			return true;
		}
		for (int i = sayiStr.length() - 1; i >= 0; i--) {
			terstenYazma += sayiStr.charAt(i);
		}

		if (sayiStr.equals(terstenYazma)) {
			polindromMu = true;
		}

		return polindromMu;

	}
}
