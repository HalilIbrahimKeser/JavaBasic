import java.util.ArrayList;
import java.util.Date;

public class NewAccount {
    private String name;
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;

    NewAccount() {
        name = "";
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }
    NewAccount(String name, int id, double balance) {
        this.transactions = new ArrayList<Transaction>();
        this.name = name;
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        this.transactions = new ArrayList<Transaction>();
    }

    @Override
    public String toString() {
        return String.format("%nName: %s%n" + "Balance: %.2f%n" + "Date created: %tF %tT %n" + "Annual interest rate: %.1f",
                getName(), getBalance(), getDateCreated(), getDateCreated(), getAnnualInterestRate());
    }
    ArrayList<Transaction> getTransactions() { return transactions; }

    private Date getDateCreated() {return dateCreated;}

    public void setName(String name) { this.name = name; }

    private String getName() { return name; }

    public void setId(int id) { this.id = id; }

    public void setBalance(double balance) { this.balance = balance; }

    void setAnnualInterestRate(double annualInterestRate) {
                NewAccount.annualInterestRate = annualInterestRate; }

    public int getId() { return id; }

    private double getBalance() { return balance; }

    private double getAnnualInterestRate() {
                return annualInterestRate; }

    public double getMonthlyInterestRate() {
                return balance * (annualInterestRate / 1200); }

    void withdraw(double amount, String type) {
                balance -= amount;
                transactions.add(new Transaction(new Date(), 'W', amount, getBalance(), type)); }

    void deposit(double amount, String type) {
                balance += amount;
                transactions.add(new Transaction(new Date(), 'D', amount, getBalance(), type)); }
}
