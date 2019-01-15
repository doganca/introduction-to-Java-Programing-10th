package Chapter7;

import java.util.Scanner;

public class Soru33 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Bir yil giriniz");
		 
		 int girilenYil = input.nextInt();
		 
		 cinTakvimiYazdir(girilenYil);
	}

	private static void cinTakvimiYazdir(int girilenYil) {
		int yilinModunuAl = yilinModu(girilenYil);
		System.out.println(girilenYil + " yili " + hayvanIsmi(yilinModunuAl) + " yilidir");
		
	}

	private static int yilinModu(int girilenYil) {
		
		return girilenYil % 12;
	}
	
	private static String hayvanIsmi(int yilinModunuAl) {
		String[] yilHayvanlari = {"Maymun", "Horoz", "Kopek", "Domuz", "Sican", "Okuz", "kaplan", "Tavsan", "Ejderha", "Yilan", "At", "Koyun" };
		return yilHayvanlari[yilinModunuAl];
	}
}
