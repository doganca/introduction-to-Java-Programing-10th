package Chapter8;

import java.util.Scanner;

public class Soru01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("3x4 luk matrisi sirasiyla giriniz");
		double[][] matris = matriseDegerleriGir(input);
		sutunToplamlariniYazdir(matris);
	}


	private static double[][] matriseDegerleriGir(Scanner input) {
		double[][] matris = new double[3][4];
		
		for (int satir = 0; satir < matris.length; satir++) {
			for (int sutun = 0; sutun < matris[satir].length; sutun++) {
				matris[satir][sutun] = input.nextDouble();
			}
		}
		return matris;
	}
	
	private static void sutunToplamlariniYazdir(double[][] matris) {
		for (int sutun = 0; sutun < matris.length + 1; sutun++) {
			double toplam = 0;
			for (int satir = 0; satir < matris.length; satir++) {
				toplam += matris[satir][sutun];
			}
			System.out.println((sutun +1) + ". sutunun toplami : " + toplam);
		}
		
	}
}
