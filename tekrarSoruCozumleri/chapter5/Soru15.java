package tekrarSoruCozumleri.chapter5;

public class Soru15 {
    public static void main(String[] args) {
        int boslukSayac = 1;
        for (int i = 33; i <= 126 ; i++) {
            System.out.print((char)i + " ");
            if (boslukSayac % 10 == 0){
                System.out.println();
            }
            boslukSayac++;
        }
    }
}
