import java.sql.SQLOutput;

public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(4);
        System.out.println("Saver 1:");
        saver1.calculateMonthlyInterest();
        saver1.displaySavings();
        System.out.println("Saver 2:");
        saver2.calculateMonthlyInterest();
        saver2.displaySavings();

        System.out.println("\n Situation for next month: ");
        SavingsAccount.modifyInterestRate(5);
        System.out.println("Saver 1:");
        saver1.calculateMonthlyInterest();
        saver1.displaySavings();
        System.out.println("Saver 2:");
        saver2.calculateMonthlyInterest();
        saver2.displaySavings();
    }
}
