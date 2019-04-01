package Chapter8;

import java.util.Scanner;

public class Soru27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Degerleri giriniz");

		double[][] degerler = degerleriGir(input);

		degerleriYazdir(degerler);

		sutunlariSirala(degerler);

		System.out.println("\nSutunlarin siralanmis hali");

		degerleriYazdir(degerler);

	}

	private static double[][] degerleriGir(Scanner input) {
		double[][] degerler = new double[3][3];
		for (int i = 0; i < degerler.length; i++) {
			for (int j = 0; j < degerler.length; j++) {
				degerler[i][j] = input.nextDouble();
			}
		}
		return degerler;
	}

	private static void degerleriYazdir(double[][] degerler) {
		for (double[] satir : degerler) {
			for (double sutun : satir) {
				System.out.print(sutun + " ");
			}
			System.out.println();
		}
	}

	private static double[][] sutunlariSirala(double[][] degerler) {
		for (int i = 0; i < degerler.length; i++) {
			for (int j = 0; j < degerler.length - 1; j++) {
				double a = degerler[j][i];
				double b = degerler[j + 1][i];
				if (degerler[j][i] > degerler[j + 1][i]) {
					double temp = degerler[j][i];
					degerler[j][i] = degerler[j + 1][i];
					degerler[j + 1][i] = temp;
				}
			}
		}
		return degerler;
	}
}
