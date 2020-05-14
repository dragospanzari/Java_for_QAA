public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance > 0.0)
            balance = initialBalance;

        /*else
            System.out.println("The Balance is negative !");*/
    }

    public void credit(double creditAmount)
    {
        if (creditAmount > 0)
            balance = balance + creditAmount;
        else
            System.out.println("Credit amount is not valid !");
    }
    public void debit(double debitAmount)
    {
        if (debitAmount <= balance)
            balance = balance - debitAmount;
        else
            System.out.println("Debit amount exceeded account balance which is " + getBalance());
    }

    public double getBalance() {
        return balance;
    }



}
