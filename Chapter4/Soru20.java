package Chapter4;

import java.util.Scanner;

public class Soru20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("bir string giriniz");
		String girdi = input.nextLine();
		
		int uzunluk = girdi.length();
		char ilkKarakter = girdi.charAt(0);
		
		System.out.println("girdiginiz string -> " + girdi + "\nstring uzunlugu -> " + uzunluk + "\nIlk karakteri -> " + ilkKarakter);
	}

}
