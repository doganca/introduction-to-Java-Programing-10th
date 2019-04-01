package Chapter3;

import java.util.Scanner;

public class Soru07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount in double, for example 11.56: ");
		double amount = input.nextDouble();

		int remainingAmount = (int) (amount * 100); // 1156

		// Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100; // 11
		remainingAmount = remainingAmount % 100; // 56

		// Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25; // 2
		remainingAmount = remainingAmount % 25; // 6

		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10; // 0
		remainingAmount = remainingAmount % 10; // 6

		// Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5; // 1
		remainingAmount = remainingAmount % 5; // 1

		// Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount; //

		System.out.println("Your amount " + amount + " consists of");
		if (numberOfOneDollars >= 2) {
			System.out.println("    " + numberOfOneDollars + " dollars");
		} else if (numberOfOneDollars == 1) {
			System.out.println("    " + numberOfOneDollars + " dollar");
		} else {
			System.out.println("    " + numberOfOneDollars + " dollar");
		}
		if (numberOfQuarters >= 2) {
			System.out.println("    " + numberOfQuarters + " quarters ");
		} else if (numberOfQuarters == 1) {
			System.out.println("    " + numberOfQuarters + " quarter ");
		} else {
			System.out.println("    " + numberOfQuarters + " quarter");
		}
		if (numberOfDimes >= 2) {
			System.out.println("    " + numberOfDimes + " dimes");
		} else if (numberOfDimes == 1) {
			System.out.println("    " + numberOfDimes + " dime");
		} else {
			System.out.println("    " + numberOfDimes + " dime");
		}
		if (numberOfNickels >= 2) {
			System.out.println("    " + numberOfNickels + " nickels");
		} else if (numberOfNickels == 1) {
			System.out.println("    " + numberOfNickels + " nickel");
		} else {
			System.out.println("    " + numberOfNickels + " nickel");
		}
		if (numberOfPennies >= 2) {
			System.out.println("    " + numberOfPennies + " pennies");
		} else if (numberOfPennies == 1) {
			System.out.println("    " + numberOfPennies + " pennie");
		} else {
			System.out.println("    " + numberOfPennies + " pennie");
		}
	}

}
