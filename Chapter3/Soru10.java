package Chapter3;

import java.util.Scanner;

public class Soru10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int sayi1 = (int)(Math.random() * 100);
		int sayi2 = (int)(Math.random() * 100);
		
		System.out.println(sayi1 + " + " + sayi2 + " =  ? ");
		int cevap = input.nextInt();
		
		int sonuc = sayi1 + sayi2;
		
		if(sonuc == cevap) {
			System.out.println("dogru cevap");
		}else {
			System.out.println("yanlis cevap ,  cevap :" + sonuc);
		}
	}

}
