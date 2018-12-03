package Chapter2;

import java.util.Scanner;

public class Soru07 {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("dakikayi girin");
		
		int dakika = giris.nextInt();
		int gun = ((dakika / 60)/ 24);
		int yil = (gun / 365) ;
		int kalanGun = (gun % 365);
		System.out.println(dakika + " dakika " + yil + " yil ve " + kalanGun + " gundur");
	}

}
