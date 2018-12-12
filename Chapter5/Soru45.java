package Chapter5;

import java.util.Scanner;

public class Soru45 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int kacSayiGirildi = 0;
		double sayilarinToplami = 0;
		double girilenSayi;
		double standartCarpma = 0;

		System.out.println("10 sayi giriniz");
		while (kacSayiGirildi < 10) {
			girilenSayi = input.nextDouble();
			sayilarinToplami += girilenSayi;
			standartCarpma += Math.pow(girilenSayi, 2);
			kacSayiGirildi++;
		}

		double ortalama = sayilarinToplami / kacSayiGirildi;
		standartCarpma = Math
				.sqrt((standartCarpma - (Math.pow(sayilarinToplami, 2) / kacSayiGirildi)) / (kacSayiGirildi - 1));

		System.out.println("ortalama : " + ortalama);
		System.out.printf("Standart carpma : %2.4f", standartCarpma);

	}

}
