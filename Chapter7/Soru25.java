package Chapter7;

import java.util.Scanner;

public class Soru25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("a, b, c degerlerini giriniz ");
		double[] degerler = new double[3];

		degerleriGir(input, degerler);

		double[] kokler = kokBul(degerler);

		denklemSonucu(kokler);
	}

	public static void degerleriGir(Scanner input, double[] degerler) {
		for (int i = 0; i < degerler.length; i++) {
			degerler[i] = input.nextDouble();
		}
	}

	private static double[] kokBul(double[] degerler) {
		double[] kokler = new double[3];

		double diskirimant = diskirimantBul(degerler);
		kokler[0] = ((-1 * degerler[1]) + diskirimant) / 2 * degerler[0];
		kokler[1] = ((-1 * degerler[1]) - diskirimant) / 2 * degerler[0];
		kokler[2] = diskirimant;
		return kokler;
	}

	private static double diskirimantBul(double[] degerler) {

		return Math.pow((degerler[1] * degerler[1] - (4 * (degerler[0] * degerler[2]))), 0.5);
	}

	private static void denklemSonucu(double[] kokler) {
		if (kokler[2] >= 1) {
			System.out.println("denkglemin iki gercek koku vardir " + kokler[0] + " ve" + kokler[1]);
		} else if (kokler[2] == 0) {
			System.out.println("denkglemin bir koku vardir " + (int) kokler[0]);
		} else {
			System.out.println("Denklemin koku yoktur");
		}

	}

}
