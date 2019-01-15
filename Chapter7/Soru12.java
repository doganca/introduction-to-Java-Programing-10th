package Chapter7;

import java.util.Scanner;

public class Soru12 {
	/*
	 * \ (Diziyi ters çevirme) Bölüm 7.7 deki reverse metodu bir dizinin
	 * elemanlarını yeni diziye kopyalayarak ters çeviriyordu. Arguman olarak gelen
	 * dizi üzerinde ters çevirme işlemini yapacak ve bu diziyi geri döndürecek
	 * şekilde bu metodu yeniden yazınız. Kullanıcıdan on adet sayı alan ve bu
	 * metodu çağırarak sayıları ters çevirip gösteren bir test programı yazınız.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] sayilar = new int[10];

		System.out.println("10 adet sayi giriniz");
		sayilariDiziyeEkle(input, sayilar);

		System.out.println("Girdinigiz sayilar : ");
		sayilariYazdir(sayilar);

		System.out.println("Sayilarin terse cevrilmis hali");
	
		
		sayilariTersCevir(sayilar);
		sayilariYazdir(sayilar);

	}

	public static void sayilariDiziyeEkle(Scanner input, int[] sayilar) {
		for (int i = 0; i < sayilar.length; i++) {
			sayilar[i] = input.nextInt();
		}
	}

	private static void sayilariYazdir(int[] sayilar) {
		for (int i = 0; i < sayilar.length; i++) {
			System.out.print(sayilar[i] + " ");
		}
		System.out.println();
	}

	private static void sayilariTersCevir(int[] sayilar) {
		
		for (int i = 0, j = sayilar.length -1; i < sayilar.length / 2; i++, j--) {
			int temp = sayilar[i];
			sayilar[i] = sayilar[j];
			sayilar[j] = temp;
		}
	}

}
