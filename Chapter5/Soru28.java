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

		System.out.print("yilin ilk gununu giriniz (0- pazar, 1- pazartesi, 2- sali, "
				+ "3- carsamba, 4- persembe, 5- cuma, 6- cumartesi) :");
		int gun = input.nextInt();

		boolean artikYilMi = ((yil % 4 == 0 && yil % 100 != 0) || yil % 400 == 0);

		for (int ay = 0; ay < 12; ay++) {
			String gunYazi = "";
			String ayYazi = "";

			switch (gun) {
			case 0:
				gunYazi = "Pazar";
				break;

			case 1:
				gunYazi = "Pazartesi";
				break;

			case 2:
				gunYazi = "Sali";
				break;

			case 3:
				gunYazi = "Carsamba";
				break;

			case 4:
				gunYazi = "Persembe";
				break;

			case 5:
				gunYazi = "Cuma";
				break;

			case 6:
				gunYazi = "Cumartesi";
				break;

			}

			switch (ay) {
			case 0:
				ayYazi = "1 Ocak";
				gun = (gun + 31) % 7;
				break;

			case 1:
				ayYazi = "1 Subat";
				if (artikYilMi)
					gun = (gun + 29) % 7;
				else
					gun = (gun + 28) % 7;
				break;

			case 2:
				ayYazi = "1 Mart";
				gun = (gun + 31) % 7;
				break;

			case 3:
				ayYazi = "1 Nisan";
				gun = (gun + 30) % 7;
				break;

			case 4:
				ayYazi = "1 Mayis";
				gun = (gun + 31) % 7;
				break;

			case 5:
				ayYazi = "1 Haziran";
				gun = (gun + 30) % 7;
				break;

			case 6:
				ayYazi = "1 Temmuz";
				gun = (gun + 31) % 7;
				break;

			case 7:
				ayYazi = "1 Agustos";
				gun = (gun + 31) % 7;
				break;

			case 8:
				ayYazi = "1 Eylul";
				gun = (gun + 30) % 7;
				break;

			case 9:
				ayYazi = "1 Ekim";
				gun = (gun + 31) % 7;
				break;

			case 10:
				ayYazi = "1 Kasim";
				gun = (gun + 30) % 7;
				break;

			case 11:
				ayYazi = "1 Aralik";
				// burda bir sonraki ayin baslangic gununu hesaplamak GEREKMIYOR
				break;
			}

			System.out.println(ayYazi + ", " + yil + " " + gunYazi);

		}

	}
}
