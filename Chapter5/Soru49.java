package Chapter5;

import java.util.Scanner;

public class Soru49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Bir yazi girininiz");
		String girilenYazi = input.nextLine();
		girilenYazi = girilenYazi.toUpperCase();

		int sesliHarfSayaci = 0;
		int sessizHarfSayaci = 0;

		for (int i = 0; i < girilenYazi.length(); i++) {
			char harf = girilenYazi.charAt(i);

			if (harf == 'A' || harf == 'E' || harf == 'I' || harf == 'O' || harf == 'U') {
				sesliHarfSayaci++;
			} else if (harf == ' ') {
				continue;
			} else {
				sessizHarfSayaci++;
			}
		}
		System.out.println("sesli harf sayisi : " + sesliHarfSayaci + "\nsessiz harf sayisi : " + sessizHarfSayaci);
	}
}
