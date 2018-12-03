package Chapter3;

import java.util.Scanner;

public class Soru06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("agirliginizi ve boyunuzu giriniz");
		double agirlik = input.nextDouble();
		double boy = input.nextDouble();
		
		double vki = agirlik / (boy * boy);
		
		if(vki <= 18.5) {
			System.out.println("zayifsiniz");
		}else if(vki <= 25) {
			System.out.println("normalsiniz");
		}else if(vki <= 30) {
			System.out.println("hafif kilolusunuz");
		}else {
			System.out.println("obezsiniz");
		}
	}

}
