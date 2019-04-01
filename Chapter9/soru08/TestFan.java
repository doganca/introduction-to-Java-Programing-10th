package Chapter9.soru08;

public class TestFan {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.setSpeed(Fan.FAST);
        f1.setRadius(10);
        f1.setColor("Sari");
        f1.setOn(true);

        Fan f2 = new Fan();
        f2.setSpeed(Fan.MEDIUM);
        f2.setRadius(5);
        f2.setColor("Mavi");
        f2.setOn(false);

        System.out.println("Fan 1 : \n" + f1.toString());
        System.out.println("Fan 2 : \n" + f2.toString());

    }
}
