package Chapter6;

public class Soru26 {
	/*
	 * (Palindrom asal sayılar) Palindrom asay sayı; hem asal sayı hem de palindrom
	 * olan sayılardır. Örneğin 131 hem asal hem de palindromdur. 313 ve 757 de aynı
	 * şekilde. İlk 100 palindrom asal sayıyı gösteren bir program yazınız. Her
	 * satırda 10 sayı ve aralarında bir boşluk olacak şekilde gösteriniz. 2 3 5 7
	 * 11 101 131 151 181 191 313 353 373 383 727 757 787 797 919 929
	 */

	public static void main(String[] args) {
		polidromAsalSayi(100);
	}

	private static void polidromAsalSayi(int kacinciSayiyaKadar) {
		int sayi = 2;
		int sayac = 1;

		while (true) {
			if (asalMi(sayi) && polindromMu(sayi)) {
				if (sayac % 10 != 0) {
					System.out.printf("%8d  ", sayi);
				} else {
					System.out.println(sayi + " ");
				}
				sayac++;
			}
			if (sayac >= kacinciSayiyaKadar + 1) {
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

	private static boolean polindromMu(int verilenSayi) {
		String sayi = "";
		sayi += verilenSayi;
		boolean polindromMu = false;
		String terstenYazilis = "";

		if (sayi.length() == 1) {
			polindromMu = true;
		} else {
			for (int i = sayi.length() - 1; i >= 0; i--) {
				terstenYazilis += sayi.charAt(i);
			}
			if (sayi.equals(terstenYazilis)) {
				polindromMu = true;
			}
		}

		return polindromMu;

	}

}
