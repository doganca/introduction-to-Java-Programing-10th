package Chapter6;

public class Soru04 {
	public static void main(String[] args) {
		System.out.println(tersentenGoster(456));
	}

	private static String tersentenGoster(int sayi) {
		String tersYazilis = "";
		int temp;

		while (sayi > 0) {
			temp = sayi % 10;
			sayi /= 10;
			tersYazilis += temp;
		}
		return tersYazilis;
	}
}
