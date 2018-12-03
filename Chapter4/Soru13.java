package Chapter4;

import java.util.Scanner;

public class Soru13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("bir harf giriniz : ");
		String harf = input.nextLine();
		
		harf = harf.trim();
		char harfCh = harf.charAt(0);
		
		int harfNo = harfCh;
		
		if((harfNo >= 65 && harfNo <= 90) || (harfNo >= 97 && harfNo <= 122)) {
			if(harf.toUpperCase().equals("A")) {
				System.out.println(harf + " sesli bir harf");
			}else if(harf.toUpperCase().equals("E")) {
				System.out.println(harf + " sesli bir harf");
			}else if(harf.toUpperCase().equals("I")) {
				System.out.println(harf + " sesli bir harf");
			}else if(harf.toUpperCase().equals("O")) {
				System.out.println(harf + " sesli bir harf");
			}else if(harf.toUpperCase().equals("U")) {
				System.out.println(harf + " sesli bir harf");
			}else {
				System.out.println(harf + " sesli bir harf degildir");
			}
		}else {
			System.out.println(harf + " gecersiz bir giris");
		}
		
		
	}

}
