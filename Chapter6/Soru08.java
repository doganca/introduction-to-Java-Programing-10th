package Chapter6;

public class Soru08 {
//	fahrenhayt = (9.0 / 5) * santigrat + 32
//	santigrat = (5.0 / 9) * (fahrenhayt – 32)
	public static void main(String[] args) {
		ustYazi();
		for (double i = 40.0, j = 120.0; i >= 31.0; i--, j -= 10.0) {
			System.out.printf("%-3.1f\t\t  %3.2f   \t|      \t%3.1f    \t%3.2f\n",i, santigradToFahrenayt(i), j, fahrenaytToSantigrad(j) );	
		}
	}

	private static double fahrenaytToSantigrad(double j) {
	double santigrad = (5.0 / 9) * (j - 32);
	return santigrad;
}

	private static double santigradToFahrenayt(double i) {
	double fahrenayt = (9.0 / 5) * (i + 32);
	return fahrenayt;
}

	private static void ustYazi() {
		System.out.println("Santigrad\t Fahrenayt\t|\t Fahrenayt\t Santigrad");
		System.out.println("------------------------------------------------------------------");
		
	}
}