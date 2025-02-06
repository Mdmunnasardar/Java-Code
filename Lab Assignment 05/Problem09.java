final class Vehicle {
    public void drive() {
        System.out.println("Vehicle is driving");
    }
}

class BankAccount {
    public final void accountInfo() {
        System.out.println("Account info");
    }
}

class SavingsAccount extends BankAccount {
    public void deposit() {
        System.out.println("Deposit made");
    }
}

public class Problem09 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.drive();

        BankAccount ba = new BankAccount();
        ba.accountInfo();

        SavingsAccount sa = new SavingsAccount();
        sa.deposit();
        sa.accountInfo();
    }
}
