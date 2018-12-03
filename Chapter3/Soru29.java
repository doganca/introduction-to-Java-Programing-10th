package Chapter3;

import java.util.Scanner;

public class Soru29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" cember1’in merkez x ve y koordinatlarini ve yaricap uzunlugunu giriniz");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double yariCap1 = input.nextDouble();
		
		System.out.println(" cember2’nin merkez x ve y koordinatlarini ve yaricap uzunlugunu giriniz");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double yaricap2 = input.nextDouble();
		
		if((Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5)) <= Math.abs(yariCap1 - yaricap2)) {
			System.out.println("cember2, cember1’in icindedir.");
		}else if(Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) <= yariCap1 + yaricap2) {
			System.out.println("cember2, cember1’le kesisir.");
		}else {
			System.out.println("cember2, cember1’le kesismez.");
		}
	}
}
