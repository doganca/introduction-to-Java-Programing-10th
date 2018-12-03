package Chapter5;

public class Soru10 {
	/*
	 * (5 ve 6’ya bölünebilen sayıları bulma) 100’den 1000’e kadar olan sayılardan 5
	 * ve 6’ya tam olarak bölünebilen sayıları her satırda 10 sayı olacak ve sayılar
	 * arasında birer boşluk olacak şekilde gösteren bir program yazınız.
	 * 
	 */
	public static void main(String[] args) {
		for(int i = 100; i <= 1000; i++) {
			if(i % 5 == 0 && i % 6 == 0) {
				System.out.println("5 ve 6 ya bolunebilen sayilar : " + i);
			}
		}
	}

}
