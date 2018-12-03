package Chapter5;

import java.util.Scanner;

public class Soru16 {
	/*
	 * (Bir tam sayının çarpanlarını bulma) Bir tam sayıyı alan ve tüm en küçük
	 * çarpanlarını küçükten büyüğe doğru gösteren bir program yazınız. Örneğin,
	 * girdi tam sayı 120 ise çıktı şöyle olmalıdır: 2, 2, 2, 3, 5.
	 * 
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("bir sayi giriniz: ");

		int sayi = input.nextInt();
		int bolen = 2;

		while (sayi / bolen != 1) {
			if (sayi % bolen == 0) {
				System.out.print(bolen + " ");
				sayi /= bolen;
			} else {
				bolen++;
			}
		}
		System.out.println(sayi + " ");
	}
}
