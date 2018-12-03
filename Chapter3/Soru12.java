package Chapter3;

import java.util.Scanner;

public class Soru12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("uc basamakli bir sayi giriniz");
		int sayi = input.nextInt();
		
		int birlerBasamagi = (sayi % 100) % 10;
		int yuzlerBasamagi = sayi / 100;
		
		if(birlerBasamagi == yuzlerBasamagi) {
			System.out.println(sayi + " sayisi polinomdur");
		}else {
			System.out.println(sayi + " sayisi polinom degildir.");
		}
		
		
	}

}
