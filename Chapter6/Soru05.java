package Chapter6;

public class Soru05 {
	public static void main(String[] args) {
		artanSayilar(4,5.6,3);
	}

	private static void artanSayilar(double sayi1, double sayi2, double sayi3) {
		double temp;

		if (sayi1 < sayi2 || sayi1 < sayi2) {
			if (sayi1 < sayi2) {
				temp = sayi1;
				sayi1 = sayi2;
				sayi2 = temp;
			}
			if (sayi1 < sayi3) {
				temp = sayi1;
				sayi1 = sayi3;
				sayi3 = temp;
			}
		}
		if(sayi2 < sayi3) {
			temp = sayi2;
			sayi2 = sayi3;
			sayi3 = temp;
		}
		
		System.out.println(sayi1 + " " + sayi2 + " " + sayi3);

	}
}
