package Chapter5;

import java.util.Scanner;

public class Soru34 {
	public static void main(String[] args) {
		Scanner oyun = new Scanner(System.in);

		int sayacOyuncu = 0;
		int sayacBilgisayar = 0;

		while (!(sayacBilgisayar > 2 || sayacOyuncu > 2)) {
			int javaOyunu = (int) (Math.random() * 3);

			System.out.print("makas (0) , tas (1) , kagit(2) : ");
			int kullaniciGiris = oyun.nextInt();

			if (javaOyunu == kullaniciGiris) {
				System.out.println("berabere kaldiniz");
			} else if (kullaniciGiris == 0 && javaOyunu == 2) {
				System.out.println("makas kagidi keser . Tebrikler kazandiniz");
				sayacOyuncu++;
			} else if (kullaniciGiris == 2 && javaOyunu == 0) {
				System.out.println("makas kagidi keser kaybettiniz");
				sayacBilgisayar++;
			} else if (kullaniciGiris == 1 && javaOyunu == 0) {
				System.out.println("tas makasi kirar . Tebrikler kazandiniz ");
				sayacOyuncu++;
			} else if (kullaniciGiris == 0 && javaOyunu == 1) {
				System.out.println("tas makasi kirar. Kaybettiniz");
				sayacBilgisayar++;
			} else if (kullaniciGiris == 2 && javaOyunu == 1) {
				System.out.println("kagit tasi sarar . Tebrikler kazandiniz");
				sayacOyuncu++;
			} else if (kullaniciGiris == 1 && javaOyunu == 2) {
				System.out.println("kagit tasi sarar. Kaybettiniz");
				sayacBilgisayar++;
			} else {
				System.out.println("tekrar deneyiniz . yanlis sayi girdiniz. Girdiginiz sayi : " + kullaniciGiris
						+ " , girilecek sayi 0 , 1 , 2 den biri olmali");
			}
		}
		if(sayacBilgisayar > 2) {
			System.out.println("bilgisayar sizi " + sayacBilgisayar + "e " + sayacOyuncu + " yendi");
		}else {
			System.out.println("siz bilgisayari " + sayacOyuncu + " e " + sayacBilgisayar + " yendiniz");
		}

	}

}
