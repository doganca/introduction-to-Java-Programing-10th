package Chapter6;

public class Soru37 { /*
						 * Metot sayının önüne bir veya daha fazla 0 (Sıfır) ekleyerek geri döner.
						 * Girilen sayının uzunluğunu başına 0 ekleyerek tamamlayanız. Örneğin;
						 * format(34, 4), 0034 döner ya da format(34, 5), 00034 döner gibi. Eğer girilen
						 * sayının basamak sayısı, uzunluk değerinden büyük ise girilen sayının aynısını
						 * geri dönsün. Örneğin; format(34, 1) ise 34. 
						 * Kullanıcıdan bir sayı ve formatlanacağı
						 * genişlik değerini alan ve format(number, width) metodunu çağırarak
						 * formatlanmış string’i gösteren bir program yazınız.
						 */
	
	public static void main(String[] args) {
		System.out.println(format(123, 5));
	}

	private static String format(int sayi, int genislik) {
		String sayiString = sayi + "";
		
		if(sayi <= genislik) {
			return sayiString;
		}
		for(int i = genislik; i >= sayiString.length(); i--) {
			sayiString = 0 + sayiString;
		}
		return sayiString;
		
	}}