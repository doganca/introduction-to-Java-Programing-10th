package Chapter6;

public class Soru06 {
	public static void main(String[] args) {
		patternGoster(6);
	}

	private static void patternGoster(int girilenSayi) {
		for (int i = 1; i <= girilenSayi; i++) {
			for (int j = girilenSayi * 2 - i; j > i; j--) {
				System.out.print("  ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.printf("%-3d", j);
				if (j > 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
