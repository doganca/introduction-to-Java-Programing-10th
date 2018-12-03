package Chapter3;

import java.util.Scanner;

public class Soru19 {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("ucgenin kenarlariniz giriniz");
		double kenar1 = giris.nextDouble();
		double kenar2 = giris.nextDouble();
		double kenar3 = giris.nextDouble();
		
		if((kenar1 + kenar2) > kenar3 || (kenar1 + kenar3) > kenar2 || (kenar2 + kenar3) > kenar1 ) {
			System.out.println("ucgenin alani hesaplanacak");
		}else {
			System.out.println("gecersiz uzunluk degeri");
		}
		// logic hata var
	}

}
