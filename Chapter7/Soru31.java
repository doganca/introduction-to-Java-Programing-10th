package Chapter7;

import java.util.Scanner;

public class Soru31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Birinci sirali listeyi giriniz, ilk deger liste uzunlugu");

		int[] liste1 = listeyeElemanEkle(input);

		System.out.println("Ikinci sirali listeyi giriniz, ilk deger liste uzunlugu ");

		int[] liste2 = listeyeElemanEkle(input);

		int[] birlesmisListe = merge(liste1, liste2);

		diziyiYazdir(birlesmisListe);
	}

	private static int[] listeyeElemanEkle(Scanner input) {
		int diziBuyuklugu = input.nextInt();
		int[] liste = new int[diziBuyuklugu];
		for (int i = 0; i < liste.length; i++) {
			liste[i] = input.nextInt();
		}
		return liste;
	}

	private static int[] merge(int[] liste1, int[] liste2) {
		int[] mergeListe = new int[liste1.length + liste2.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < liste1.length && j < liste2.length) {
			if (liste1[i] < liste2[j]) {
				mergeListe[k] = liste1[i];
				k++;
				i++;
			} else {
				mergeListe[k] = liste2[j];
				k++;
				j++;
			}

		}

		while (i < liste1.length) {
			mergeListe[k] = liste1[i];
			k++;
			i++;
		}

		while (j < liste2.length) {
			mergeListe[k] = liste2[j];
			k++;
			j++;
		}

		return mergeListe;
	}

	private static void diziyiYazdir(int[] birlesmisListe) {
		for (int i : birlesmisListe) {
			System.out.print(i + " ");
		}
	}

}
