package Chapter6;

public class Soru30 {
	public static void main(String[] args) {

		crapsOyunu();
	}

	public static void crapsOyunu() {
		int toplam = zar1() + zar2();
		System.out.println(zar1() + " + " + zar2() + " = " + toplam + " attiniz");
		sonuc(toplam);
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

	private static void sonuc(int toplam) {
		if (toplam == 2 || toplam == 3 || toplam == 12) {
			System.out.println("Kaybettiniz");
		} else if (toplam == 7 || toplam == 11) {
			System.out.println("Kazandiniz");
		} else {
			System.out.println(toplam + " puan");
			yeniOyun(toplam);
		}
	}

	private static void yeniOyun(int eskiSayi) {
		int toplam = 0;

		while (true) {
			toplam = zar1() + zar2();

			if (eskiSayi == toplam) {
				System.out.println(zar1() + " + " + zar2() + " = " + toplam + " attiniz");
				System.out.println("Kazandiniz");
				break;
			} else if (toplam == 7) {
				System.out.println(zar1() + " + " + zar2() + " = " + toplam + " attiniz");
				System.out.println("Kaybettiniz");
				break;
			}
		}
	}

}
