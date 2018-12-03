package Chapter2;

import java.util.Scanner;

public class Soru03 {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("feet degeri giriniz "); 
		
		double feet = giris.nextDouble();
		double metre = feet * 0.305;
		
		System.out.println(feet + " feet" + " " + metre + " metredir");
		
	}

}
