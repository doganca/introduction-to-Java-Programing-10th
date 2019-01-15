package Chapter6;

public class Soru32 {
	public static void main(String[] args) {
		int oynanOyunSayisi = 0;
		int kazanilanOyunSayisi = 0;

		while (oynanOyunSayisi < 10_000) {
			if (crapsOyunu()) {
				kazanilanOyunSayisi++;
			}
			oynanOyunSayisi++;
		}
		System.out.println(oynanOyunSayisi + " kere oynandi ve " + kazanilanOyunSayisi + " kere kazanildi");

	}

	public static boolean crapsOyunu() {
		int toplam = zar1() + zar2();
		if (sonuc(toplam)) {
			return true;
		} else {
			return false;
		}
	}

	private static int zar1() {
		int zar = 0;
		while (zar == 0) {
			zar = (int) (Math.random() * 7);
		}
		return zar;
	}

	private static int zar2() {
		int zar = 0;
		while (zar == 0) {
			zar = (int) (Math.random() * 7);
		}
		return zar;
	}

	private static boolean sonuc(int toplam) {

		if (toplam == 2 || toplam == 3 || toplam == 12) {
			return false;
		} else if (toplam == 7 || toplam == 11) {
			return true;
		} else {
			return yeniOyun(toplam);
		}
	}

	private static boolean yeniOyun(int eskiSayi) {
		int toplam = 0;

		while (true) {
			toplam = zar1() + zar2();

			if (eskiSayi == toplam) {
				return true;
			} else if (toplam == 7) {
				return false;
			}
		}
	}

}
