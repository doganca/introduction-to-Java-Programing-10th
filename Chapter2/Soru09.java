package Chapter2;

import java.util.Scanner;

public class Soru09 {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println(" v0 , v1 ve t yi giriniz");
		double ilkHiz = giris.nextDouble();
		double sonHiz = giris.nextDouble();
		double zaman  = giris.nextDouble();
		
		double ivme = (sonHiz - ilkHiz) / zaman ;
		
		System.out.println(" ortalama ivme : " + ivme);
	}

}
