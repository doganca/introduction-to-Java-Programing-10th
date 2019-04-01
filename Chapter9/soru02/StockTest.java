package Chapter9.soru02;

public class StockTest {
    public static void main(String[] args) {
        Stock test = new Stock("a1","demir");

        test.setGuncelFiyat(123.44);
        test.setBirOncekiFiyat(122.3);

        System.out.println("Bir onceki fiyat ile guncel fiyat arasindaki fark : " + test.getChangePersent());

    }
}
