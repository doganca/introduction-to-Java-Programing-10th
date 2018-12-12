package Chapter5;

public class Soru35 {
	public static void main(String[] args) {
		double cikacakSonuc = 1 / (1 + Math.sqrt(2));

		for (int i = 2, j = 3; i <= 624 && j <= 625; i++, j++) {
			cikacakSonuc += 1 / (Math.sqrt(i) + Math.sqrt(j));
		}
		System.out.printf("Toplama isleminin sonucu : %2.2f", cikacakSonuc);
	}

}
