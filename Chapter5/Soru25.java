package Chapter5;

public class Soru25 {
	public static void main(String[] args) {
		double sonuc = 0;
		for (double i = 1; i < (2 * 10_000.0 -1); i += 2 ) {
			sonuc += 1 / i;
			i += 2;
			sonuc -= 1 / i;
		}
		double pi = 4 * sonuc;
		System.out.println("10000 icin pi sonucu : "  + pi);
		
		sonuc = 0;
		for (double i = 1; i < (2 * 20_000.0 -1); i += 2) {
			sonuc += 1 / i;
			i += 2;
			sonuc -= 1 / i;
		}
		pi = 4 * sonuc;
		System.out.println("20000 icin pi degeri : " + pi);
		
		
		sonuc = 0;
		for(double i = 1; i < (2 * 100000.0 -1); i += 2) {
			sonuc += 1 / i;
			i += 2;
			sonuc -= 1 / i;
		}
		pi = 4 * sonuc ;
		System.out.println("100000 icin pi degeri : " + pi);
	}
	
	
	

}
