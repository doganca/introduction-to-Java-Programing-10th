package Chapter5;

public class Soru15 {
	/*
	 * (ASCII karakter tablosunu gösterme) ASCII karakter tablosunda !’den ~ ‘ye
	 * kadar olan karakterleri gösteren bir program yazınız. Her satırda on karakter
	 * gösteriniz. Ek B’de ASCII tablosu verilmiştir. Karakterler arasında tam
	 * olarak bir boşluk bulunmalıdır. 33 126
	 * 
	 */
	public static void main(String[] args) {
		int baslangic = 33;
		int bitis = 126;
		for(int i = baslangic; i <= bitis; i++) {
			char tablo = (char)i;
			if(i % 10 == 0 ) {
			System.out.println();	
			}
			System.out.print(tablo);
			
			
		}
		
	}

}
