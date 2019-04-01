package tekrarSoruCozumleri.chapter5;

public class Soru05 {
    public static void main(String[] args) {
       String title = "Kilograms     Pounds                 |         Pounds           Kilograms";

        System.out.println(title);
        for (int i = 1, j = 20; i < 200; i += 2,j += 5) {
            System.out.printf("%d  \t\t  %3.1f \t\t\t\t\t\t\t\t  %1d \t\t\t %3.2f\n", i, (i * 2.2 ), j, (j / 2.2));

        }
    }
}
