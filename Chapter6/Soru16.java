package Chapter6;

public class Soru16 {
	public static void main(String[] args) {
		for (int i = 2000; i <= 2020; i++) {
			System.out.println(i + "   ---> " + yildaKiGunSayisiniGoster(i) + " gun");
		}
	}

	public static int yildaKiGunSayisiniGoster(int yil) {
		if (artikYilMi(yil)) {
			return 365;
		} else {
			return 366;
		}
	}

	public static boolean artikYilMi(int yil) {
		if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
}
