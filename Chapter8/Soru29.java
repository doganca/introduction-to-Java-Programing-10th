package Chapter8;

import java.util.Scanner;

public class Soru29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Birinci listeyi giriniz");

		int[][] dizi1 = diziyeElemanEkle(input);

		System.out.println("Ikicinci listeyi giriniz");

		int[][] dizi2 = diziyeElemanEkle(input);

		boolean dizilerEsitMi = dizilerEsitMi(dizi1, dizi2);

		System.out.println(dizilerEsitMi ? " Listeler birbirine esit" : "listeler birbirine esit degil");
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

	private static boolean dizilerEsitMi(int[][] dizi1, int[][] dizi2) {
		boolean durum = false;
		for (int i = 0; i < dizi2.length; i++) {
			for (int j = 0; j < dizi2.length; j++) {
				durum = false;
				int satir = 0;
				while (satir < dizi2.length) {
					int sutun = 0;
					if (durum) {
						break;
					}
					while (sutun < dizi2.length) {
						int a = dizi2[satir][sutun];
						if (dizi1[i][j] == dizi2[satir][sutun]) {
							durum = true;
							break;
						}
						sutun++;
					}
					satir++;
				}
			}
		}

		if (durum) {
			return true;
		} else {
			return false;
		}

	}
}
