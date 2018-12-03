package Chapter5;

public class Soru18_patternC {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 12 -i ; j > i; j--) {
				System.out.print(" ");		
			}
			for (int j = i; j >= 1 ; j--) {
				System.out.printf("%-1d", j);
				if(j > 1) {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
			
		
	}

}
