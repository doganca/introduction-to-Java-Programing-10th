package Chapter5;

public class Soru04 {
	/*
	 * (Mil’den kilometre’ye dönüştürme) Aşağıdaki tabloyu oluşturan bir program
	 * yazınız. (1 mil 1,609 kilometredir) 10 mile kadar
	 */

	public static void main(String[] args) {
		System.out.println("mil\t\t\t KM");
		for(int i = 1; i < 11; i++) {
			double km = i * 1.609;
			System.out.println(i + "\t\t\t" + km);
		}

	}
}
