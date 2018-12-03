package Chapter4;

import java.util.Scanner;

public class Soru22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("s1 giriniz");
		String s1 = input.nextLine();
		System.out.println("s2 giriniz");
		String s2 = input.nextLine();
		 if(s1.contains(s2)) {
			 System.out.println(s2 + " " + s1 + " in substringidir");
		 }else {
			 System.out.println(s2 + " " + s1 + " in substringi degildir");
		 }
		
		
	}

}
