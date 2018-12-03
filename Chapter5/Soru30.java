package Chapter5;

import java.util.Scanner;

public class Soru30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Para miktarini giriniz :");
		double paraMiktari = input.nextInt();

		System.out.print("Yillik faiz oranini giriniz(ornegin 5)");
		double yillikFaizOrani = input.nextDouble();

		System.out.print("Kac aydan sonrasini gormek istiyorsunuz :");
		int kacAySonrasi = input.nextInt();

		double aylikFaizOrani = (yillikFaizOrani / 100) / 12;

		double toplamBirikenPara = 0;


		for (int i = 1; i <= kacAySonrasi; i++) {
			toplamBirikenPara = (paraMiktari +toplamBirikenPara) * (1 + aylikFaizOrani);
			System.out.printf("%d ay sonunda para mikrati %3.3f\n" ,i, toplamBirikenPara);

		}
	}

}
