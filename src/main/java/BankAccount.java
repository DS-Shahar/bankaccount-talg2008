public class BankAccount {
    private int balance;
    private int minBalance;
    /**
     * @param balance Amount of money in the account, can be negative
     * @param balance Must be >= minBalance
     */
    private String owner;

    public String toString() {
        return "balance of " + owner +": "+ balance;
    }
    public BankAccount(int balance, int minBalance, String owner) {
        this.balance = balance;
        this.minBalance = minBalance;
        this.owner=owner;
    }

    public int getBalance() {
        return balance;
    }
    public int getMinBalance() {
        return minBalance;
    }
    public void setMinBalance(int minBalance) {
        this.minBalance = minBalance;
    }
    public void setBalance(int balance) {
        if (balance>=minBalance)
        {
            this.balance=balance;
        }

    }
    public boolean withdraw(int amount) {
        if (balance-amount>minBalance) {
            balance=balance-amount;
            return true;
        }
        else {

            return false;
        }
    }

    public void deposit (int amount) {
        balance +=amount;

    }

    public boolean transfer(BankAccount target, int amount) {
        if (withdraw(amount) == true){
            target.deposit(amount);
            return true;
        }
        else{
            return false;
        }
    }
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
