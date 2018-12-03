package Chapter5;

import java.util.Scanner;

public class Soru09 {
	/*
	 * (En yüksek iki puanı bulma) Kullanıcıdan toplam öğrenci sayısını ve her
	 * öğrencinin adı ve puanını alan, bunun ardından en yüksek ve en yüksek ikinci
	 * puana sahip öğrencilerin adını ve puanını gösteren bir program yazınız.
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("ogrenci sayisini giriniz");
		int donguSayisi = input.nextInt();
		
		
		String enYuksekIsim = " ";
		int enYuksekPuan = 0;
		String ikinciEnYuksekIs = " ";
		int ikinciEnYuksekPuan = 0;
		
		for (int i = 0; i < donguSayisi; i++) {
			System.out.println("ogrenci adi ve puanini giriniz");
			String ogrAdi = input.next();
			int ogrPuan = input.nextInt();
			
			if (ogrPuan > enYuksekPuan) {
				ikinciEnYuksekIs = enYuksekIsim;
				ikinciEnYuksekPuan = enYuksekPuan;
				
				enYuksekIsim = ogrAdi;
				enYuksekPuan = ogrPuan;
				
			} else if (ogrPuan > ikinciEnYuksekPuan) {
				ikinciEnYuksekIs = ogrAdi;
				ikinciEnYuksekPuan = ogrPuan;
			}
		}
		
		System.out.println("En yuksek puana sahip ogrenci  : " + enYuksekIsim + " , puani : " + enYuksekPuan);
		System.out.println("En yuksek ikinci puana sahip ogrenci : " + ikinciEnYuksekIs + " , puani : " + ikinciEnYuksekPuan);
	}

} 


