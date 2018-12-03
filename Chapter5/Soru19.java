package Chapter5;

public class Soru19 {
	public static void main(String[] args) {
		for (int i = 1; i <= 128; i += i) {
			for (int j = i; j < 128; j+= j) {
				System.out.print(j+ " ");
			}
			for (int j = i; j >= 1; j -= i) {
				System.out.printf("%-1d", j);
				while (j >= 1) {
					j /= 2;
					if (j > 0)
						if (j < 10) {
							System.out.printf("%2d", j);
						} else if (j > 10 && j < 100) {
							System.out.printf("%3d", j);
						}
				}

			}

			System.out.println();

		}
		
	}
}
