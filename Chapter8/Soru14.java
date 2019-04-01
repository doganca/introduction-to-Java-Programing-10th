package Chapter8;

import java.util.Scanner;

public class Soru14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Kare matrisin uzunlugu girin");

		int matrisUzunlugu = input.nextInt();

		int[][] matris = matrisiOlustur(matrisUzunlugu);

		matrisiYazdir(matris);

		matrisiKontrolEt(matris);
	}

	private static int[][] matrisiOlustur(int matrisUzunlugu) {
		int[][] matris = new int[matrisUzunlugu][matrisUzunlugu];

		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris.length; j++) {
				matris[i][j] = (int) (Math.random() * 2);
			}
		}
		return matris;
	}

	private static void matrisiYazdir(int[][] matris) {
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris.length; j++) {
				System.out.print(matris[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void matrisiKontrolEt(int[][] matris) {
		satirlariKontrolEt(matris);
		sutunlariKontrolEt(matris);

	}

	private static void satirlariKontrolEt(int[][] matris) {
		satirdakiSifirlariKontrolEt(matris);
		satirdakiBirleriKontrolEt(matris);

	}

	private static void satirdakiSifirlariKontrolEt(int[][] matris) {
		boolean tumSayilarAyniYerdeMi = false;
		String neresi = "Satir";
		for (int i = 0; i < matris.length; i++) {
			int sayac = 0;
			for (int j = 0; j < matris.length; j++) {
				if (matris[i][j] == 0) {
					sayac++;
				}
			}
			if (sayac == matris.length) {
				System.out.println(i + ". si satirda tum sifirlar");
				tumSayilarAyniYerdeMi = true;
			}
		}
		tumSayilarAyniYerdeMi(tumSayilarAyniYerdeMi, neresi);
	}

	private static void satirdakiBirleriKontrolEt(int[][] matris) {
		boolean tumSayilarAyniYerdeMi = false;
		String neresi = "Satir";
		for (int i = 0; i < matris.length; i++) {
			int sayac = 0;
			for (int j = 0; j < matris.length; j++) {
				if (matris[i][j] == 1) {
					sayac++;
				}
			}
			if (sayac == matris.length) {
				System.out.println(i + ". satirda tum 1' ler. ");
				tumSayilarAyniYerdeMi = true;
			}
		}
		tumSayilarAyniYerdeMi(tumSayilarAyniYerdeMi,neresi);
	}

	private static void sutunlariKontrolEt(int[][] matris) {
		sutundakiSifirlariKontrolEt(matris);
		sutundakiBirleriKontrolEt(matris);

	}

	private static void sutundakiSifirlariKontrolEt(int[][] matris) {
		boolean tumSayilarAyniSutundaMi = false;
		String neresi = "Sutun";
		for (int i = 0; i < matris.length; i++) {
			int sayac = 0;
			int jIndeks = -1;
			for (int j = 0; j < matris.length; j++) {
				if (matris[j][i] == 0) {
					sayac++;
					jIndeks = j;
				}
			}
			if (sayac == matris.length) {
				System.out.println(jIndeks + ". sutunda tum 0' lar");
				tumSayilarAyniSutundaMi = true;
			}
		}
		tumSayilarAyniYerdeMi(tumSayilarAyniSutundaMi,neresi);
	}

	private static void sutundakiBirleriKontrolEt(int[][] matris) {
		boolean tumSayilarAyniSutundaMi = false;
		String neresi = "Sutun";
		for (int i = 0; i < matris.length; i++) {
			int sayac = 0;
			int jIndeksi = -1;
			for (int j = 0; j < matris.length; j++) {
				if (matris[j][i] == 1) {
					sayac++;
				}
			}
			if (sayac == matris.length) {
				System.out.println(jIndeksi + ". sutunda tum 1' ler");
				tumSayilarAyniSutundaMi = true;
			}
		}
		tumSayilarAyniYerdeMi(tumSayilarAyniSutundaMi, neresi);
	}

	public static void tumSayilarAyniYerdeMi(boolean tumSayilarAyniSutundaMi, String yeriNeresi) {
		if (!tumSayilarAyniSutundaMi) {
			System.out.println("Hicbir " + yeriNeresi + "' da ayni sayi yok");
		}
	}
	
	//TODO yazdirma mantigi duzeltilecek , surekli yazmasina gerek yok
}
