package Chapter7;

import java.util.Scanner;

public class Soru27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Birinci diziyi giriniz, ilk deger dizi buyuklugu olacak");

		int diziBuyuklugu = input.nextInt();

		int[] dizi1 = diziDegerleriniEkle(input, diziBuyuklugu);

		System.out.println("Ikinci diziyi giriniz, ilk deger dizi buyuklugu olacak");

		diziBuyuklugu = input.nextInt();

		int[] dizi2 = diziDegerleriniEkle(input, diziBuyuklugu);

		boolean diziDurum = diziElemanlariEsMi(dizi1, dizi2);

		sonucuYazdir(diziDurum);

	}

	private static int[] diziDegerleriniEkle(Scanner input, int diziBuyuklugu) {
		int[] dizi = new int[diziBuyuklugu];

		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = input.nextInt();
		}
		return dizi;
	}

	private static boolean diziElemanlariEsMi(int[] dizi1, int[] dizi2) {
		if (dizi1.length != dizi2.length) {
			return false;
		}
		boolean durum = false;
		for (int i = 0; i < dizi2.length; i++) {
			for (int j = 0; j < dizi2.length; j++) {
				if (dizi1[i] == dizi2[j]) {
					return true;
				}
			}
		}
		return durum;
	}

	private static void sonucuYazdir(boolean diziDurum) {
		System.out.println(diziDurum ? "dizi elemanlari birbiri ile ayni" : "diziler ayni degil");
	}
}
