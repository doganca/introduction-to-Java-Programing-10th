package Chapter5;

import java.util.Scanner;

public class Soru17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int sayi = input.nextInt();

		for (int i = 0; i < sayi; i++) {
			for (int j = sayi - 1 - i; j > 0; j--) {
				System.out.print("  ");
			}
			for (int j = i + 1; j > 0; j--) {
				System.out.print(" " + j);
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" " + (j + 2));
			}
			System.out.println();
		}
	}

}
