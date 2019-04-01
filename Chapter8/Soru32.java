package Chapter8;

import java.util.Scanner;

public class Soru32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("x1, y1, x2, y2, x3, y3’u giriniz: ");

		double[][] ucgeninNoktalari = ucgeninNoklariniEkle(input);

		double ucgeninAlani = ucgeninAlaniniHesapla(ucgeninNoktalari);

		double ucgeninYeri = ucgeninYeri(ucgeninNoktalari);

		if (ucgeninYeri == 0) {
			System.out.println("Ayni dogru uzerindedir");
		} else {
			System.out.println("Ucgenin alani : " + ucgeninAlani);
		}

	}

	private static double[][] ucgeninNoklariniEkle(Scanner input) {
		double[][] dizi = new double[3][2];
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				dizi[i][j] = input.nextDouble();
			}
		}
		return dizi;
	}

	private static double ucgeninAlaniniHesapla(double[][] ucgeninNoktalari) {
		double side1 = Math.pow(Math.pow(ucgeninNoktalari[1][0] - ucgeninNoktalari[2][0], 2)
				+ Math.pow(ucgeninNoktalari[1][1] - ucgeninNoktalari[0][1], 2), 0.5);
		double side2 = Math.pow(Math.pow(ucgeninNoktalari[2][0] - ucgeninNoktalari[1][0], 2)
				+ Math.pow(ucgeninNoktalari[2][1] - ucgeninNoktalari[1][1], 2), 0.5);
		double side3 = Math.pow(Math.pow(ucgeninNoktalari[0][0] - ucgeninNoktalari[2][0], 2)
				+ Math.pow(ucgeninNoktalari[0][1] - ucgeninNoktalari[2][0], 2), 0.5);

		double s = (side1 + side2 + side3) / 2;

		double alan = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		return alan;
	}

	public static double ucgeninYeri(double[][] ucgeninNoktalari) {
		return (ucgeninNoktalari[1][0] - ucgeninNoktalari[0][0]) * (ucgeninNoktalari[2][1] - ucgeninNoktalari[0][1])
				- (ucgeninNoktalari[2][0] - ucgeninNoktalari[0][0]) * (ucgeninNoktalari[1][1] - ucgeninNoktalari[0][1]);
	}
}
