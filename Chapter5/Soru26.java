package Chapter5;

public class Soru26 {
	public static void main(String[] args) {
		double e = 0;
		for (double i = 1; i <= 10_000; i++) {
			double faktoryel = i; // i den gelen degiskeni faktoryele atadim
			for (double j = i - 1; j >= 1; j--) { // i den gelen sayidan bir cikarip sayinin bir eksigile sayiyi carpip faktoryel aliyorum
				faktoryel *= j;
			}
			e += 1 / faktoryel;	
		}
		System.out.println("10000 icin sorunun cevabi : " + e);
		
		e = 0;
		for(double i = 1; i <= 20_000; i++) {
			double faktoryel = i;
			for(double j = i - 1; j >= 1; j--) {
				faktoryel *= j;
			}
			e += 1 / faktoryel;
		}
		System.out.println("20000 icin sorunun cevabi : " + e);
		
		e = 0;
		for(double i = 1; i <= 100_000; i++) {
			double faktoryel = i;
			for(double j = i - 1; j >= 1; j--) {
				faktoryel *= j;
			}
			e += 1 / faktoryel;
		}
		System.out.println("100000 icin sorunun cevabi : " + e);
	}

}
