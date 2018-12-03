package Chapter5;

public class Soru06 {
	/*
	 * (Milden kilometreye dönüştürme) Aşağıdaki iki tabloyu yan yana gösteren bir
	 * program yazınız. 1 mil 1,609 kilometredir , 10 mile kadar mil , 20 den 65e
	 * kadar 5 artarak km mile donusecek
	 */
	public static void main(String[] args) {
		System.out.print("mil\t\t KM\t\t|\t\tKM\t\tmil\n");
		for (int i = 1, j = 20; i <= 10 && j <= 65; i++, j+= 5) {
			if (i < 11 || j > 19 || j % 5 == 0) {
				if (i < 11) {
					double km = i * 1.609;
					System.out.println(i + "\t\t" + km + "");
				}
				if (j % 5 == 0) {
					double mil = j / 1.609;
					System.out.print("\t\t\t\t\t\t" + j + "\t\t" + mil + "\n");
				}

			}

		}

	}
}
