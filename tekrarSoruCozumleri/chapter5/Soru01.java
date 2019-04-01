package tekrarSoruCozumleri.chapter5;

import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Istediginiz kadar sayi giriniz , eger 0 girilirse program sonlanir");
        int girilenPozitifSayiAdeti = 0;
        int girilenNegatifSayiAdeti = 0;
        int toplam = 0;
        double ortalama = 0;

        while (true){
            int sayi = input.nextInt();
            if(sayi == 0){
                break;
            }
            if (sayi > 0){
                girilenPozitifSayiAdeti++;
            }
            if (sayi < 0){
                girilenNegatifSayiAdeti++;
            }
            toplam += sayi;
        }

        ortalama = toplam / (girilenNegatifSayiAdeti + girilenNegatifSayiAdeti);

        System.out.println("Girilen pozitif sayi adeti : " + girilenPozitifSayiAdeti +
                "\nGirilen negatif sayi adeti : " + girilenNegatifSayiAdeti +
                "\nGirilen sayilarin toplami : " + toplam +
                "\nGirilen sayilarin ortalmasi :" + ortalama);
    }
}
