package Chapter8;

import java.util.Scanner;

public class Soru06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("1. matrisi giriniz");

		double[][] matris1 = matrisDegerleriniGir(input);
		
		System.out.println("2. matrisi giriniz ");
		
		double[][] matris2 = matrisDegerleriniGir(input);
		
		double[][] ikiMatrisinCarpimi = ikiMatrisiCarp(matris1,matris2);
		
		matrisiYazdir(matris1,matris2,ikiMatrisinCarpimi);
	}



	private static double[][] matrisDegerleriniGir(Scanner input) {
		double matris[][] = new double[3][3];
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris.length; j++) {
				matris[i][j] = input.nextDouble();
			}
		}

		return matris;
	}
	
	private static double[][] ikiMatrisiCarp(double[][] matris1, double[][] matris2) {
		double[][] carpim = new double[3][3];
		for (int i = 0; i < carpim.length; i++) {
			for (int j = 0; j < carpim.length; j++) {
				for (int k = 0; k < carpim.length; k++) {
					carpim[i][j] = matris1[i][k] * matris2[k][j] + carpim[i][j];
				}
			}
		}
		return carpim;
	}
	
	private static void matrisiYazdir(double[][] matris, int index) {
		for (int i = 0; i < matris[index].length; i++) {
			System.out.printf("%3.1f ", matris[index][i]);
		}
	}
	
	private static void matrisiYazdir(double[][] matris1, double[][] matris2, double[][] ikiMatrisinCarpimi) {
		for (int i = 0; i < ikiMatrisinCarpimi.length; i++) {
			matrisiYazdir(matris1, i);
			System.out.print(i == 1 ? " X  " : "    ");
			matrisiYazdir(matris2, i);
			System.out.print(i == 1 ? " =  " : "    ");
			matrisiYazdir(ikiMatrisinCarpimi, i);
			System.out.println();
		}
		
	}


}
