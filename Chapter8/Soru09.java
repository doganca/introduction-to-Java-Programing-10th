package Chapter8;

import java.util.Scanner;

public class Soru09 {
	public static void main(String[] args) {

		int[][] oyun = new int[3][3];

		oyunuOyna(oyun);

	}

	private static void oyunuOyna(int[][] oyun) {
		boolean[] kazanan = new boolean[2];
		tahtayiYazdir(oyun);
		kullanicidanOyunGirisiIste(oyun, kazanan);
		if (kazanan[0]) {
			System.out.println("X kazandi");
		}
		if (kazanan[1]) {
			System.out.println("O kazandi");
		}

	}

	private static void tahtayiYazdir(int[][] oyun) {
		for (int i = 0; i < oyun.length; i++) {
			System.out.println("-------------");
			for (int j = 0; j < oyun.length; j++) {
				System.out.print("| " + neYazilacak(i, j, oyun) + "  ");
				if (j == 2) {
					System.out.print("|");
				}
			}
			System.out.println();
		}
		System.out.print("-------------");

	}

	private static String neYazilacak(int i, int j, int[][] oyun) {
		if (oyun[i][j] == 1) {
			return "X";
		} else if (oyun[i][j] == 2) {
			return "O";
		} else {
			return "";
		}
	}

	private static void kullanicidanOyunGirisiIste(int[][] oyun, boolean[] kazanan) {
		Scanner input = new Scanner(System.in);
		int xMiOmu = 0;
		while (!kazananVarMi(oyun, kazanan)) {
			System.out.println("\nSatir ve sutun girin");
			int satir = input.nextInt();
			int sutun = input.nextInt();
			if (!tahtadaSayiBosMu(oyun, satir, sutun)) {
				System.out.println("Tahtada satir dolu baska biryer girin");
			}
			if (xMiOmu % 2 == 0) {
				oyun[satir][sutun] = 1;
			} else {
				oyun[satir][sutun] = 2;
			}
			tahtayiYazdir(oyun);
			xMiOmu++;
		}

	}

	private static boolean tahtadaSayiBosMu(int[][] oyun, int satir, int sutun) {
		if (oyun[satir][sutun] == 0) {
			return true;
		}
		return false;
	}

	private static boolean kazananVarMi(int[][] oyun, boolean[] kazanan) {
		boolean satir = satirKontrolEt(oyun, kazanan);
		boolean sutun = sutunKontrolEt(oyun, kazanan);
		boolean capraz = caprazKontrolEt(oyun, kazanan);
		if (satir || sutun || capraz) {
			return true;
		}
		return false;
	}

	private static boolean satirKontrolEt(int[][] oyun, boolean[] kazanan) {
		for (int i = 0; i < oyun.length; i++) {
			int xSayac = 0;
			int oSayac = 0;
			for (int j = 0; j < oyun.length; j++) {
				if (oyun[i][j] == 1) {
					xSayac++;
				}
				if (oyun[i][j] == 2) {
					oSayac++;
				}
			}
			if (xSayac == 3) {
				kazananiGir(kazanan, 0);
				return true;
			}
			if (oSayac == 3) {
				kazananiGir(kazanan, 1);
				return true;
			}
		}
		return false;
	}

	private static void kazananiGir(boolean[] kazanan, int kimKazandi) {
		kazanan[kimKazandi] = true;

	}

	private static boolean sutunKontrolEt(int[][] oyun, boolean[] kazanan) {
		for (int i = 0; i < oyun.length; i++) {
			int xSayac = 0;
			int oSayac = 0;
			for (int j = 0; j < oyun.length; j++) {
				if (oyun[j][i] == 1) {
					xSayac++;
				}
				if (oyun[j][i] == 2) {
					oSayac++;
				}
			}
			if (xSayac == 3) {
				kazananiGir(kazanan, 0);
				return true;
			}
			if (oSayac == 3) {
				kazananiGir(kazanan, 1);
				return true;
			}
		}
		return false;
	}

	private static boolean caprazKontrolEt(int[][] oyun, boolean[] kazanan) {
		boolean sagCapraz = sagCaprazKontrolEt(oyun, kazanan);
		boolean solCapraz = solCaprazKontrolEt(oyun, kazanan);
		if (sagCapraz || solCapraz) {
			return true;
		}
		return false;
	}

	private static boolean sagCaprazKontrolEt(int[][] oyun, boolean[] kazanan) {
		int xSayac = 0;
		int oSayac = 0;
		for (int i = 0; i < oyun.length; i++) {
			for (int j = i; j <= i; j++) {
				if (oyun[i][j] == 1) {
					xSayac++;
					continue;
				}
				if (oyun[i][j] == 2) {
					oSayac++;
					continue;
				}
				continue;
			}
		}
		if (xSayac == 3) {
			kazananiGir(kazanan, 0);
			return true;
		}
		if (oSayac == 3) {
			kazananiGir(kazanan, 1);
			return true;
		}
		return false;
	}


	private static boolean solCaprazKontrolEt(int[][] oyun, boolean[] kazanan) {
		int xSayac = 0;
		int oSayac = 0;
		for (int i = 0; i < oyun.length; i++) {
			for (int j = oyun.length - 1 - i; j >= oyun.length - 1 - i; j--) {
				if (oyun[i][j] == 1) {
					xSayac++;
					continue;
				}
				if (oyun[i][j] == 2) {
					oSayac++;
					continue;
				}
				continue;
			}
		}
		if (xSayac == 3) {
			kazananiGir(kazanan, 0);
			return true;
		}
		if (oSayac == 3) {
			kazananiGir(kazanan, 1);
			return true;
		}
		return false;
	}
}
 // TODO tahtaya girdi girildiginde tasma yapiyor duzeltilecek
