package Chapter6;

import java.util.Scanner;

public class Soru36 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kenar sayisini giriniz");
		int kenarSayisi = input.nextInt();
		
		System.out.println("Kenar uzunlugunu giriniz");
		double kenarUzunlugu = input.nextDouble();
		
		System.out.println(alan(kenarSayisi,kenarUzunlugu));
	}

	private static double alan(int kenarSayisi, double kenarUzunlugu) {
		double alan = (kenarSayisi * Math.pow(kenarUzunlugu, 2) / (4 * Math.tan(Math.PI / kenarSayisi)));
		return alan;
	}
}
