package Chapter7;

import java.util.Scanner;

public class Soru30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Girilecek deger sayisini giriniz");
		
		int degerSayisi = input.nextInt();
		
		System.out.println(degerSayisi + "  kadar deger giriniz ");
		
		int[] degerler = degerleriKaydet(input, degerSayisi);
		
		int ardisikDegerSayisi = ardisikDegerBul(degerler);
		
		sonucuYazdir(ardisikDegerSayisi);
		
	}


	private static int[] degerleriKaydet(Scanner input, int degerSayisi) {
		int[] degerler = new int[degerSayisi];
		
		for (int i = 0; i < degerler.length; i++) {
			degerler[i] = input.nextInt();
		}
		return degerler;
	}
	
	private static int ardisikDegerBul(int[] degerler) {
		int ardisikDegerSayisi = 0;
		for (int i = 0, j = 1; i <= degerler.length; i++ ,j++) {
			if((degerler[i] + 1 ) == degerler[j] ) {
				ardisikDegerSayisi++;
			}if(ardisikDegerSayisi >= 4) {
				return ardisikDegerSayisi;
			}
			if(ardisikDegerSayisi < 4 && i == degerler.length - 2) {
				return ardisikDegerSayisi;
			}
		}
		return ardisikDegerSayisi;
	}
	
	private static void sonucuYazdir(int ardisikDegerSayisi) {
		if(ardisikDegerSayisi >= 4) {
			System.out.println("Dizide ardisik 4 deger vardir");
		}else{
			System.out.println("dizide ardisik 4 deger yoktur.");
		}
		
	}

}
