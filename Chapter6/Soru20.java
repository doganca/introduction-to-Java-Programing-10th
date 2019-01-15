package Chapter6;

import java.util.Scanner;

public class Soru20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Uzunlugunu bulmak istediginiz kelimeyi girin : ");
		String girilenKelime = input.nextLine();
		
		System.out.println("Girdiginiz kelime  : " + girilenKelime + "  uzunlugu --> " + kelimeUzunlugu(girilenKelime));
	}

	private static int kelimeUzunlugu(String girilenKelime) {
		int uzunluk = girilenKelime.length();
		return uzunluk;
	}

}
