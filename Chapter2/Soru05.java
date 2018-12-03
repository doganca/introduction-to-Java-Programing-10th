package Chapter2;

import java.util.Scanner;

public class Soru05 {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("ara toplam ve komisyon oranini giriniz : ");
		double araToplam = giris.nextDouble();
		double komisyon = giris.nextDouble();
		
		double komisyonMikrati = (araToplam * komisyon) / 100; 
		double toplam = komisyonMikrati + araToplam;
		
		System.out.println("komisyon : " + komisyonMikrati + " ve toplam " + toplam + " dir.");
	}

}
