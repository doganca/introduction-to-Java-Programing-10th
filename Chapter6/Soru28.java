package Chapter6;

public class Soru28 {
	public static void main(String[] args) {
		mesaneAsalSayilar(31);
	}

	private static void mesaneAsalSayilar(int i) {
		int sayi = 2;
		int asal = sayi;
		;

		int mersameAsal = 0;

		ustYazi();
		do {
			mersameAsal = (int) Math.pow(2, asal) - 1;
			if (asalMi(sayi) && asalMi(mersameAsal)) {
				System.out.println(sayi + "       " + (int) mersameAsal);
			}
			sayi++;
			asal = sayi;
		} while (sayi <= i);

	}

	private static void ustYazi() {
		System.out.println("P       2^p-1");
		System.out.println("--------------");

	}

	private static boolean asalMi(double mersameAsal) {
		boolean asalMi = true;
		for (int i = 2; i < mersameAsal; i++) {
			if (mersameAsal % i == 0) {
				asalMi = false;
			}
		}
		return asalMi;

	}

}
