package Chapter5;

public class Soru19 {
	public static void main(String[] args) {

		for (int i = 0; i < 8; i++) {
			for (int j = 8 - 1 - i; j > 0; j--) {
				System.out.print("    ");
			}
			for (int j = 0; j < i; j++) {
				System.out.printf("%4d", (int) Math.pow(2, j));
			}
			for (int j = i; j >= 0; j--) {
				System.out.printf("%4d", (int) Math.pow(2, j));
			}
			System.out.println();
		}
	}
}
