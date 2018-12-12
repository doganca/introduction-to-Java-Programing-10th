package Chapter4;

import java.util.Scanner;

public class Soru17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ay giriniz");
		String girilenAy = input.nextLine();

		System.out.println("Bir yil giriniz");
		int girilenYil = input.nextInt();

		boolean artikYilMi = ((girilenYil % 4 == 0 && girilenYil % 100 != 0) || (girilenYil % 400 == 0));

		if (artikYilMi && girilenAy.equals("Sub")) {
			System.out.println("Subat " + girilenYil + " da 29 gun vardir");
		} else {
			switch (girilenAy) {
			case "Oca":
				System.out.println("Ocak " + girilenYil + " da 31 gun vardir");
				break;

			case "Sub":
				System.out.println("Subat " + girilenYil + " da 28 gun vardir");
				break;

			case "Mar":
				System.out.println("Mart " + girilenYil + " da 30 gun vardir");
				break;

			case "Nis":
				System.out.println("Nisan " + girilenYil + " da 31 gun vardir");
				break;

			case "May":
				System.out.println("Mayis " + girilenYil + " da 30 gun vardir");
				break;

			case "Haz":
				System.out.println("Haziran " + girilenYil + " da 31 gun vardir");
				break;

			case "Tem":
				System.out.println("Temmuz " + girilenYil + " da 30 gun vardir");
				break;

			case "Agu":
				System.out.println("Agustos " + girilenYil + " da 31 gun vardir");
				break;

			case "Eyl":
				System.out.println("Eylul " + girilenYil + " da 30 gun vardir");
				break;

			case "Eki":
				System.out.println("Ekim " + girilenYil + " da 31 gun vardir");
				break;

			case "Kas":
				System.out.println("Kasim " + girilenYil + " da 30 gun vardir");
				break;

			case "Ara":
				System.out.println("Aralik " + girilenYil + " da 31 gun vardir");
				break;

			default:
				System.out.println("yanlis ay ismi girdiniz");
				break;
			}
		}

	}

}
