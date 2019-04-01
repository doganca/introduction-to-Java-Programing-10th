package Chapter9.soru04;

public class TestRandom {
    public static void main(String[] args) {
        Random random = new Random();

        random.randomSayiYazdir(100);

        System.out.println();

        Random random1 = new Random(100);

        random1.randomSayiYazdir(50);

        System.out.println();
        System.out.println();

        Random random2 = new Random(100);
        System.out.println(random2.randomSayiOlustur());

    }
}
