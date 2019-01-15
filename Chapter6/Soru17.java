package Chapter6;

import java.util.Scanner;

public class Soru17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Matris boyutunu giriniz ");
		int matrisBoyutu = input.nextInt();

		matrisOlusutur(matrisBoyutu);
	}

	public static void matrisOlusutur(int matrisBoyutu) {
		for (int i = 0; i < matrisBoyutu; i++) {
			for (int j = 0; j < matrisBoyutu; j++) {
				System.out.print(sayiGetir() + " ");
			}
			System.out.println();
		}
	}

	public static int sayiGetir() {
		int sayi = (int) (Math.random() * 2);
		return sayi;
	}
}
