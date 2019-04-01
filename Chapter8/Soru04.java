package Chapter8;

import java.util.Scanner;

public class Soru04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Calisan sayisini giriniz");
		int calisanSayisi = input.nextInt();

		int[][] haftalikCalismaTablosu = new int[calisanSayisi][7];

		calismaSaatleriniHaftalikCalismaTablosunaGir(input, haftalikCalismaTablosu);

		int[][] calismaSaatleri = haftalikCalismaSaatleriniTopla(haftalikCalismaTablosu);

		haftalikCalismaSaatleriniSiraliYazdir(calismaSaatleri);

	}

	public static void calismaSaatleriniHaftalikCalismaTablosunaGir(Scanner input, int[][] haftalikCalismaTablosu) {
		for (int i = 0; i < haftalikCalismaTablosu.length; i++) {
			System.out.println((i + 1) + ". ci calisanin gunlere gore calisma saatini giriniz");
			for (int j = 0; j < haftalikCalismaTablosu[7].length; j++) {
				haftalikCalismaTablosu[i][j] = input.nextInt();
			}
		}
	}
	
	public static int[][] haftalikCalismaSaatleriniTopla(int[][] haftalikCalismaTablosu) {
		int[][] calismaSaatleri = new int[haftalikCalismaTablosu.length][2];

		for (int i = 0; i < haftalikCalismaTablosu.length; i++) {
			int toplam = 0;
			for (int j = 0; j < haftalikCalismaTablosu[7].length; j++) {
				toplam += haftalikCalismaTablosu[i][j];
				calismaSaatleri[i][0] = i;
				calismaSaatleri[i][1] = toplam;
			}
		}
		return calismaSaatleri;
	}

	private static void haftalikCalismaSaatleriniSiraliYazdir(int[][] calismaSaatleri) {
		calisanlariCalismaSaatineGoreSirala(calismaSaatleri);

		calisanlariSiraliYazdir(calismaSaatleri);

	}

	public static void calisanlariCalismaSaatineGoreSirala(int[][] calismaSaatleri) {
		for (int i = 0; i < calismaSaatleri.length; i++) {
			int indeksNumarasi = calismaSaatleri[i][0];
			int calismaSaati = calismaSaatleri[i][1];
			int satir = i;

			for (int j = i + 1; j < calismaSaatleri.length; j++) {
				if (calismaSaati < calismaSaatleri[j][1]) {
					calismaSaati = calismaSaatleri[j][1];
					indeksNumarasi = calismaSaatleri[j][0];
					satir = j;
				}
			}

			if (satir != i) {
				calismaSaatleri[satir][1] = calismaSaatleri[i][1];
				calismaSaatleri[satir][0] = calismaSaatleri[i][0];
				calismaSaatleri[i][1] = calismaSaati;
				calismaSaatleri[i][0] = indeksNumarasi;
			}
		}
	}

	public static void calisanlariSiraliYazdir(int[][] calismaSaatleri) {
		for (int i = 0; i < calismaSaatleri.length; i++) {
			System.out
					.println((calismaSaatleri[i][0] + 1) + ". ci calisan haftada " + calismaSaatleri[i][1] + " saat calisti");
		}
	}


}
