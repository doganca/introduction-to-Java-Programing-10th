package Chapter2;

import java.util.Scanner;

public class Soru13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(" biriktilen aylik para miktarini giriniz : ");
		
		
		double aylikEklenenMiktar = input.nextDouble();
		double aylikFaiz = (1 + 0.00417);
		double hesaptakiParaMiktari = 0;

		// 1. ay
		hesaptakiParaMiktari += aylikEklenenMiktar;
		hesaptakiParaMiktari *= aylikFaiz;

		// 2. ay
		hesaptakiParaMiktari += aylikEklenenMiktar;
		hesaptakiParaMiktari *= aylikFaiz;

		// 3. ay
		hesaptakiParaMiktari += aylikEklenenMiktar;
		hesaptakiParaMiktari *= aylikFaiz;

		// 4. ay
		hesaptakiParaMiktari += aylikEklenenMiktar;
		hesaptakiParaMiktari *= aylikFaiz;

		// 5. ay
		hesaptakiParaMiktari += aylikEklenenMiktar;
		hesaptakiParaMiktari *= aylikFaiz;

		// 6. ay
		hesaptakiParaMiktari += aylikEklenenMiktar;
		hesaptakiParaMiktari *= aylikFaiz;

		System.out.println((hesaptakiParaMiktari / 100) * 100);
	}
}
