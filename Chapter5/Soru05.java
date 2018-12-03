package Chapter5;

public class Soru05 {
	/*
	 * (Kilogramdan pound’a ve pound’dan kilograma dönüştürme) Aşağıdaki iki tabloyu
	 * yan yana gösteren bir program yazınız. 1 kilogram 2.2 pound
	 */
	public static void main(String[] args) {
		System.out.println("KG\t\tPaund\t\t     |\t\tPaund\t\tKG");
		for (int i = 0, j = 20; j < 515 ; i++,  j++) {
			if (j % 5 == 0) {
				double kg = j / 2.2;
				System.out.print("\t\t\t\t\t\t" + j + "\t\t" + kg + "\n");
			}else if(j % 5 != 0) {
				System.out.print("");
			}
			if (i > 200) {
				continue;
			} else if (i % 2 == 1) {
				double pound = i * 2.2;
				System.out.print(i + "\t\t" + pound + "\n");
			}

		}

	}

} 

// tam sorunu cozemedim
