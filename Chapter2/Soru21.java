package Chapter2;

import java.util.Scanner;

public class Soru21 {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		
		System.out.println("yatirim miktarini girin : ");
		double yatirimMiktari = giris.nextDouble();
		
		System.out.println("yillik faiz oranini yuzde olarak giriniz : ");
		double yillikFaizOrani = giris.nextDouble();
		double aylikFaizOrani = yillikFaizOrani / 1200;
		
		System.out.println("yil sayisini giriniz : ");
		double yilSayisi = giris.nextDouble();
		
		double yatiriminGeriDonusDegeri = yatirimMiktari * Math.pow(1 + aylikFaizOrani, (yilSayisi * 12));
		
		System.out.println(yatiriminGeriDonusDegeri);
		
	}

}
