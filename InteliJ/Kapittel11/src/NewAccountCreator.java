
public class NewAccountCreator  extends NewAccount{
    public NewAccountCreator() {
        super();
    }

    public static void main(String[] args) {
        NewAccount account = new NewAccount("George", 1122, 1000);

        account.setAnnualInterestRate(5.5);
        account.deposit(30, "Allowance");
        account.deposit(40, "Lottery prize");
        account.deposit(50, "Grandpa's gift");
        account.withdraw(5, "Ice creams");
        account.withdraw(4, "Scratch card");
        account.withdraw(2, "Bus ticket");

        System.out.println(account);
        System.out.printf("%-20s" + "%-8s" + "%-12s" + "%8s" + "%16s %n", "Date:", "Type:", "Amount:", "Balance:", "Description:");
        for (int i = 0; i < account.getTransactions().size(); i++ ) {
            System.out.println((account.getTransactions().get(i)));
        }
    }
}

