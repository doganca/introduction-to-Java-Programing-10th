package Chapter2;

import java.util.Scanner;

public class Soru11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("yil sayisi girin ");
		
		int hesaplanacakYil = input.nextInt();
		
		int dogum = 7;
		int olum = 13;
		int gocmen = 45;
		
		int nufus = 312_032_486;
		
		double yildakiSaniye = (365 * 24 * 60 * 60);
		
		double yildakiDogum = yildakiSaniye / dogum;
		double yildakiOlum = yildakiSaniye / olum;
		double yildakiGocmen = yildakiSaniye / gocmen;
		
		double toplamDegisim =  hesaplanacakYil * (yildakiDogum - yildakiOlum + yildakiGocmen) ;
		
		System.out.println(hesaplanacakYil + " yil sonra nufus : " + (int)(nufus + toplamDegisim));
		
	}

}
