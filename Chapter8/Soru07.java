package Chapter8;

public class Soru07 {

	public static void main(String[] args) {
		double[][] noktalar = { { -1, 0, 3 }, { -1, -1, -1 }, { 4, 1, 1 }, { 2, 0.5, 9 }, { 3.5, 2, -1 }, { 3, 1.5, 3 },
				{ -1.5, 4, 2 }, { 5.5, 4, -0.5 } };

		enYakinNoktayiBul(noktalar);
	}

	private static void enYakinNoktayiBul(double[][] noktalar) {

		double enKucukMesafe = Double.MAX_VALUE;

		int p1 = -1;
		int p2 = -1;

		for (int i = 0; i < noktalar.length - 1; i++) {
			for (int j = i + 1; j < noktalar.length; j++) {
				double mesafe = mesafeHesapla(noktalar[i][0], noktalar[i][1], noktalar[i][2], noktalar[j][0],
						noktalar[j][1], noktalar[j][2]);
				
				if(enKucukMesafe > mesafe) {
					enKucukMesafe = mesafe;
					p1 = i;
					p2 = j;
				}
			}
		}
		System.out.println("Birbirine en yakin iki nokta : (" + noktalar[p1][0] + ", " + noktalar[p1][1] + ", " + noktalar[p1][2] + "),( "
				+ noktalar[p2][0] + " , " + noktalar[p2][1] + ", " +  noktalar[p2][2] + ")");
	}

	private static double mesafeHesapla(double x1, double y1, double z1, double x2, double y2, double z2) {
		
		return Math.sqrt(Math.pow(z2 - z1, 2) + Math.pow(y2 -y1, 2) + Math.pow(z2 - z1, 2));
	}
}
