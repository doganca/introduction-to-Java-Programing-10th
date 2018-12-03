package Chapter5;

import java.util.Scanner;

public class Soru31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Ana para miktarini giriniz : ");
		double anaPara = input.nextDouble();

		System.out.print("Yillik faiz oranini giriniz : ");
		double yillikFaizOrani = input.nextDouble();

		System.out.println("Vade mikyarini ay olarak girin");
		int vade = input.nextInt();

		System.out.println("ay\t\tBiriken miktar");
		for (int i = 1; i <= vade; i++) {
			anaPara += anaPara * yillikFaizOrani / 1200;
			System.out.printf("%d\t\t%5.3f\n", i, anaPara);

		}
	}
}
