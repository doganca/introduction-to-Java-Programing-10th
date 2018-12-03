package Chapter5;

import java.util.Scanner;

public class Soru21 {
	public static void main(String[] args) {

		/*
		 * (Finans uygulaması: farklı faiz oranları için kredi miktarını karşılaştırma)
		 * Kullanıcıdan kredi miktarını ve yıl olarak kredi vadesini alıp, %5’ten %8’e
		 * 1/8 artım ile her bir faiz oranı için aylık ve toplam ödemeyi gösteren bir
		 * program yazınız.
		 */
		Scanner input = new Scanner(System.in);
		
		double  faiz1 = 5;
		int 	faiz2 = 8;

		// kullanicidan istedigi kredi miktarini aliyoruz
		System.out.println("Kredi miktarini girin : ");
		double kMiktari = input.nextDouble();

		// kac yilda odemek istedigini soruyoruz
		System.out.println("Kac yil da odenecek : ");
		int kacYil = input.nextInt();
		
		System.out.println("Faiz orani\t\t Aylik odeme\t\t toplam odeme");
		
		for (double i = faiz1; i <= faiz2; i+= 0.125) {
			System.out.print(i + "\t\t\t   ");
			double aylikFaizOrani = i / 1200;
			double aylikOdeme = kMiktari * aylikFaizOrani / (1 - 1 / Math.pow(1 + aylikFaizOrani 
					, kacYil * 12));
			System.out.printf("%1.2f\t\t   " ,aylikOdeme );
			System.out.printf("%5.3f\n",(aylikOdeme * 12) * kacYil);
		}

	}

}

// %5 ten % 8 kadar faiz arttirma algoritmasinda sikinti yasadim  

