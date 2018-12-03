package Chapter1;

public class Soru_10 {
	public static void main(String[] args) {
		double kilometreMilDonusumu = 14 / 1.6;
		int saniyeHesabi = 45 * 60 + 30;
		double saatHesabi = (saniyeHesabi / 60.0)/ 60.0;
		
		double ortalamaHiz = kilometreMilDonusumu / saatHesabi;
		
		System.out.println(ortalamaHiz);
	}

}
