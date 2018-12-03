package Chapter4;

import java.util.Scanner;

public class Soru02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double DUNYA_YARICAP = 6_371.01;
		System.out.println("nokta 1 in enlem ve boylamini derece olarak giriniz");
		double x1= input.nextDouble();
		double y1 = input.nextDouble();
		
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		
		System.out.println("nokta 2 in enlem ve boylamini derece olarak giriniz");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		
		double ikiNoktaMesafe = (DUNYA_YARICAP * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
		
		System.out.println("iki nokta arasi mesafe " + ikiNoktaMesafe + " KM dir");
		
	}

}
