package Chapter9.soru05;

import java.util.GregorianCalendar;

public class TestGregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar dc = new GregorianCalendar();

        System.out.println(dc.getTime());

        dc.setTimeInMillis(1234567898765L);

        System.out.println(dc.getTime());
    }
}
