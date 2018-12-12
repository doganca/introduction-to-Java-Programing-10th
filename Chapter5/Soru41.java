package Chapter5;

import java.util.Scanner;

public class Soru41 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int enBuyukSayi = 0;
		int sayac = 0;

		System.out.print("sayi giriniz 0 olunca sonlanir :  ");
		int girilenSayi = input.nextInt();
		while (girilenSayi != 0) {
			girilenSayi = input.nextInt();

			if (girilenSayi > enBuyukSayi) {
				enBuyukSayi = girilenSayi;
				sayac = 1;
			}
			if (enBuyukSayi == girilenSayi) {
				sayac++;
			}
		}
		System.out.println(
				"girilen en buyuk sayi : " + enBuyukSayi + "\nEn buyuk sayi " + (sayac - 1) + " kere tekrarlaniyor");
	}
}
