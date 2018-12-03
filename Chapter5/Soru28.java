package Chapter5;

import java.util.Scanner;

public class Soru28 {
	/*
	 * artik yil formulu (yil % 4 == 0 && yil % 100 != 0) || yil % 400 == 0) (Her
	 * ayın ilk günü) Kullanıcıdan yılı ve yılın ilk gününü alan ve o yılın her
	 * ayının ilk günlerini gösteren bir program yazınız. Örneğin, kullanıcı yılı
	 * 2013 ve yılın ilk günü olan Salı için 2 girdiyse, program şu çıktıyı
	 * vermelidir: January 1, 2013 is Tuesday ... December 1, 2013 is Sunday 1 Ocak,
	 * 2013 Salı ... 1 Aralık, 2013 Pazar 1,3,5,7,8,10,12 aylar 31 gun . 4,6,9,11
	 * aylar 30 gun. Subat ayi 28 gun veya artik yilda 29 gun
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("yili giriniz ");
		int yil = input.nextInt();

		System.out.print("yilin ilk gununu giriniz (1- pazar, 2- pazartesi, 3- sali, "
				+ "4- carsamba, 5- persembe, 6- cuma, 7- cumartesi) :");
		int yilinIlkGunu = input.nextInt();

		boolean artikYilMi = false;
		String yazilacakCitki = "";
		int yildakiGunSayisi = 365;

		if ((yil % 4 == 0 && yil % 100 != 0) || yil % 400 == 0) {
			artikYilMi = true;
		}

		for (int i = 1; i <= 12; i++) {
			yazilacakCitki = "";

			switch (i) {
			case 0:
				yazilacakCitki += "1 Ocak";
				break;

			case 1:
				yazilacakCitki += "1 Subat";
				break;

			case 2:
				yazilacakCitki += "1 Mart";
				break;

			case 3:
				yazilacakCitki += "1 Nisan";
				break;

			case 4:
				yazilacakCitki += "1 Mayis";
				break;

			case 5:
				yazilacakCitki += "1 Haziran";
				break;

			case 6:
				yazilacakCitki += "1 Temmuz";
				break;

			case 7:
				yazilacakCitki += "1 Agustos";
				break;

			case 8:
				yazilacakCitki += "1 Eylul";
				break;

			case 9:
				yazilacakCitki += "1 Ekim";
				break;

			case 10:
				yazilacakCitki += "1 Kasim";
				break;

			case 11:
				yazilacakCitki += "1 Aralik";
				break;
			}
			
			yazilacakCitki += yil + " yili ilk gunu";
			
			yilinIlkGunu = (yilinIlkGunu + yildakiGunSayisi) % 7;
			
			if (!artikYilMi) {
				switch (yilinIlkGunu) {
				case 0:
					
					break;

				default:
					break;
				}
			}

		}

	}
tamamlamadim baglanti kurmada sikinti sayadim
}
