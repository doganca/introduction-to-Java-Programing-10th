package Chapter2;

import java.util.Scanner;

public class Soru15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("x1 ve y1 giriniz ;");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.println("x2 ve y2 giriniz");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double islem = Math.sqrt((Math.pow((x2 - x1), 2.0)) + (Math.pow((y2 - y1), 2.0)));
		
		System.out.println(islem);
	}

}
