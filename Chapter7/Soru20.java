package Chapter7;

public class Soru20 {
	/*
	 * Seçmeli sıralama metodu sürekli en küçük değeri bularak bunu ilk elemanla
	 * takas eder. Bu programı en büyük elemanı bulacak ve bunu sonuncu ile takas
	 * edecek şekilde yeniden yazınız. On tane ondalık sayı alan ve bu metodu
	 * çağırarak sayıları sıralanmış olarak gösteren bir test programı yazınız.
	 */
	public static void main(String[] args) {
		int[] array = {5,7,3,5,2,1};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for (int i : array) {
			System.out.print(i + ", ");
		}
	}
}
