package Chapter4;

import java.util.Scanner;

public class Soru01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("besgenin merkezindne kosesine kadar olan uzunlugu giriniz");
		double uzunluk = input.nextDouble();
		
		double kenarUzunlugu = ((2 * uzunluk) * Math.sin(Math.PI / 5));
		double alan = ((5 * Math.pow(kenarUzunlugu, 2)) / (4 * Math.tan(Math.PI / 5)));
		
		System.out.println("besgenin alani : " + alan);
	}

}
