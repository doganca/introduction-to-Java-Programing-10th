package Chapter3;

import java.util.Scanner;

public class Soru17 {
	public static void main(String[] args) {
		Scanner oyun = new Scanner(System.in);
		int javaOyunu = (int)(Math.random() * 3);

		
		System.out.print("makas (0) , tas (1) , kagit(2) : ");
		int kullaniciGiris = oyun.nextInt();
		
		if(javaOyunu == kullaniciGiris) {
			System.out.println("berabere kaldiniz");
		}else if (kullaniciGiris == 0 && javaOyunu == 2){
			System.out.println("makas kagidi keser . Tebrikler kazandiniz");
		}else if(kullaniciGiris == 2 && javaOyunu == 0) {
			System.out.println("makas kagidi keser kaybettiniz");
		}else if(kullaniciGiris == 1 && javaOyunu == 0) {
			System.out.println("tas makasi kirar . Tebrikler kazandiniz ");
		}else if(kullaniciGiris == 0 && javaOyunu == 1) {
			System.out.println("tas makasi kirar. Kaybettiniz");
		}else if(kullaniciGiris == 2 && javaOyunu == 1) {
			System.out.println("kagit tasi sarar . Tebrikler kazandiniz");
		}else if(kullaniciGiris == 1 && javaOyunu == 2) {
			System.out.println("kagit tasi sarar. Kaybettiniz");
		}else {
			System.out.println("tekrar deneyiniz . yanlis sayi girdiniz. Girdiginiz sayi : " + kullaniciGiris + " , girilecek sayi 0 , 1 , 2 den biri olmali");
		}
	}
}
