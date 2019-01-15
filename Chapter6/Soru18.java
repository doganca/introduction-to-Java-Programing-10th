package Chapter6;

import java.util.Scanner;

public class Soru18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Sifrenizi giriniz : ");
		String sifre = input.nextLine();
		
		if(!sifreUzunlugu(sifre)) {
			System.out.println("Gecersiz sifre");
			System.out.println("Sifreniz en az 8 karakter olmali");
		}
		if(!sifreIcerigi(sifre)) {
			System.out.println("Gecersiz sifre");
			System.out.println("Sifreniz sadece harf ve rakam icerebilir");		
		}
		if(!sifreRakamSayisi(sifre)) {
			System.out.println("Gecersiz sifre");
			System.out.println("Sifreniz en az iki rakam icermelidir");
		}
		
		System.out.println("Gecerli sifre");
	}

	private static boolean sifreUzunlugu(String sifre) {
		if (sifre.length() < 8) {
			return false;
		} else {
			return true;
		}
	}

	private static boolean sifreIcerigi(String sifre) {
		boolean durum = true;
		for (int i = 0; i < sifre.length(); i++) {
			char ch = sifre.charAt(i);
			if ((ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
				durum = true;
			} else {
				durum = false;
			}
		}
		return durum;
	}

	private static boolean sifreRakamSayisi(String sifre) {
		int sayac = 0;

		for (int i = 0; i < sifre.length(); i++) {
			char ch = sifre.charAt(i);
			if ((ch >= 48 && ch <= 57)) {
				sayac++;
			}
		}
		
		if (sayac >= 2) {
			return true;
		} else {
			return false;
		}
	}
}
