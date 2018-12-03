package Chapter5;

public class Soru12 {
	/*
	 * (n2 > 12000 olduğu durumda en küçük n’i bulma) n2 ‘nin 12000’den büyük olduğu
	 * en küçük tam sayı n’i while döngüsü kullanarak bulunuz.
	 * 
	 */
	public static void main(String[] args) {
		double n = 1;
		while(n < 12000) {
			double m = Math.pow(n, 2);
			if(m > 12000.0) {
				break;			
			}
			n++;
		}
		System.out.println(n);
	}
}
