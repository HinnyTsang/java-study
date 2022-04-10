package BanckSimulator;
import java.text.DecimalFormat;

public class BankAccount {

    protected long accountNumber;
    protected String password;
    protected String holderName;
    protected double balanced;

    public BankAccount () {

    }

    public BankAccount (String holderName, String password, long accountNumber, double balanced) {
        this.holderName = holderName;
        this.password = password;
        this.accountNumber = accountNumber;
        this.balanced = balanced;
    }


    public Boolean withdraw(double amount) {
        if (amount % 100 != 0)
            return false;

        if (amount > 10000)
            return false;

        this.balanced -= amount;
        return true;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public Boolean loginSuccess(String password) {
        return this.password.equals(password);
    }
    public String toString() {

       DecimalFormat formatter = new DecimalFormat("#,###,###.00");

       return String.format("[Normal Account] Holder: %s, Account Balance: $%s", this.holderName, formatter.format(this.balanced));
    }

    

}


