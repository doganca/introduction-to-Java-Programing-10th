package tekrarSoruCozumleri.chapter5;

public class Soru13 {
    public static void main(String[] args) {
        int n = 0;
        while (!(Math.pow(n,3) > 12000)){
            n++;
        }
        System.out.println("n : " + n);
    }
}
