package Chapter5;

public class Soru40 {
	public static void main(String[] args) {

		int yazi = 0;
		int tura = 0;

		for (int i = 0; i <= 1_000_000; i++) {
			int yaziMiTuraMi = (int) (Math.random() * 2);

			if (yaziMiTuraMi > 0) {
				yazi++;
			} else {
				tura++;
			}
		}

		System.out.println("yazi sayisi : " + yazi + "\ntura sayisi : " + tura);
	}
}
