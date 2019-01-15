package Chapter6;

public class Soru25 {
	public static void main(String[] args) {
		System.out.println(milisaniyeyiZamanaCevir(555550000));
	}

	private static String milisaniyeyiZamanaCevir(long milisaniye) {
		int saniye = (int)milisaniye / 1000;
		int simdikiSaniye = saniye % 60;
		
		int dakika = saniye / 60;
		int simdikiDakika = dakika % 60;
		
		int saat = dakika / 60;
		
		return saat + ":" + simdikiDakika + ":" + simdikiSaniye ;
	}

}
