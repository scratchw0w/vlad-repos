package HW;

public class BankAccount {
    private int balance;

    public BankAccount(int currentBalance){
        this.balance = currentBalance;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return this.balance + " ";
    }
}
