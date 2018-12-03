package Chapter2;

import java.util.Scanner;

public class Soru17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("-58 f ile  + 48 arasinda bir sicaklik giriniz");
		double sicaklikDegeri = input.nextDouble();
		System.out.println("ruzgar hiz degerini giriniz");
		double ruzgarHizDegeri = input.nextDouble();
		
		
		double hissedilenSicaklik = 35.74 + (0.6215 * sicaklikDegeri) - (35.75 * Math.pow(ruzgarHizDegeri, 0.16)) + (0.4275 * (sicaklikDegeri * Math.pow(ruzgarHizDegeri, 0.16) ));
		System.out.println("hissedilen sicaklik : " + hissedilenSicaklik);
	}
}
