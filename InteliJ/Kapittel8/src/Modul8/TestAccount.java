package Modul8;
import java.util.GregorianCalendar;

public class TestAccount {
    public static void main(String[] args) {

        //Account 1, withdrawal 2500.
        Account account1 = new Account(1122, 2000);

        account1.setAnnualInterestRate(4.5);
            if (account1.withdraw(2500)) {
            System.out.println("\nUttak av 2500 fra kontoen, status: Suksess");
            } else{
            System.out.println("\nUttak av 2500 fra kontoen, status: Feilet"); }
        //Account 1, deposit 3000.
            if (account1.deposit(3000)) {
            System.out.println("Setter inn 3000 til kontoen, status: Suksess");
            } else{
            System.out.println("Setter inn 3000 til kontoen, status: Feilet"); }
        System.out.println("Saldoen er: " +account1.getBalance());
        System.out.println("Månedelig rente er: "+account1.getMonthlyInterestRate()+" kroner");
        System.out.println("Kontoen ble opprettet: " + account1.getDateCreated().getTime());
    }
    //Class
    public static class Account {
        private int id;
        private double balance;
        private static double annualInterestRate;
        private GregorianCalendar dateCreated;

    //Constructors
    Account(int newId, int newBalance) {
        id = newId;
        balance = newBalance;
        this.dateCreated = new GregorianCalendar();
    }
    //Getters and setters
    int getId() { return (id); }
    double getBalance() { return (balance); }
    GregorianCalendar getDateCreated() { return dateCreated; }
    static double getAnnualInterestRate() { return (annualInterestRate);}
    void setAnnualInterestRate(double newAnnualInterestRate) { annualInterestRate = newAnnualInterestRate; }

    //Methods
    double getMonthlyInterestRate() { return balance * annualInterestRate / 1200; }
    boolean withdraw(double amount) {
         if (amount > 0 && amount <= balance) { balance -= amount;
            return true;
            }else if ((amount < 0) && (amount >= balance)) return false;
            return false; }
    boolean deposit(double amount) {
         if (amount > 0) balance += amount;
            return true; }
    }
}
