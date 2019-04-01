package Chapter8;

import java.util.Scanner;

public class Soru30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("A yi giriniz");

		double[][] a = new double[2][2];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = input.nextDouble();
			}
		}

		System.out.println("B yi giriniz");

		double[] b = new double[2];

		for (int i = 0; i < b.length; i++) {
			b[i] = input.nextDouble();
		}

		double[] cozum = denklemiCoz(a, b);

		if (cozum == null) {
			System.out.println("Denklemin cozumu yoktur");
		} else {
			System.out.println("x in degeri : " + cozum[0] + " y in degeri :" + cozum[1]);
		}
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
