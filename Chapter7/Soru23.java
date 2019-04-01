package Chapter7;

public class Soru23 {
	/*
	 * (Oyun: Kilitli dolap bilmecesi) 100 kilitli dolap ve 100 öğrencinin olduğu
	 * bir okulda, okulun ilk günü tüm dolaplar kilitlidir++. Öğrenciler sırayla
	 * okula girerler ve ilk öğrenci (O1) tüm dolapların kilidini açar. İkinci
	 * öğrenci, O2, ikinci dolaptan (D2) başlar ve bir dolap atlayıp bir dolap
	 * kilitleyerek devam eder (örneğin üçüncü dolabı atlayıp dördüncüyü kilitler;
	 * beşinciyi atlayıp altıncıyı kilitler, vb.) Üçüncü öğrenci O3, üçüncü dolaptan
	 * başlar D3 ve üçün katı olan dolapları değiştirir. (Açıksa kilitler,
	 * kilitliyse açar) O4, D4’ten başlar ve dördün katı olan dolapları değiştirir.
	 * O5, D5’ten başlar ve beşin katı olan dolapları değiştirir ve bu O100 ve D100
	 * olana kadar böyle devam eder.
	 */

	public static void main(String[] args) {
		boolean[] dolaplar = dolaplariKapat(100);
		hangiDolapAcik(dolaplar);

	}

	private static boolean[] dolaplariKapat(int i) {
		boolean[] dolaplar = new boolean[i];

		for (int j = 0; j < dolaplar.length; j++) {
			dolaplar[j] = false;
		}
		return dolaplar;
	}

	private static void hangiDolapAcik(boolean[] dolaplar) {
		dolaplar = dolapDegerleri(dolaplar);
		acikDolapalriYazdir(dolaplar);

	}

	public static boolean[] dolapDegerleri(boolean[] dolaplar) {
		for (int ogrenci = 1; ogrenci < dolaplar.length; ogrenci++) {
			for (int dolap = ogrenci; dolap < dolaplar.length; dolap += ogrenci) {
				if (dolaplar[dolap] == true) {
					dolaplar[dolap] = false;
				} else {
					dolaplar[dolap] = true;
				}
			}
		}
		return dolaplar;
	}

	private static void acikDolapalriYazdir(boolean[] dolaplar) {
		for (int i = 0; i < dolaplar.length; i++) {
			if (dolaplar[i]) {
				System.out.print(i + " ");
			}
		}
		System.out.print(" dolarlar acik");
	}

}
