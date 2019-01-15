package Chapter7;

import java.util.Scanner;

public class Soru28 {
	/*
	 * (Matematik: kombinasyonlar) Kullanıcıdan 10 tam sayı girmesini isteyen ve bu
	 * 10 sayıdan seçilen ikili kombinasyonların tümünü gösteren bir program
	 * yazınız.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int diziBuyuklugu = 10;
		System.out.println(diziBuyuklugu + " sayi giriniz");

		int[] dizi = diziyeElemanlariEkle(input, diziBuyuklugu);

		kombinasyolariYazdir(dizi);

	}

	private static int[] diziyeElemanlariEkle(Scanner input, int diziBuyuklugu) {
		int dizi[] = new int[diziBuyuklugu];

		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = input.nextInt();
		}
		return dizi;
	}

	private static void kombinasyolariYazdir(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				System.out.print("(" + dizi[i] + ", " + dizi[j] + ") , ");
			}
			System.out.println();
		}

	}
}
