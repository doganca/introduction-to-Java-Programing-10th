package Chapter6;

import java.util.Scanner;

public class Soru19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ucgenin uc kenarini giriniz : ");
		
		int kenar1 = input.nextInt();
		int kenar2 = input.nextInt();
		int kenar3 = input.nextInt();
		
		if(kenarUzunluguGecerliMi(kenar1,kenar2,kenar3)) {
			System.out.printf("%5.3f",ucgenAlani(kenar1,kenar2,kenar3));
		}else {
			System.out.println("Iki kenar ucunlugu ucuncuden uzun degil");
		}
	}

	private static boolean kenarUzunluguGecerliMi(int kenar1, int kenar2, int kenar3) {
		if((kenar1 + kenar2 > kenar3) || (kenar1 + kenar3 > kenar2) || (kenar2 + kenar3 > kenar1)) {
			return true;
		}else {
			return false;
		}
	}
	
	private static double ucgenAlani(int kenar1, int kenar2, int kenar3) {
		double s = (kenar1 + kenar2 + kenar3) / 2;
		double alan =  Math.sqrt(s * (s - kenar1) * (s - kenar2) * (s - kenar3));
		return alan ;
	}
}
