package Chapter9.soru12;

import Chapter9.soru11.LinearEquation;

import java.util.Scanner;

public class KesisimNoktasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = (y1 - y2);
        double b = (-1 * (x1 - x2));
        double c = (y3 - y4);
        double d = (-1 * (x3 - x4));
        double e = ((y1 - y2) * x1 - ((x1 - x2) * y1));
        double f = ((y3 - y4) * x3 - ((x3 - x4) * y3));

        LinearEquation l1 = new LinearEquation(a, b, c, d, e, f);

        if (l1.isSolvable() == 0) {
            System.out.println("Bu dogru parareldir");
        } else {
            System.out.println("Nokta yerleri : " + "(" + l1.getX() + ", " + l1.getY() + ")");
        }

    }
}
