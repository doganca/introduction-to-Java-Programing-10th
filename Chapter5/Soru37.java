package Chapter5;

import java.util.Scanner;

public class Soru37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("ikilik sayiya donusecek onluk sayi giriniz ");
		int girilenSayi = input.nextInt();

		String ikilikTabanTerstenYazilisi = "";

		while (girilenSayi > 0) {
			int temp = girilenSayi % 2;
			girilenSayi /= 2;
			ikilikTabanTerstenYazilisi += temp;
		}

		for (int i = ikilikTabanTerstenYazilisi.length(); i > 0; i--) {
			System.out.print(ikilikTabanTerstenYazilisi.charAt(i - 1));

		}
	}

}
