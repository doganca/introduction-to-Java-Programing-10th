package Chapter3;

import java.util.Scanner;

public class Soru31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("dolar kurunu giriniz : ");
		double dolarKuru = input.nextDouble();
		
		System.out.println("dolari tl cevirmek icin 0 i , TL yi dolara cevirmek icin 1 i girin ");
		int islem = input.nextInt();
		
		double miktar ;
		
		switch (islem) {
		case 0:
			System.out.println("dolar miktarini girin :");
			miktar = input.nextDouble();
			System.out.println(miktar * dolarKuru + " TL");
			
			break;
		case 1: 
			System.out.println("TL miktarini giriniz :");
			miktar = input.nextDouble();
			System.out.println((int)(miktar / dolarKuru) + " USD");
			break;

		default:
			System.out.println("yanlis giris yaptiniz.");
			break;
		}
	}

}
