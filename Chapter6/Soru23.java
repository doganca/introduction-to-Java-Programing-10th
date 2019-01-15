package Chapter6;

public class Soru23 {
	public static void main(String[] args) {
		System.out.println(kelimeIcerindekiHarfSaysisi("aaaaaasssaa", 'a'));
		
	}

	private static int kelimeIcerindekiHarfSaysisi(String kelime, char aranan) {
		int sayac = 0;
		
		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i) == aranan) {
				sayac++;
			}
		}
		return sayac;
	}
}
