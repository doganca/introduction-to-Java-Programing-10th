package Chapter9.soru11;

public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double isSolvable() {
        return (a * d) - (b * c);
    }

    public double getX() {
        return (((e * d) - (b * f)) / ((a * d) - (b * c)));
    }

    public double getY() {
        return (((a * f) - (e * c)) / ((a * d) - (b * c)));
    }

    public void sonucuYazdir() {
        if (isSolvable() == 0) {
            System.out.println("Denklemin sonucu yoktur");
        } else {
            System.out.println("X : " + getX());
            System.out.println("y : " + getY());
        }
    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
}
