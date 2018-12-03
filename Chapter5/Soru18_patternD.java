package Chapter5;

public class Soru18_patternD {
	public static void main(String[] args) {
		for (int i = 6; i >= 1; i--) {
			for (int j = i - 1 ; j <= 4 ; j += 1) {
				System.out.print("  ");
				
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
				
			}
			System.out.println();
			
		}

	}

}
