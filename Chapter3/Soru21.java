package Chapter3;

import java.util.Scanner;

public class Soru21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("yili giriniz ? ");
		int yil = input.nextInt();
		System.out.println("ayi giriniz (1-12 arasi)");
		int ay = input.nextInt();

		if (ay == 1 || ay == 2) {
			if (ay == 1) {
				ay = 13;
				--yil;
			}
			if (ay == 2) {
				ay = 14;
				--yil;
			}
		}

		System.out.println("ayin kaci oldugunu giriniz");
		int ayinKaci = input.nextInt();

		int yuzYil = (yil / 100);
		int yuzYilinKacinciYili = (yil % 100);

		int haftaninGunu = (ayinKaci
				+ ((26 * (ay + 1) / 10) + yuzYilinKacinciYili + (yuzYilinKacinciYili / 4) + (yuzYil / 4) + (5 * yuzYil))
						% 7);
		int gunHesapla = haftaninGunu % 7;

		if (gunHesapla == 0) {
			System.out.println("cumartesi");
		} else if (gunHesapla == 1) {
			System.out.println("pazar");
		} else if (gunHesapla == 2) {
			System.out.println("pazartesi");
		} else if (gunHesapla == 3) {
			System.out.println("sali");
		} else if (gunHesapla == 4) {
			System.out.println("carsamba");
		} else if (gunHesapla == 5) {
			System.out.println("persembe");
		} else if (gunHesapla == 6) {
			System.out.println("cuma");
		} else {
			System.out.println("yanlis hesap tekrar deneyiniz. Dogru girdiginizden emin olun");
		}
	}

}
