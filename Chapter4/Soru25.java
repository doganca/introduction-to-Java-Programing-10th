package Chapter4;

public class Soru25 {
	public static void main(String[] args) {
		int harf1 = 65 + (int)(Math.random() * (90 - 65));
		int harf2 = 65 + (int)(Math.random() * (90 - 65));
		int harf3 = 65 + (int)(Math.random() * (90 - 65));
		
		int rakam1 = (int) (Math.random() * 10);
		int rakam2 = (int) (Math.random() * 10);
		int rakam3 = (int) (Math.random() * 10);
		int rakam4 = (int) (Math.random() * 10);
		
		System.out.println("Yeni plakamiz - > " + (char)harf1 + (char)harf2 + (char)harf3 + " " + rakam1 + rakam2 + rakam3 + rakam4);
	}

}
