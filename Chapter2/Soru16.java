package Chapter2;

import java.util.Scanner;

public class Soru16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("kenar uzunlugunu yaziniz : ");
		double kenarUzunlugu = input.nextDouble();
		
		double alan = (3 * Math.sqrt(3) / 2) * kenarUzunlugu * kenarUzunlugu ;
		
		System.out.println("alan : " + alan);
	}
	

	//karakökı öğrenildi ona göre yapılacak
}
