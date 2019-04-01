package Chapter3;

import java.util.Scanner;

public class Soru09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer:");
		int isbn = input.nextInt();

		int d1 = isbn / 100000000;
		int kalan = isbn % 100000000;
		
		int d2 = kalan / 10000000;
		kalan %= 10000000;
		
		int d3 = kalan / 1000000;
		kalan %= 1000000;
		
		int d4 = kalan / 100000;
		kalan %= 100000;
		
		int d5 = kalan / 10000;
		kalan %= 10000;
		
		int d6 = kalan / 1000;
		kalan %= 1000;
		
		int d7 = kalan / 100;
		kalan %= 100;
		
		int d8 = kalan / 10;
		kalan %= 10;
		
		int d9 = kalan;

		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		if (d10 >= 10) {
			System.out.println(d1 + "" + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "x");
		} else {
			System.out.println(d1 + "" + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
		}
	}

}
