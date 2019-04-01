package Chapter9.soru09;

public class TestRegularPolygon {
    public static void main(String[] args) {
        RegularPolygon r1 = new RegularPolygon();
        RegularPolygon r2 = new RegularPolygon(6,4);
        RegularPolygon r3 = new RegularPolygon(10,4,5.6,7.8);

        System.out.println("Cevresi : " + r1.getPerimeter() + " Alani  :" + r1.getArea());
        System.out.println("Cevresi : " + r2.getPerimeter() + " Alani  :" + r2.getArea());
        System.out.println("Cevresi : " + r3.getPerimeter() + " Alani  :" + r3.getArea());
    }
}
