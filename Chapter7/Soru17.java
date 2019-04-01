package Chapter7;

import java.util.Scanner;

public class Soru17 {
	/*
	 * (Öğrencileri sıralama) Kullanıcıdan öğrenci sayısını ve bu öğrencilerin ad ve
	 * not bilgisini alan ve notlarına göre azalan şekilde sıralayıp gösteren bir
	 * program yazınız.
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ogrenci sayisini giriniz");
		
		int ogrenciSayisi = input.nextInt();
		
		String[] ogrenciIsimleri = new String[ogrenciSayisi];
		int[] ogrenciNotlari = new int[ogrenciSayisi];
		
		degerleriDiziyeEkle(input, ogrenciIsimleri, ogrenciNotlari);
		
		notlariSirala(ogrenciIsimleri,ogrenciNotlari);
		
		for (int i = 0; i < ogrenciNotlari.length; i++) {
			System.out.println(ogrenciIsimleri[i] + " " + ogrenciNotlari[i]);
		}
	}

	public static void degerleriDiziyeEkle(Scanner input, String[] ogrenciIsimleri, int[] ogrenciNotlari) {
		for (int i = 0; i < ogrenciNotlari.length; i++) {
			System.out.println((i + 1) + " ogrenci ismi :");
			ogrenciIsimleri[i] = input.next();
			System.out.println((i + 1) + " ogrenci notu :");
			ogrenciNotlari[i] = input.nextInt();
		}
	}

	private static void notlariSirala(String[] ogrenciIsimleri, int[] ogrenciNotlari) {
		for (int j = 0; j < ogrenciNotlari.length; j++) {
			for (int i = 1; i < ogrenciNotlari.length; i++) {
				if(ogrenciNotlari[i -1] < ogrenciNotlari[i]) {
					int temp = ogrenciNotlari[i];
					ogrenciNotlari[i] = ogrenciNotlari[i -1];
					ogrenciNotlari[i -1] = temp;
					
					String tempStr = ogrenciIsimleri[i];
					ogrenciIsimleri[i] = ogrenciIsimleri[i -1];
					ogrenciIsimleri[i -1] = tempStr;
				}
			}
		}
		
	}
}
