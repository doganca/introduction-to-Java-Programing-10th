package Chapter6;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("ilk kac besgensel sayiyi yazdirmak istersiniz ?");
		int kacBesgensel = input.nextInt();

		besgenselSayi(kacBesgensel);
	}

	private static void besgenselSayi(int kacBesgensel) {
		mesaj(kacBesgensel);
		for (int i = 1; i <= kacBesgensel; i++) {
			int besgensel = i * (3 * i - 1) / 2;

			if (i % 10 == 0) {
				System.out.printf("%6d\n", besgensel);
			} else {
				System.out.printf("%6d", besgensel);
			}
		}

	}

	private static void mesaj(int kacBesgensel) {
		System.out.println("\t\tILK " + kacBesgensel + " BESGENSEL SAYILAR ");
		System.out.println("-----------------------------------------------------------");

	}

}
