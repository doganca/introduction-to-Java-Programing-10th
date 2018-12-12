package Chapter5;

import java.util.Scanner;

public class Soru44 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bir sayi gieiniz");
		short girilenSayi = input.nextShort();
		
		String bitler = "";
		
		for (int i = 0; i < 16; i++) {
			bitler =(girilenSayi & 1) + bitler;
			
			girilenSayi >>= 1;
		}
		System.out.println("Bitler : " + bitler);
	}
}
