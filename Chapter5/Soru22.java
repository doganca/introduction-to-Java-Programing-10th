package Chapter5;

import java.util.Scanner;

public class Soru22 {
	/*
	 * kredi amortisman planı) Verilen kredi için aylık ödeme, anapara ve faizin
	 * toplamıdır. Aylık faiz değeri, aylık faiz oranı ve bakiyenin (kalan anapara)
	 * çarpımı ile hesaplanır. Aylık anapara ödemesi ise aylık ödeme eksi aylık
	 * faizdir. Kullanıcıdan kredi miktarını, yılı, faiz oranını alan ve kredi
	 * amortisman planını gösteren bir program yazınız
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//kullanicidan istedigi kredi tutarini aliyoruz
		System.out.println("Kredi miktarini giriniz");
		double krediMiktari = input.nextDouble();
		
		//kac yilda odemek istedigini soruyoruz
		System.out.println("Kac yilda odenecek : ");
		int kacYil = input.nextInt();
		
		//faiz oraninini aliyoruz 
		System.out.println("yillik faiz oranini girin : " );
		double yillikFaizOrani = input.nextDouble();
		
		//aylik faiz oranini hesapliyoruz
		double aylikFaiz = yillikFaizOrani / 1200;

		double aylikOdeme = krediMiktari * aylikFaiz / (1 - 1 
				/ Math.pow(1 + aylikFaiz, kacYil * 12));
		
		// aylik odenecek miktar
		System.out.printf("aylik odeme %1.2f\n", aylikOdeme);
		
		// toplam odenecek miktar odenecek miktar 
		System.out.printf("yilliko denecek miktar : %1.2f\n" , (aylikOdeme * 12) * kacYil);
		
		double bakiye = krediMiktari , anapara , faiz;
		System.out.println("Odeme     Faiz    Anapara    Bakiye  ");
		
		//dongu ile aylik odemleri gosteriyoruz
		for(int i = 1; i <= kacYil * 12; i++) { // donguyu 1 ile baslatiyoruz dongu kac yilda kac ay oldugu hesaplanip donecek
			faiz = aylikFaiz * bakiye;
			anapara = aylikOdeme - faiz;
			bakiye -= anapara;
			System.out.printf("%-10d%-10.2f%-10.2f%-10.2f\n", i, faiz, anapara, bakiye );
			
		}
		
	}

}
