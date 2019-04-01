package Chapter9.soru01;

public class Dikdorgen {
    private  double en = 1;
    private  double boy = 1;

    public Dikdorgen() {
    }

    public  Dikdorgen(double en, double boy){
        this.en = en;
        this.boy = boy;
    }

    public double getArea(){
        double en = this.en;
        double boy = this.boy;

        return en * boy;
    }

    public double getPerimeter(){
        double en = this.en;
        double boy = this.boy;

        return 2 * (boy + en);
    }

    public double getEn() {
        return en;
    }

    public void setEn(double en) {
        this.en = en;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }
}
