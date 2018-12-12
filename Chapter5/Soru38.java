package Chapter5;

import java.util.Scanner;

public class Soru38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Sekizlik tabana donusecek onluk tabandan sayi giriniz :");
		int girilenSayi = input.nextInt();
		
		String sekizlikTabanTerstenYazilisi = "";
		
		while(girilenSayi > 8) {
			int temp = girilenSayi % 8;
			girilenSayi /= 8;
			sekizlikTabanTerstenYazilisi += temp;
		}
		sekizlikTabanTerstenYazilisi += girilenSayi;
		
		for (int i = sekizlikTabanTerstenYazilisi.length(); i > 0; i--) {
			System.out.print(sekizlikTabanTerstenYazilisi.charAt(i - 1));
		}
	}

}
