/**
 * Created by u1862653 on 14/02/2019.
 */
public class CurrentAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private boolean hasOverdraft;

    public CurrentAccount(String accountHolder, String accountNumber, boolean hasOverdraft) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.hasOverdraft = hasOverdraft;
        this.balance = 0.0;

    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isHasOverdraft() {
        return hasOverdraft;
    }

    public void setHasOverdraft(boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }
    public boolean withdraw(double amount){
        if (this.balance > amount || this.hasOverdraft){
            balance -= amount;
            return true;

        }
        return false;

    }
    public boolean deposit(double amount){
        if (amount > 0){
            this.balance += amount;
        }
        return amount > 0;
    }


    }
}
