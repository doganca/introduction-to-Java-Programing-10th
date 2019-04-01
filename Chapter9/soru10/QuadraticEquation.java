package Chapter9.soru10;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getDiscriminant() {
        return Math.sqrt(Math.pow(b, 2) - (4 * (a * c)));
    }

    private double getRoot1() {
        return (-b + Math.sqrt(Math.pow(b, 2)) - (4 * (a * c))) / (2 * a);
    }

    private double getRoot2() {
        return (-b - Math.sqrt(Math.pow(b, 2)) - (4 * (a * c))) / (2 * a);
    }

    public void sonucuYazdir() {
        if (getDiscriminant() > 0) {
            System.out.println(getRoot1() + " " + getRoot2());
        } else if (getDiscriminant() == 0) {
            System.out.println(getRoot1());
        } else {
            System.out.println(" Denklemin hiçbir gerçek kökü yoktur");
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
}
