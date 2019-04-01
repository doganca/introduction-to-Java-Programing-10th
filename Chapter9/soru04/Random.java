package Chapter9.soru04;

public class Random {
    private int seed = 1000;

    public Random(){

    }

    public Random(int seed) {
        super();
        this.seed = seed;
    }

    public int randomSayiOlustur(){
        return  (int)(Math.random() * this.seed) + 1;
    }

    public void randomSayiYazdir(int kacSayiyaKadar){
        if (!(kacSayiyaKadar <= this.seed)){
            System.out.println("Hata");
            System.exit(1);
        }

        for (int i = 0; i < kacSayiyaKadar ; i++) {
            if (i % 10 != 0){
                System.out.print(randomSayiOlustur() + " ");
            }else {
                System.out.println();
            }

        }
    }
}
