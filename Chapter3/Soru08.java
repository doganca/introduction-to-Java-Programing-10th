package Chapter3;

import java.util.Scanner;

public class Soru08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("3 tande sayi giriniz");
		int sayi1 = input.nextInt();
		int sayi2 = input.nextInt();
		int sayi3 = input.nextInt();

		int temp;

		if (sayi2 < sayi1 || sayi3 < sayi1) {
			if (sayi2 < sayi1) {
				temp = sayi1;
				sayi1 = sayi2;
				sayi2 = temp;
			}
			if (sayi3 < sayi1) {
				temp = sayi1;
				sayi1 = sayi3;
				sayi3 = temp;
			}
		}
		if (sayi3 < sayi2) {
			temp = sayi3;
			sayi3 = sayi2;
			sayi2 = temp;
		}

		System.out.println(sayi1 + " " + sayi2 + " " + sayi3);
	}

}
