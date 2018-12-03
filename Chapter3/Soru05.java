package Chapter3;

import java.util.Scanner;

public class Soru05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("haftanun gununu giriniz");
		int girilenGun = input.nextInt();

		System.out.println("bugunden kac gun sonrasini bulacaksiniz : ");
		int kacGunSonra = input.nextInt();

		int bulunacakGun = (girilenGun + kacGunSonra) % 7;

		System.out.print("bugun gunlerden  ");

		switch (girilenGun) {
		case 0:
			System.out.print("pazar");
			break;

		case 1:
			System.out.print("pazartesi");
			break;

		case 2:
			System.out.print("sali");
			break;

		case 3:
			System.out.print("carsamba");
			break;

		case 4:
			System.out.print("persembe");
			break;

		case 5:
			System.out.print("cuma");
			break;

		case 6:
			System.out.print("cumartesi");
			break;

		default:
			System.out.print("haftadaki gun sayisi kadar bir gun giriniz");
			break;
		}

		System.out.println("");
		System.out.print(kacGunSonra + " gun sonra ");

		switch (bulunacakGun) {
		case 0:
			System.out.print("pazar");
			break;
		case 1:
			System.out.println("pazartesi");
		case 2:
			System.out.print("sali");
			break;
		case 3:
			System.out.print("carsamba");
			break;
		case 4:
			System.out.print("persembe");
			break;
		case 5:
			System.out.print("cuma");
			break;
		case 6:
			System.out.println("cumartesi");
			break;


		}
	}

}
