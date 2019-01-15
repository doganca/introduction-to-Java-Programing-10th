package Chapter7;

import java.util.Scanner;

public class Soru01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Ogrenci sayisini giriniz : ");
		int ogrenciSayisi = input.nextInt();

		int[] ogrenciPuanlari = new int[ogrenciSayisi];

		System.out.println(ogrenciSayisi + " ogrenci puani giriniz");

		for (int i = 0; i < ogrenciPuanlari.length; i++) {
			ogrenciPuanlari[i] = input.nextInt();
		}
		notlariYazdir(ogrenciPuanlari);
	}

	private static void notlariYazdir(int[] ogrenciPuanlari) {
		int enIyiNot = enIyiNotBulma(ogrenciPuanlari);

		for (int i = 0; i < ogrenciPuanlari.length; i++) {
			notuGetir(i, ogrenciPuanlari[i], enIyiNot);
		}
	}

	public static int enIyiNotBulma(int[] ogrenciPuanlari) {
		int enIyiNot = 0;

		for (int i = 0; i < ogrenciPuanlari.length; i++) {
			if (enIyiNot <= ogrenciPuanlari[i]) {
				enIyiNot = ogrenciPuanlari[i];
			}
		}
		return enIyiNot;
	}

	private static void notuGetir(int ogrenciIndeksi, int ogrenciPuani, int enYuksekNot) {
		if (ogrenciPuani >= (enYuksekNot - 10)) {
			System.out.println(ogrenciIndeksi + " ogrencinin puani : " + ogrenciPuani + " ve notu A");
		} else if (ogrenciPuani >= (enYuksekNot - 20)) {
			System.out.println(ogrenciIndeksi + " ogrencinin puani : " + ogrenciPuani + " ve notu B");
		} else if (ogrenciPuani >= (enYuksekNot - 30)) {
			System.out.println(ogrenciIndeksi + " ogrencinin puani : " + ogrenciPuani + " ve notu C");
		} else if (ogrenciPuani >= (enYuksekNot - 40)) {
			System.out.println(ogrenciIndeksi + " ogrencinin puani : " + ogrenciPuani + " ve notu D");
		} else {
			System.out.println(ogrenciIndeksi + " ogrencinin puani : " + ogrenciPuani + " ve notu F");
		}
	}
}
