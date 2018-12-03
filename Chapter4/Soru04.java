package Chapter4;

import java.util.Scanner;

public class Soru04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("kenar uzunlugunu giriniz");
		double kenarUzunlugu = input.nextDouble();
		
		double alan = 6 * Math.pow(kenarUzunlugu, 2) / (4 * Math.tan(Math.PI / 6));
		
		System.out.println("altigenin alani " + alan + " dir");
	}

}
