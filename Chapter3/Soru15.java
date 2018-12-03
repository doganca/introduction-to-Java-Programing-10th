package Chapter3;

import java.util.Scanner;

public class Soru15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int piyango = (int) (Math.random() * 900) + 100;

		System.out.println("3 basamakli piyango numaranizi giriniz");
		int kullaniciPiyango = input.nextInt();

		int kullaniciPiyangiBirlerBasamagi = (kullaniciPiyango % 100) % 10;
		int kullaniciPiyangoOnlarBasamagi = (kullaniciPiyango % 100) / 10;
		;
		int kullaniciPiyangoYuzlerBasamagi = (kullaniciPiyango / 100);

		int piyangoBirlerBasamagi = (piyango % 100) % 10;
		int piyangoOnlarBasamagi = (piyango % 100) / 10;
		int piyangoYuzlerBasamagi = piyango / 100;
		
		System.out.println("---  piyango kazanan numara : ----  " + " ** " + piyango + " **"  );
		if (piyango == kullaniciPiyango) {
			System.out.println("tebrikler 10.000TL kazandiniz");
		} else if (piyangoYuzlerBasamagi == kullaniciPiyangiBirlerBasamagi
				|| piyangoYuzlerBasamagi == kullaniciPiyangoOnlarBasamagi
				|| piyangoYuzlerBasamagi == kullaniciPiyangoYuzlerBasamagi
				|| piyangoOnlarBasamagi == kullaniciPiyangiBirlerBasamagi
				|| piyangoOnlarBasamagi == kullaniciPiyangoOnlarBasamagi
				|| piyangoOnlarBasamagi == kullaniciPiyangoYuzlerBasamagi
				|| piyangoBirlerBasamagi == kullaniciPiyangiBirlerBasamagi
				|| piyangoBirlerBasamagi == kullaniciPiyangoOnlarBasamagi
				|| piyangoBirlerBasamagi == kullaniciPiyangoYuzlerBasamagi) {
			System.out.println("tebrikler 1000TL kazandiniz ");
		} else {
			System.out.println("hicbirsey kazanmadiniz");
		}

		// Eğer girilen sayının tüm basamakları piyangoda kazanan sayı ile aynı ise;
		// ödül 3 000 TL --
		// bu kismi anlamadim

	}

}
