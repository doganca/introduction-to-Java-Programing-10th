package Chapter9.soru03;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(10000);

        Date date1 = new Date();
        date1.setTime(100000);

        Date date2 = new Date(1000000);

        Date date3 = new Date(10000000);
        Date date4 = new Date(1000000000);
        Date date5 = new Date();
        date5.setTime(100000000000000L);

        System.out.println(date.toString());
        System.out.println(date1.toString());
        System.out.println(date2.toString());
        System.out.println(date3.toString());
        System.out.println(date4.toString());
        System.out.println(date5.toString());
    }
}
