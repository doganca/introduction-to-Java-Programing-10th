package Chapter8;

import java.util.Scanner;

public class Soru35 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Matris buyuklugunu giriniz");
		
		int matrisBuyuklugu = input.nextInt();
		
		int[][] matris = matrisOlustur(matrisBuyuklugu);
		
		matrisiYazdir(matris);
		
		int[] enBuyukBlok = enBuyukBloguBul(matris);
		
		
	}


	private static int[][] matrisOlustur(int matrisBuyuklugu) {
		int[][] matris = new int[matrisBuyuklugu][matrisBuyuklugu];
		
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris.length; j++) {
				matris[i][j] = (int)(Math.random() * 2);
			}
		}
		return matris;
	}
	
	private static void matrisiYazdir(int[][] matris) {
		for (int[] i : matris) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	private static int[] enBuyukBloguBul(int[][] matris) {
		int[] sonuc = new int[3];
		// TODO: 2019-01-29  algoritmayiKuramadim , algoritma kurulacak
		
		return sonuc;
	}
}
