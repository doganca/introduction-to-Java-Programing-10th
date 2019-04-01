package Chapter8;

import java.util.Scanner;

public class Soru36 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("N i giriniz");

		int n = input.nextInt();

		System.out.println("Bosluklara ayrilmis " + n + " satir harf giriniz");

		String[][] harfler = harfleriGir(n, input);
		
		if(harfler == null) {
			System.out.println("A dan " + (char)('A' + n -1) + " e kadar harf olmali");
		}

		sonucuBul(harfler);
	}

	private static String[][] harfleriGir(int n, Scanner input) {
		String[][] harfler = new String[n][n];

		for (int i = 0; i < harfler.length; i++) {
			for (int j = 0; j < harfler.length; j++) {
				String harfStr = input.next();
				char harf = harfStr.charAt(0);
				if (harfiKontrolEt(harf,n)) {
					harfler[i][j] = input.next();
				}else {
					harfler = null;
					break;
				}
			}
		}
		return harfler;
	}

	private static boolean harfiKontrolEt(char harf,int n) {
		if(harf >= 'A' && harf < (char)('A' + n )) {
			return true;
		}
			return false;
	}

	private static void sonucuBul(String[][] harfler) {
		boolean harfSatir = harfleriSatirKontrolET(harfler);
		boolean harfSutun = harfleriSutunKontrolEt(harfler);
		
		if(harfSatir && harfSutun) {
			System.out.println(" Girilen dizi harf karesidir");
		}
	}


	private static boolean harfleriSatirKontrolET(String[][] harfler) {
		// TODO harfler satir olarak sirali olup olmadiklari kontrol edilecek;
		return false;
	}
	
	private static boolean harfleriSutunKontrolEt(String[][] harfler) {
		// TODO harfler sutun olarak sirali olup olmadiklari kontrol edilecek
		return false;
	}
}
