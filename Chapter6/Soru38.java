package Chapter6;

public class Soru38 {/*
						 * public class Soru16 { public static void main(String[] args) { int
						 * rasgeleSayi = 65 + (int)(Math.random() * (91 - 65));
						 * 
						 * System.out.println(rasgeleSayi);
						 * 
						 * char harf = (char) rasgeleSayi; System.out.println(harf); }
						 * 
						 * }
						 */
	public static void main(String[] args) {
		rasgeleBuyukHarf(100);
		System.out.println();
		rasgeleSayi(100);
	}

	private static void rasgeleBuyukHarf(int i) {
		int sayac = 1;

		for (int j = 0; j < i; j++) {
			int rasgeleSayi = 65 + (int) (Math.random() * (91 - 65));
			if (sayac % 10 != 0) {
				System.out.print((char) rasgeleSayi + " ");
				sayac++;
			} else {
				System.out.println((char) rasgeleSayi);
				sayac++;
			}
		}
	}

	private static void rasgeleSayi(int i) {
		int sayac = 1;
		for(int j = 0; j < i; j++) {
			int rasgeleSayi = 48 + (int)(Math.random() * (58 - 48));
			if(sayac % 10 != 0) {
				System.out.print((char)rasgeleSayi + " ");
			}else {
				System.out.println((char)rasgeleSayi);
			}
			sayac++;
		}
	}

}
