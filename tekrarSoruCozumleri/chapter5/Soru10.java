package tekrarSoruCozumleri.chapter5;

public class Soru10 {
    /*
     * 100’den 1000’e kadar olan sayılardan 5 ve 6’ya tam olarak bölünebilen sayıları
     * her satırda 10 sayı olacak ve sayılar arasında birer
     * boşluk olacak şekilde gösteren bir program yazınız.*/

    public static void main(String[] args) {
        boolean bosluk = false;
        int sayac = 0;
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                bosluk = true;
                sayac++;
            }
            if (bosluk && sayac % 10 == 0) {
                System.out.println();
                bosluk = false;
            }
        }

    }
}

