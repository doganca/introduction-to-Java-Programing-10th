package Chapter4;

import java.util.Scanner;

public class Soru21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("bir SSN giriniz");
		String ssn = input.nextLine();

		
		if(ssn.length() == 11) {
			System.out.println(ssn + " gecerli bir SSN numarasidir");
		}else {
			System.out.println(ssn + " gecersiz bir SSN numarasidir");
		}
	}

}
