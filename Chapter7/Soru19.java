package Chapter7;

import java.util.Scanner;

public class Soru19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Bir dizi giriniz, ilk girilen deger dizi buyuklugu olacak");

		int diziBuyuklugu = input.nextInt();

		int[] dizi = diziyeElemanEkle(input, diziBuyuklugu);

		boolean diziSiralimi = diziSiralimi(dizi);
		
		sonucuYazdir(dizi, diziSiralimi);

	}


	private static int[] diziyeElemanEkle(Scanner input, int diziBuyuklugu) {
		int[] dizi = new int[diziBuyuklugu];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = input.nextInt();
		}
		return dizi;
	}

	private static boolean diziSiralimi(int[] dizi) {
		for (int i = 0; i < dizi.length -1; i++) {
			if (!(dizi[i] <= dizi[i + 1]))
				return false;
		}
		return true;

	}
	
	private static void sonucuYazdir(int[] dizi, boolean diziSiralimi) {
		diziyiYazdir(dizi);
		System.out.println("  dizisi " + (diziSiralimi ? " siralidir" : " sirali degildir"));
		
	}

	private static void diziyiYazdir(int[] dizi) {
		for (int i : dizi) {
			System.out.print(i + " ");
		}
		
	}

}
