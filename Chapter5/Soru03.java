package Chapter5;

public class Soru03 {
	/*
	 * (Kilogram’dan pound’a dönüştürme) Aşağıdaki tabloyu oluşturan bir program
	 * yazınız. (1 kilogram 2.2 pound’dur.) 200 kg kadar tek sayilar yazilacak
	 */
	public static void main(String[] args) {
		System.out.println("kilogram\t\tPaund"); 
		System.out.println("---------\t\t--------");
		for (int i = 0; i <= 200; i++) { // 0 dan 200 kadar sayan dongu baslattim
			if(i % 2 ==1) { // isleme sadece tek sayilari aldim tek sayi kontrolu yapiliyor
				double pound = i * 2.2; // kiloyu pounda donusturdum 
				System.out.println(i + "\t\t\t" + pound);
			}
		}

	}
}
