package Chapter6;

public class Soru14 {
	public static void main(String[] args) {

		ustYazi();
		for (int i = 1; i <= 901; i++) {
			System.out.printf("%-2d\t%2.4f\n", i, m(i));

		}
	}

	private static double m(int i) {
		double m = 0;

		for (int j = 1; j <= i; j++) {
			double pay = Math.pow(-1, j + 1.0);
			double payda = (2 * j) - 1;
			m += pay / payda;
		}
		m *= 4;
		return m;
	}

	private static void ustYazi() {
		System.out.println("i\t m(i)");
		System.out.println("-------------");

	}
}
