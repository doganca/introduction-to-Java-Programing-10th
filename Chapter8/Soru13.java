package Chapter8;

import java.util.Scanner;

public class Soru13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dizinin satir ve sutun sayisini giriniz");
		int satirSayisi = input.nextInt();
		int sutunSayisi = input.nextInt();
		
		System.out.println("Diziyi giriniz");
		
		int[][] dizi = diziyeElemanlariGir(satirSayisi,sutunSayisi,input);
		
		int[] enBuyukElemaninYeri = enBuyukElemaniBul(dizi,satirSayisi,sutunSayisi);
		
		System.out.println("En buyuk elemanin indeksleri (" + enBuyukElemaninYeri[0] + "," + enBuyukElemaninYeri[1] + ")");
		
	}

	private static int[] enBuyukElemaniBul(int[][] dizi,int satir,int sutun) {
		int[] yer = new int[2];
		int enBuyukEleman = Integer.MIN_VALUE;
		for (int i = 0; i < satir; i++) {
			for (int j = 0; j < sutun; j++) {
				if(dizi[i][j] > enBuyukEleman) {
					enBuyukEleman = dizi[i][j];
					yer[0] = i;
					yer[1] = j;
				}
				
			}
		}
		return yer;
	}

	private static int[][] diziyeElemanlariGir(int satirSayisi, int sutunSayisi, Scanner input) {
		int[][] dizi = new int[satirSayisi][sutunSayisi];
		for (int satir = 0; satir < satirSayisi; satir++) {
			for (int sutun = 0; sutun < sutunSayisi; sutun++) {
				dizi[satir][sutun] = input.nextInt();
			}
		}
		return dizi;
	}
}
