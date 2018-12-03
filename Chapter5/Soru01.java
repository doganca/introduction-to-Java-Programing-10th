package Chapter5;

import java.util.Scanner;

public class Soru01 {

	/*
	 * (Negatif ve pozitif sayıları sayma ve sayıların ortalamasını hesaplama)
	 * Kullanıcının istediği kadar tam sayı girebileceği, girilen sayıların kaç
	 * tanesi negatif, kaç tanesi pozitif , toplamı ve ortalamasını hesaplayan bir
	 * program yazınız . Eğer 0 değeri girilirse program sonlanacaktır. Ortalama
	 * değerini gerçel sayı olarak gösteriniz. Örnek akışı inceleyiniz:
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pozitif = 0; // pozitif tam sayilari burda tutuyorum
		int negatig = 0; // negatif tam sayilari burda tutuyorum
		int sayiSayisi = 0; // kac tane sayi girildigini burda tutuyorum
		int toplam = 0; // girilen sayilarin birbiri ile olan toplamini burda tutuyorum
		int ortalama = 0; // girilen sayilarin ortalmasini burda tutuyorum

		System.out.println("Tam sayi giriniz , 0 yazinca program sonlanacaktir.");
		while (true) { // sonsuz dongu olusturdum

			int sayi = input.nextInt(); // kullanicidan sayi aliyorum
			if (sayi == 0) { // girilen sayiyi kontrol ediyorum eger 0 ise break ile sonlandiriyorum
				break;
			} else if (sayi > 0) { // sayi 0 dan buyuk ise posizif , positif sayilari bir arttiriyorum
				pozitif++;
			} else if (sayi < 0) { // sayi 0 dan kucuk ise negatif , negatif sayilari bir arttiriyorum
				negatig++;
			}
			toplam += sayi; // sayilari burda topluyorum
			sayiSayisi++; // girilen sayi sayisini burda tutuyorum 
		}

		System.out.println("pozitif sayi miktari : " + pozitif + "\nnegatif sayi miktari : " + negatig
				+ "\nTum sayilarin taplami " + toplam + "\nTum sayilarin ortalmasi : " + (toplam / sayiSayisi));

	}

}
