package Chapter7;

import java.util.Scanner;

public class Soru09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("10 adet sayi giriniz");
		
		double[] sayilar = new double[10];
		
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = input.nextDouble();
		}
		
		System.out.println("Girilen en kucuk sayi : " + enKucukSayi(sayilar));
	}

	private static double enKucukSayi(double[] sayilar) {
		double enKucukSayi = Integer.MAX_VALUE;
		for (int i = 0; i < sayilar.length; i++) {
			if(enKucukSayi > sayilar[i]) {
				enKucukSayi = sayilar[i];
			}
		}
		return enKucukSayi;
	}
}
