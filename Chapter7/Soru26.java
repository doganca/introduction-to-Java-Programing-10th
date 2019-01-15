package Chapter7;

import java.util.Scanner;

public class Soru26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Birinci diziyi giriniz , ilk deger dizi buyuklugunu belirtir");

		int diziBuyuklugu = input.nextInt();

		int[] dizi1 = diziyeDegerleriEkle(input, diziBuyuklugu);

		System.out.println("Ikinci diziyi giriniz , ilk deger dizi buyuklugunu belirtir");

		diziBuyuklugu = input.nextInt();

		int[] dizi2 = diziyeDegerleriEkle(input, diziBuyuklugu);

		boolean dizilerEsMi = dizilerEsMi(dizi1, dizi2);

		sonucuYazdir(dizilerEsMi);

	}

	public static int[] diziyeDegerleriEkle(Scanner input, int diziBuyuklugu) {
		int[] dizi = new int[diziBuyuklugu];

		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = input.nextInt();
		}
		return dizi;
	}

	private static boolean dizilerEsMi(int[] dizi1, int[] dizi2) {
		if (dizi1.length != dizi2.length) {
			return false;
		}
		for (int i = 0; i < dizi2.length; i++) {
			if (dizi1[i] != dizi2[i]) {
				return false;
			}
		}
		return true;
	}

	private static void sonucuYazdir(boolean dizilerEsMi) {
		if (dizilerEsMi) {
			System.out.println("Iki dizi birbirlerine esit");
		} else {
			System.out.println("Iki dizi esit degil");
		}
	}
}
