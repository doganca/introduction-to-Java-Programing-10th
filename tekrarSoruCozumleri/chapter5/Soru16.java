package tekrarSoruCozumleri.chapter5;

import java.util.Scanner;

public class Soru16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        int sayi = input.nextInt();

        int bolen = 2;
        while(sayi / bolen != 0){
            if(sayi % bolen== 0){
                System.out.print(bolen + " ");
                sayi /= bolen;
            }else {
                bolen++;
            }
        }

    }
}
