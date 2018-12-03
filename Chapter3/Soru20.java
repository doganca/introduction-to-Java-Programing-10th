package Chapter3;

import java.util.Scanner;

public class Soru20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("-58 ile 41F arasinda sicaklik girin");
		double sicaklik = input.nextDouble();
		
		System.out.println("ruzgar hizini saatte min 2 mil olacak sekilde giriniz ");
		double ruzgarHizi = input.nextDouble();
		
		if((sicaklik >= -58 && sicaklik <= 41) && ruzgarHizi >= 2) {
			double hissedilenSicaklik = 35.74 + (0.6215 * sicaklik) - (35.75 * Math.pow(ruzgarHizi, 0.16)) 
					+ (0.4275 * sicaklik * Math.pow(ruzgarHizi, 0.16));
			System.out.println("hissedilen sicaklik : " + hissedilenSicaklik);
		}else {
			System.err.printf("girilen degerler dogru degil");
		}
	}
}
