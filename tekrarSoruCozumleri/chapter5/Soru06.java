package tekrarSoruCozumleri.chapter5;

public class Soru06 {
    public static void main(String[] args) {
        String title = " Miles        Kilometers         |         Kilometers         Miles";

        System.out.println(title);

        for (int i = 1, j = 20; i <= 10 ; i++, j += 5) {
            System.out.printf("%1d     \t\t\t %1.3f \t\t\t\t\t\t\t %2d \t \t %2.3f\n ", i, (i * 1.609), j, (j / 1.609));
        }
    }
}
