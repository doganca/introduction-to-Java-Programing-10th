package Chapter3;

import java.util.Scanner;

public class Soru33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("paket 1 icin agirlik ve fiyat giriniz");
		int agirlik = input.nextInt();
		double fiyat = input.nextDouble();
		
		System.out.println("paket 2 icin agirlik ve fiyat girin");
		int agirlik2 = input.nextInt();
		double fiyat2 = input.nextDouble();
		
		double paketBirOrtalama = agirlik / fiyat;
		System.out.println(paketBirOrtalama);
		double paketIkiOrtalama = agirlik2 / fiyat2;
		System.out.println(paketIkiOrtalama);
		System.out.println();
		
		if(paketBirOrtalama < paketIkiOrtalama) {
			System.out.println("pakat 1 in fiyati daha uygun");
		}else if(paketBirOrtalama > paketIkiOrtalama) {
			System.out.println("paket 2 nin fiyati daha uygun");
		}else if (paketBirOrtalama == paketIkiOrtalama) {
			System.out.println("fiyatlari esit");
		}else {
			System.out.println("yanlis karakter girdiniz");
		}
	}
// soru orneginin cevabinda sikinti var
}
