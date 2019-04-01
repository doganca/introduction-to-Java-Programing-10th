package Chapter8;

import java.util.Scanner;

public class SOru31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Dogrularin kesisim noktalarini giriniz");

		double[][] noktalar = noktalariGir(input);

		double[] sonuc = kesisimNoktalari(noktalar);

		if (sonuc == null) {
			System.out.println("Iki dogru paraleldir");
		} else {
			System.out.println("Kesisen dogrular (" + sonuc[0] + ", " + sonuc[1] + " )");
		}
	}

	private static double[][] noktalariGir(Scanner input) {
		double[][] noktalar = new double[4][2];
		for (int i = 0; i < noktalar.length; i++) {
			for (int j = 0; j < noktalar[i].length; j++) {
				noktalar[i][j] = input.nextDouble();
			}
		}
		return noktalar;
	}

	private static double[] kesisimNoktalari(double[][] noktalar) {
		double[][] a = new double[2][2];
		double[] b = new double[2];

		a[0][0] = noktalar[0][1] - noktalar[1][1];
		a[0][1] = -1 * (noktalar[0][0] - noktalar[1][0]);
		a[1][0] = noktalar[2][1] - noktalar[3][1];
		a[1][1] = -1 * (noktalar[2][0] - noktalar[3][0]);

		b[0] = (noktalar[0][1] - noktalar[1][1]) * noktalar[0][0] - (noktalar[0][0] - noktalar[1][0]) * noktalar[0][1];
		b[1] = (noktalar[2][1] - noktalar[3][1]) * noktalar[2][0] - (noktalar[2][0] - noktalar[3][0]) * noktalar[2][1];

		return denklemiCoz(a, b);
	}

	private static double[] denklemiCoz(double[][] a, double[] b) {
		if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0) {
			return null;
		}

		double[] sonuc = new double[2];

		sonuc[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

		sonuc[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

		return sonuc;
	}
	
	
}
