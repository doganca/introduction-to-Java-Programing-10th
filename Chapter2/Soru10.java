package Chapter2;

import java.util.Scanner;

public class Soru10 {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		
		System.out.println("suyun miktari kg cinsinden : ");
		double suMiktari = giris.nextDouble();
		
		System.out.println("baslangic isisi : ");
		double baslangicIsisi = giris.nextDouble();
		
		System.out.println("istenilen sicaklik : ");
		double istenilenSicaklik = giris.nextDouble();
		
		double gerekliEnerji = (suMiktari * (istenilenSicaklik - baslangicIsisi)) * 4184 ;
		
		System.out.println("gereken enerji : " + gerekliEnerji);
	}

}
