package tekrarSoruCozumleri.chapter5;

import java.util.Scanner;

public class Soru14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Iki pozitif tam sayi giriniz : ");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        int enbBuyukSayi = 0;

        if (sayi1 > sayi2){
            enbBuyukSayi = sayi1;
        }else {
            enbBuyukSayi = sayi2;
        }

        for (int i = enbBuyukSayi / 2; i > 0; i--) {
            if (sayi1 % i == 0 && sayi2 % i == 0){
                System.out.println("EBOB : " + i);
                break;
            }
        }
    }
}
