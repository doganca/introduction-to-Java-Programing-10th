package Chapter4;

import java.util.Scanner;

public class Soru05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("kenar sayisini giriniz");
		int kenarSayisi = input.nextInt();
		
		System.out.println("kenar uzunlugunu giriniz");
		double kenarUzunlugu = input.nextDouble();
		
		double alan = kenarSayisi * Math.pow(kenarUzunlugu, 2) / (4 * Math.tan(Math.PI / kenarSayisi));
		
		System.out.println("cokgenin alani " + alan + " dir");
		
		        
	}

}
