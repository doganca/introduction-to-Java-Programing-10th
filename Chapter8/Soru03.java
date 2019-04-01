package Chapter8;

public class Soru03 {
	public static void main(String[] args) {
		char[][] cevaplar = { { 'A', 'A', 'B', 'A', 'A', 'A', 'A', 'B', 'A', 'C' },
				{ 'A', 'B', 'A', 'D', 'A', 'A', 'A', 'A', 'A', 'A' },
				{ 'A', 'C', 'A', 'D', 'A', 'A', 'A', 'A', 'A', 'A' },
				{ 'C', 'A', 'A', 'A', 'A', 'B', 'A', 'D', 'A', 'A' },
				{ 'A', 'D', 'A', 'B', 'A', 'A', 'A', 'A', 'A', 'A' },
				{ 'D', 'A', 'A', 'C', 'A', 'B', 'C', 'A', 'C', 'A' },
				{ 'A', 'D', 'B', 'A', 'A', 'A', 'A', 'A', 'D', 'A' },
				{ 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'B', 'A', 'A' },
				{ 'A', 'D', 'A', 'C', 'B', 'A', 'C', 'A', 'D', 'A' },
				{ 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'B', 'D', 'A' } };

		char[] cevapAnahtari = { 'D', 'A', 'C', 'B', 'B', 'A', 'D', 'B', 'C', 'C' };

		ogrecininNotlariniYazdir(cevaplar, cevapAnahtari);

	}

	public static void ogrecininNotlariniYazdir(char[][] cevaplar, char[] cevapAnahtari) {
		int[][] cevaplariTut = new int[cevaplar.length][2];

		dogruCevapSayisiniDiziyeEkle(cevaplar, cevapAnahtari, cevaplariTut);

		sirala(cevaplariTut);
	}

	public static void dogruCevapSayisiniDiziyeEkle(char[][] cevaplar, char[] cevapAnahtari, int[][] cevaplariTut) {
		for (int satir = 0; satir < cevaplar.length; satir++) {
			int dogruCevapSayaci = 0;
			for (int sutun = 0; sutun < cevaplar[satir].length; sutun++) {
				if (cevaplar[satir][sutun] == cevapAnahtari[sutun]) {
					dogruCevapSayaci++;
				}
			}
			cevaplariTut[satir][0] = satir;
			cevaplariTut[satir][1] = dogruCevapSayaci;

		}
	}

	private static void sirala(int[][] cevaplariTut) {

		degerleriSirala(cevaplariTut);

		degerleriYazdir(cevaplariTut);

	}

	public static void degerleriYazdir(int[][] cevaplariTut) {
		for (int i = 0; i < cevaplariTut.length; i++) {
			System.out.println(cevaplariTut[i][0] + " . ogrencinin dogru cevap sayisi " + cevaplariTut[i][1]);
		}
	}

	public static void degerleriSirala(int[][] cevaplariTut) {
		for (int satir = 0; satir < cevaplariTut.length; satir++) {
			int indeksNumarasi = cevaplariTut[satir][0];
			int dogruCevapSayisi = cevaplariTut[satir][1];
			int satirNo = satir;

			for (int i = satir + 1; i < cevaplariTut.length; i++) {
				if (dogruCevapSayisi < cevaplariTut[i][1]) {
					dogruCevapSayisi = cevaplariTut[i][1];
					indeksNumarasi = cevaplariTut[i][0];
					satirNo = i;
				}
			}

			if (satirNo != satir) {
				cevaplariTut[satirNo][1] = cevaplariTut[satir][1];
				cevaplariTut[satirNo][0] = cevaplariTut[satir][0];
				cevaplariTut[satir][1] = dogruCevapSayisi;
				cevaplariTut[satir][0] = indeksNumarasi;
			}

		}
	}
}
