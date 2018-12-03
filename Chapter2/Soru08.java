package Chapter2;
import java.util.Scanner;

public class Soru08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("saat dikimi giriniz ");
		
		int saatDilimi = input.nextInt();
		
		long gecenMilisaniye = System.currentTimeMillis();
		
		long gecenSaniye = (gecenMilisaniye / 1000);
		
		long suankiSaniye = (gecenSaniye % 60);
		
		long gecenDakika = (gecenSaniye / 60);
		
		long suankiDakika = (gecenDakika % 60);
		
		long gecenSaat = (gecenDakika / 60);
		
		long saatGmtHesabi = ((gecenSaat + saatDilimi) % 24);
		
		System.out.println(saatGmtHesabi + ":" + suankiDakika + ":" + suankiSaniye);
	}

}
