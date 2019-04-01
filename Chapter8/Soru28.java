package Chapter8;

import java.util.Scanner;

public class Soru28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Birinci listeyi giriniz");

		int[][] dizi1 = diziyeElemanEkle(input);

		System.out.println("Ikinci listeyi giriniz");

		int[][] dizi2 = diziyeElemanEkle(input);

		boolean dizilerEsitMi = dizilerBirebirEsitMi(dizi1, dizi2);

		System.out.println(dizilerEsitMi ? "iki Dizi birebir Esit" : "iki dizi birebir esit degil");
	}

	private static int[][] diziyeElemanEkle(Scanner input) {
		int[][] dizi = new int[3][3];

		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				dizi[i][j] = input.nextInt();
			}
		}
		return dizi;
	}

	private static boolean dizilerBirebirEsitMi(int[][] dizi1, int[][] dizi2) {
		for (int i = 0; i < dizi2.length; i++) {
			for (int j = 0; j < dizi2.length; j++) {
				if (dizi1[i][j] != dizi2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
