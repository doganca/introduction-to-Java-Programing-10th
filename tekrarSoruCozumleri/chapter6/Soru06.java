package tekrarSoruCozumleri.chapter6;

public class Soru06 {
    public static void main(String[] args) {
        desenOlustur(5);
    }

    private static void desenOlustur(int i) {
        for (int j = 0; j <= i; j++) {
            for (int k = j; k < i ; k++) {
                System.out.print("  ");
            }
            for (int k = j; k > 0; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
