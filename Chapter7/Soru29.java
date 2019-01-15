package Chapter7;

public class Soru29 {
	/*
	 * (Oyun: Dört kart çekme) 52 karttan oluşan bir iskambil destesinden 4 kart
	 * çeken ve bu kartların toplam değerini hesaplayan bir program yazınız. As,
	 * Papaz, Kız ve Vale için sayısal değerler sırasıyla 1, 13, 12, 11’dir.
	 * Programınız 24’e ulaşmak için gereken çekme sayısını göstersin.
	 */

	public static void main(String[] args) {
		String[] iskembilDestesiKartlari = { "as", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Vale", "Kiz",
				"Papaz" };

		int[] iskembilDestesi = kartlariKaristir();

		oyunuOyna(iskembilDestesiKartlari, iskembilDestesi);

	}

	public static int[] kartlariKaristir() {
		int[] deste = destegeSayilariEkle();
		for (int i = 0; i < deste.length; i++) {
			int rassalIndeks = (int) (Math.random() * deste.length);

			int temp = deste[i];
			deste[i] = deste[rassalIndeks];
			deste[rassalIndeks] = temp;
		}

		return deste;
	}

	private static int[] destegeSayilariEkle() {
		int deste[] = new int[52];
		for (int i = 0; i < deste.length; i++) {
			deste[i] = i;
		}
		return deste;
	}

	private static void oyunuOyna(String[] iskembilDestesiKartlari, int[] iskembilDestesi) {
		int kartToplami = 0;
		int kartCekmeSayisi = 0;

		while (kartToplami >= 24) {
			kartToplami += kartDegeri(iskembilDestesiKartlari, iskembilDestesi);
			kartCekmeSayisi++;
		}
		
		sonucuYazdir(kartToplami,kartCekmeSayisi);

	}

	private static void sonucuYazdir(int kartToplami, int kartCekmeSayisi) {
		System.out.println("kart toplami : " + kartToplami + " kart cekme sayisi : " + kartCekmeSayisi
				);
	}

	private static int kartDegeri(String[] iskembilDestesiKartlari, int[] iskembilDestesi) {
		int kartDegeri = 0;
		String rasgeleDortKartCek = rasgeleDortKartCek(iskembilDestesiKartlari, iskembilDestesi);
		kartDegeri += kartDegerleriTopla(rasgeleDortKartCek);
		return kartDegeri;
	}

	public static String rasgeleDortKartCek(String[] iskembilDestesiKartlari, int[] iskembilDestesi) {
		String rasgeleKartCek = "";
		for (int i = 0; i < 4; i++) {
			return rasgeleKartCek = iskembilDestesiKartlari[iskembilDestesi[i] % 13];
		}
		return rasgeleKartCek;
	}

	private static int kartDegerleriTopla(String rasgeleDortKartCek) {
		int toplam = 0;
		if (rasgeleDortKartCek.equals("As")) {
			toplam += 1;
		} else if (rasgeleDortKartCek.equals("2")) {
			toplam += 2;
		} else if (rasgeleDortKartCek.equals("3")) {
			toplam += 3;
		} else if (rasgeleDortKartCek.equals("4")) {
			toplam += 4;
		} else if (rasgeleDortKartCek.equals("5")) {
			toplam += 5;
		} else if (rasgeleDortKartCek.equals("6")) {
			toplam += 6;
		} else if (rasgeleDortKartCek.equals("7")) {
			toplam += 7;
		} else if (rasgeleDortKartCek.equals("8")) {
			toplam += 8;
		} else if (rasgeleDortKartCek.equals("9")) {
			toplam += 9;
		} else if (rasgeleDortKartCek.equals("10")) {
			toplam += 10;
		} else if (rasgeleDortKartCek.equals("Vale")) {
			toplam += 11;
		} else if (rasgeleDortKartCek.equals("Kiz")) {
			toplam += 12;
		} else if (rasgeleDortKartCek.equals("Papaz")) {
			toplam += 13;
		}

		return toplam;
	}
aa
}
