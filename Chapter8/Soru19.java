package Chapter8;

import java.util.Scanner;

public class Soru19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Iki boyutlu dizinin satir ve sutun sayisini giriniz");
        int satirSayisi = input.nextInt();
        int sutunSayisi = input.nextInt();

        System.out.println("Desenin degerlerini giriniz");

        int[][] desen = deseneDegerleriGir(satirSayisi, sutunSayisi, input);

        boolean ardisikSayiVarMi = ardisikSayiKontrolu(desen, sutunSayisi);

        System.out.println(ardisikSayiVarMi);
    }

    private static int[][] deseneDegerleriGir(int satirSayisi, int sutunSayisi, Scanner input) {
        int[][] desen = new int[satirSayisi][sutunSayisi];

        for (int i = 0; i < desen.length; i++) {
            for (int j = 0; j < desen[i].length; j++) {
                desen[i][j] = input.nextInt();
            }
        }
        return desen;
    }

    private static boolean ardisikSayiKontrolu(int[][] desen, int sutunSayisi) {
        boolean ardisikSayiVarMi = false;

        boolean satirKontrol = satirlariKontrolEt(desen);
        boolean sutunKontrol = sutunlariKontrolEt(desen, sutunSayisi);
        boolean caprazKontrol = isCaprazKontrol(desen, sutunSayisi);

        if (satirKontrol || sutunKontrol) {
            ardisikSayiVarMi = true;
        }

        return ardisikSayiVarMi;
    }

    private static boolean isCaprazKontrol(int[][] desen, int sutunSayisi) {
        boolean durum = false;
        for (int i = 0; i < desen.length; i++) {
            for (int j = 0; j < desen[i].length ; j++) {
                //************************************** kodlar yazilcak
            }
        }
        return durum;
    }

    private static boolean satirlariKontrolEt(int[][] desen) {
        for (int i = 0; i < desen.length; i++) {
            int sayi = desen[i][0];
            int sayac = 0;
            for (int j = 0; j < desen[i].length; j++) {
                if (sayi != desen[i][j]) {
                    sayi = desen[i][j];
                    sayac = 0;
                }
                if (sayi == desen[i][j]) {
                    sayac++;
                }
                if (sayac > 3) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean sutunlariKontrolEt(int[][] desen, int sutunSayisi) {
        for (int i = 0; i < sutunSayisi; i++) {
            int sayac = 0;
            int sayi = desen[0][0];
            for (int j = 0; j < desen.length; j++) {
                if (sayi != desen[j][i]) {
                    sayi = desen[j][i];
                    sayac = 0;
                }
                if (sayi == desen[j][i]) {
                    sayac++;
                }
                if (sayac > 3) {
                    return true;
                }
            }
        }
        return false;
    }
//TODO capraz karsilastirma yapilacak
}
