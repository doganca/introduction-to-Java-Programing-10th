package tekrarSoruCozumleri.chapter6;

public class Soru01 {
    public static void main(String[] args) {
        System.out.println("Ilk 100 besgensel sayi : ");
        for (int i = 1; i <=100 ; i++) {
            if ((i -1) % 10 == 0){
                System.out.println();
            }
            System.out.printf("%5d ",besgenSayilar(i));
        }

    }

    public static int besgenSayilar(int sayi){
        return (sayi * ((3 * sayi) - 1)) / 2;
    }
}
