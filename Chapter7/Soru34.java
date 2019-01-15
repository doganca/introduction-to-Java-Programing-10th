package Chapter7;

public class Soru34 {
	public static void main(String[] args) {
		stringSirala("edcba");
	}

	private static void stringSirala(String string) {
		char[] girdi = string.toCharArray();
		
		for (int i = 1; i < girdi.length; i++) {
			for (int j = 0; j < girdi.length; j++) {
				if(girdi[i] < girdi[j]) {
					char temp = girdi[i];
					girdi[i] = girdi[j];
					girdi[j] = temp;
				}
			}
		}
		degerYazdir(girdi);
		
	}

	private static void degerYazdir(char[] girdi) {
		for (char c : girdi) {
			System.out.print(c);
		}
	}

}