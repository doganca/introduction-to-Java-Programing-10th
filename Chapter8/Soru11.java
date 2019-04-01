package Chapter8;

import java.util.Scanner;

public class Soru11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("0 - 511 arasi sayi girin");

		int sayi = input.nextInt();

		String ikilikTabandaSayi = ikilikTabandaSayiyiBul(sayi);
		
		

	}

	private static String ikilikTabandaSayiyiBul(int sayi) {
		String donusum = "";
		while(sayi > 0) {
			donusum += sayi % 2;
			sayi /= 2;
		}

		donusum = basinaSifirEkle(donusum);
		donusum = tersCevir(donusum);
		return donusum;
	}

	private static String basinaSifirEkle(String donusum) {
		int kacKereDonecek = 9 - donusum.length();
		for (int i = 0; i < kacKereDonecek; i++) {
			donusum += 0;
		}
		return donusum;
	}

	private static String tersCevir(String donusum) {
		char[] donusumChr = donusum.toCharArray();
		for (int i = 0, j = donusumChr.length -1; i < donusumChr.length / 2; i++, j--) {
			char temp = donusumChr[i];
			donusumChr[i] = donusumChr[j];
			donusumChr[j] = temp;
		}
		return new String(donusum);
	}
}
