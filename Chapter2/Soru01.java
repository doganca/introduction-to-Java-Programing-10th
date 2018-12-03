package Chapter2;

import java.util.Scanner;

public class Soru01 {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Santigrat olarak derece giriniz");
		
		double derece = giris.nextDouble();
		
		double fahrenayt = (9.0 / 5) * derece + 32;
		
		System.out.println(fahrenayt);
	}

}
