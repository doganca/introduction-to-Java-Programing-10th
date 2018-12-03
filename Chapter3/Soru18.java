package Chapter3;

import java.util.Scanner;

public class Soru18 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("kargo agirligini giriniz : ");
		double kargoAgirligi = input.nextDouble();
		
		if(kargoAgirligi > 0 && kargoAgirligi <= 1) {
			System.out.println("3.5 $ ucretiniz var");
		}else if(kargoAgirligi > 1 && kargoAgirligi <= 3) {
			System.out.println("5.5$ ycret");
		}else if(kargoAgirligi > 3 && kargoAgirligi <= 10 ) {
			System.out.println("8.5$ ucret");
		}else if(kargoAgirligi > 10 && kargoAgirligi <= 20) {
			System.out.println("10.5$ ucret");
		}else if(kargoAgirligi > 20 && kargoAgirligi <= 50) {
			System.out.println("iletisime gecin");
		}else {
			System.out.println("50 kg buyuk kargo gonderilemez");
		}
	}

}
