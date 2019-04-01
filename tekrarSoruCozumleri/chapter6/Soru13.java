package tekrarSoruCozumleri.chapter6;

public class Soru13 {
    public static void main(String[] args) {
        System.out.println("i                 m(i)");
        System.out.println("--------------------------------");
        seriHesapla(20);

    }

    private static void seriHesapla(int sayi) {
        double toplam = 0;
        for (int i = 1; i <= sayi; i++) {
            toplam += (i / (i + 1.0));
            System.out.printf("%d                %2.4f\n", i, toplam);

        }
    }
}
