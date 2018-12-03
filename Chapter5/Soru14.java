package Chapter5;

import java.util.Scanner;

public class Soru14 {
	/*
	 * (En büyük ortak böleni hesaplama) Madde 5.9’da n1 ve n2 tam sayılarının en
	 * büyük ortak bölenini bulmak için burada şu şekilde farklı bir çözüm
	 * sunulmuştur: Öncelikle n1 ve n2 ‘nin minimumu olan d ‘yi bulunuz. d, d-1,
	 * d-2, ..., 2, veya 1’in, n1 ve n2’nin her ikisi için de sırasıyla bölen olup
	 * olmadığını kontrol ediniz. n1 ve n2 için ilk ortak bölen en büyük ortak
	 * bölendir. Kullanıcıdan iki pozitif tam sayı alan ve en büyük ortak böleni
	 * gösteren bir program yazınız.
	 * 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ilk sayiyi giriniz");
		int sayi1 = input.nextInt();
		
		System.out.println("ikinci sayiyi giriniz");
		int sayi2 = input.nextInt();
		int bolen = 2;
		int obeb = 1;
		
		if(sayi1 > sayi2) {
			for(int i = sayi2; i >= 2; i--) {
				if(bolen <= sayi1 && bolen <= sayi2) {
					if(sayi1 % i == 0 && sayi2 % i == 0) {
						obeb = i;
						break;
					}
				}
			}
			
		}else {
			for(int i = 1; i <=sayi1; i--) {
				if(bolen <= sayi1 && bolen <=sayi2) {
					if(i % sayi1 == 0 && i % sayi2 == 0) {
						obeb = i;
						break;
					}
				}
			}
		}
		
		System.out.println("en buyuk ortak bolen : " + obeb);
		
		
		
	}
}
