package Chapter4;

import java.util.Scanner;

public class Soru11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("0-15 arasinda bir sayi giriniz");
		int girilenSayi = input.nextInt();
		
		if(girilenSayi < 9) {
			System.out.println(girilenSayi);
		}else if(girilenSayi == 10) {
			System.out.println("A");
		}else if(girilenSayi == 11) {
			System.out.println("B");
		}else if(girilenSayi == 12) {
			System.out.println("C");
		}else if(girilenSayi == 13) {
			System.out.println("D");
		}else if(girilenSayi == 14) {
			System.out.println("E");
		}else if(girilenSayi == 15) {
			System.out.println("F");
		}else {
			System.out.println(girilenSayi + " sayisi 15 ten buyuktur gecersizdir.");
		}
	}

}
