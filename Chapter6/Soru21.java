package Chapter6;

import java.util.Scanner;

public class Soru21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kelimeyi giriniz : ");
		String kelime = input.nextLine();
		
		System.out.println(SayiyiGetir(kelime));
	}

	private static String SayiyiGetir(String kelime) {
		String eklenecek = "";
		kelime = kelime.toUpperCase();
		
		for (int i = 0; i < kelime.length(); i++) {
			if(!(kelime.charAt(i) >= 65 && kelime.charAt(i) <= 90)) {
				eklenecek += kelime.charAt(i);
			}
		}
		
		for (int i = 0; i < kelime.length(); i++) {
			if(kelime.charAt(i) >= 65 && kelime.charAt(i) <= 90) {
				if(kelime.charAt(i) == 'A' || kelime.charAt(i) == 'B' ||kelime.charAt(i) == 'C' ) {
					eklenecek += 2;
				}
				if(kelime.charAt(i) == 'D' || kelime.charAt(i) == 'E' ||kelime.charAt(i) == 'F' ) {
					eklenecek += 3;
				}
				if(kelime.charAt(i) == 'G' || kelime.charAt(i) == 'H' ||kelime.charAt(i) == 'I' ) {
					eklenecek += 4;
				}
				if(kelime.charAt(i) == 'J' || kelime.charAt(i) == 'K' ||kelime.charAt(i) == 'L' ) {
					eklenecek += 5;
				}
				if(kelime.charAt(i) == 'M' || kelime.charAt(i) == 'N' ||kelime.charAt(i) == 'O' ) {
					eklenecek += 6;
				}
				if(kelime.charAt(i) == 'P' || kelime.charAt(i) == 'R' ||kelime.charAt(i) == 'S' || kelime.charAt(i) == 'Q' ) {
					eklenecek += 7;
				}
				if(kelime.charAt(i) == 'T' || kelime.charAt(i) == 'U' ||kelime.charAt(i) == 'V' ) {
					eklenecek += 8;
				}if(kelime.charAt(i) == 'W' || kelime.charAt(i) == 'X' ||kelime.charAt(i) == 'Y' || kelime.charAt(i) == 'Z' ) {
					eklenecek += 9;
				}
			}
		}
		return eklenecek;
	}
}
