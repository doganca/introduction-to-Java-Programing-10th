package Chapter9.soru07;

public class TestAccount {
    public static void main(String[] args) {
        Account d1 = new Account(1,1000);
        d1.setAnnualInterestRate(3.45);

        System.out.println(d1.getAnnualInterestRate());
        System.out.println(d1.getMonthlyInterestRate());

        d1.withdraw(1000);

        System.out.println(d1.getBalance());

        d1.deposit(2500);

        System.out.println(d1.getBalance());
    }
}
