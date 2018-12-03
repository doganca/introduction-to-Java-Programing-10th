package Chapter3;

import java.util.Scanner;

public class Soru28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("r1’in merkez x ve y koordinatlarini, enini ve boyunu giriniz");
		double r1x = input.nextDouble();
		double r1y = input.nextDouble();
		double r1Eni = input.nextDouble();
		double r1Boyu = input.nextDouble();
		
		System.out.println("r2’nin merkez x ve y koordinatlarini, enini ve boyunu giriniz");
		double r2x = input.nextDouble();
		double r2y = input.nextDouble();
		double r2Eni = input.nextDouble();
		double r2Boyu = input.nextDouble();
		
		if((Math.pow(Math.pow(r2y - r1y, 2), .05) + r2Boyu / 2 <= r1Boyu / 2) &&
				(Math.pow(Math.pow(r2x - r1x, 2), .05) + r2Eni / 2 <= r1Eni /2) &&
				(r1Boyu / 2 + r2Boyu / 2 <= r1Boyu) && (r1Eni / 2 + r2Eni / 2 <= r1Eni)) {
			System.out.println("r2 r1'in icerisinde");
		}else if((r1x + r1Eni / 2  > r2x - r2Eni) || (r1y + r1Boyu / 2 > r2y - r2Boyu )) {
			System.out.println("r2, r1’le kesisir.");
		}else {
			  System.out.println(" r2, r1’le kesismez.");
		}

		
		
	}
}
