package Chapter3;

import java.util.Scanner;

public class Soru27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("x ve y noktalarini giriniz : ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double xKesisiyorMu = (-x * (200 * 100)) / (-y * 200 - x * 100);
		double yKesisiyorMu = (-y * (200 * 100)) / (-y * 200 - x * 100);
		
		if(x > xKesisiyorMu || y > yKesisiyorMu) {
			System.out.println(x + " , " + y + "noktalari ucgenin icerisinde");
		}else {
			System.out.println(x + " , " + y + " noktalari ucgenin icerisinde degiller");
		}
	}
	// hata var

}
