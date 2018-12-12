package Chapter5;

import java.util.Scanner;

public class Soru19_volkan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int sayi = input.nextInt();

		for (int i = 0; i < sayi; i++) {
			for (int j = sayi - 1 - i; j > 0; j--) {
				System.out.print("    ");
			}
			for (int j = 0; j < i; j++) {
				System.out.printf("%4d", (int)Math.pow(2, j));
			}
			for (int j = i; j >= 0; j--) {
				System.out.printf("%4d", + (int)Math.pow(2, j));
			}
			System.out.println();
		}
	}

}
