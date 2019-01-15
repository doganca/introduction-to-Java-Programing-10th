package Chapter7;

public class Soru16 {
	public static void main(String[] args) {
		int diziBuyuklugu = 100_000;
		
		int[] rasgeleSayilar = new int[diziBuyuklugu];
		
		for (int i = 0; i < rasgeleSayilar.length; i++) {
			rasgeleSayilar[i] = (int)(Math.random() * 100) + 1;
		}
	}
}
aa