package Chapter3;

import java.util.Scanner;

public class Soru34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("p0, p1 ve p2 icin uc nokta giriniz:");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		boolean arasindaMi = !(((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0
				|| ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) < 0 || (x2 < x0) || (y2 < y0) || (x2 > x1)
				|| (y2 > y1));


		if (!arasindaMi) {
			System.out.print("arasinda olan dogru parcasindadir.");
		}else {
			System.out.println(" arasinda olan dogru parcasi degildir.");
		}
	}
}
