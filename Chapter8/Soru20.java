package Chapter8;

import java.util.Scanner;

public class Soru20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] oyunTahtasi = new int[7][7];

        boolean[] kimKazandi = new boolean[2];

        boolean kazananVarMi = isKazananVarMi(oyunTahtasi, kimKazandi);

        int sayac = 0;

        while (!kazananVarMi) {
            tahtayiYazdir(oyunTahtasi);

            System.out.println("0 - 6 sutunlarin birine " + getRenk(sayac) + " koyun");

            int kolon = input.nextInt();
            tahtayaGirdiyiEkle(oyunTahtasi, sayac, kolon);
            sayac++;
        }

        System.out.println(kimKazandi[0] ? "Red kazandi" : "Yellow kazandi");
    }

    private static boolean isKazananVarMi(int[][] oyunTahtasi, boolean[] kimKazandi) {
        boolean satirKontrol = (isSatirKontrol(1, oyunTahtasi, kimKazandi) || isSatirKontrol(2, oyunTahtasi, kimKazandi));
        boolean sutunKontrol = (isSutunKontrol(1, oyunTahtasi, kimKazandi)|| isSutunKontrol(2,oyunTahtasi,kimKazandi));
        if (satirKontrol || sutunKontrol) {
            return true;
        }
        return  false;
    }

    private static boolean isSutunKontrol(int hangiRenk, int[][] oyunTahtasi, boolean[] kimKazandi) {
        for (int i = oyunTahtasi.length - 1; i > 0; i--) {
            int sayac = 0;
            for (int j = oyunTahtasi.length - 1; j > 0; j--) {
                if (oyunTahtasi[j][i] == hangiRenk) {
                    sayac++;
                }
            }
            if (sayac > 3) {
                kimKazandi[hangiRenk] = true;
                return true;
            }
        }
        return false;
    }

        private static boolean isSatirKontrol ( int hangiRenk, int[][] oyunTahtasi, boolean[] kimKazandi){
            for (int i = oyunTahtasi.length - 1; i > 0; i--) {
                int sayac = 0;
                for (int j = 0; j < oyunTahtasi.length; j++) {
                    if (oyunTahtasi[i][j] == hangiRenk) {
                        sayac++;
                    }
                }
                if (sayac > 3) {
                    kimKazandi[hangiRenk] = true;
                    return true;
                }
            }
            return false;
        }

        private static void tahtayaGirdiyiEkle ( int[][] oyunTahtasi, int sayac, int kolon){
            int satir = 6;
            while (satir >= 0) {
                if (oyunTahtasi[satir][kolon] == 0) {
                    if (sayac % 2 == 0) {
                        oyunTahtasi[satir][kolon] = 1;
                        break;
                    } else {
                        oyunTahtasi[satir][kolon] = 2;
                        break;
                    }
                }
                satir--;
            }
        }

        private static boolean kolonDoluMu ( int[][] oyunTahtasi, int kolon){
            boolean doluMu = false;
            for (int i = oyunTahtasi.length - 1; i < 0; i--) {
                for (int j = 0; j < oyunTahtasi.length; j++) {
                    if (oyunTahtasi[i][kolon] == 0) {
                        doluMu = true;
                    }
                }
            }
            return doluMu;
        }

        private static String getRenk ( int sayac){
            if (sayac % 2 == 0) {
                return "RED";
            }
            return "YELLOW";
        }

        private static void tahtayiYazdir ( int[][] oyunTahtasi){
            for (int i = 0; i < oyunTahtasi.length; i++) {
                for (int j = 0; j < oyunTahtasi.length; j++) {
                    System.out.print("|" + neYazilacak(oyunTahtasi, i, j));
                }
                System.out.println("|");
            }

            System.out.println("----------------------");
        }

        private static String neYazilacak ( int[][] oyunTahtasi, int i, int j){
            if (oyunTahtasi[i][j] == 1) {
                return "R ";
            }
            if (oyunTahtasi[i][j] == 2) {
                return "Y ";
            }

            return "  ";
        }
    }
// TODO: 4 adet oldumu kontrol edilecek ve capraz sorgu yapilacak