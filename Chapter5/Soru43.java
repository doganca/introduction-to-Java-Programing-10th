package Chapter5;

public class Soru43 {
	public static void main(String[] args) {
		int sayac = 0;

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				System.out.println(i + " " + j);
				sayac++;
			}
		}
		System.out.println("tum kombinasyon sayisi : " + sayac + 1);
	}
}
