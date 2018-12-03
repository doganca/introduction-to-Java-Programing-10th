package Chapter2;

import java.util.Scanner;

public class Soru14 {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		
		System.out.println("agirligi pound cinsinden girin : ");
		double agirlik = giris.nextDouble();
		
		System.out.println("uzunlugu inc cinsinden girin : ");
		int uzunluk = giris.nextInt();
		
		double kgAgirlik = agirlik * 0.45359237;
		double metreUzunluk = uzunluk * 0.0254;
		
		double vucutKitleIndeksi = kgAgirlik / (metreUzunluk * metreUzunluk);
		
		System.out.println("vucut kitle indeksiniz : " + vucutKitleIndeksi);
	}

}
