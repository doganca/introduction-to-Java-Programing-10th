package Chapter7;

public class Soru07 {
	public static void main(String[] args) {
		int[] rakamlar = new int[10];
		sayac(rakamlar, 100);
	}

	private static void sayac(int[] rakamlar, int uretilecekRakamSayisi) {
		rakamUret(rakamlar, uretilecekRakamSayisi);
		rakamlariYazdir(rakamlar);

	}

	public static void rakamUret(int[] rakamlar, int uretilecekRakamSayisi) {
		for (int i = 0; i < uretilecekRakamSayisi; i++) {
			int rakam = (int) (Math.random() * 10);
			rakamlar[rakam]++;
		}
	}

	private static void rakamlariYazdir(int[] rakamlar) {
		for (int i = 0; i < rakamlar.length; i++) {
			System.out.printf("%d rakami %2d kere tekrar etti \n",i, rakamlar[i]);
		}

	}
}
