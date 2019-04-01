package Chapter8;

import java.util.Scanner;

public class Soru08 {

	// FindNearestPoints.java inceleneip anladiktan sonra bu yazılacak
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Nokta sayisini giriniz");

		int noktaSayisi = input.nextInt();

		double[][] noktalar = noktalariGir(noktaSayisi, input);

		enyakinNoktalariBul(noktalar);

	}

	private static double[][] noktalariGir(int noktaSayisi, Scanner input) {
		double[][] noktalar = new double[noktaSayisi][2];
		for (int i = 0; i < noktalar.length; i++) {
			noktalar[i][0] = input.nextDouble();
			noktalar[i][1] = input.nextDouble();
		}
		return noktalar;
	}

	private static void enyakinNoktalariBul(double[][] noktalar) {
		double enKucukMesafe = Double.MAX_VALUE;

		int p1 = -1;
		int p2 = -1;

		for (int i = 0; i < noktalar.length - 1; i++) {
			for (int j = i + 1; j < noktalar[i].length; j++) {
				double mesafe = mesafeHesapla(noktalar[i][0], noktalar[i][1], noktalar[j][0], noktalar[j][1]);

				if (enKucukMesafe > mesafe) {
					enKucukMesafe = mesafe;
					p1 = i;
					p2 = j;
				}
			}
		}

		for (int i = 0; i < noktalar.length; i++) {
			for (int j = 0; j < noktalar.length; j++) {
				if (mesafeHesapla(noktalar[i][0], noktalar[i][1], noktalar[j][0], noktalar[j][1]) == enKucukMesafe)
					System.out.println("Birbirine en yakin iki nokta " + "(" + noktalar[i][0] + ", " + noktalar[i][1]
							+ ") ve (" + noktalar[j][0] + ", " + noktalar[j][1] + ")");
			}
		}
		System.out.println("En kisa mesafe " + enKucukMesafe);

	}

	private static double mesafeHesapla(double x1, double y1, double x2, double y2) {

		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

}
