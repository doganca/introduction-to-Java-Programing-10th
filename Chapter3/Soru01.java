package Chapter3;

import java.util.Scanner;

public class Soru01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(" a , b , c degerlerini giriniz : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double diskirimant = Math.pow((b * b - (4 * (a * c))), 0.5);
		
		double r1 =((-1 * b) + diskirimant) / 2 * a ;
		double r2 = ((-1 * b) - diskirimant) / 2 * a;
		
		if(diskirimant >= 1 ) {
			System.out.println("denkglemin iki gercek koku vardir " + r1 + " ve" + r2);
		}else if(diskirimant == 0) {
			System.out.println("denklemin bir koku vardir :  " + (int)r1);
		}else {
			System.out.println("denklemin hicbir koku yoktur.");
		}
	}

}
