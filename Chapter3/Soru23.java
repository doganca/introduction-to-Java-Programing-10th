package Chapter3;

import java.util.Scanner;

public class Soru23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("x ve y degerlerini giriniz");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		boolean dikdortgenIcindeMi = (Math.pow(Math.pow(x, 2), 0.5) <= 10.0 / 2) || (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);
		
		System.out.println(x + " ve " + y +  " noktalari " + (dikdortgenIcindeMi ? "cemberin icerisinde " : "cemberin icerisinde degil "));
	}

}
