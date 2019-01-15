package Chapter6;

import java.util.Scanner;

public class Soru24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Yili giriniz :");
		int girilenYil = input.nextInt();

		System.out.print("Ayi giriniz 1-12 kadar ");
		int girilenAy = input.nextInt();

		System.out.println(simdikiZamaniGetir());
		ayiYazdir(girilenAy, girilenYil);

	}

	public static String simdikiZamaniGetir() {
		String simdikiZaman = "";

		int saatDilimi = 3;

		long gecenMilisaniye = System.currentTimeMillis();

		long gecenSaniye = gecenMilisaniye / 1000;

		int simdikiSaniye = (int) gecenSaniye % 60;

		int gecenDakika = (int) gecenSaniye / 60;

		int simdikiDakika = gecenDakika % 60;

		int gecenSaat = gecenDakika / 60;

		int simdikiSaat = gecenSaat % 24;

		simdikiSaat += saatDilimi;

		if (simdikiSaat > 23 || simdikiDakika < 10 || simdikiSaniye < 10) {
			simdikiSaat = 00;
			simdikiZaman = "------------ " + simdikiSaat + "0:0" + simdikiDakika + ":" + simdikiSaniye
					+ " ------------ ";
		}
		simdikiZaman = "------------ " + simdikiSaat + "0:" + simdikiDakika + ":" + simdikiSaniye + " ------------ ";

		return simdikiZaman;
	}

	public static void ayiYazdir(int girilenAy, int girilenYil) {
		ustYazi(girilenAy, girilenYil);

		ayGunleri(girilenAy, girilenYil);

	}

	private static void ustYazi(int ay, int yil) {
		System.out.println("------------  " + ayinIsminiYaz(ay) + " " + yil + "  -------------");
		System.out.println(" PZT  SL CRS PRS  CM CTS  PZ");

	}

	private static String ayinIsminiYaz(int ay) {
		switch (ay) {
		case 1:
			return "ocak";
		case 2:
			return "subat";
		case 3:
			return "mart";
		case 4:
			return "nisan";
		case 5:
			return "mayis";
		case 6:
			return "haziran";
		case 7:
			return "temmuz";
		case 8:
			return "agustos";
		case 9:
			return "eylul";
		case 10:
			return "ekim";
		case 11:
			return "kasim";
		case 12:
			return "aralik";

		}
		return null;
	}

	public static void ayGunleri(int girilenAy, int girilenYil) {
		int baslangicGunu = baslangicGunu(girilenAy, girilenYil);
		for (int i = 0; i < baslangicGunu; i++) {
			System.out.print("    ");
		}
		for (int i = 1; i <= aydakiGunSayisi(girilenAy, girilenYil); i++) {
			System.out.printf("%4d", i);

			if ((i + baslangicGunu) % 7 == 0)
				System.out.println();
		}

		System.out.println();
	}

	public static int baslangicGunu(int girilenAy, int girilenYil) {
		int BirOcak1980Gunu = 3;

		int yildakiGunSayisi = yildakiGunSayisi(girilenAy, girilenYil);
		return (BirOcak1980Gunu + yildakiGunSayisi) % 7;
	}

	private static int yildakiGunSayisi(int girilenAy, int girilenYil) {
		int toplamGun = 0;
		for (int i = 1800; i < girilenYil; i++) {
			if (artikYilMi(i)) {
				toplamGun += 366;
			} else {
				toplamGun += 365;
			}
		}

		for (int i = 1; i < girilenAy; i++) {
			toplamGun += aydakiGunSayisi(girilenAy, girilenYil);
		}
		return 0;
	}

	public static int aydakiGunSayisi(int girilenAy, int girilenYil) {
		if (girilenAy == 1 || girilenAy == 3 || girilenAy == 5 || girilenAy == 7 || girilenAy == 8 || girilenAy == 10
				|| girilenAy == 12)
			return 31;

		if (girilenAy == 4 || girilenAy == 6 || girilenAy == 9 || girilenAy == 11)
			return 30;

		if (girilenAy == 2)
			return artikYilMi(girilenYil) ? 29 : 28;

		return 0;
	}

	public static boolean artikYilMi(int i) {

		return i % 400 == 0 || (i % 4 == 0 && i % 100 != 0);
	}

}// tam olarak yapamadim 

