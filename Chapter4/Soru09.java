package Chapter4;

import java.util.Scanner;

public class Soru09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("bir harf giriniz");
		String kod = input.nextLine();
		
		char ilkHarf = kod.charAt(0);
		
		int sonuc = ilkHarf;
		
		System.out.println(kod + " harfinin karsiligi " + sonuc);
	}

}
