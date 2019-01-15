package Chapter6;

import java.util.Scanner;

public class Soru13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("m(i) yi giriniz ");
		int girilenSayi = input.nextInt();

		ustYazi();
		for (int i = 1; i <= girilenSayi; i++) {
			System.out.printf("%-2d \t %2.4f\n", i, m(i));
		}

	}

	private static void ustYazi() {
		System.out.println("i\tm(i)");
		System.out.println("------------");

	}

	public static double m(int j) {
		double m = 0;
		for (int i = 1; i <= j; i++) {
			m += i / (1.0 + i);
		}
		return m;
	}
}
