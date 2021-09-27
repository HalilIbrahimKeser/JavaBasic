import java.util.Date;

public class Transaction {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    Transaction(Date date, char type, double amount, double balance, String description) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    @Override
    public String toString() {
        return String.format("%1$td.%1$tm.%1$ty %-11tT" + "%-10c" + "%5.2f" + " %12.2f    " +"%-18s",
                getDate(), getType(), getAmount(), getBalance(), getDescription());
    }

    private char getType() { return this.type; }

    private double getAmount() { return this.amount; }

    private double getBalance() { return this.balance; }

    private String getDescription() { return this.description; }

    private Date getDate() { return date; }
}