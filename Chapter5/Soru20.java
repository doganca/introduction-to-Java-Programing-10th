package Chapter5;

public class Soru20 {
	public static void main(String[] args) {
		int sayac = 0;
		int sayi = 2;

		while (sayi < 1000) {
			boolean asalMi = true;

			for (int i = 2; i < sayi; i++) {
				if (sayi % i == 0) {
					asalMi = false;
				}
			}
			if (asalMi == true) {
				sayac++;
				if (sayac % 8 == 0) {
					System.out.printf("%3d\n", sayi);
				} else {
					System.out.printf("%3d  ", sayi);
				}

			}
			sayi++;
		}
	}
}
