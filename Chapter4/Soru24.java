package Chapter4;

import java.util.Scanner;

public class Soru24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("uc sehir ismi giriniz");
		String sehir1 = input.next();
		String sehir2 = input.next();
		String sehir3 = input.next();
		
		String temp;
		
		char sehir1Ilk = sehir1.trim().toLowerCase().charAt(0);
		char sehir2Ilk = sehir2.trim().toLowerCase().charAt(0);
		char sehir3Ilk = sehir3.trim().toLowerCase().charAt(0);
		
		if(sehir1Ilk > sehir2Ilk || sehir1Ilk > sehir3Ilk) {
			if(sehir1Ilk > sehir2Ilk) {
				temp = sehir1;
				sehir1 = sehir2;
				sehir2 = temp;
			}
			if(sehir1Ilk > sehir3Ilk) {
				temp = sehir1;
				sehir1 = sehir3;
				sehir3 = temp;
			}
			
		}
		if(sehir2Ilk > sehir3Ilk) {
			temp = sehir2;
			sehir2 = sehir3;
			sehir3 = temp;
		}
		
		System.out.println(sehir1 + "\n" + sehir2 + "\n" + sehir3);
	}

}
