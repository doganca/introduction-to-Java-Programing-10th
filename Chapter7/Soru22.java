package Chapter7;

public class Soru22 {
	private static final int EMPTY = 0;
	private static final int QUEEN = 1;
	private static final int FORBEDEN = 0;
	
	
	public static void main(String[] args) {
		int[] tahta = kiraliceEklenmisTahtayiBul();
		tahtayiYazdir(tahta);
	}

	private static void tahtayiYazdir(int[] tahta) {
		System.out.println("########## Board ##########");
		for (int i = 0; i < tahta.length; i++) {
			if ((i +1) % 8 == 0) {
				System.out.println("|"+neYazlacak(tahta, i) + "|");
			} else {
				System.out.print("|" + neYazlacak(tahta, i));
			}
		}
		System.out.println();
	}

	private static String neYazlacak(int[] tahta, int i) {
		if (tahta[i] == EMPTY) {
			return " ";
		}
		if (tahta[i] == QUEEN) {
			return "Q";
		}
		if (tahta[i] == FORBEDEN) {
			return "X";
		}
		return null;
	}

	private static int[] kiraliceEklenmisTahtayiBul() {
		
		int[] tahta; 
		while (true) {
			int sayac = 0;
			tahta = new int[64];
			int index = 0;
			while(!hepsiDolduMu(tahta)) {
				if (eklenebilirMi(index,tahta)) {
					tahta[index] = QUEEN;
					etrafiniEklemereKapat(tahta, index);
					sayac++;
					tahtayiYazdir(tahta);
				}
				index++;
			}
			if (sayac == 8)
				break;
			
		}
		return tahta;
	}

	private static boolean hepsiDolduMu(int[] tahta) {
		for (int i = 0; i < tahta.length; i++) {
			if(tahta[i] == EMPTY) {
				return false;
			}
		}
		return true;
	}

	private static boolean eklenebilirMi(int index, int[] tahta) {
		if(tahta[index] == EMPTY) {
			return true;
		}
		return false;
	}

	private static void etrafiniEklemereKapat(int[] tahta, int i) {
		for (int satir = getRow(i); satir < 8; satir++) {
			for (int sutun = getCol(i); sutun < tahta.length; sutun++) {
				int index = getIndex(satir, sutun);
				if (tahta[index] == EMPTY) {
					tahta[index] = QUEEN;
					// dolu yerler isaretlenecek
							
				}
			}
		}

	}
	
	public static int getRow(int sayi) {
		return sayi / 8;
	}
	public static int getCol(int sayi) {
		return sayi % 8;
	}
	
	public static int getIndex(int row, int col) {
		return row * 8 + col;
	}
	
	/*
	tahtada etrafini nasil kapatacagimi cozemedim , algoritma kuramadim 
	q nin satir sutun ve caprazlarinini eklemeye kapatamadim,
	algoritma suan sonsuz donguye giriyor
	*/
}
