package Chapter2;

import java.util.Scanner;

public class Soru23 {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		
		System.out.println("surus mefasesini girin");
		double surusMesafesi = giris.nextDouble();
		
		System.out.println("galon basina giden mil sayisini girin");
		double milBasinaGidenGalonBenzin = giris.nextDouble();
		
		System.out.println("galon fiyatini girin ");
		double galonFiyati = giris.nextDouble();
		
		double toplamSurusMaliyeti = (surusMesafesi / milBasinaGidenGalonBenzin) * galonFiyati;
		
		System.out.println("toplam surus maliyeti - " + toplamSurusMaliyeti);
	}

}
