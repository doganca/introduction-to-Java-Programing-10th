package Chapter8;

import java.util.Scanner;

public class Soru15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Bes nokta giriniz");

		double[][] noktalar = noktalariDiziyeEkle(input);

		boolean ayniDogruUstundeMi = noktalariKontrolEt(noktalar);
		
		System.out.println("5 nokta ayni dogru uzerinde" + (ayniDogruUstundeMi ? " " : " degil"));
	}

	private static double[][] noktalariDiziyeEkle(Scanner input) {
		double[][] noktalar = new double[5][2];
		for (int i = 0; i < noktalar.length; i++) {
			for (int j = 0; j < noktalar[2].length; j++) {
				noktalar[i][j] = input.nextDouble();
			}
		}
		return noktalar;
	}

	private static boolean noktalariKontrolEt(double[][] noktalar) {
		for (int i = 0; i < noktalar.length - 2; i += 3) {
			for (int j = 0; j < noktalar.length; j++) {
				if (noktaPozisyonu(noktalar[i][0], noktalar[i][1], noktalar[i + 1][0], noktalar[i + 1][1],
						noktalar[i + 2][0], noktalar[i + 2][1]) != 0) {
					return false;
				}
			}
		}
		return true;
	}

	private static double noktaPozisyonu(double x0, double y0, double x1, double y1, double x2, double y2) {
		double pozisyon = ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0));

		return pozisyon;
	}
}
