package Chapter3;

import java.util.Scanner;

public class Soru32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("p0, p1 ve p2 icin uc nokta giriniz");
		double p0x = input.nextDouble();
		double p0y = input.nextDouble();
		double p1x = input.nextDouble();
		double p1y = input.nextDouble();
		double p2x = input.nextDouble();
		double p2y = input.nextDouble();
		
		double pozisyon = ((p1x - p0x) * (p2y - p0y) - (p2x - p0x) * (p1y - p0y));
		
		if(pozisyon > 0) {
			System.out.println("sol tarafta bulunur");
		}else if(pozisyon == 0) {
			System.out.println("ustunde bulunur");
		}else {
			System.out.println("sag tarafinda bulunur");
		}
	}

}
