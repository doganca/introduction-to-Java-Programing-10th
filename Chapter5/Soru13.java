package Chapter5;

public class Soru13 {
	/*
	 * (n3 < 12000 olduğu durumda en büyük n’i bulma) n3’ün 12000’den küçük olduğu
	 * en büyük tam sayı n’i while döngüsü kullanarak bulunuz.
	 * 
	 */
	
	public static void main(String[] args) {
		int n = 0;
		
		while(n < 12000) {
			double m = Math.pow(n, 3);
			if(m > 12000) {
				break;
			}
			n++;
		}
		System.out.println(n);
	}

}
