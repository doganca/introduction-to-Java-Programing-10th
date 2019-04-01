package Chapter7;

import java.util.Scanner;

public class Soru32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Integer liste giriniz, ilk eleman liste buyujlugu olacak");

		int[] liste = listeyeElemanlariEkle(input);
		metoduBul(liste);
	}

	private static int[] listeyeElemanlariEkle(Scanner input) {
		int diziBuyuklugu = input.nextInt();
		int[] dizi = new int[diziBuyuklugu];

		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = input.nextInt();
		}
		return dizi;
	}

	private static void metoduBul(int[] liste) {
		int pivot = liste[0];

		int pivottanKucukSayiSayisi = pivottanKucukSayiSayisi(liste, pivot);
		int[] pivottanKucuk = pivottanKucukSayileriListeyeEkle(pivottanKucukSayiSayisi, pivot, liste);

		int pivottanBuyukSayiSayisi = pivottanBuyukSayiSayisi(liste, pivot);
		int[] pivottanBuyuk = pivottanBuyukSayileriListeyeEkle(pivottanBuyukSayiSayisi, pivot, liste);

		int[] metodSonuc = listeyiDuzelt(pivottanBuyuk, pivottanKucuk, pivot);
		
		sonucuYazdir(metodSonuc);
	}


	private static int pivottanKucukSayiSayisi(int[] liste, int pivot) {
		int sayac = 0;
		for (int i = 0; i < liste.length; i++) {
			if (liste[i] < pivot) {
				sayac++;
			}
		}
		return sayac;
	}

	private static int[] pivottanKucukSayileriListeyeEkle(int pivottanKucukSayiSayisi, int pivot, int[] liste) {
		int[] dizi = new int[pivottanKucukSayiSayisi];
		int sayac = 0;
		for (int i = 0; i < liste.length; i++) {
			if (liste[i] < pivot) {
				dizi[sayac] = liste[i];
				sayac++;
			}
		}
		return dizi;
	}

	private static int pivottanBuyukSayiSayisi(int[] liste, int pivot) {
		int sayac = 0;
		for (int i = 0; i < liste.length; i++) {
			if (liste[i] > pivot) {
				sayac++;
			}
		}
		return sayac;
	}

	private static int[] pivottanBuyukSayileriListeyeEkle(int pivottanBuyukSayiSayisi, int pivot, int[] liste) {
		int[] dizi = new int[pivottanBuyukSayiSayisi];
		int sayac = 0;
		for (int i = 0; i < liste.length; i++) {
			if (liste[i] > pivot) {
				dizi[sayac] = liste[i];
				sayac++;
			}
		}
		return dizi;
	}

	private static int[] listeyiDuzelt(int[] pivottanBuyuk, int[] pivottanKucuk, int pivot) {
		int[] liste = new int[pivottanBuyuk.length + pivottanKucuk.length + 1];
		
		for (int i = 0; i < pivottanKucuk.length; i++) {
			liste[i] = pivottanKucuk[i];
		}
		
		liste[pivottanKucuk.length] = pivot;
		
		for (int i = 0; i < pivottanBuyuk.length; i++) {
			liste[(pivottanKucuk.length + 1) + i] = pivottanBuyuk[i];
		}
		
		return liste;
	}
	
	private static void sonucuYazdir(int[] metodSonuc) {
		for (int i : metodSonuc) {
			System.out.print(i + " ");
		}
		
	}

}
