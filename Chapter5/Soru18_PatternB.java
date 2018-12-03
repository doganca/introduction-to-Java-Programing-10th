package Chapter5;

public class Soru18_PatternB {
	public static void main(String[] args) {
		for (int i = 6; i <= 6; i--) { // 6 defa donecek satir dongusu
			if (i <= 0) {
				break;
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();

		}
	}

}
