package tekrarSoruCozumleri.chapter5;

public class Soru11 {
    /*
     * (5 ya da 6’ya tam bölünen ancak her ikisine birden bölünmeyen sayıları bulma)
     * 100’sen 200’e kadar  5 ya da 6’ya tam bölünen ancak her ikisine birden tam bölünmeyen sayıları
     * her satırda 10 sayı olacak şekilde gösteren bir program yazınız.
     * Sonuçlar arasında sadece bir boşluk olacak şekilde gösteriniz.*/
    public static void main(String[] args) {
        boolean boslukDurumu = false;
        int boslukSayac = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 5 == 0 ^ i % 6 ==0){
                System.out.print(i + " ");
                boslukDurumu = true;
                boslukSayac++;
            }
            if (boslukDurumu && boslukSayac % 10 == 0){
                System.out.println();
                boslukDurumu = false;
            }
        }
    }
}
