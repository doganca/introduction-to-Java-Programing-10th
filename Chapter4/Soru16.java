package Chapter4;

public class Soru16 {
	public static void main(String[] args) {
		int rasgeleSayi = 65 + (int)(Math.random() * (91 - 65));

		System.out.println(rasgeleSayi);

		char harf = (char) rasgeleSayi;
		System.out.println(harf);
	}

}
