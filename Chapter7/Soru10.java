package Chapter7;

public class Soru10 {
	public static void main(String[] args) {
		int[] sayilar = {1,2,3,0,5,6,7,8,9,6};
		System.out.println(enKucukElemaninIndeksi(sayilar));
	}

	private static int enKucukElemaninIndeksi(int[] sayilar) {
		int index = 0;
		int enKucukSayi = Integer.MAX_VALUE;
		for (int i = 0; i < sayilar.length; i++) {
			if(enKucukSayi > sayilar[i]) {
				enKucukSayi = sayilar[i];
				index = i;
			}
		}
		return index;
	}
}
