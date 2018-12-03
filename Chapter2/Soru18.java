package Chapter2;

public class Soru18 {
	public static void main(String[] args) {
		double ikinci = Math.pow(2, 3);
		double ucuncu = Math.pow(3, 4);
		double dorduncu = Math.pow(4, 5);
		double besinci = Math.pow(5, 6);
		
		System.out.println("  a  " + "  b  " + "  pow(a, b)");
		System.out.println("  1  " + "  2    " + (int)Math.pow(1, 2));
		System.out.println("  2  " + "  3    " + (int)ikinci);
		System.out.println("  3  " + "  4    " + (int)ucuncu);
		System.out.println("  4  " + "  5    " + (int)dorduncu);
		System.out.println("  5  " + "  6    " + (int)besinci);
	}

}
