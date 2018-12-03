package Chapter5;

public class Soru24 {
	public static void main(String[] args) {
		double toplam = 0;
		for (double i = 1.0, j = 3.0; i < 100.0 && j < 100.0; i+= 2, j+=2) {
			toplam += i / j;
		}
		System.out.printf("serinin toplami: %2.3f  " , toplam);
	}
}
