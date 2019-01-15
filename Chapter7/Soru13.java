package Chapter7;

public class Soru13 {
	/*
	 * (Rastgele sayı seçme) Arguman olarak gönderilen sayılar haricinde 1 ile 54
	 * arasında rastgele bir sayı geri döndüren bir metot yazınız. Metot bildirimi
	 * aşağıdaki şekildedir: public static int getRandom(int... numbers)
	 */

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		System.out.println(getRandom(a));
	}

	private static int getRandom(int... a) {
		while (true) {
			int randomNumber = (int) (Math.random() * 15) + 1;
			if (!(isNumber(a, randomNumber))) {
				return randomNumber;
			}
		}

	}

	private static boolean isNumber(int[] numbers, int randomNumber) {
		boolean isNumberHave = false;
		for (int i : numbers) {
			if (i == randomNumber) {
				isNumberHave = true;
			}
		}
		return isNumberHave;
	}

}
