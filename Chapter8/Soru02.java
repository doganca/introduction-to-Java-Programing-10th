package Chapter8;

import java.util.Scanner;

public class Soru02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("4x4 boyutunda matrisin degerlerini satir olaral giriniz");

		double[][] matris = matrisDegerleriGir(input);

		double toplam = matrisAnaCaprazlarinToplami(matris);

		System.out.println(" Ana çaprazdaki verilerin toplami : " + toplam);
	}

	private static double[][] matrisDegerleriGir(Scanner input) {
		double[][] matris = new double[4][4];
		for (int satir = 0; satir < matris.length; satir++) {
			for (int sutun = 0; sutun < matris.length; sutun++) {
				matris[satir][sutun] = input.nextDouble();
			}
		}
		return matris;
	}

	private static double matrisAnaCaprazlarinToplami(double[][] matris) {
		double toplam = 0;
		for (int satir = 0, sutun = 0; satir < matris.length; satir++, sutun++) {
			toplam += matris[satir][sutun];
		}

		return toplam;
	}
}
