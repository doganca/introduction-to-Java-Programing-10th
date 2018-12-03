package Chapter3;

import java.util.Scanner;

public class Soru26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int sayi = input.nextInt();
		
		if(sayi % 5 == 0 && sayi % 6 == 0) {
			System.out.print(sayi + " 5 ve 6 ya tam bolunebilir mi ? ");
			System.out.println(" dogru");
		}else {
			System.out.print(sayi + " 5 ve 6 ya tam bolunebilir mi ? : ");
			System.out.println(" yanlis");
			
		}
		if(sayi % 5 == 0 || sayi % 6 == 0) {
			System.out.print(sayi + " 5 veya 6 ya bolunebilir mi ? : ");
			System.out.println(" dogru");
		}else {
			System.out.print(sayi + " 5 veya 6 ya bolunebilir mi ? : ");
			System.out.println(" yanlis");
			
		}
		if(sayi % 5 == 0 ^ sayi % 6 == 0) {
			System.out.print(sayi + " 5 yada 6 ya bolunebilir ama her ikisine birden bolunemez mi ? : ");
			System.out.println(" dogru");
		}else {
			System.out.print(sayi + " 5 yada 6 ya bolunebilir ama her ikisine birden bolunemez mi ? : ");
			System.out.println(" yanlis");
		}
	}

}
