package tekrarSoruCozumleri.chapter5;

public class Soru07 {
    /*
     *  Bu yılın okul ücretinin 10000 $ olduğunu ve her yıl %5 arttığını varsayalım.
     *  Bir sonraki yıl okul ücreti 10 500$ olacaktır.
     *  10 yılın okul ücretini ve 10 uncu yıldan sonraki 4 yılın toplam ücretini hesaplayan bir program yazınız
     */
    public static void main(String[] args) {
        int okulUcreti = 10_000;
        double okulUcretiYillikArtis = 0.05;
        int onYillikOkulUcreti = 0;
        int onuncuYildanSonrakiDortYillikOkulUcreti = 0;

        for (int i = 1; i <= 14; i++) {
            if (i <= 10) {
                okulUcreti += okulUcreti * okulUcretiYillikArtis;
                onYillikOkulUcreti += okulUcreti;
            }
            if (i > 10) {
                okulUcreti += okulUcreti * okulUcretiYillikArtis;
                onuncuYildanSonrakiDortYillikOkulUcreti += okulUcreti;
            }
        }

        System.out.println("10 yılın okul ücretini : " + onYillikOkulUcreti);
        System.out.println("10 uncu yıldan sonraki 4 yılın toplam ücreti : " + onuncuYildanSonrakiDortYillikOkulUcreti);
    }
}
