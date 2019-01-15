package Chapter6;

import java.util.Scanner;

public class Soru07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Yatirim miktarini giriniz : ");
		double yatirimMiktari = input.nextDouble();

		System.out.println("Yillik faiz oranini giriniz : ");
		double yillikFaizOrani = input.nextDouble();
		double aylikFaizOrani = yillikFaizOrani / 1200;

		System.out.println("");

		ustYazi();
		for (int i = 1; i <= 30; i++) {
			System.out.printf("%-3d\t", i);
			System.out.printf("%6.3f\n", faizHesapla(yatirimMiktari, aylikFaizOrani, i));
		}
	}

	private static void ustYazi() {
		System.out.println("yil\tPara mIktari");
	}

	private static double faizHesapla(double yatirimMiktari, double aylikFaizOrani, int i) {
		double faizKazanci = yatirimMiktari * Math.pow(1 + aylikFaizOrani, (i * 12));
		return faizKazanci;
	}

}