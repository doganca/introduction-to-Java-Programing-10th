package Chapter4;

import java.util.Scanner;

public class Soru18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("IKI karakter giriniz");
		String girilenDeger = input.nextLine();
		
		char ilkKarakter = girilenDeger.trim().toUpperCase().charAt(0);
		char ikinciKarakter = girilenDeger.trim().toUpperCase().charAt(1);
		
		switch (ilkKarakter) {
		case 'M': 
			System.out.print("Matematik");
			
			break;
		case 'C':
			System.out.print("Bilgisayar bilimleri");
			
			break;
			
		case 'I':
			System.out.print("Bilgi teknolojileri");
			
			break;

		default:
			System.out.print("Gecersiz giris");
			break;
		}
		switch (ikinciKarakter) {
		case '1':
			System.out.print(" 1. Sinif");
			
			break;
			
		case '2':
			System.out.print(" 2. Sinif");
			
			break;
			
		case '3':
			System.out.print(" 3. Sinif");

			break;
		default:
			System.out.println("gecersiz giris");
			break;
		}
	}

}
