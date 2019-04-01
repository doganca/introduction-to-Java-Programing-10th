package Chapter8;

public class Soru22 {
	public static void main(String[] args) {
		int[][] matris = matriseDegerAta();
		boolean matrisKontrol = matrisiKonrolEt(matris);

		if (matrisKontrol) {
			System.out.println("Matrisin her satir ve sutununda cift sayida 1 var");
		} else {
			System.out.println("Matrisin her satir ve sutununda cift sayida 1 yok");
		}
	}

	private static int[][] matriseDegerAta() {
		int[][] matris = new int[6][6];
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris.length; j++) {
				matris[i][j] = (int) (Math.random() * 2);
			}
		}
		return matris;
	}

	private static boolean matrisiKonrolEt(int[][] matris) {
		boolean satirKontrol = satiriKontrolEt(matris);
		boolean sutunKontrol = sutunKontolEt(matris);

		if (satirKontrol && sutunKontrol) {
			return true;
		}
		return false;
	}

	private static boolean satiriKontrolEt(int[][] matris) {
		int sayac = 0;

		for (int i = 0; i < matris.length; i++) {
			int icSayac = 0;
			for (int j = 0; j < matris.length; j++) {
				if (matris[i][j] == 1) {
					icSayac++;
				}
			}
			if (icSayac % 2 == 0) {
				sayac++;
			}
		}
		if (sayac % 2 == 0) {
			return true;
		}
		return false;
	}

	private static boolean sutunKontolEt(int[][] matris) {
		int sayac = 0;

		for (int i = 0; i < matris.length; i++) {
			int icSayac = 0;

			for (int j = 0; j < matris.length; j++) {
				if (matris[j][i] == 1) {
					icSayac++;
				}
			}
			if (icSayac % 2 == 0) {
				sayac++;
			}
		}
		if (sayac % 2 == 0) {
			return true;
		}
		return false;
	}

}
