package Chapter5;

public class Soru23 {
	public static void main(String[] args) {
		double toplamSoldanSaga = 0;
		for (double i = 1.0; i <= 50_000.0; i++) {
			toplamSoldanSaga += 1 / i; 	
		}
		System.out.println("soldan saga toplam : " + toplamSoldanSaga);
		
		double toplamSagdanSola = 0;
		for (double i = 50_000.0; i >= 1.0; i--) {
			toplamSagdanSola =+  1 / i;
		}
		System.out.println("sagdan sola toplam : " + toplamSagdanSola);
		
		System.out.println("sagdan sola , soldan saga toplamlari arasindaki fark  :" 
				+ (toplamSoldanSaga - toplamSagdanSola));
		
	}

}
