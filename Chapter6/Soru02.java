package Chapter6;

import java.util.Scanner;

public class Soru02 {
	public static void main(String[] args) {
		Scanner innput = new Scanner(System.in);

		System.out.println("Hangi sayininin basamak degeri toplamini gormek istersiniz ? ");
		long girilenSayi = innput.nextLong();
		
		System.out.println(girilenSayi + " Sayisinin basamak toplami : " + basamakDegeriHesapla(girilenSayi));
	}

	private static long basamakDegeriHesapla(long girilenSayi) {
		long toplam = 0;
		int deger = 0;

		while (girilenSayi > 0) {
			toplam += (int) (girilenSayi % 10);
			girilenSayi /= 10;

		}
		return toplam;
	}
}
