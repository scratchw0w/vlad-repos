package hw;

import static hw.Util.RUN_OUT_OF_CASH_EXCEPTION_MESSAGE;

public class Account {
    private float balance;
    private String name;

    public Account(float balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public float getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float withdraw(float withdrawMoney) throws RunOutOfCashException {
        if (this.balance < withdrawMoney) throw new RunOutOfCashException(RUN_OUT_OF_CASH_EXCEPTION_MESSAGE + this.name);
        this.balance -= withdrawMoney;
        return this.balance;
    }

    public float deposit(float depositingMoney) {
        this.balance += depositingMoney;
        return this.balance;
    }

    public void showInfo() {
        System.out.println("The name of account is " + getName());
        System.out.println("Your current balance is " + getBalance());
        System.out.println();
    }
}
