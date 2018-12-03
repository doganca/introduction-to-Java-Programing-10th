package Chapter2;

import java.util.Scanner;

public class Soru06 {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("1 den 1000 kadar sayi giriniz");
		
		int sayi = giris.nextInt();
		int ucuncuSayi = sayi % 10 ;
		int bol = sayi / 10 ;
		int ikinciSayi = bol % 10;
		int ilkSayi = sayi / 100 ;
		
		int toplam = ilkSayi + ikinciSayi + ucuncuSayi ;
		
		System.out.println("sayi toplamlari : " + toplam);
	}

}
