package Chapter2;

import java.util.Scanner;

public class Soru02 {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("silindirin alanini ve hacmini girin");
		double yariCap = giris.nextDouble();
		double yukseklik = giris.nextDouble();
		
		double alan = yariCap * yariCap * Math.PI;
		double hacim = alan * yukseklik; 
		
		System.out.println("alani :  " + alan + " " + " hacmi : " + hacim );
	}

}
