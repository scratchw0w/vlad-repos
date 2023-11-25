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

    public String withdraw(float withdrawMoney) {
            this.balance -= withdrawMoney;
            return "Your current balance is " + getBalance();
    }

    public String deposit(float depositingMoney) {
        this.balance += depositingMoney;
        return "Your current balance is " + getBalance();
    }

    public void showInfo(){
        System.out.println("The name of account is " + getName());
        System.out.println("Your current balance is " + getBalance());
        System.out.println();
    }
}
