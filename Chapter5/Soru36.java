package Chapter5;

import java.util.Scanner;

public class Soru36 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ilk 9 basamaktaki sayilari giriniz, ilk sayi 0 olmali");
		
		int d10 = 0;
		for (int i = 1; i <= 9; i++) {
			System.out.println("ilk 9 basamak sayisini giriniz , ilk sayi 0 olmali");
			d10 = input.nextInt();
			d10 += (d10 * i) % 11;
			
		}
		
		if (d10 >= 10) {
			System.out.println(d1 + ""+ d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "x");
		}else {
			System.out.println(d1 + "" + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
		}
	}

}
