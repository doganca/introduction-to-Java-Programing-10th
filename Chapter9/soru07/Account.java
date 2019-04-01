package Chapter9.soru07;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreted;

    public Account() {

    }

    public Account(int id, double balance) {
        super();
        this.id = id;
        this.balance = balance;
    }

    public double getMonthlyInterestRate() {
        return this.annualInterestRate / 12;
    }


    public void withdraw(double cekilecekMiktar){
        if (cekilecekMiktar <= this.balance){
            System.out.println("Hesabinizdan " + cekilecekMiktar + " USD cekilmistir.");
            this.balance -= cekilecekMiktar;
        }else {
            System.out.println("Yetersiz bakiye");
        }
    }

    public void deposit(double yatirilacakMikater){
        this.balance += yatirilacakMikater;
        System.out.println("Hesabiniza " + yatirilacakMikater + " USD yatrilmistir.");

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreted() {
        return dateCreted;
    }
}
