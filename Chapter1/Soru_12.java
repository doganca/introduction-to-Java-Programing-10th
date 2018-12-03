package Chapter1;

public class Soru_12 {
	public static void main(String[] args) {
		double milToKm = 24 * 1.6;
		int toplamSaniye = ((60 * 60) + (40 * 60) + 35);
		double toplamSureSaatHesabi = (toplamSaniye / 60) / 60.0;
		
		double ortalamaHiz = milToKm / toplamSureSaatHesabi;
		
		System.out.println("ortalama hizi : " + ortalamaHiz);
	}

}
