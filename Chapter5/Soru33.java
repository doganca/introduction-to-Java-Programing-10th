package Chapter5;

public class Soru33 {
	/*
	 * Mükemmel sayı) Kendisi dışındaki tüm pozitif bölenlerinin toplamı kendisi
	 * olan pozitif bir tam sayıya mükemmel sayı denir. Örneğin, 6 ilk mükemmel
	 * sayıdır. 6 = 3 + 2 + 1 ikincisi ise 28 = 14 + 7 + 4 + 2 + 1 10.000’den küçük
	 * dört mükemmel sayı vardır. Bu dört mükemmel sayıyı bulan bir program yazınız.
	 */
	public static void main(String[] args) {
		for (int i = 2; i <= 10_000; i++) {
			int mukemmelSayi = 0;
			for (int j = 1; j <= i / 2; j++) {
				if(i % j == 0) {
					 mukemmelSayi += j;
					if (mukemmelSayi == i) {
						System.out.println(mukemmelSayi);
					}
				}
				
			}
			
		}
	}

}
cevapta hata var