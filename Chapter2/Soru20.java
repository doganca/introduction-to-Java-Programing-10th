package Chapter2;

import java.util.Scanner;

public class Soru20 {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("bakiye ve yillik faiz oranini girin");
		
		double bakiye = giris.nextDouble();
		double yillikFaizOrani = giris.nextDouble();
		
		double faizGetirisi = bakiye * (yillikFaizOrani / 1200);
		
		System.out.println("faiz orani : " + faizGetirisi);
	}

}
