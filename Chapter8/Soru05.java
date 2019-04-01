package Chapter8;

import java.util.Scanner;

public class Soru05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. matrisi giriniz");
		
		int[][] matris1 =degerGir(input);
		
		System.out.println("2. matrisi giriniz");
		
		int[][] matris2 = degerGir(input);
		
		int[][] ikiMatrisinToplami = ikiMatrisiTopla(matris1,matris2);
		
		
		
		matrisiYazdir(ikiMatrisinToplami,matris1,matris2);
		
		
	}

	private static void matrisiYazdir(int[][] matris, int satir) {
		for (int i = 0; i < matris[satir].length; i++) {
			System.out.printf("%3d ",matris[satir][i]);
		}
		
	}
	
	private static void matrisiYazdir(int[][] matris, int[][] matris1, int[][] matris2) {
		for (int i = 0; i < matris2.length; i++) {
			matrisiYazdir(matris1, i);
			System.out.print(i == 1 ? "   +  " : "      ");
			matrisiYazdir(matris2, i);
			System.out.print(i == 1 ? "   =  " : "      ");
			matrisiYazdir(matris, i);
			System.out.println();
		}
		
	}


	

	public static int[][] degerGir(Scanner input) {
		int[][] matris = new int[3][3];
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris.length; j++) {
				matris[i][j] = input.nextInt();
			}
		}
		return matris;
	}
	
	private static int[][] ikiMatrisiTopla(int[][] matris1, int[][] matris2) {
		int[][] toplam = new int[3][3];
		for (int i = 0; i < toplam.length; i++) {
			for (int j = 0; j < toplam.length; j++) {
				toplam[i][j] = matris1[i][j] + matris2[i][j];
			}
		}
		
		return toplam;
	}
}
