package tekrarSoruCozumleri.chapter5;

public class Soru18_C {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 6 - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
