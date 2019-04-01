package Chapter7;

public class Soru18 {
	public static void main(String[] args) {
		int[] dizi = { 44, 4, 2, 77, 5, 4, 3, 7, 99, 7, 6, 7, 5, 4, 2, 77, 5 };

		int[] diziSirali = bubbleSort(dizi);

		for (int i : diziSirali) {
			System.out.print(i + ", ");
		}

	}

	public static int[] bubbleSort(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 1; j < dizi.length - i; j++) {
				if (dizi[j - 1] > dizi[j]) {
					int temp = dizi[j];
					dizi[j] = dizi[j - 1];
					dizi[j - 1] = temp;
				}
			}
		}
		return dizi;
	}
}
