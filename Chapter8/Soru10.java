package Chapter8;

public class Soru10 {
	public static void main(String[] args) {
		int[][] matris = new int[4][4];

		matriseDegerAta(matris);

		matrisiYazdir(matris);

		System.out.println("En buyuk satir indeksi : " + enBuyukSatir(matris));
		System.out.println("En buyuk sutun indeksi : " + enBuyukSutun(matris));
	}

	private static int enBuyukSutun(int[][] matris) {
		int index = -1;
		int enCok = 0;

		for (int i = 0; i < matris.length; i++) {
			int sayac = 0;
			for (int j = 0; j < matris.length; j++) {
				if (matris[j][i] == 1) {
					sayac++;
				}
			}

			if (sayac > enCok) {
				enCok = sayac;
				index = i;
			}
		}
		return index;

	}

	public static void matriseDegerAta(int[][] matris) {
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris.length; j++) {
				matris[i][j] = (int) (Math.random() * 2);
			}
		}
	}

	public static void matrisiYazdir(int[][] matris) {
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris.length; j++) {
				System.out.print(matris[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int enBuyukSatir(int[][] matris) {
		int index = -1;
		int enCok = 0;
		for (int i = 0; i < matris.length; i++) {
			int sayac = 0;
			for (int j = 0; j < matris.length; j++) {
				if (matris[i][j] == 1) {
					sayac++;
				}
			}
			if (sayac > enCok) {
				enCok = sayac;
				index = i;
			}
		}
		return index;
	}
}
