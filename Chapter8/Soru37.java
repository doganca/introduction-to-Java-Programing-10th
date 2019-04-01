package Chapter8;

import java.util.Scanner;

public class Soru37 {
	public static void main(String[] args) {
		String[][] ulkeler = {
				{"Ukrayna", "kiev"},
				{"Turkiye", "ankara"},
				{"Almanya", "berlin"},
				{"Norvec", "oslo"},
				{"Fransa", "paris"},
				{"Hollanda", "amsterdam"},
				{"Rusya", "moskova"},
				{"Azerbaycan", "baku"},
				{"Ispanya", "madrid"}};
		
		
		oyunuOyna(ulkeler);
	}

	private static void oyunuOyna(String[][] ulkeler) {
		Scanner input = new Scanner(System.in);
		int dogruCevap = 0;
		for (int i = 0; i < ulkeler.length; i++) {
			for (int j = 0; j < ulkeler[i].length -1; j++) {
				System.out.print(ulkeler[i][j] + " nin baskenti neresidir  :");
				String cevap = input.nextLine();
				cevap = cevap.toLowerCase();
				if(ulkeler[i][1].equals(cevap)) {
					System.out.println("Cevabiniz dogru");
					dogruCevap++;
				}else {
					System.out.println("Dogru cevap " + ulkeler[i][1]);
				}
			}
		}
		System.out.println("Soru sayisi : " + ulkeler.length + " , Dogru Cevap sayisi : " + dogruCevap);
	}
}
