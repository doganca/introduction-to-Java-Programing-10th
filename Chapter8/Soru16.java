package Chapter8;

public class Soru16 {
	public static void main(String[] args) {
		int[][] dizi = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };

		diziyiSirala(dizi);

		diziyiYazdir(dizi);
	}

	private static void diziyiSirala(int[][] dizi) {
		for (int i = 0; i < dizi.length * 2; i++) {
			for (int j = 0; j < dizi.length -1; j++) {
				if (dizi[j][0] > dizi[j + 1][0] || dizi[j][1] > dizi[j + 1][1]) {
					int sifirinciIndeks = dizi[j][0];
					int birinciIndeks = dizi[j][1];

					dizi[j][0] = dizi[j + 1][0];
					dizi[j][1] = dizi[j + 1][1];

					dizi[j + 1][0] = sifirinciIndeks;
					dizi[j + 1][1] = birinciIndeks;

				}
			}
		}
	}

	private static void diziyiYazdir(int[][] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.print("(" + dizi[i][j] + ", " + dizi[i][j +1] + ")");
			}
			System.out.print(",");
		}

	}

}
