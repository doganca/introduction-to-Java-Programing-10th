package tekrarSoruCozumleri.chapter6;

public class Soru02 {
    public static void main(String[] args) {
        System.out.println(basabakToplami(2345));
    }

    public static int basabakToplami(int sayi) {
        int deger = 0;
        while (sayi != 0) {
            deger += sayi % 10;
            sayi /= 10;
        }
        return deger;
    }
}
