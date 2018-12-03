package Chapter3;

import java.util.Scanner;

public class Soru14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sayi = (int)(Math.random() * 2);
		
		System.out.println("yazi ise 1 tura ise 0 a basin");
		int kullanici = input.nextInt();
		
		
		if(sayi == 1 && kullanici == 1) {
			System.out.println("tebrikler yazi geldi");
		}else if(sayi == 0 && kullanici == 0) {
			System.out.println("tebrikler tura geldi");
		}else {
			System.out.println("bilemediniz");
		}
		
	}

}
