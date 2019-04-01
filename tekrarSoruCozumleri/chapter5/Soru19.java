package tekrarSoruCozumleri.chapter5;

public class Soru19 {
    public static void main(String[] args) {
        for (int i = 1; i <= 8 ; i++) {
            for (int j = 8 - i; j > 0 ; j--) {
                System.out.print("  ");
            }
            for (int j = i + i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
