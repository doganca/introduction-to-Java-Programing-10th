package tekrarSoruCozumleri.chapter6;

public class Soru12 {
    public static void main(String[] args) {
        charYazdir('1','Z',10);
    }

    public static void charYazdir(char ch1, char ch2, int boslukSayisi){
        for (int i = ch1; i <= ch2 ; i++) {
            if((i + 1) % boslukSayisi == 0){
                System.out.println();
            }
            System.out.print((char)i + " ");
        }
    }
}
