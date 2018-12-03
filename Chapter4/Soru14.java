package Chapter4;

import java.util.Scanner;

public class Soru14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Notu harf olarak girin");
		String not = input.nextLine();

		switch (not.trim().toUpperCase()) {
		case "A":
			System.out.println(not + " notunun sayisal karsiligi 4");

			break;
		case "B":
			System.out.println(not + " notunun sayisal karsiligi 3");

			break;
		case "C":
			System.out.println(not + " notunun sayisal karsiligi 2");

			break;
		case "D":
			System.out.println(not + " notunun sayisal karsiligi 1");

			break;
		case "F":
			System.out.println(not + " notunun sayisal karsiligi 0");

			break;

		default:
			System.out.println(not + " gecersiz bir giris");
			break;
		}

	}
}
