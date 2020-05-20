public class SavingsAccount {
    static float annuallInterestRate;
    float savingsBalance;
    float monthlyInterest;

    public SavingsAccount(float savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest() {
        this.monthlyInterest = (savingsBalance * annuallInterestRate) / 12;
        System.out.println("The next month interest is: $ " + String.format("%.2f",this.monthlyInterest));
    }

    public static void modifyInterestRate(float interestRate) {
        annuallInterestRate = interestRate / 100;
    }

    private void calculateSavings() {
        savingsBalance += this.monthlyInterest;
    }

    public void displaySavings() {
        calculateSavings();
        System.out.println("The new balance is : $ " + String.format("%.2f",savingsBalance));
    }
}
