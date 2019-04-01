package Chapter7;

public class Soru06 {
	static final int NUMBER_OF_PRIMES = 1_000_0000;
	static final int IYI_PERFORMANS = 0;
	static final int NORMAL = 1;
	static final int KOTU_PERFORMANS = 2;
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		printPrimeNumbers(NUMBER_OF_PRIMES, IYI_PERFORMANS);
		long end = System.currentTimeMillis();
		System.out.println("IYI_PERFORMANS takes " + (end - start) + " ms");
		/*
		start = System.currentTimeMillis();
		printPrimeNumbers(NUMBER_OF_PRIMES, NORMAL);
		end = System.currentTimeMillis();
		System.out.println("NORMAL takes " + (end - start) + " ms");
		
		start = System.currentTimeMillis();
		printPrimeNumbers(NUMBER_OF_PRIMES, KOTU_PERFORMANS);
		end = System.currentTimeMillis();
		System.out.println("KOTU_PERFORMANS takes " + (end - start) + " ms");
		*/
	}

	public static void printPrimeNumbers(int numberOfPrimes, int alg) {
		final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
		int count = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness
		int[] primes = new int[numberOfPrimes];

		// Repeatedly find prime numbers
		while (count < numberOfPrimes) {
			// Print the prime number and increase the count
			boolean isPrime = false;
			switch (alg) {
			case 0:
				isPrime = isPrimePerformansli(number, primes);
				break;
			case 1:
				isPrime = isPrime(number);
				break;
			case 2:
				isPrime = isPrimePerformanssiz(number);
				break;
			}
			if (isPrime) {
				primes[count] = number;
				count++; // Increase the count

				/*
				System.out.printf("%-10s", number);
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// Print the number and advance to the new line
					System.out.println();
				} 
				*/	
			}

			// Check if the next number is prime
			number++;
		}
	}
	
	
	/** Check whether number is prime */
	public static boolean isPrimePerformansli(int number, int[] primes) {
		double sqrt = Math.sqrt(number);
		
		for (int i = 0; primes[i] != 0 && primes[i] <= sqrt; i++) {
			if (number % primes[i] == 0) { // If true, number is not prime
				return false; // number is not a prime
			}
		}

		return true; // number is prime
	}

	/** Check whether number is prime */
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { // If true, number is not prime
				return false; // number is not a prime
			}
		}

		return true; // number is prime
	}
	
	/** Check whether number is prime */
	public static boolean isPrimePerformanssiz(int number) {
		for (int divisor = 2; divisor < number; divisor++) {
			if (number % divisor == 0) { // If true, number is not prime
				return false; // number is not a prime
			}
		}

		return true; // number is prime
	}
}
