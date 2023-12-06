package hw;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accountList;

    public Bank() {
        this.accountList = new ArrayList<>();
    }

    public List<Account> getAccountList() {
        return this.accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public void transferMoney(Account accountDonor, Account accountGetter, float amountOfMoney) {
        if (amountOfMoney <= 0) {
            throw new IllegalArgumentException("Amount of money is not valid");
        }

        try {
            accountDonor.withdraw(amountOfMoney);
            accountGetter.deposit(amountOfMoney);
        } catch (RunOutOfCashException runOutOfCashException) {
            System.out.println("Too small balance");
            System.out.println("-------------------------------------------------");
        }
    }

    public void addAccount(Account account) {
        this.accountList.add(account);
    }

    public void removeAccount(Account account) {
        this.accountList.remove(account);
    }

    public void showInfo() {
        this.accountList.stream()
                .forEach(account -> account.showInfo());
    }
}
