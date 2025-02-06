abstract class BankAccount {
    double bal;

    public BankAccount(double bal) {
        this.bal = bal;
    }

    public abstract void calcInterest();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double bal) {
        super(bal);
    }

    @Override
    public void calcInterest() {
        System.out.println("Savings Interest: " + bal * 0.04);
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(double bal) {
        super(bal);
    }

    @Override
    public void calcInterest() {
        System.out.println("Current Interest: " + bal * 0.02);
    }
}

public class Problem08 {
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount(1000.0);
        sa.calcInterest();

        BankAccount ca = new CurrentAccount(1000.0);
        ca.calcInterest();
    }
}
