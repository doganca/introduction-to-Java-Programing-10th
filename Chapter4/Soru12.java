package Chapter4;

import java.util.Scanner;

public class Soru12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("hex sayisi giriniz");
		String sayi = input.nextLine();
		
		if(sayi == "1" || sayi == "2" || sayi == "3" || sayi == "4" || sayi == "5" 
				|| sayi == "6" || sayi == "7" || sayi =="8" || sayi == "9") {
			System.out.println(sayi);
			
		}

	}
}
