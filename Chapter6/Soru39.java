package Chapter6;

import java.util.Scanner;

public class Soru39 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" p0, p1 ve p2 icin uc nokta giriniz : ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		if (solTarafta(x0, y0, x1, y1, x2, y2)) {
			System.out.println("Sol taraftadir");
		} else if (sagTarafta(x0, y0, x1, y1, x2, y2)) {
			System.out.println("Sag taraftadir");
		} else {
			System.out.println("Ustunde bulunur");
		}
	}

	private static boolean solTarafta(double x0, double y0, double x1, double y1, double x2, double y2) {
		double pozisyon = ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0));
		if (pozisyon > 0) {
			return true;
		}
		return false;
	}

	private static boolean sagTarafta(double x0, double y0, double x1, double y1, double x2, double y2) {
		double pozisyon = ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0));
		if (pozisyon < 0) {
			return true;
		}
		return false;
	}
}
