package Chapter5;

import java.util.Scanner;

public class Soru46 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Yazi giriniz");
		String girilenYazi = input.nextLine();
		
		for (int i = girilenYazi.length(); i > 0; i--) {
			System.out.print(girilenYazi.charAt(i - 1));
		}
	}

}
