package Chapter3;

import java.util.Scanner;

public class Soru30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("gmt gore bulunan zaman dilimini giriniz");
		int gmt = input.nextInt();
		
		long zaman = System.currentTimeMillis();
		
		long gecenSaniye = zaman / 1000;
		int simdikiSaniye = (int)gecenSaniye % 60;
		
		long gecenDakika = gecenSaniye / 60;
		int simdikiDakika = (int)gecenDakika % 60;
		
		long gecenSaat = gecenDakika / 60;
		int simdikiSaat = (int)gecenSaat % 12;
		
		if(gmt <= 0) {
			System.out.println("suan ki saat" + (simdikiSaat - gmt) + ":" + simdikiDakika + ":" + simdikiSaniye);
		}else {
			System.out.println("suan ki saat" + (simdikiSaat + gmt) + ":" + simdikiDakika + ":" + simdikiSaniye);
		}
	}

}
