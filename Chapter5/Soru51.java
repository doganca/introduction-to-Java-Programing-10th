package Chapter5;

import java.util.Scanner;

public class Soru51 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ilk yaziyi giriniz");
		String ilkYazi = input.nextLine();

		System.out.println("Ikinci yaziyi giriniz");
		String ikinciYazi = input.nextLine();

		String ortakBaslangic = "";

		for (int i = 0; i < ilkYazi.length(); i++) {
			char ilkYaziHarfi = ilkYazi.charAt(i);
			char ikinciYaziHarfi = ikinciYazi.charAt(i);

			if (ilkYazi.charAt(0) != ikinciYazi.charAt(0)) {
				System.out.println("ortak baslangic yok");
				break;
			} else if (ilkYaziHarfi == ikinciYaziHarfi) {
				ortakBaslangic += ilkYaziHarfi;
			} else {
				break;
			}
		}
		
		if (ortakBaslangic.length() > 0) {
			System.out.println("Ortak baslangic : " + ortakBaslangic);
		}

	}

}
