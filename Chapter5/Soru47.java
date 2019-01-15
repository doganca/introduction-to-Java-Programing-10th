package Chapter5;

import java.util.Scanner;

public class Soru47 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Bir ISBN-13’un ilk 12 basamagini string olarak giriniz");
		String isbnNo = input.nextLine();

		int d13 = 0;

		for (int i = 0; i < isbnNo.length(); i++) {

			if (i % 2 != 0) {
				d13 += 10 - (Integer.parseInt(isbnNo.charAt(i) + ""));
			} else {
				d13 += 10 - (3 * Integer.parseInt(isbnNo.charAt(i) + ""));
			}
		}

		d13 = d13 % 10;

		if (d13 == 10) {
			isbnNo += 0;
		} else {
			isbnNo += d13;
		}

		System.out.println("ISBN-13 sayisi : " + isbnNo);

	}

}
