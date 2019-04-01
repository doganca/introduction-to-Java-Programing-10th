package Chapter7;

public class Soru29 {
	/*
	 * (Oyun: Dört kart çekme) 52 karttan oluşan bir iskambil destesinden 4 kart
	 * çeken ve bu kartların toplam değerini hesaplayan bir program yazınız. As,
	 * Papaz, Kız ve Vale için sayısal değerler sırasıyla 1, 13, 12, 11’dir.
	 * Programınız 24’e ulaşmak için gereken çekme sayısını göstersin.
	 */

	public static void main(String[] args) {
		int[] deste = desteyeSayiAta(52);

		int sayac = 0;

		do {
			desteyiKaristir(deste);
			sayac++;
		} while (kartCek(deste) != 24);
		
		System.out.println("24 ulasmak icin " + sayac + " kez 4 lu kart cekildi");

	}

	private static int[] desteyeSayiAta(int i) {
		int[] deste = new int[i];
		for (int j = 0; j < deste.length; j++) {
			deste[j] = j;
		}
		return deste;
	}

	private static void desteyiKaristir(int[] deste) {
		for (int i = 0; i < deste.length; i++) {
			int random = (int) (Math.random() * deste.length);
			int temp = deste[i];
			deste[i] = deste[random];
			deste[random] = temp;
		}
	}

	private static int kartCek(int[] deste) {
		int toplam = 0;
		String[] sayi = { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Vale", "Kiz", "Papaz" };
		for (int i = 0; i < 4; i++) {
			int random = (int) (Math.random() * 52);
			String cekilenKart = sayi[random % 13];
			int kartDegeri = kartDegeriBul(cekilenKart);
			toplam += kartDegeri;
		}

		return toplam;

	}

	private static int kartDegeriBul(String cekilenKart) {
		switch (cekilenKart) {
		case "As":
			return 1;
		case "2":
			return 2;
		case "3":
			return 3;
		case "4":
			return 4;
		case "5":
			return 5;
		case "6":
			return 6;
		case "7":
			return 7;
		case "8":
			return 8;
		case "9":
			return 9;
		case "10":
			return 10;
		case "Vale":
			return 11;
		case "Kiz":
			return 12;
		case "Papaz":
			return 13;

		}
		return 0;
	}
}