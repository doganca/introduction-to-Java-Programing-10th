package Chapter4;

import java.util.Scanner;

public class Soru08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("bir ascii kodu giriniz");
		int kod = input.nextInt();
		
		char sonuc = (char) kod;
		
		System.out.println(kod + " sayisininin ascii karsiligi " + sonuc);
	}

}