package Chapter5;

import java.util.Scanner;

public class Soru48 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("bir yazi giriniz");
		String girilenYazi = input.nextLine();
		
		for (int i = 0; i <= girilenYazi.length(); i++) {
			if (i % 2 != 0) {
				System.out.print(girilenYazi.charAt(i - 1));
			}
		}
	}

}
