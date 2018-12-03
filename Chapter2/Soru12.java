package Chapter2;

import java.util.Scanner;

public class Soru12 {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("hizi ve ivmeyi giriniz ");
		
		int hiz = giris.nextInt();
		double ivme = giris.nextDouble();
		
		double pistUzunlugu = ((hiz * hiz ) / (2 * ivme));
		
		System.out.println("gerekli pist uzunlugu : " + pistUzunlugu);
		
	}

}
