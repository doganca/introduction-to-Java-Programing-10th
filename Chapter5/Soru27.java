package Chapter5;

public class Soru27 {
	// artik yil formulu (yil % 4 == 0 && yil % 100 != 0) || yil % 400 == 0)
	/*
	 * (Artık yıllar) Her satırda on tane ve aralarında birer boşluk olacak şekilde
	 * 101’den 2100’e tüm artık yılları gösteren bir program yazınız. Ayrıca bu
	 * zaman aralığında kaç artık yıl olduğunu gösteriniz.
	 */
	public static void main(String[] args) {

		int sayac = 1;
		for (int i = 101; i <= 2100; i++) {
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				if(sayac % 10 != 0) {
					System.out.print(i + " ");
				}
				if(sayac % 10 == 0) {
					System.out.println(i);
				}
				sayac++;
			}
		}
		System.out.print("\n101 yilindan 2100 yilina kadar " + (sayac - 1) + " yil vardir");

	}

}
