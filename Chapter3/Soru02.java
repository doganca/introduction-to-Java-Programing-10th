package Chapter3;

import java.util.Scanner;

public class Soru02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sayi1 = (int) (Math.random() * 10);
		int sayi2 = (int) (Math.random() * 10);
		int sayi3 = (int) (Math.random() * 10);

		int toplam = sayi1 + sayi2 + sayi3;

		System.out.println(sayi1 + " + " + sayi2 + " + " + sayi3 + " = ");
		int cevap = input.nextInt();

		if (toplam == cevap) {
			System.out.println("dogru cevap ");
		} else {
			System.out.println("yanlis cevap");
		}
	}

}
