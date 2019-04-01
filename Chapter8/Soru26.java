package Chapter8;

import java.util.Scanner;

public class Soru26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("3 satir degerleri giriniz");

		double[][] deegerler = degerleriGir(input);
		
		degerleriYazdir(deegerler);
		
		satirlariSirala(deegerler);
		
		System.out.println("\nDegerlerin siralanmis hali");
		
		degerleriYazdir(deegerler);
	}



	private static double[][] degerleriGir(Scanner input) {
		double[][] degerler = new double[3][3];

		for (int i = 0; i < degerler.length; i++) {
			for (int j = 0; j < degerler.length; j++) {
				degerler[i][j] = input.nextDouble();
			}
		}
		return degerler;
	}
	
	private static double[][] satirlariSirala(double[][] deegerler) {
		for (int i = 0; i < deegerler.length; i++) {
			for (int j = 0; j < deegerler[i].length -1; j++) {
				if(deegerler[i][j] > deegerler[i][j+1]) {
					double temp = deegerler[i][j];
					deegerler[i][j] = deegerler[i][j+1];
					deegerler[i][j+1] = temp;
				}
			}
		}
		return deegerler;
	}
	
	private static void degerleriYazdir(double[][] deegerler) {
		for (double[] satir : deegerler) {
			for (double sutun : satir) {
				System.out.print(sutun + " ");
			}
			System.out.println();
		}
		
	}

}
