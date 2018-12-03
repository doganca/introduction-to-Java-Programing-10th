package Chapter5;

public class Soru07 {
	/*
	 * (Finans uygulaması: Okul ücretini hesaplama) Bu yılın okul ücretinin 10000 $
	 * olduğunu ve her yıl %5 arttığını varsayalım. Bir sonraki yıl okul ücreti 10
	 * 500$ olacaktır. 10 yılın okul ücretini ve 10 uncu yıldan sonraki 4 yılın
	 * toplam ücretini hesaplayan bir program yazınız.
	 * 
	 */
	public static void main(String[] args) {
		double okulUcreti = 10_000;
		double artis = 0.05;
		double ucret = 0;
		for(int i = 1; i <= 14; i++) {
			double artisMiktari = okulUcreti * artis;
			okulUcreti += artisMiktari;
			if(i <= 10) {
			System.out.println(i + ". yil okul ucreti : " + okulUcreti);
			}
			if(i > 10) {
				 ucret += okulUcreti;
				
			}
			
		}
		System.out.println("Onyncu yildan sonraki 4 yilin ucreti : " + ucret);
		
		
	}

}
