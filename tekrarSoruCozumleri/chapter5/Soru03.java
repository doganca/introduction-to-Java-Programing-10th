package tekrarSoruCozumleri.chapter5;

public class Soru03 {
    public static void main(String[] args) {
        System.out.println("Kilograms\t Paunds");
        for (int i = 1; i < 200; i+= 2) {
            System.out.printf("%d \t      \t%1.1f\n",i , (i * 2.2 ));
        }
    }
}
