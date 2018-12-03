package Chapter3;

import java.util.Scanner;

public class Soru22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("x ve y noktalarini giriniz");
		double x = input.nextDouble();
		double y = input.nextDouble();

		boolean yaricap = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5) <= 10;

		if (yaricap) {
			System.out.println("( " + x + " , " + y + " ) " + " noktalari cemberin icerisindedir");
		} else {
			System.out.println("nokta cemberin icerisinde degil");
		}
	}
}
