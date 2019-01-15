package Chapter6;

public class Soru09 {
	public static void main(String[] args) {
		ustyazi();
		for (double i = 1, j = 20; i <= 10; i++, j += 5.0) {
			System.out.printf("%1.1f\t %1.3f\t |\t %2.1f \t %2.3f\n", i, feetToMeters(i), j, metersToFeet(j));
		}
	}

	private static double metersToFeet(double j) {
		double feet = 3.279 * j;
		return feet;
	}

	private static double feetToMeters(double i) {
		double meters = 0.305 * i;
		return meters;
	}

	private static void ustyazi() {
		System.out.println("Feet \t Metre \t  | \t Metre \t  Feet");
		System.out.println("------------------------------------------");
	}

}
