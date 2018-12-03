package Chapter4;

import java.util.Scanner;

public class Soru23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calisanin adini giriniz");
		String ad = input.nextLine();
		
		System.out.println("haftalik calisma saatini giriniz");
		int calismaSaati = input.nextInt();
		
		System.out.println("saatlik ucretini giriniz");
		double saatlikUcret = input.nextDouble();
		
		System.out.println("gelir vergisi oranini giriniz");
		double gelirVergisi = input.nextDouble();
		
		System.out.println("stopaj vergisi oranini giriniz");
		double stopajVergisi = input.nextDouble();
		
		double brutUcret = calismaSaati * saatlikUcret;
		double gelirVergisiHesap = brutUcret * gelirVergisi;
		double stopajVergisiHesap = brutUcret * stopajVergisi;
		double toplamIndirim = gelirVergisiHesap + stopajVergisiHesap;
		double netUcret = brutUcret - toplamIndirim;
		
		
		System.out.println("Calisanin adi : " + ad + "\nHaftalik calisma saati : " + calismaSaati + "\nSaatlik ucret : " + saatlikUcret 
				+ "\nBurut ucret : " + brutUcret + "\nIndirimler : " + "\n\tgelir vergisi : " + gelirVergisiHesap 
				+ "\n\tStopaj vergisi : " + stopajVergisiHesap + "\n\tToplam indirim : " + toplamIndirim + "\nNet ucret : " + netUcret );
	}

}
