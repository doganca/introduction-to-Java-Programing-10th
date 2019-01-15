package Chapter6;

import java.util.Scanner;

public class Soru35 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kenar uzunlugunu giriniz");
		double kenarUzunlugu = input.nextDouble();
		
		System.out.println("besgenin alani : " + alan(kenarUzunlugu));
	}

	private static double alan(double kenarUzunlugu) {
		double alan = (5 * Math.pow(kenarUzunlugu, 2)) / (4 * Math.tan(Math.PI / 5));
		return alan;
	}

}
