package Chapter2;

import java.util.Scanner;

public class Soru04 {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("pound olarak deger girin  : ");
		
		double pound = giris.nextDouble();
		double kilo = pound * 0.454;
		
		System.out.println(pound + " pound " + kilo + " kilodur.");
	}

}
