package Chapter5;

import java.util.Scanner;

public class Soru50 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Bir yazi giriniz");
		String girilenYazi = input.nextLine();

		int buyukHarfSayisi = 0;

		for (int i = 0; i < girilenYazi.length(); i++) {
			char harf = girilenYazi.charAt(i);

			if (harf >= 65 && harf <= 90) {
				buyukHarfSayisi++;
			}
		}
		System.out.println("Buyuk harflerin sayisi : " + buyukHarfSayisi);
	}
}
