package Chapter9.soru01;

public class Main {
    public static void main(String[] args) {
        Dikdorgen diktortgen1 = new Dikdorgen();
        Dikdorgen dikdorgen2 = new Dikdorgen(35.9,3.5 );

        diktortgen1.setBoy(4);
        diktortgen1.setEn(40);

        System.out.println("Diktortgen 1' in alani : " + diktortgen1.getArea() + " , cevresi : " + diktortgen1.getPerimeter());
        System.out.println("Dikdorgen 2 ' in alani : " + dikdorgen2.getArea() + ", cevresi : " + dikdorgen2.getPerimeter());
    }
}
